




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

import uk.co.planetbeyond.service.manager.WebUserManagerImpl;

/**
 * WebUserBean is a mapping of web_user Table.
 * @author sql2java
*/
@Persistent
public class BaseWebUserBean extends BaseGeneratedBean implements Serializable
{
	private static final long serialVersionUID = 8821997923826301964L;
	
    protected java.util.Date creationTimestamp;
    protected String password;
    protected String name;
    protected Integer userId;

    /**
     * Prefered methods to create a WebUserBean is via the createWebUserBean method in WebUserManager or
     * via the factory class WebUserFactory create method
     */
    public BaseWebUserBean()
    {
    }

    /**
     * Getter method for creationTimestamp.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: web_user.creation_timestamp</li>
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
     * Getter method for password.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: web_user.password</li>
     * <li>column size: 20</li>
     * <li>jdbc type returned by the driver: Types.VARCHAR</li>
     * </ul>
     *
     * @return the value of password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * Setter method for password.
     * <br>
     *
     * @param newVal the new value to be assigned to password
     */
    public void setPassword(String newVal)
    {
        password = newVal;
    }

    /**
     * Getter method for name.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: web_user.name</li>
     * <li>column size: 20</li>
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
     * Getter method for userId.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: web_user.user_id</li>
     * <li>column size: 10</li>
     * <li>jdbc type returned by the driver: Types.INTEGER</li>
     * </ul>
     *
     * @return the value of userId
     */
    public Integer getUserId()
    {
        return userId;
    }

    /**
     * Setter method for userId.
     * <br>
     *
     * @param newVal the new value to be assigned to userId
     */
    public void setUserId(Integer newVal)
    {
        userId = newVal;
    }


    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(BaseWebUserBean bean)
    {
        setCreationTimestamp(bean.getCreationTimestamp());
        setPassword(bean.getPassword());
        setName(bean.getName());
        setUserId(bean.getUserId());
    }

    /**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object)
	{
		if (!(object instanceof BaseWebUserBean)) {
			return false;
		}

		BaseWebUserBean obj = (BaseWebUserBean) object;
		return new EqualsBuilder()
            .append(getCreationTimestamp(), obj.getCreationTimestamp())
            .append(getPassword(), obj.getPassword())
            .append(getName(), obj.getName())
            .append(getUserId(), obj.getUserId())
            .isEquals();
	}


    /**
     * Converts the current object to full form of the bean which includes all utility methods as well
     */
    public WebUserBean toManagedBean()
    {
	WebUserBean bean = WebUserManagerImpl.getInstance().createWebUserBean();
        bean.setCreationTimestamp(getCreationTimestamp());
        bean.setPassword(getPassword());
        bean.setName(getName());
        bean.setUserId(getUserId());
	return bean;
    }
}
