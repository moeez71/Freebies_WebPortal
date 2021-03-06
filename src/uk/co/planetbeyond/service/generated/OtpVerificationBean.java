




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

import uk.co.planetbeyond.service.manager.OtpVerificationManagerImpl;
import uk.co.planetbeyond.service.generated.GeneratedBean;





import uk.co.planetbeyond.service.generated.exception.DAOException;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.sleepycat.persist.model.Persistent;

/**
 * OtpVerificationBean is a mapping of otp_verification Table.
 * @author sql2java
*/
@Persistent
public class OtpVerificationBean extends BaseOtpVerificationBean implements Serializable, GeneratedBean, JoinHelperInterface
{
	private static final long serialVersionUID = -8212568703426682458L;
	
    private boolean expiryTimestampIsModified = false;
    private boolean expiryTimestampIsInitialized = false;

    private boolean creationTimestampIsModified = false;
    private boolean creationTimestampIsInitialized = false;

    private boolean statusIsModified = false;
    private boolean statusIsInitialized = false;

    private boolean otpCodeIsModified = false;
    private boolean otpCodeIsInitialized = false;

    private boolean msisdnIsModified = false;
    private boolean msisdnIsInitialized = false;

    private boolean otpIdIsModified = false;
    private boolean otpIdIsInitialized = false;

    private boolean _isNew = true;

    /**
     * Prefered methods to create a OtpVerificationBean is via the createOtpVerificationBean method in OtpVerificationManager or
     * via the factory class OtpVerificationFactory create method
     */
    public OtpVerificationBean()
    {
    }



    /**
     * Setter method for expiryTimestamp.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to expiryTimestamp
     */
    @Override
    public void setExpiryTimestamp(java.util.Date newVal)
    {
        if ((newVal != null && expiryTimestamp != null && (newVal.compareTo(expiryTimestamp) == 0)) ||
            (newVal == null && expiryTimestamp == null && expiryTimestampIsInitialized)) {
            return;
        }
        expiryTimestamp = newVal;
        expiryTimestampIsModified = true;
        expiryTimestampIsInitialized = true;
    }

    /**
     * Setter method for expiryTimestamp.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to expiryTimestamp
     */
    public void setExpiryTimestamp(long newVal)
    {
        setExpiryTimestamp(new java.util.Date(newVal));
    }

    /**
     * Determines if the expiryTimestamp has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isExpiryTimestampModified()
    {
        return expiryTimestampIsModified;
    }

    /**
     * Manually set whether expiryTimestamp has been modified or not.
     */
    public void isExpiryTimestampModified(boolean value)
    {
        expiryTimestampIsModified = value;
    }	

    /**
     * Determines if the expiryTimestamp has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isExpiryTimestampInitialized()
    {
        return expiryTimestampIsInitialized;
    }

    /**
     * Manually set whether expiryTimestamp has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isExpiryTimestampInitialized(boolean value)
    {
        expiryTimestampIsInitialized = value;
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
     * Setter method for otpCode.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to otpCode
     */
    @Override
    public void setOtpCode(String newVal)
    {
        if ((newVal != null && otpCode != null && (newVal.compareTo(otpCode) == 0)) ||
            (newVal == null && otpCode == null && otpCodeIsInitialized)) {
            return;
        }
        otpCode = newVal;
        otpCodeIsModified = true;
        otpCodeIsInitialized = true;
    }

    /**
     * Determines if the otpCode has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isOtpCodeModified()
    {
        return otpCodeIsModified;
    }

    /**
     * Manually set whether otpCode has been modified or not.
     */
    public void isOtpCodeModified(boolean value)
    {
        otpCodeIsModified = value;
    }	

    /**
     * Determines if the otpCode has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isOtpCodeInitialized()
    {
        return otpCodeIsInitialized;
    }

    /**
     * Manually set whether otpCode has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isOtpCodeInitialized(boolean value)
    {
        otpCodeIsInitialized = value;
    }



    /**
     * Setter method for msisdn.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to msisdn
     */
    @Override
    public void setMsisdn(String newVal)
    {
        if ((newVal != null && msisdn != null && (newVal.compareTo(msisdn) == 0)) ||
            (newVal == null && msisdn == null && msisdnIsInitialized)) {
            return;
        }
        msisdn = newVal;
        msisdnIsModified = true;
        msisdnIsInitialized = true;
    }

    /**
     * Determines if the msisdn has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMsisdnModified()
    {
        return msisdnIsModified;
    }

    /**
     * Manually set whether msisdn has been modified or not.
     */
    public void isMsisdnModified(boolean value)
    {
        msisdnIsModified = value;
    }	

