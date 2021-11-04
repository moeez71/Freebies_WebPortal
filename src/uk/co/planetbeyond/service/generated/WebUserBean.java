




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.generated;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import uk.co.planetbeyond.service.manager.WebUserManagerImpl;
import uk.co.planetbeyond.service.generated.GeneratedBean;





import uk.co.planetbeyond.service.generated.exception.DAOException;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.sleepycat.persist.model.Persistent;

/**
 * WebUserBean is a mapping of web_user Table.
 * @author sql2java
*/
@Persistent
public class WebUserBean extends BaseWebUserBean implements Serializable, GeneratedBean, JoinHelperInterface
{
	private static final long serialVersionUID = -8212568703426682458L;
	
    private boolean creationTimestampIsModified = false;
    private boolean creationTimestampIsInitialized = false;

    private boolean passwordIsModified = false;
    private boolean passwordIsInitialized = false;

    private boolean nameIsModified = false;
    private boolean nameIsInitialized = false;

    private boolean userIdIsModified = false;
    private boolean userIdIsInitialized = false;

    private boolean _isNew = true;

    /**
     * Prefered methods to create a WebUserBean is via the createWebUserBean method in WebUserManager or
     * via the factory class WebUserFactory create method
     */
    public WebUserBean()
    {
    }



    /**
     * Setter method for creationTimestamp.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to creationTimestamp
     */
    @Override
    public void setCreationTimestamp(java.util.Date newVal)
    {
        if ((newVal != null && creationTimestamp != null && (newVal.compareTo(creationTimestamp) == 0)) ||
            (newVal == null && creationTimestamp == null && creationTimestampIsInitialized)) {
            return;
        }
        creationTimestamp = newVal;
        creationTimestampIsModified = true;
        creationTimestampIsInitialized = true;
    }

    /**
     * Setter method for creationTimestamp.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to creationTimestamp
     */
    public void setCreationTimestamp(long newVal)
    {
        setCreationTimestamp(new java.util.Date(newVal));
    }

    /**
     * Determines if the creationTimestamp has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCreationTimestampModified()
    {
        return creationTimestampIsModified;
    }

    /**
     * Manually set whether creationTimestamp has been modified or not.
     */
    public void isCreationTimestampModified(boolean value)
    {
        creationTimestampIsModified = value;
    }	

    /**
     * Determines if the creationTimestamp has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCreationTimestampInitialized()
    {
        return creationTimestampIsInitialized;
    }

    /**
     * Manually set whether creationTimestamp has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isCreationTimestampInitialized(boolean value)
    {
        creationTimestampIsInitialized = value;
    }



    /**
     * Setter method for password.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to password
     */
    @Override
    public void setPassword(String newVal)
    {
        if ((newVal != null && password != null && (newVal.compareTo(password) == 0)) ||
            (newVal == null && password == null && passwordIsInitialized)) {
            return;
        }
        password = newVal;
        passwordIsModified = true;
        passwordIsInitialized = true;
    }

    /**
     * Determines if the password has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPasswordModified()
    {
        return passwordIsModified;
    }

    /**
     * Manually set whether password has been modified or not.
     */
    public void isPasswordModified(boolean value)
    {
        passwordIsModified = value;
    }	

    /**
     * Determines if the password has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPasswordInitialized()
    {
        return passwordIsInitialized;
    }

    /**
     * Manually set whether password has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isPasswordInitialized(boolean value)
    {
        passwordIsInitialized = value;
    }



    /**
     * Setter method for name.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to name
     */
    @Override
    public void setName(String newVal)
    {
        if ((newVal != null && name != null && (newVal.compareTo(name) == 0)) ||
            (newVal == null && name == null && nameIsInitialized)) {
            return;
        }
        name = newVal;
        nameIsModified = true;
        nameIsInitialized = true;
    }

    /**
     * Determines if the name has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isNameModified()
    {
        return nameIsModified;
    }

    /**
     * Manually set whether name has been modified or not.
     */
    public void isNameModified(boolean value)
    {
        nameIsModified = value;
    }	

