




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

import uk.co.planetbeyond.service.manager.AdvertScheduleManagerImpl;
import uk.co.planetbeyond.service.generated.GeneratedBean;

import uk.co.planetbeyond.service.generated.cache.ClientCache;

import uk.co.planetbeyond.service.generated.AdvertisementBean;
import uk.co.planetbeyond.service.manager.AdvertisementManagerImpl;
import uk.co.planetbeyond.service.generated.ClientBean;
import uk.co.planetbeyond.service.manager.ClientManagerImpl;



import uk.co.planetbeyond.service.generated.exception.DAOException;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.sleepycat.persist.model.Persistent;

/**
 * AdvertScheduleBean is a mapping of advert_schedule Table.
 * @author sql2java
*/
@Persistent
public class AdvertScheduleBean extends BaseAdvertScheduleBean implements Serializable, GeneratedBean, JoinHelperInterface
{
	private static final long serialVersionUID = -8215873669860050714L;
	
    private boolean creationTimestampIsModified = false;
    private boolean creationTimestampIsInitialized = false;

    private boolean scheduledTimestampIsModified = false;
    private boolean scheduledTimestampIsInitialized = false;

    private boolean descriptionIsModified = false;
    private boolean descriptionIsInitialized = false;

    private boolean nameIsModified = false;
    private boolean nameIsInitialized = false;

    private boolean clientIdIsModified = false;
    private boolean clientIdIsInitialized = false;

    private boolean scheduleIdIsModified = false;
    private boolean scheduleIdIsInitialized = false;

    private boolean _isNew = true;

    /**
     * Prefered methods to create a AdvertScheduleBean is via the createAdvertScheduleBean method in AdvertScheduleManager or
     * via the factory class AdvertScheduleFactory create method
     */
    public AdvertScheduleBean()
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
     * Setter method for scheduledTimestamp.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to scheduledTimestamp
     */
    @Override
    public void setScheduledTimestamp(java.util.Date newVal)
    {
        if ((newVal != null && scheduledTimestamp != null && (newVal.compareTo(scheduledTimestamp) == 0)) ||
            (newVal == null && scheduledTimestamp == null && scheduledTimestampIsInitialized)) {
            return;
        }
        scheduledTimestamp = newVal;
        scheduledTimestampIsModified = true;
        scheduledTimestampIsInitialized = true;
    }

    /**
     * Setter method for scheduledTimestamp.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to scheduledTimestamp
     */
    public void setScheduledTimestamp(long newVal)
    {
        setScheduledTimestamp(new java.util.Date(newVal));
    }

    /**
     * Determines if the scheduledTimestamp has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isScheduledTimestampModified()
    {
        return scheduledTimestampIsModified;
    }

    /**
     * Manually set whether scheduledTimestamp has been modified or not.
     */
    public void isScheduledTimestampModified(boolean value)
    {
        scheduledTimestampIsModified = value;
    }	

    /**
     * Determines if the scheduledTimestamp has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isScheduledTimestampInitialized()
    {
        return scheduledTimestampIsInitialized;
    }

    /**
     * Manually set whether scheduledTimestamp has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isScheduledTimestampInitialized(boolean value)
    {
        scheduledTimestampIsInitialized = value;
    }



    /**
     * Setter method for description.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to description
     */
    @Override
    public void setDescription(String newVal)
    {
        if ((newVal != null && description != null && (newVal.compareTo(description) == 0)) ||
            (newVal == null && description == null && descriptionIsInitialized)) {
            return;
        }
        description = newVal;
        descriptionIsModified = true;
        descriptionIsInitialized = true;
    }

    /**
     * Determines if the description has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isDescriptionModified()
    {
        return descriptionIsModified;
    }

    /**
     * Manually set whether description has been modified or not.
     */
    public void isDescriptionModified(boolean value)
    {
        descriptionIsModified = value;
    }	

    /**
     * Determines if the description has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isDescriptionInitialized()
    {
        return descriptionIsInitialized;
    }

    /**
     * Manually set whether description has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isDescriptionInitialized(boolean value)
    {
        descriptionIsInitialized = value;
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
     * Setter method for clientId.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to clientId
     */
    @Override
    public void setClientId(Integer newVal)
    {
        if ((newVal != null && clientId != null && (newVal.compareTo(clientId) == 0)) ||
            (newVal == null && clientId == null && clientIdIsInitialized)) {
            return;
        }
        clientId = newVal;
        clientIdIsModified = true;
        clientIdIsInitialized = true;
    }

