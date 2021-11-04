




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.generated;

import java.io.Serializable;
import com.sleepycat.persist.model.Persistent;
import org.apache.commons.lang.builder.EqualsBuilder;

import uk.co.planetbeyond.service.manager.AdvertisementManagerImpl;

/**
 * AdvertisementBean is a mapping of advertisement Table.
 * @author sql2java
*/
@Persistent
public class BaseAdvertisementBean extends BaseGeneratedBean implements Serializable
{
	private static final long serialVersionUID = -3369661974763827788L;
	
    protected Integer scheduleId;
    protected Integer duration;
    protected Integer budget;
    protected String path;
    protected String filename;
    protected java.util.Date creationTimestamp;
    protected String name;
    protected Integer advertisementId;

    /**
     * Prefered methods to create a AdvertisementBean is via the createAdvertisementBean method in AdvertisementManager or
     * via the factory class AdvertisementFactory create method
     */
    public BaseAdvertisementBean()
    {
    }

    /**
     * Getter method for scheduleId.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: advertisement.schedule_id</li>
     * <li> foreign key: advert_schedule.schedule_id</li>
     * <li>column size: 10</li>
     * <li>jdbc type returned by the driver: Types.INTEGER</li>
     * </ul>
     *
     * @return the value of scheduleId
     */
    public Integer getScheduleId()
    {
        return scheduleId;
    }

    /**
     * Setter method for scheduleId.
     * <br>
     *
     * @param newVal the new value to be assigned to scheduleId
     */
    public void setScheduleId(Integer newVal)
    {
        scheduleId = newVal;
    }

    /**
     * Getter method for duration.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: advertisement.duration</li>
     * <li>column size: 10</li>
     * <li>jdbc type returned by the driver: Types.INTEGER</li>
     * </ul>
     *
     * @return the value of duration
     */
    public Integer getDuration()
    {
        return duration;
    }

    /**
     * Setter method for duration.
     * <br>
     *
     * @param newVal the new value to be assigned to duration
     */
    public void setDuration(Integer newVal)
    {
        duration = newVal;
    }

    /**
     * Getter method for budget.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: advertisement.budget</li>
     * <li>column size: 10</li>
     * <li>jdbc type returned by the driver: Types.INTEGER</li>
     * </ul>
     *
     * @return the value of budget
     */
    public Integer getBudget()
    {
        return budget;
    }

    /**
     * Setter method for budget.
     * <br>
     *
     * @param newVal the new value to be assigned to budget
     */
    public void setBudget(Integer newVal)
    {
        budget = newVal;
    }

    /**
     * Getter method for path.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: advertisement.path</li>
     * <li>column size: 45</li>
     * <li>jdbc type returned by the driver: Types.VARCHAR</li>
     * </ul>
     *
     * @return the value of path
     */
    public String getPath()
    {
        return path;
    }

    /**
     * Setter method for path.
     * <br>
     *
     * @param newVal the new value to be assigned to path
     */
    public void setPath(String newVal)
    {
        path = newVal;
    }

    /**
     * Getter method for filename.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: advertisement.filename</li>
     * <li>column size: 500</li>
     * <li>jdbc type returned by the driver: Types.VARCHAR</li>
     * </ul>
     *
     * @return the value of filename
     */
    public String getFilename()
    {
        return filename;
    }

    /**
     * Setter method for filename.
     * <br>
     *
     * @param newVal the new value to be assigned to filename
     */
    public void setFilename(String newVal)
    {
        filename = newVal;
    }

    /**
     * Getter method for creationTimestamp.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: advertisement.creation_timestamp</li>
     * <li>column size: 19</li>
     * <li>jdbc type returned by the driver: Types.TIMESTAMP</li>
     * </ul>
     *
     * @return the value of creationTimestamp
     */
    public java.util.Date getCreationTimestamp()
    {
        return creationTimestamp;
    }

    /**
     * Setter method for creationTimestamp.
     * <br>
     *
     * @param newVal the new value to be assigned to creationTimestamp
     */
    public void setCreationTimestamp(java.util.Date newVal)
    {
        creationTimestamp = newVal;
    }

    /**
     * Getter method for name.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: advertisement.name</li>
     * <li>column size: 45</li>
     * <li>jdbc type returned by the driver: Types.VARCHAR</li>
     * </ul>
     *
     * @return the value of name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Setter method for name.
     * <br>
     *
     * @param newVal the new value to be assigned to name
     */
    public void setName(String newVal)
    {
        name = newVal;
    }

    /**
     * Getter method for advertisementId.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: advertisement.advertisement_id</li>
     * <li>column size: 10</li>
     * <li>jdbc type returned by the driver: Types.INTEGER</li>
     * </ul>
     *
     * @return the value of advertisementId
     */
    public Integer getAdvertisementId()
    {
        return advertisementId;
    }

    /**
     * Setter method for advertisementId.
     * <br>
     *
     * @param newVal the new value to be assigned to advertisementId
     */
    public void setAdvertisementId(Integer newVal)
    {
        advertisementId = newVal;
    }


    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(BaseAdvertisementBean bean)
    {
        setScheduleId(bean.getScheduleId());
        setDuration(bean.getDuration());
        setBudget(bean.getBudget());
        setPath(bean.getPath());
        setFilename(bean.getFilename());
        setCreationTimestamp(bean.getCreationTimestamp());
        setName(bean.getName());
        setAdvertisementId(bean.getAdvertisementId());
    }

    /**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object)
	{
		if (!(object instanceof BaseAdvertisementBean)) {
			return false;
		}

		BaseAdvertisementBean obj = (BaseAdvertisementBean) object;
		return new EqualsBuilder()
            .append(getScheduleId(), obj.getScheduleId())
            .append(getDuration(), obj.getDuration())
            .append(getBudget(), obj.getBudget())
            .append(getPath(), obj.getPath())
            .append(getFilename(), obj.getFilename())
            .append(getCreationTimestamp(), obj.getCreationTimestamp())
            .append(getName(), obj.getName())
            .append(getAdvertisementId(), obj.getAdvertisementId())
            .isEquals();
	}


    /**
     * Converts the current object to full form of the bean which includes all utility methods as well
     */
    public AdvertisementBean toManagedBean()
    {
	AdvertisementBean bean = AdvertisementManagerImpl.getInstance().createAdvertisementBean();
        bean.setScheduleId(getScheduleId());
        bean.setDuration(getDuration());
        bean.setBudget(getBudget());
        bean.setPath(getPath());
        bean.setFilename(getFilename());
        bean.setCreationTimestamp(getCreationTimestamp());
        bean.setName(getName());
        bean.setAdvertisementId(getAdvertisementId());
	return bean;
    }
}
