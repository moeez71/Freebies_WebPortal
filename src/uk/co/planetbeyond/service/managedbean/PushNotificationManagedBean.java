




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.managedbean;

import uk.co.planetbeyond.service.generated.PushNotificationBean;
import com.sleepycat.persist.model.Persistent;

/**
* If any changes needs to be made to the PushNotificationBean, it MUST not be made directly to PushNotificationBean
* Instead the PushNotificationManagedBean should be used to make the changes
*/
@Persistent
public class PushNotificationManagedBean extends PushNotificationBean
{
	private static final long serialVersionUID = -4854302302300733088L;

	/**
	* Make the constructor public so that it can be accessed externally
	*/
	public PushNotificationManagedBean()
	{
		super();
	}
}
