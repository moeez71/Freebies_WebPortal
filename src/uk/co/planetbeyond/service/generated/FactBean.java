




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

import uk.co.planetbeyond.service.manager.FactManagerImpl;
import uk.co.planetbeyond.service.generated.GeneratedBean;





import uk.co.planetbeyond.service.generated.exception.DAOException;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.sleepycat.persist.model.Persistent;

/**
 * FactBean is a mapping of fact Table.
 * @author sql2java
*/
@Persistent
public class FactBean extends BaseFactBean implements Serializable, GeneratedBean, JoinHelperInterface
{
	private static final long serialVersionUID = -8210916215915031034L;
	
    private boolean creationTimestampIsModified = false;
    private boolean creationTimestampIsInitialized = false;

    private boolean textIsModified = false;
    private boolean textIsInitialized = false;

    private boolean factIdIsModified = false;
    private boolean factIdIsInitialized = false;

    private boolean _isNew = true;

    /**
     * Prefered methods to create a FactBean is via the createFactBean method in FactManager or
     * via the factory class FactFactory create method
     */
    public FactBean()
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
     * Setter method for factId.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to factId
     */
    @Override
    public void setFactId(Integer newVal)
    {
        if ((newVal != null && factId != null && (newVal.compareTo(factId) == 0)) ||
            (newVal == null && factId == null && factIdIsInitialized)) {
            return;
        }
        factId = newVal;
        factIdIsModified = true;
        factIdIsInitialized = true;
    }

    /**
     * Setter method for factId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to factId
     */
    public void setFactId(int newVal)
    {
        setFactId(new Integer(newVal));
    }

    /**
     * Determines if the factId has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isFactIdModified()
    {
        return factIdIsModified;
    }

    /**
     * Manually set whether factId has been modified or not.
     */
    public void isFactIdModified(boolean value)
    {
        factIdIsModified = value;
    }	

    /**
     * Determines if the factId has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isFactIdInitialized()
    {
        return factIdIsInitialized;
    }

    /**
     * Manually set whether factId has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isFactIdInitialized(boolean value)
    {
        factIdIsInitialized = value;
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
        return creationTimestampIsModified 		|| textIsModified  		|| factIdIsModified  ;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified(boolean isModified)
    {
        creationTimestampIsModified = isModified;
        textIsModified = isModified;
        factIdIsModified = isModified;
    }

    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(FactBean bean)
    {
        setCreationTimestamp(bean.getCreationTimestamp());
        setText(bean.getText());
        setFactId(bean.getFactId());
    }

    /**
     * Converts the current object to stripped form of the bean which only includes the properties of the bean and their getters/
     */
    public BaseFactBean toBaseBean()
    {
	BaseFactBean bean = new BaseFactBean();
        bean.setCreationTimestamp(getCreationTimestamp());
        bean.setText(getText());
        bean.setFactId(getFactId());
	return bean;
    }
    
    /**
     * Copies ALL properties of the passed bean into the current bean including isNew and isModified etc
     *
     * @param bean the bean to copy into the current bean
     */
    public void copyAll(FactBean bean)
    {
	copy(bean);
	this._isNew = bean.isNew();
	
	creationTimestampIsModified = bean.isCreationTimestampModified();
  	creationTimestampIsInitialized= bean.isCreationTimestampInitialized();
	textIsModified = bean.isTextModified();
  	textIsInitialized= bean.isTextInitialized();
	factIdIsModified = bean.isFactIdModified();
  	factIdIsInitialized= bean.isFactIdInitialized();
    }    

    /**
     * return a dictionnary of the object
     */
    public Map<String,String> getDictionnary()
    {
        Map<String,String> dictionnary = new HashMap<String,String>();
        dictionnary.put("creation_timestamp", getCreationTimestamp() == null ? "" : getCreationTimestamp().toString());
        dictionnary.put("text", getText() == null ? "" : getText().toString());
        dictionnary.put("fact_id", getFactId() == null ? "" : getFactId().toString());
        return dictionnary;
    }

    /**
     * return a dictionnary of the pk columns
     */
    public Map<String,String> getPkDictionnary()
    {
        Map<String,String> dictionnary = new HashMap<String,String>();
        dictionnary.put("fact_id", getFactId() == null ? "" : getFactId().toString());
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
        } else if ("text".equalsIgnoreCase(column) || "text".equalsIgnoreCase(column)) {
            return getText() == null ? "" : getText().toString();
        } else if ("fact_id".equalsIgnoreCase(column) || "factId".equalsIgnoreCase(column)) {
            return getFactId() == null ? "" : getFactId().toString();
        }
        return "";
    }

    /**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object)
	{
		if (!(object instanceof FactBean)) {
			return false;
		}

		FactBean obj = (FactBean) object;
		return new EqualsBuilder()
            .append(getCreationTimestamp(), obj.getCreationTimestamp())
            .append(getText(), obj.getText())
            .append(getFactId(), obj.getFactId())
            .isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode()
	{
		return new HashCodeBuilder(-82280557, -700257973)
            .append(getCreationTimestamp())
            .append(getText())
            .append(getFactId())
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
            .append("text", getText())
            .append("fact_id", getFactId())
            .toString();
	}


    public int compareTo(Object object)
    {
        FactBean obj = (FactBean) object;
        return new CompareToBuilder()
            .append(getCreationTimestamp(), obj.getCreationTimestamp())
            .append(getText(), obj.getText())
            .append(getFactId(), obj.getFactId())
            .toComparison();
   }






    //_____________________________________________________________________
    //

    // SAVE
    //_____________________________________________________________________
    /**
     * Saves the FactBean bean into the database.
     *
     * @return the inserted or updated bean
     * @throws DAOException
     */
    //12
    public FactBean save() throws DAOException
    {
        return FactManagerImpl.getInstance().save(this);
    }

    /**
     * Update the FactBean bean record in the database according to the changes.
     *
     * @return the updated bean
     * @throws DAOException
     */
    //14
    public FactBean update() throws DAOException
    {
        return FactManagerImpl.getInstance().update(this);
    }

    /**
     * Inserts the FactBean bean record in the database.
     *
     * @return the updated bean
     * @throws DAOException
     */
    //15
    public FactBean insert() throws DAOException
    {
        return FactManagerImpl.getInstance().insert(this);
    }

    /**
     * Creates and returns a new instance of FactBean.
     *
     * @return
     */
    //15
    public BaseGeneratedBean newBaseInstance()
    {
        return FactManagerImpl.getInstance().createFactBean();
    }

    /**
     * Creates and returns a new instance of FactBean.
     *
     * @return
     */
    //15
    public static FactBean newInstance()
    {
        return FactManagerImpl.getInstance().createFactBean();
    }

    /**
     * Returns manager class for Fact
     *
     * @return
     */
    //15
    public BaseGeneratedManager getBaseManager()
    {
        return FactManagerImpl.getInstance();
    }

    /**
     * Returns name of the corresponding table i.e. Fact
     *
     * @return
     */
    //15
    public String getTableName()
    {
        return "fact";
    }



}