    /**
     * Determines if the name has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isNameInitialized()
    {
        return nameIsInitialized;
    }

    /**
     * Manually set whether name has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isNameInitialized(boolean value)
    {
        nameIsInitialized = value;
    }



    /**
     * Setter method for userId.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to userId
     */
    @Override
    public void setUserId(Integer newVal)
    {
        if ((newVal != null && userId != null && (newVal.compareTo(userId) == 0)) ||
            (newVal == null && userId == null && userIdIsInitialized)) {
            return;
        }
        userId = newVal;
        userIdIsModified = true;
        userIdIsInitialized = true;
    }

    /**
     * Setter method for userId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to userId
     */
    public void setUserId(int newVal)
    {
        setUserId(new Integer(newVal));
    }

    /**
     * Determines if the userId has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isUserIdModified()
    {
        return userIdIsModified;
    }

    /**
     * Manually set whether userId has been modified or not.
     */
    public void isUserIdModified(boolean value)
    {
        userIdIsModified = value;
    }	

    /**
     * Determines if the userId has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isUserIdInitialized()
    {
        return userIdIsInitialized;
    }

    /**
     * Manually set whether userId has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isUserIdInitialized(boolean value)
    {
        userIdIsInitialized = value;
    }

    /**
     * Determines if the current object is new.
     *
     * @return true if the current object is new, false if the object is not new
     */
    public boolean isNew()
    {
        return _isNew;
    }

    /**
     * Specifies to the object if it has been set as new.
     *
     * @param isNew the boolean value to be assigned to the isNew field
     */
    public void isNew(boolean isNew)
    {
        this._isNew = isNew;
    }