    /**
     * Setter method for clientId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to clientId
     */
    public void setClientId(int newVal)
    {
        setClientId(new Integer(newVal));
    }

    /**
     * Determines if the clientId has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isClientIdModified()
    {
        return clientIdIsModified;
    }

    /**
     * Manually set whether clientId has been modified or not.
     */
    public void isClientIdModified(boolean value)
    {
        clientIdIsModified = value;
    }	

    /**
     * Determines if the clientId has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isClientIdInitialized()
    {
        return clientIdIsInitialized;
    }

    /**
     * Manually set whether clientId has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isClientIdInitialized(boolean value)
    {
        clientIdIsInitialized = value;
    }



    /**
     * Setter method for scheduleId.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to scheduleId
     */
    @Override
    public void setScheduleId(Integer newVal)
    {
        if ((newVal != null && scheduleId != null && (newVal.compareTo(scheduleId) == 0)) ||
            (newVal == null && scheduleId == null && scheduleIdIsInitialized)) {
            return;
        }
        scheduleId = newVal;
        scheduleIdIsModified = true;
        scheduleIdIsInitialized = true;
    }

    /**
     * Setter method for scheduleId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to scheduleId
     */
    public void setScheduleId(int newVal)
    {
        setScheduleId(new Integer(newVal));
    }

    /**
     * Determines if the scheduleId has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isScheduleIdModified()
    {
        return scheduleIdIsModified;
    }

    /**
     * Manually set whether scheduleId has been modified or not.
     */
    public void isScheduleIdModified(boolean value)
    {
        scheduleIdIsModified = value;
    }	

