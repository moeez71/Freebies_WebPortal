




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.manager;

import uk.co.planetbeyond.service.generated.SubscriberManager;
import uk.co.planetbeyond.service.generated.SubscriberBean;
import uk.co.planetbeyond.service.managedbean.SubscriberManagedBean;

/**
* If any change needs to be made to the SubscriberManager, it MUST not be made directly
* Instead the SubscriberManagerImpl class should be used to make the changes
*/
public class SubscriberManagerImpl extends SubscriberManager 
{
	/**
	* Singleton instance of this class
	*/
	private static SubscriberManagerImpl singleton = new SubscriberManagerImpl();
	
	/**
	* Make the constructor private to make the class singleton
	*/
	private SubscriberManagerImpl()
	{
		super();
		
		// set the singleton instance of SubscriberManagerImpl class in the SubscriberManager so that
		// SubscriberManager.getInstance() also points to the singleton instance of SubscriberManagerImpl 
		setInstance(this);
	}
	
	/**
	* To make the singleton instance available to external classes
	*/
	public static SubscriberManagerImpl getInstance()
	{
		return singleton;
	}

	/**
	* Override this method so that it returns an instance of SubscriberManagedBean instead of SubscriberBean
	*/
	@Override
	public SubscriberBean createSubscriberBean()
	{
		return new SubscriberManagedBean();
	}   
}