    /**
     * Determines if the msisdn has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMsisdnInitialized()
    {
        return msisdnIsInitialized;
    }

    /**
     * Manually set whether msisdn has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isMsisdnInitialized(boolean value)
    {
        msisdnIsInitialized = value;
    }



    /**
     * Setter method for otpId.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to otpId
     */
    @Override
    public void setOtpId(Integer newVal)
    {
        if ((newVal != null && otpId != null && (newVal.compareTo(otpId) == 0)) ||
            (newVal == null && otpId == null && otpIdIsInitialized)) {
            return;
        }
        otpId = newVal;
        otpIdIsModified = true;
        otpIdIsInitialized = true;
    }

    /**
     * Setter method for otpId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to otpId
     */
    public void setOtpId(int newVal)
    {
        setOtpId(new Integer(newVal));
    }

    /**
     * Determines if the otpId has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isOtpIdModified()
    {
        return otpIdIsModified;
    }

    /**
     * Manually set whether otpId has been modified or not.
     */
    public void isOtpIdModified(boolean value)
    {
        otpIdIsModified = value;
    }	

    /**
     * Determines if the otpId has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isOtpIdInitialized()
    {
        return otpIdIsInitialized;
    }

    /**
     * Manually set whether otpId has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isOtpIdInitialized(boolean value)
    {
        otpIdIsInitialized = value;
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
        return expiryTimestampIsModified 		|| creationTimestampIsModified  		|| statusIsModified  		|| otpCodeIsModified  		|| msisdnIsModified  		|| otpIdIsModified  ;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified(boolean isModified)
    {
        expiryTimestampIsModified = isModified;
        creationTimestampIsModified = isModified;
        statusIsModified = isModified;
        otpCodeIsModified = isModified;
        msisdnIsModified = isModified;
        otpIdIsModified = isModified;
    }

    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(OtpVerificationBean bean)
    {
        setExpiryTimestamp(bean.getExpiryTimestamp());
        setCreationTimestamp(bean.getCreationTimestamp());
        setStatus(bean.getStatus());
        setOtpCode(bean.getOtpCode());
        setMsisdn(bean.getMsisdn());
        setOtpId(bean.getOtpId());
    }

    /**
     * Converts the current object to stripped form of the bean which only includes the properties of the bean and their getters/
     */
    public BaseOtpVerificationBean toBaseBean()
    {
	BaseOtpVerificationBean bean = new BaseOtpVerificationBean();
        bean.setExpiryTimestamp(getExpiryTimestamp());
        bean.setCreationTimestamp(getCreationTimestamp());
        bean.setStatus(getStatus());
        bean.setOtpCode(getOtpCode());
        bean.setMsisdn(getMsisdn());
        bean.setOtpId(getOtpId());
	return bean;
    }
    
    /**
     * Copies ALL properties of the passed bean into the current bean including isNew and isModified etc
     *
     * @param bean the bean to copy into the current bean
     */
    public void copyAll(OtpVerificationBean bean)
    {
	copy(bean);
	this._isNew = bean.isNew();
	
	expiryTimestampIsModified = bean.isExpiryTimestampModified();
  	expiryTimestampIsInitialized= bean.isExpiryTimestampInitialized();
	creationTimestampIsModified = bean.isCreationTimestampModified();
  	creationTimestampIsInitialized= bean.isCreationTimestampInitialized();
	statusIsModified = bean.isStatusModified();
  	statusIsInitialized= bean.isStatusInitialized();
	otpCodeIsModified = bean.isOtpCodeModified();
  	otpCodeIsInitialized= bean.isOtpCodeInitialized();
	msisdnIsModified = bean.isMsisdnModified();
  	msisdnIsInitialized= bean.isMsisdnInitialized();
	otpIdIsModified = bean.isOtpIdModified();
  	otpIdIsInitialized= bean.isOtpIdInitialized();
    }    

    /**
     * return a dictionnary of the object
     */
    public Map<String,String> getDictionnary()
    {
        Map<String,String> dictionnary = new HashMap<String,String>();
        dictionnary.put("expiry_timestamp", getExpiryTimestamp() == null ? "" : getExpiryTimestamp().toString());
        dictionnary.put("creation_timestamp", getCreationTimestamp() == null ? "" : getCreationTimestamp().toString());
        dictionnary.put("status", getStatus() == null ? "" : getStatus().toString());
        dictionnary.put("otp_code", getOtpCode() == null ? "" : getOtpCode().toString());
        dictionnary.put("msisdn", getMsisdn() == null ? "" : getMsisdn().toString());
        dictionnary.put("otp_id", getOtpId() == null ? "" : getOtpId().toString());
        return dictionnary;
    }

    /**
     * return a dictionnary of the pk columns
     */
    public Map<String,String> getPkDictionnary()
    {
        Map<String,String> dictionnary = new HashMap<String,String>();
        dictionnary.put("otp_id", getOtpId() == null ? "" : getOtpId().toString());
        return dictionnary;
    }

