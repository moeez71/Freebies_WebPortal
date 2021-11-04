package uk.co.planetbeyond.service.managedbean;

import java.io.Serializable;
import java.util.Date;

import org.primefaces.model.DefaultScheduleEvent;

public class ManagedScheduleEvent extends DefaultScheduleEvent implements Serializable
{
	private static final long serialVersionUID = 1159919524657003238L;

	public ManagedScheduleEvent(String name, Date startDate, Date endDate)
	{
		super(name, startDate, endDate);
	}

	public ManagedScheduleEvent()
	{
	}

}