    /**
     * Determines if the scheduleId has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isScheduleIdInitialized()
    {
        return scheduleIdIsInitialized;
    }

    /**
     * Manually set whether scheduleId has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isScheduleIdInitialized(boolean value)
    {
        scheduleIdIsInitialized = value;
    }

    /** The Client referenced by this bean. */
    private ClientBean referencedClient;
    /** Getter method for ClientBean. */
    public ClientBean getClientBean() {
        return this.referencedClient;
    }
    /** Setter method for ClientBean. */
    public void setClientBean(ClientBean reference) {
        this.referencedClient = reference;
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
        return creationTimestampIsModified 		|| scheduledTimestampIsModified  		|| descriptionIsModified  		|| nameIsModified  		|| clientIdIsModified  		|| scheduleIdIsModified  ;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified(boolean isModified)
    {
        creationTimestampIsModified = isModified;
        scheduledTimestampIsModified = isModified;
        descriptionIsModified = isModified;
        nameIsModified = isModified;
        clientIdIsModified = isModified;
        scheduleIdIsModified = isModified;
    }

    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(AdvertScheduleBean bean)
    {
        setCreationTimestamp(bean.getCreationTimestamp());
        setScheduledTimestamp(bean.getScheduledTimestamp());
        setDescription(bean.getDescription());
        setName(bean.getName());
        setClientId(bean.getClientId());
        setScheduleId(bean.getScheduleId());
    }

    /**
     * Converts the current object to stripped form of the bean which only includes the properties of the bean and their getters/
     */
    public BaseAdvertScheduleBean toBaseBean()
    {
	BaseAdvertScheduleBean bean = new BaseAdvertScheduleBean();
        bean.setCreationTimestamp(getCreationTimestamp());
        bean.setScheduledTimestamp(getScheduledTimestamp());
        bean.setDescription(getDescription());
        bean.setName(getName());
        bean.setClientId(getClientId());
        bean.setScheduleId(getScheduleId());
	return bean;
    }
    
    /**
     * Copies ALL properties of the passed bean into the current bean including isNew and isModified etc
     *
     * @param bean the bean to copy into the current bean
     */
    public void copyAll(AdvertScheduleBean bean)
    {
	copy(bean);
	this._isNew = bean.isNew();
	
	creationTimestampIsModified = bean.isCreationTimestampModified();
  	creationTimestampIsInitialized= bean.isCreationTimestampInitialized();
	scheduledTimestampIsModified = bean.isScheduledTimestampModified();
  	scheduledTimestampIsInitialized= bean.isScheduledTimestampInitialized();
	descriptionIsModified = bean.isDescriptionModified();
  	descriptionIsInitialized= bean.isDescriptionInitialized();
	nameIsModified = bean.isNameModified();
  	nameIsInitialized= bean.isNameInitialized();
	clientIdIsModified = bean.isClientIdModified();
  	clientIdIsInitialized= bean.isClientIdInitialized();
	scheduleIdIsModified = bean.isScheduleIdModified();
  	scheduleIdIsInitialized= bean.isScheduleIdInitialized();
    }    

    /**
     * return a dictionnary of the object
     */
    public Map<String,String> getDictionnary()
    {
        Map<String,String> dictionnary = new HashMap<String,String>();
        dictionnary.put("creation_timestamp", getCreationTimestamp() == null ? "" : getCreationTimestamp().toString());
        dictionnary.put("scheduled_timestamp", getScheduledTimestamp() == null ? "" : getScheduledTimestamp().toString());
        dictionnary.put("description", getDescription() == null ? "" : getDescription().toString());
        dictionnary.put("name", getName() == null ? "" : getName().toString());
        dictionnary.put("client_id", getClientId() == null ? "" : getClientId().toString());
        dictionnary.put("schedule_id", getScheduleId() == null ? "" : getScheduleId().toString());
        return dictionnary;
    }

    /**
     * return a dictionnary of the pk columns
     */
    public Map<String,String> getPkDictionnary()
    {
        Map<String,String> dictionnary = new HashMap<String,String>();
        dictionnary.put("schedule_id", getScheduleId() == null ? "" : getScheduleId().toString());
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
        } else if ("scheduled_timestamp".equalsIgnoreCase(column) || "scheduledTimestamp".equalsIgnoreCase(column)) {
            return getScheduledTimestamp() == null ? "" : getScheduledTimestamp().toString();
        } else if ("description".equalsIgnoreCase(column) || "description".equalsIgnoreCase(column)) {
            return getDescription() == null ? "" : getDescription().toString();
        } else if ("name".equalsIgnoreCase(column) || "name".equalsIgnoreCase(column)) {
            return getName() == null ? "" : getName().toString();
        } else if ("client_id".equalsIgnoreCase(column) || "clientId".equalsIgnoreCase(column)) {
            return getClientId() == null ? "" : getClientId().toString();
        } else if ("schedule_id".equalsIgnoreCase(column) || "scheduleId".equalsIgnoreCase(column)) {
            return getScheduleId() == null ? "" : getScheduleId().toString();
        }
        return "";
    }

    /**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object)
	{
		if (!(object instanceof AdvertScheduleBean)) {
			return false;
		}

		AdvertScheduleBean obj = (AdvertScheduleBean) object;
		return new EqualsBuilder()
            .append(getCreationTimestamp(), obj.getCreationTimestamp())
            .append(getScheduledTimestamp(), obj.getScheduledTimestamp())
            .append(getDescription(), obj.getDescription())
            .append(getName(), obj.getName())
            .append(getClientId(), obj.getClientId())
            .append(getScheduleId(), obj.getScheduleId())
            .isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode()
	{
		return new HashCodeBuilder(-82280557, -700257973)
            .append(getCreationTimestamp())
            .append(getScheduledTimestamp())
            .append(getDescription())
            .append(getName())
            .append(getClientId())
            .append(getScheduleId())
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
            .append("scheduled_timestamp", getScheduledTimestamp())
            .append("description", getDescription())
            .append("name", getName())
            .append("client_id", getClientId())
            .append("schedule_id", getScheduleId())
            .toString();
	}


    public int compareTo(Object object)
    {
        AdvertScheduleBean obj = (AdvertScheduleBean) object;
        return new CompareToBuilder()
            .append(getCreationTimestamp(), obj.getCreationTimestamp())
            .append(getScheduledTimestamp(), obj.getScheduledTimestamp())
            .append(getDescription(), obj.getDescription())
            .append(getName(), obj.getName())
            .append(getClientId(), obj.getClientId())
            .append(getScheduleId(), obj.getScheduleId())
            .toComparison();
   }



    //////////////////////////////////////
    // GET/SET IMPORTED KEY BEAN METHOD
    //////////////////////////////////////


    /**
     * Retrieves the AdvertisementBean object from database where advert_schedule.schedule_id == advertisement.schedule_id
     *
     * @return the associated AdvertisementBean bean
     * @throws DAOException
     */
    //3.0 GET IMPORTED
    public List<AdvertisementBean> loadAdvertisements() throws DAOException
    {
        AdvertisementBean other = AdvertisementManagerImpl.getInstance().createAdvertisementBean();
        other.setScheduleId(getScheduleId());
        return AdvertisementManagerImpl.getInstance().loadUsingTemplateAsList(other);
    }