    /**
     * return a the value string representation of the given field
     */
    public String getValue(String column)
    {
        if (null == column || "".equals(column)) {
            return "";
        } else if ("expiry_timestamp".equalsIgnoreCase(column) || "expiryTimestamp".equalsIgnoreCase(column)) {
            return getExpiryTimestamp() == null ? "" : getExpiryTimestamp().toString();
        } else if ("creation_timestamp".equalsIgnoreCase(column) || "creationTimestamp".equalsIgnoreCase(column)) {
            return getCreationTimestamp() == null ? "" : getCreationTimestamp().toString();
        } else if ("status".equalsIgnoreCase(column) || "status".equalsIgnoreCase(column)) {
            return getStatus() == null ? "" : getStatus().toString();
        } else if ("otp_code".equalsIgnoreCase(column) || "otpCode".equalsIgnoreCase(column)) {
            return getOtpCode() == null ? "" : getOtpCode().toString();
        } else if ("msisdn".equalsIgnoreCase(column) || "msisdn".equalsIgnoreCase(column)) {
            return getMsisdn() == null ? "" : getMsisdn().toString();
        } else if ("otp_id".equalsIgnoreCase(column) || "otpId".equalsIgnoreCase(column)) {
            return getOtpId() == null ? "" : getOtpId().toString();
        }
        return "";
    }

    /**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object)
	{
		if (!(object instanceof OtpVerificationBean)) {
			return false;
		}

		OtpVerificationBean obj = (OtpVerificationBean) object;
		return new EqualsBuilder()
            .append(getExpiryTimestamp(), obj.getExpiryTimestamp())
            .append(getCreationTimestamp(), obj.getCreationTimestamp())
            .append(getStatus(), obj.getStatus())
            .append(getOtpCode(), obj.getOtpCode())
            .append(getMsisdn(), obj.getMsisdn())
            .append(getOtpId(), obj.getOtpId())
            .isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode()
	{
		return new HashCodeBuilder(-82280557, -700257973)
            .append(getExpiryTimestamp())
            .append(getCreationTimestamp())
            .append(getStatus())
            .append(getOtpCode())
            .append(getMsisdn())
            .append(getOtpId())
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
            .append("expiry_timestamp", getExpiryTimestamp())
            .append("creation_timestamp", getCreationTimestamp())
            .append("status", getStatus())
            .append("otp_code", getOtpCode())
            .append("msisdn", getMsisdn())
            .append("otp_id", getOtpId())
            .toString();
	}


    public int compareTo(Object object)
    {
        OtpVerificationBean obj = (OtpVerificationBean) object;
        return new CompareToBuilder()
            .append(getExpiryTimestamp(), obj.getExpiryTimestamp())
            .append(getCreationTimestamp(), obj.getCreationTimestamp())
            .append(getStatus(), obj.getStatus())
            .append(getOtpCode(), obj.getOtpCode())
            .append(getMsisdn(), obj.getMsisdn())
            .append(getOtpId(), obj.getOtpId())
            .toComparison();
   }






    //_____________________________________________________________________
    //

    // SAVE
    //_____________________________________________________________________
    /**
     * Saves the OtpVerificationBean bean into the database.
     *
     * @return the inserted or updated bean
     * @throws DAOException
     */
    //12
    public OtpVerificationBean save() throws DAOException
    {
        return OtpVerificationManagerImpl.getInstance().save(this);
    }

    /**
     * Update the OtpVerificationBean bean record in the database according to the changes.
     *
     * @return the updated bean
     * @throws DAOException
     */
    //14
    public OtpVerificationBean update() throws DAOException
    {
        return OtpVerificationManagerImpl.getInstance().update(this);
    }

    /**
     * Inserts the OtpVerificationBean bean record in the database.
     *
     * @return the updated bean
     * @throws DAOException
     */
    //15
    public OtpVerificationBean insert() throws DAOException
    {
        return OtpVerificationManagerImpl.getInstance().insert(this);
    }

    /**
     * Creates and returns a new instance of OtpVerificationBean.
     *
     * @return
     */
    //15
    public BaseGeneratedBean newBaseInstance()
    {
        return OtpVerificationManagerImpl.getInstance().createOtpVerificationBean();
    }

    /**
     * Creates and returns a new instance of OtpVerificationBean.
     *
     * @return
     */
    //15
    public static OtpVerificationBean newInstance()
    {
        return OtpVerificationManagerImpl.getInstance().createOtpVerificationBean();
    }

    /**
     * Returns manager class for OtpVerification
     *
     * @return
     */
    //15
    public BaseGeneratedManager getBaseManager()
    {
        return OtpVerificationManagerImpl.getInstance();
    }

    /**
     * Returns name of the corresponding table i.e. OtpVerification
     *
     * @return
     */
    //15
    public String getTableName()
    {
        return "otp_verification";
    }



}
