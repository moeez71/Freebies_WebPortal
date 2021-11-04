




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

import uk.co.planetbeyond.service.manager.OfferOfTheDayManagerImpl;

/**
 * OfferOfTheDayBean is a mapping of offer_of_the_day Table.
 * @author sql2java
*/
@Persistent
public class BaseOfferOfTheDayBean extends BaseGeneratedBean implements Serializable
{
	private static final long serialVersionUID = 5694455838414074681L;
	
    protected Integer categoryId;
    protected String detail;
    protected java.util.Date creationTimestamp;
    protected java.util.Date scheduledTime;
    protected String name;
    protected Integer offerId;

    /**
     * Prefered methods to create a OfferOfTheDayBean is via the createOfferOfTheDayBean method in OfferOfTheDayManager or
     * via the factory class OfferOfTheDayFactory create method
     */
    public BaseOfferOfTheDayBean()
    {
    }

    /**
     * Getter method for categoryId.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: offer_of_the_day.category_id</li>
     * <li> foreign key: offer_category.category_id</li>
     * <li>column size: 10</li>
     * <li>jdbc type returned by the driver: Types.INTEGER</li>
     * </ul>
     *
     * @return the value of categoryId
     */
    public Integer getCategoryId()
    {
        return categoryId;
    }

    /**
     * Setter method for categoryId.
     * <br>
     *
     * @param newVal the new value to be assigned to categoryId
     */
    public void setCategoryId(Integer newVal)
    {
        categoryId = newVal;
    }

    /**
     * Getter method for detail.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: offer_of_the_day.detail</li>
     * <li>column size: 200</li>
     * <li>jdbc type returned by the driver: Types.VARCHAR</li>
     * </ul>
     *
     * @return the value of detail
     */
    public String getDetail()
    {
        return detail;
    }

    /**
     * Setter method for detail.
     * <br>
     *
     * @param newVal the new value to be assigned to detail
     */
    public void setDetail(String newVal)
    {
        detail = newVal;
    }

    /**
     * Getter method for creationTimestamp.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: offer_of_the_day.creation_timestamp</li>
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
     * Getter method for scheduledTime.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: offer_of_the_day.scheduled_time</li>
     * <li>column size: 19</li>
     * <li>jdbc type returned by the driver: Types.TIMESTAMP</li>
     * </ul>
     *
     * @return the value of scheduledTime
     */
    public java.util.Date getScheduledTime()
    {
        return scheduledTime;
    }

    /**
     * Setter method for scheduledTime.
     * <br>
     *
     * @param newVal the new value to be assigned to scheduledTime
     */
    public void setScheduledTime(java.util.Date newVal)
    {
        scheduledTime = newVal;
    }

    /**
     * Getter method for name.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: offer_of_the_day.name</li>
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
     * Getter method for offerId.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: offer_of_the_day.offer_id</li>
     * <li>column size: 10</li>
     * <li>jdbc type returned by the driver: Types.INTEGER</li>
     * </ul>
     *
     * @return the value of offerId
     */
    public Integer getOfferId()
    {
        return offerId;
    }

    /**
     * Setter method for offerId.
     * <br>
     *
     * @param newVal the new value to be assigned to offerId
     */
    public void setOfferId(Integer newVal)
    {
        offerId = newVal;
    }


    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(BaseOfferOfTheDayBean bean)
    {
        setCategoryId(bean.getCategoryId());
        setDetail(bean.getDetail());
        setCreationTimestamp(bean.getCreationTimestamp());
        setScheduledTime(bean.getScheduledTime());
        setName(bean.getName());
        setOfferId(bean.getOfferId());
    }

    /**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object)
	{
		if (!(object instanceof BaseOfferOfTheDayBean)) {
			return false;
		}

		BaseOfferOfTheDayBean obj = (BaseOfferOfTheDayBean) object;
		return new EqualsBuilder()
            .append(getCategoryId(), obj.getCategoryId())
            .append(getDetail(), obj.getDetail())
            .append(getCreationTimestamp(), obj.getCreationTimestamp())
            .append(getScheduledTime(), obj.getScheduledTime())
            .append(getName(), obj.getName())
            .append(getOfferId(), obj.getOfferId())
            .isEquals();
	}


    /**
     * Converts the current object to full form of the bean which includes all utility methods as well
     */
    public OfferOfTheDayBean toManagedBean()
    {
	OfferOfTheDayBean bean = OfferOfTheDayManagerImpl.getInstance().createOfferOfTheDayBean();
        bean.setCategoryId(getCategoryId());
        bean.setDetail(getDetail());
        bean.setCreationTimestamp(getCreationTimestamp());
        bean.setScheduledTime(getScheduledTime());
        bean.setName(getName());
        bean.setOfferId(getOfferId());
	return bean;
    }
}