    /**
     * Retrieves a single object of AdvertisementBean from database where advert_schedule.schedule_id == advertisement.schedule_id
     *
     * @return the associated AdvertisementBean bean
     * @throws DAOException
     */
    //3.0.1 GET IMPORTED
    public AdvertisementBean loadSingleAdvertisement() throws DAOException
    {
        List<AdvertisementBean> list = loadAdvertisements();
	
	if (list == null || list.size() == 0)
	{
		return null;
	}

	return list.get(0);
    }



    //////////////////////////////////////
    // GET/SET FOREIGN KEY BEAN METHOD
    //////////////////////////////////////
    /**
     * Retrieves the ClientBean object from database where advert_schedule.client_id == client.client_id
     *
     * @return the associated ClientBean bean
     * @throws DAOException
     */
    //3.1 GET IMPORTED VALUES
    public ClientBean loadClient() throws DAOException
    {
        ClientBean other = ClientManagerImpl.getInstance().createClientBean();
        other.setClientId(getClientId()); 
        setClientBean(ClientManagerImpl.getInstance().loadUniqueUsingTemplate(other)); 
        return getClientBean();
    }





    /**
     * Retrieves and stores (if not already present) the ClientBean object from the cache where advert_schedule.client_id == client.client_id
     *
     * @return the associated ClientBean bean
     * @throws DAOException
     */
    //3.4 GET IMPORTED VALUES
    public ClientBean loadClientFromCache() throws DAOException
    {
        return ClientCache.getInstance().fetchClient(getClientId());
    }



    //_____________________________________________________________________
    //

    // SAVE
    //_____________________________________________________________________
    /**
     * Saves the AdvertScheduleBean bean into the database.
     *
     * @return the inserted or updated bean
     * @throws DAOException
     */
    //12
    public AdvertScheduleBean save() throws DAOException
    {
        return AdvertScheduleManagerImpl.getInstance().save(this);
    }

    /**
     * Update the AdvertScheduleBean bean record in the database according to the changes.
     *
     * @return the updated bean
     * @throws DAOException
     */
    //14
    public AdvertScheduleBean update() throws DAOException
    {
        return AdvertScheduleManagerImpl.getInstance().update(this);
    }

    /**
     * Inserts the AdvertScheduleBean bean record in the database.
     *
     * @return the updated bean
     * @throws DAOException
     */
    //15
    public AdvertScheduleBean insert() throws DAOException
    {
        return AdvertScheduleManagerImpl.getInstance().insert(this);
    }

    /**
     * Creates and returns a new instance of AdvertScheduleBean.
     *
     * @return
     */
    //15
    public BaseGeneratedBean newBaseInstance()
    {
        return AdvertScheduleManagerImpl.getInstance().createAdvertScheduleBean();
    }

    /**
     * Creates and returns a new instance of AdvertScheduleBean.
     *
     * @return
     */
    //15
    public static AdvertScheduleBean newInstance()
    {
        return AdvertScheduleManagerImpl.getInstance().createAdvertScheduleBean();
    }

    /**
     * Returns manager class for AdvertSchedule
     *
     * @return
     */
    //15
    public BaseGeneratedManager getBaseManager()
    {
        return AdvertScheduleManagerImpl.getInstance();
    }

    /**
     * Returns name of the corresponding table i.e. AdvertSchedule
     *
     * @return
     */
    //15
    public String getTableName()
    {
        return "advert_schedule";
    }



}
