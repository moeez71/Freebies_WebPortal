




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

import uk.co.planetbeyond.service.manager.PushNotificationManagerImpl;
import uk.co.planetbeyond.service.generated.GeneratedBean;





import uk.co.planetbeyond.service.generated.exception.DAOException;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.sleepycat.persist.model.Persistent;

/**
 * PushNotificationBean is a mapping of push_notification Table.
 * @author sql2java
*/
@Persistent
public class PushNotificationBean extends BasePushNotificationBean implements Serializable, GeneratedBean, JoinHelperInterface
{
	private static final long serialVersionUID = -8212568703426682458L;
	
    private boolean statusIsModified = false;
    private boolean statusIsInitialized = false;

    private boolean scheduledTimeIsModified = false;
    private boolean scheduledTimeIsInitialized = false;

    private boolean textIsModified = false;
    private boolean textIsInitialized = false;

    private boolean notificationIdIsModified = false;
    private boolean notificationIdIsInitialized = false;

    private boolean _isNew = true;

    /**
     * Prefered methods to create a PushNotificationBean is via the createPushNotificationBean method in PushNotificationManager or
     * via the factory class PushNotificationFactory create method
     */
    public PushNotificationBean()
    {
    }



    /**
     * Setter method for status.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to status
     */
    @Override
    public void setStatus(Integer newVal)
    {
        if ((newVal != null && status != null && (newVal.compareTo(status) == 0)) ||
            (newVal == null && status == null && statusIsInitialized)) {
            return;
        }
        status = newVal;
        statusIsModified = true;
        statusIsInitialized = true;
    }

    /**
     * Setter method for status.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to status
     */
    public void setStatus(int newVal)
    {
        setStatus(new Integer(newVal));
    }

    /**
     * Determines if the status has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isStatusModified()
    {
        return statusIsModified;
    }

    /**
     * Manually set whether status has been modified or not.
     */
    public void isStatusModified(boolean value)
    {
        statusIsModified = value;
    }	

    /**
     * Determines if the status has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isStatusInitialized()
    {
        return statusIsInitialized;
    }

    /**
     * Manually set whether status has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isStatusInitialized(boolean value)
    {
        statusIsInitialized = value;
    }



    /**
     * Setter method for scheduledTime.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to scheduledTime
     */
    @Override
    public void setScheduledTime(java.util.Date newVal)
    {
        if ((newVal != null && scheduledTime != null && (newVal.compareTo(scheduledTime) == 0)) ||
            (newVal == null && scheduledTime == null && scheduledTimeIsInitialized)) {
            return;
        }
        scheduledTime = newVal;
        scheduledTimeIsModified = true;
        scheduledTimeIsInitialized = true;
    }

    /**
     * Setter method for scheduledTime.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to scheduledTime
     */
    public void setScheduledTime(long newVal)
    {
        setScheduledTime(new java.util.Date(newVal));
    }

    /**
     * Determines if the scheduledTime has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isScheduledTimeModified()
    {
        return scheduledTimeIsModified;
    }

    /**
     * Manually set whether scheduledTime has been modified or not.
     */
    public void isScheduledTimeModified(boolean value)
    {
        scheduledTimeIsModified = value;
    }	

    /**
     * Determines if the scheduledTime has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isScheduledTimeInitialized()
    {
        return scheduledTimeIsInitialized;
    }

    /**
     * Manually set whether scheduledTime has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isScheduledTimeInitialized(boolean value)
    {
        scheduledTimeIsInitialized = value;
    }



    /**
     * Setter method for text.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to text
     */
    @Override
    public void setText(String newVal)
    {
        if ((newVal != null && text != null && (newVal.compareTo(text) == 0)) ||
            (newVal == null && text == null && textIsInitialized)) {
            return;
        }
        text = newVal;
        textIsModified = true;
        textIsInitialized = true;
    }