    /**
     * Determines if the object has been modified since the last time this method was called.
     * <br>
     * We can also determine if this object has ever been modified since its creation.
     *
     * @return true if the object has been modified, false if the object has not been modified
     */
    public boolean isModified()
    {
        return creationTimestampIsModified 		|| passwordIsModified  		|| nameIsModified  		|| userIdIsModified  ;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified(boolean isModified)
    {
        creationTimestampIsModified = isModified;
        passwordIsModified = isModified;
        nameIsModified = isModified;
        userIdIsModified = isModified;
    }

    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(WebUserBean bean)
    {
        setCreationTimestamp(bean.getCreationTimestamp());
        setPassword(bean.getPassword());
        setName(bean.getName());
        setUserId(bean.getUserId());
    }

    /**
     * Converts the current object to stripped form of the bean which only includes the properties of the bean and their getters/
     */
    public BaseWebUserBean toBaseBean()
    {
	BaseWebUserBean bean = new BaseWebUserBean();
        bean.setCreationTimestamp(getCreationTimestamp());
        bean.setPassword(getPassword());
        bean.setName(getName());
        bean.setUserId(getUserId());
	return bean;
    }
    
    /**
     * Copies ALL properties of the passed bean into the current bean including isNew and isModified etc
     *
     * @param bean the bean to copy into the current bean
     */
    public void copyAll(WebUserBean bean)
    {
	copy(bean);
	this._isNew = bean.isNew();
	
	creationTimestampIsModified = bean.isCreationTimestampModified();
  	creationTimestampIsInitialized= bean.isCreationTimestampInitialized();
	passwordIsModified = bean.isPasswordModified();
  	passwordIsInitialized= bean.isPasswordInitialized();
	nameIsModified = bean.isNameModified();
  	nameIsInitialized= bean.isNameInitialized();
	userIdIsModified = bean.isUserIdModified();
  	userIdIsInitialized= bean.isUserIdInitialized();
    }    

    /**
     * return a dictionnary of the object
     */
    public Map<String,String> getDictionnary()
    {
        Map<String,String> dictionnary = new HashMap<String,String>();
        dictionnary.put("creation_timestamp", getCreationTimestamp() == null ? "" : getCreationTimestamp().toString());
        dictionnary.put("password", getPassword() == null ? "" : getPassword().toString());
        dictionnary.put("name", getName() == null ? "" : getName().toString());
        dictionnary.put("user_id", getUserId() == null ? "" : getUserId().toString());
        return dictionnary;
    }

    /**
     * return a dictionnary of the pk columns
     */
    public Map<String,String> getPkDictionnary()
    {
        Map<String,String> dictionnary = new HashMap<String,String>();
        dictionnary.put("user_id", getUserId() == null ? "" : getUserId().toString());
        return dictionnary;
    }

    /**
     * return a the value string representation of the given field
     */
    public String getValue(String column)
    {
        if (null == column || "".equals(column)) {
            return "";
        } else if ("creation_timestamp".equalsIgnoreCase(column) || "creationTimestamp".equalsIgnoreCase(column)) {
            return getCreationTimestamp() == null ? "" : getCreationTimestamp().toString();
        } else if ("password".equalsIgnoreCase(column) || "password".equalsIgnoreCase(column)) {
            return getPassword() == null ? "" : getPassword().toString();
        } else if ("name".equalsIgnoreCase(column) || "name".equalsIgnoreCase(column)) {
            return getName() == null ? "" : getName().toString();
        } else if ("user_id".equalsIgnoreCase(column) || "userId".equalsIgnoreCase(column)) {
            return getUserId() == null ? "" : getUserId().toString();
        }
        return "";
    }

    /**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object)
	{
		if (!(object instanceof WebUserBean)) {
			return false;
		}

		WebUserBean obj = (WebUserBean) object;
		return new EqualsBuilder()
            .append(getCreationTimestamp(), obj.getCreationTimestamp())
            .append(getPassword(), obj.getPassword())
            .append(getName(), obj.getName())
            .append(getUserId(), obj.getUserId())
            .isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode()
	{
		return new HashCodeBuilder(-82280557, -700257973)
            .append(getCreationTimestamp())
            .append(getPassword())
            .append(getName())
            .append(getUserId())
            .toHashCode();
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
	    return toString(ToStringStyle.MULTI_LINE_STYLE);
	}

	/**
	 * you can use the following styles:
	 * <li>ToStringStyle.DEFAULT_STYLE</li>
	 * <li>ToStringStyle.MULTI_LINE_STYLE</li>
     * <li>ToStringStyle.NO_FIELD_NAMES_STYLE</li>
     * <li>ToStringStyle.SHORT_PREFIX_STYLE</li>
     * <li>ToStringStyle.SIMPLE_STYLE</li>
	 */
	public String toString(ToStringStyle style) {
		return new ToStringBuilder(this, style)
            .append("creation_timestamp", getCreationTimestamp())
            .append("password", getPassword())
            .append("name", getName())
            .append("user_id", getUserId())
            .toString();
	}


    public int compareTo(Object object)
    {
        WebUserBean obj = (WebUserBean) object;
        return new CompareToBuilder()
            .append(getCreationTimestamp(), obj.getCreationTimestamp())
            .append(getPassword(), obj.getPassword())
            .append(getName(), obj.getName())
            .append(getUserId(), obj.getUserId())
            .toComparison();
   }






    //_____________________________________________________________________
    //

    // SAVE
    //_____________________________________________________________________
    /**
     * Saves the WebUserBean bean into the database.
     *
     * @return the inserted or updated bean
     * @throws DAOException
     */
    //12
    public WebUserBean save() throws DAOException
    {
        return WebUserManagerImpl.getInstance().save(this);
    }

    /**
     * Update the WebUserBean bean record in the database according to the changes.
     *
     * @return the updated bean
     * @throws DAOException
     */
    //14
    public WebUserBean update() throws DAOException
    {
        return WebUserManagerImpl.getInstance().update(this);
    }

    /**
     * Inserts the WebUserBean bean record in the database.
     *
     * @return the updated bean
     * @throws DAOException
     */
    //15
    public WebUserBean insert() throws DAOException
    {
        return WebUserManagerImpl.getInstance().insert(this);
    }

    /**
     * Creates and returns a new instance of WebUserBean.
     *
     * @return
     */
    //15
    public BaseGeneratedBean newBaseInstance()
    {
        return WebUserManagerImpl.getInstance().createWebUserBean();
    }

    /**
     * Creates and returns a new instance of WebUserBean.
     *
     * @return
     */
    //15
    public static WebUserBean newInstance()
    {
        return WebUserManagerImpl.getInstance().createWebUserBean();
    }

    /**
     * Returns manager class for WebUser
     *
     * @return
     */
    //15
    public BaseGeneratedManager getBaseManager()
    {
        return WebUserManagerImpl.getInstance();
    }

    /**
     * Returns name of the corresponding table i.e. WebUser
     *
     * @return
     */
    //15
    public String getTableName()
    {
        return "web_user";
    }



}