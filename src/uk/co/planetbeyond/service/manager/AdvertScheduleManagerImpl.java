




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.manager;

import uk.co.planetbeyond.service.generated.AdvertScheduleManager;
import uk.co.planetbeyond.service.generated.AdvertScheduleBean;
import uk.co.planetbeyond.service.managedbean.AdvertisementScheduleManagedBean;

/**
* If any change needs to be made to the AdvertScheduleManager, it MUST not be made directly
* Instead the AdvertScheduleManagerImpl class should be used to make the changes
*/
public class AdvertScheduleManagerImpl extends AdvertScheduleManager 
{
	/**
	* Singleton instance of this class
	*/
	private static AdvertScheduleManagerImpl singleton = new AdvertScheduleManagerImpl();
	
	/**
	* Make the constructor private to make the class singleton
	*/
	private AdvertScheduleManagerImpl()
	{
		super();
		
		// set the singleton instance of AdvertScheduleManagerImpl class in the AdvertScheduleManager so that
		// AdvertScheduleManager.getInstance() also points to the singleton instance of AdvertScheduleManagerImpl 
		setInstance(this);
	}
	
	/**
	* To make the singleton instance available to external classes
	*/
	public static AdvertScheduleManagerImpl getInstance()
	{
		return singleton;
	}

	/**
	* Override this method so that it returns an instance of AdvertScheduleManagedBean instead of AdvertScheduleBean
	*/
	@Override
	public AdvertScheduleBean createAdvertScheduleBean()
	{
		return new AdvertisementScheduleManagedBean();
	}   
}