    /**
     * Determines if the text has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTextModified()
    {
        return textIsModified;
    }

    /**
     * Manually set whether text has been modified or not.
     */
    public void isTextModified(boolean value)
    {
        textIsModified = value;
    }	

    /**
     * Determines if the text has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTextInitialized()
    {
        return textIsInitialized;
    }

    /**
     * Manually set whether text has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isTextInitialized(boolean value)
    {
        textIsInitialized = value;
    }



    /**
     * Setter method for notificationId.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to notificationId
     */
    @Override
    public void setNotificationId(Integer newVal)
    {
        if ((newVal != null && notificationId != null && (newVal.compareTo(notificationId) == 0)) ||
            (newVal == null && notificationId == null && notificationIdIsInitialized)) {
            return;
        }
        notificationId = newVal;
        notificationIdIsModified = true;
        notificationIdIsInitialized = true;
    }

    /**
     * Setter method for notificationId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to notificationId
     */
    public void setNotificationId(int newVal)
    {
        setNotificationId(new Integer(newVal));
    }

    /**
     * Determines if the notificationId has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isNotificationIdModified()
    {
        return notificationIdIsModified;
    }

    /**
     * Manually set whether notificationId has been modified or not.
     */
    public void isNotificationIdModified(boolean value)
    {
        notificationIdIsModified = value;
    }	

    /**
     * Determines if the notificationId has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isNotificationIdInitialized()
    {
        return notificationIdIsInitialized;
    }

    /**
     * Manually set whether notificationId has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isNotificationIdInitialized(boolean value)
    {
        notificationIdIsInitialized = value;
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
        return statusIsModified 		|| scheduledTimeIsModified  		|| textIsModified  		|| notificationIdIsModified  ;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified(boolean isModified)
    {
        statusIsModified = isModified;
        scheduledTimeIsModified = isModified;
        textIsModified = isModified;
        notificationIdIsModified = isModified;
    }

    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(PushNotificationBean bean)
    {
        setStatus(bean.getStatus());
        setScheduledTime(bean.getScheduledTime());
        setText(bean.getText());
        setNotificationId(bean.getNotificationId());
    }

    /**
     * Converts the current object to stripped form of the bean which only includes the properties of the bean and their getters/
     */
    public BasePushNotificationBean toBaseBean()
    {
	BasePushNotificationBean bean = new BasePushNotificationBean();
        bean.setStatus(getStatus());
        bean.setScheduledTime(getScheduledTime());
        bean.setText(getText());
        bean.setNotificationId(getNotificationId());
	return bean;
    }
    
    /**
     * Copies ALL properties of the passed bean into the current bean including isNew and isModified etc
     *
     * @param bean the bean to copy into the current bean
     */
    public void copyAll(PushNotificationBean bean)
    {
	copy(bean);
	this._isNew = bean.isNew();
	
	statusIsModified = bean.isStatusModified();
  	statusIsInitialized= bean.isStatusInitialized();
	scheduledTimeIsModified = bean.isScheduledTimeModified();
  	scheduledTimeIsInitialized= bean.isScheduledTimeInitialized();
	textIsModified = bean.isTextModified();
  	textIsInitialized= bean.isTextInitialized();
	notificationIdIsModified = bean.isNotificationIdModified();
  	notificationIdIsInitialized= bean.isNotificationIdInitialized();
    }    

    /**
     * return a dictionnary of the object
     */
    public Map<String,String> getDictionnary()
    {
        Map<String,String> dictionnary = new HashMap<String,String>();
        dictionnary.put("status", getStatus() == null ? "" : getStatus().toString());
        dictionnary.put("scheduled_time", getScheduledTime() == null ? "" : getScheduledTime().toString());
        dictionnary.put("text", getText() == null ? "" : getText().toString());
        dictionnary.put("notification_id", getNotificationId() == null ? "" : getNotificationId().toString());
        return dictionnary;
    }

    /**
     * return a dictionnary of the pk columns
     */
    public Map<String,String> getPkDictionnary()
    {
        Map<String,String> dictionnary = new HashMap<String,String>();
        dictionnary.put("notification_id", getNotificationId() == null ? "" : getNotificationId().toString());
        return dictionnary;
    }

