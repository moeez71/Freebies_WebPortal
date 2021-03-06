




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.manager;

import uk.co.planetbeyond.service.generated.PushNotificationManager;
import uk.co.planetbeyond.service.generated.PushNotificationBean;
import uk.co.planetbeyond.service.managedbean.PushNotificationManagedBean;

/**
* If any change needs to be made to the PushNotificationManager, it MUST not be made directly
* Instead the PushNotificationManagerImpl class should be used to make the changes
*/
public class PushNotificationManagerImpl extends PushNotificationManager 
{
	/**
	* Singleton instance of this class
	*/
	private static PushNotificationManagerImpl singleton = new PushNotificationManagerImpl();
	
	/**
	* Make the constructor private to make the class singleton
	*/
	private PushNotificationManagerImpl()
	{
		super();
		
		// set the singleton instance of PushNotificationManagerImpl class in the PushNotificationManager so that
		// PushNotificationManager.getInstance() also points to the singleton instance of PushNotificationManagerImpl 
		setInstance(this);
	}
	
	/**
	* To make the singleton instance available to external classes
	*/
	public static PushNotificationManagerImpl getInstance()
	{
		return singleton;
	}

	/**
	* Override this method so that it returns an instance of PushNotificationManagedBean instead of PushNotificationBean
	*/
	@Override
	public PushNotificationBean createPushNotificationBean()
	{
		return new PushNotificationManagedBean();
	}   
}
