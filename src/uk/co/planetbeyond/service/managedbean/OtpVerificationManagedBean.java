




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.managedbean;

import uk.co.planetbeyond.service.generated.OtpVerificationBean;
import com.sleepycat.persist.model.Persistent;

/**
* If any changes needs to be made to the OtpVerificationBean, it MUST not be made directly to OtpVerificationBean
* Instead the OtpVerificationManagedBean should be used to make the changes
*/
@Persistent
public class OtpVerificationManagedBean extends OtpVerificationBean
{
	private static final long serialVersionUID = -4854302302300733088L;

	/**
	* Make the constructor public so that it can be accessed externally
	*/
	public OtpVerificationManagedBean()
	{
		super();
	}
}