    /**
     * return a the value string representation of the given field
     */
    public String getValue(String column)
    {
        if (null == column || "".equals(column)) {
            return "";
        } else if ("status".equalsIgnoreCase(column) || "status".equalsIgnoreCase(column)) {
            return getStatus() == null ? "" : getStatus().toString();
        } else if ("scheduled_time".equalsIgnoreCase(column) || "scheduledTime".equalsIgnoreCase(column)) {
            return getScheduledTime() == null ? "" : getScheduledTime().toString();
        } else if ("text".equalsIgnoreCase(column) || "text".equalsIgnoreCase(column)) {
            return getText() == null ? "" : getText().toString();
        } else if ("notification_id".equalsIgnoreCase(column) || "notificationId".equalsIgnoreCase(column)) {
            return getNotificationId() == null ? "" : getNotificationId().toString();
        }
        return "";
    }

    /**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object)
	{
		if (!(object instanceof PushNotificationBean)) {
			return false;
		}

		PushNotificationBean obj = (PushNotificationBean) object;
		return new EqualsBuilder()
            .append(getStatus(), obj.getStatus())
            .append(getScheduledTime(), obj.getScheduledTime())
            .append(getText(), obj.getText())
            .append(getNotificationId(), obj.getNotificationId())
            .isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode()
	{
		return new HashCodeBuilder(-82280557, -700257973)
            .append(getStatus())
            .append(getScheduledTime())
            .append(getText())
            .append(getNotificationId())
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
            .append("status", getStatus())
            .append("scheduled_time", getScheduledTime())
            .append("text", getText())
            .append("notification_id", getNotificationId())
            .toString();
	}


    public int compareTo(Object object)
    {
        PushNotificationBean obj = (PushNotificationBean) object;
        return new CompareToBuilder()
            .append(getStatus(), obj.getStatus())
            .append(getScheduledTime(), obj.getScheduledTime())
            .append(getText(), obj.getText())
            .append(getNotificationId(), obj.getNotificationId())
            .toComparison();
   }






    //_____________________________________________________________________
    //

    // SAVE
    //_____________________________________________________________________
    /**
     * Saves the PushNotificationBean bean into the database.
     *
     * @return the inserted or updated bean
     * @throws DAOException
     */
    //12
    public PushNotificationBean save() throws DAOException
    {
        return PushNotificationManagerImpl.getInstance().save(this);
    }

    /**
     * Update the PushNotificationBean bean record in the database according to the changes.
     *
     * @return the updated bean
     * @throws DAOException
     */
    //14
    public PushNotificationBean update() throws DAOException
    {
        return PushNotificationManagerImpl.getInstance().update(this);
    }

    /**
     * Inserts the PushNotificationBean bean record in the database.
     *
     * @return the updated bean
     * @throws DAOException
     */
    //15
    public PushNotificationBean insert() throws DAOException
    {
        return PushNotificationManagerImpl.getInstance().insert(this);
    }

    /**
     * Creates and returns a new instance of PushNotificationBean.
     *
     * @return
     */
    //15
    public BaseGeneratedBean newBaseInstance()
    {
        return PushNotificationManagerImpl.getInstance().createPushNotificationBean();
    }

    /**
     * Creates and returns a new instance of PushNotificationBean.
     *
     * @return
     */
    //15
    public static PushNotificationBean newInstance()
    {
        return PushNotificationManagerImpl.getInstance().createPushNotificationBean();
    }

    /**
     * Returns manager class for PushNotification
     *
     * @return
     */
    //15
    public BaseGeneratedManager getBaseManager()
    {
        return PushNotificationManagerImpl.getInstance();
    }

    /**
     * Returns name of the corresponding table i.e. PushNotification
     *
     * @return
     */
    //15
    public String getTableName()
    {
        return "push_notification";
    }



}
