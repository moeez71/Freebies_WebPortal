




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

import uk.co.planetbeyond.service.manager.OfferCategoryManagerImpl;

/**
 * OfferCategoryBean is a mapping of offer_category Table.
 * @author sql2java
*/
@Persistent
public class BaseOfferCategoryBean extends BaseGeneratedBean implements Serializable
{
	private static final long serialVersionUID = 5694455838414074681L;
	
    protected Integer type;
    protected String name;
    protected Integer categoryId;

    /**
     * Prefered methods to create a OfferCategoryBean is via the createOfferCategoryBean method in OfferCategoryManager or
     * via the factory class OfferCategoryFactory create method
     */
    public BaseOfferCategoryBean()
    {
    }

    /**
     * Getter method for type.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: offer_category.type</li>
     * <li>comments: 1=daily
2=instagram
3=facebook
4=soundcloud
5=snapchat</li>
     * <li>column size: 3</li>
     * <li>jdbc type returned by the driver: Types.TINYINT</li>
     * </ul>
     *
     * @return the value of type
     */
    public Integer getType()
    {
        return type;
    }

    /**
     * Setter method for type.
     * <br>
     *
     * @param newVal the new value to be assigned to type
     */
    public void setType(Integer newVal)
    {
        type = newVal;
    }

    /**
     * Getter method for name.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: offer_category.name</li>
     * <li>column size: 30</li>
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
     * Getter method for categoryId.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: offer_category.category_id</li>
     * <li> imported key: offer_of_the_day.category_id</li>
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
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(BaseOfferCategoryBean bean)
    {
        setType(bean.getType());
        setName(bean.getName());
        setCategoryId(bean.getCategoryId());
    }

    /**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object)
	{
		if (!(object instanceof BaseOfferCategoryBean)) {
			return false;
		}

		BaseOfferCategoryBean obj = (BaseOfferCategoryBean) object;
		return new EqualsBuilder()
            .append(getType(), obj.getType())
            .append(getName(), obj.getName())
            .append(getCategoryId(), obj.getCategoryId())
            .isEquals();
	}


    /**
     * Converts the current object to full form of the bean which includes all utility methods as well
     */
    public OfferCategoryBean toManagedBean()
    {
	OfferCategoryBean bean = OfferCategoryManagerImpl.getInstance().createOfferCategoryBean();
        bean.setType(getType());
        bean.setName(getName());
        bean.setCategoryId(getCategoryId());
	return bean;
    }
}