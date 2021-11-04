package uk.co.planetbeyond.service.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.LazyScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;
import org.primefaces.model.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.co.planetbeyond.service.generated.AdvertScheduleBean;
import uk.co.planetbeyond.service.generated.exception.DAOException;
import uk.co.planetbeyond.service.manager.AdvertScheduleManagerImpl;

@ManagedBean
@ViewScoped
public class ScheduleView implements Serializable
{
	private static Logger log = LoggerFactory.getLogger(ScheduleView.class);
	private static final long serialVersionUID = 484369422594637051L;
	private ScheduleEvent event = new ManagedScheduleEvent();
	private LazyDataModel<AdvertScheduleBean> scheduledAdList;

	private ScheduleModel lazyEventModel;
	private AdvertScheduleBean advertScheduleBean;
	private ScheduleModel eventModel;
	private Integer showId;

	@PostConstruct
	public void init()
	{
		advertScheduleBean = new AdvertScheduleBean();
		eventModel = new DefaultScheduleModel();

		lazyEventModel = new LazyScheduleModel()
		{

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void loadEvents(Date start, Date end)
			{
				Calendar date = Calendar.getInstance();
				date.setTime(start);

				/**
				 * by default first day on calendar is Sunday. If 1st of active month is not on Sunday we have to add new month in start date so that
				 * we can extract active month
				 */
				if (date.get(Calendar.DAY_OF_MONTH) > Calendar.SUNDAY)
				{
					date.add(Calendar.MONTH, 1);
				}

				// list to hold values of registered campaigns in given month
				List<AdvertScheduleBean> listOfScheduledShows = new ArrayList<>();
				List<Object> parameters = new ArrayList<>();

				String where = "WHERE MONTH(scheduled_timestamp) = MONTH(?)";
				parameters.add(date.getTime());

				try
				{

					listOfScheduledShows = AdvertScheduleManagerImpl.getInstance().loadByPreparedStatementAsList(where, parameters.toArray(), null);

				}
				catch (DAOException e)
				{
					log.error(e.getMessage(), e);
				}

				for (AdvertScheduleBean bean : listOfScheduledShows)
				{
					ManagedScheduleEvent scheduledEvent = new ManagedScheduleEvent(bean.getName(), bean.getScheduledTimestamp(), bean.getScheduledTimestamp());

					lazyEventModel.addEvent(scheduledEvent);

				}
			}
		};

	}

	/**
	 * Adding Show Event
	 * 
	 * @param actionEvent
	 * @return
	 */
	public String addEvent(ActionEvent actionEvent)
	{
		try
		{
			log.info("Saving scheduled show");

			advertScheduleBean.save();
			advertScheduleBean = new AdvertScheduleBean();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Show successfully saved into database", ""));
			FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
			scheduledAdList = null;
			return "schedule_ad.faces?faces-redirect=true";

		}
		catch (Exception e)
		{
			log.error(e.toString(), e);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error: " + "<br />" + e.getLocalizedMessage(), null));
			FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
			return "error.faces?faces-redirect=true";
		}
	}

	public String updateShow()
	{
		log.info("Update cateogry against id:{}");
		return "";
	}

	public LazyDataModel<AdvertScheduleBean> getScheduledShowList()
	{
		try
		{
			if (scheduledAdList != null)
			{
				return scheduledAdList;
			}

			final String where = "WHERE 1=1";
			int count = AdvertScheduleManagerImpl.getInstance().countWhere(where);

			scheduledAdList = new LazyDataModel<AdvertScheduleBean>()
			{
				private static final long serialVersionUID = 1L;

				@Override
				public List<AdvertScheduleBean> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> arg4)
				{
					try
					{
						List<AdvertScheduleBean> testCasesList = AdvertScheduleManagerImpl.getInstance().loadByPreparedStatementAsList(where + " ORDER BY show_id DESC LIMIT ?,?", new Object[] { first, pageSize }, null);

						return testCasesList;
					}

					catch (Throwable e)
					{
						log.error(e.toString(), e);
						return null;
					}
				}
			};
			scheduledAdList.setRowCount(count);

			return scheduledAdList;

		}
		catch (Throwable e)
		{
			log.error(e.toString(), e);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error: " + "<br />" + e.getLocalizedMessage(), null));
			return null;
		}
	}

	/**
	 * Get all saved show categories
	 * 
	 * @param categoryId
	 * @return
	 */
	public String getshowCategory(Integer categoryId)
	{

		return null;

	}

	/**
	 * get all saved host
	 * 
	 * @param hostId
	 * @return
	 */
	public String getshowHost(Integer hostId)
	{

		return null;

	}

	/**
	 * Id to string converter
	 * 
	 * @param status
	 * @return
	 */
	public String getshowStatus(Integer status)
	{

		return null;
	}

	/**
	 * sets warning message if no slot is available for booking
	 */
	public void getNoSlotAvailableMessage()
	{

	}

	/**
	 * 
	 * returns count of already booked campaigns
	 * 
	 * @return
	 * @throws Exception
	 */
	public Integer getCountOfBookedCampaigns() throws Exception
	{
		return 0;
	}

	/**
	 * we have different rules for admin, weekdays and weekends. This functions returns max number of bookings as per context
	 * 
	 * @return
	 */
	public Integer getMaxAllowedBookings()
	{
		return 0;

	}

	public ScheduleModel getEventModel()
	{
		return eventModel;
	}

	public ScheduleEvent getEvent()
	{
		if (event == null)
		{
			event = new ManagedScheduleEvent();
		}
		return event;
	}

	public ScheduleModel getLazyEventModel()
	{
		return lazyEventModel;
	}

	public void setEvent(ScheduleEvent events)
	{
		event = events;
	}

	public void onEventSelect(SelectEvent selectEvent)
	{
		event = (ScheduleEvent) selectEvent.getObject();
	}

	public void onDateSelect(SelectEvent selectEvent)
	{
		event = new ManagedScheduleEvent("", (Date) selectEvent.getObject(), (Date) selectEvent.getObject());
	}

	public void onEventMove(ScheduleEntryMoveEvent event)
	{
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Event moved", "Day delta:" + event.getDayDelta() + ", Minute delta:" + event.getMinuteDelta());

		addMessage(message);
	}

	public void onEventResize(ScheduleEntryResizeEvent event)
	{
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Event resized", "Day delta:" + event.getDayDelta() + ", Minute delta:" + event.getMinuteDelta());

		addMessage(message);
	}

	private void addMessage(FacesMessage message)
	{
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public Integer getShowId()
	{
		return showId;
	}

	public void setShowId(Integer showId)
	{
		this.showId = showId;
	}

}
