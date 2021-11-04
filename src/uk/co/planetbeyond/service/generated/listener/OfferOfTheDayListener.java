




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.generated.listener;

import uk.co.planetbeyond.service.generated.exception.DAOException;
import uk.co.planetbeyond.service.generated.OfferOfTheDayBean;

/**
 * Listener that is notified of offer_of_the_day table changes.
 * @author sql2java
 */
public interface OfferOfTheDayListener
{
    /**
     * Invoked just before inserting a OfferOfTheDayBean record into the database.
     *
     * @param bean the OfferOfTheDayBean that is about to be inserted
     */
    public void beforeInsert(OfferOfTheDayBean bean) throws DAOException;


    /**
     * Invoked just after a OfferOfTheDayBean record is inserted in the database.
     *
     * @param bean the OfferOfTheDayBean that was just inserted
     */
    public void afterInsert(OfferOfTheDayBean bean) throws DAOException;


    /**
     * Invoked just before updating a OfferOfTheDayBean record in the database.
     *
     * @param bean the OfferOfTheDayBean that is about to be updated
     */
    public void beforeUpdate(OfferOfTheDayBean bean) throws DAOException;


    /**
     * Invoked just after updating a OfferOfTheDayBean record in the database.
     *
     * @param bean the OfferOfTheDayBean that was just updated
     */
    public void afterUpdate(OfferOfTheDayBean bean) throws DAOException;


    /**
     * Invoked just before deleting a OfferOfTheDayBean record in the database.
     *
     * @param bean the OfferOfTheDayBean that is about to be deleted
     */
    public void beforeDelete(OfferOfTheDayBean bean) throws DAOException;


    /**
     * Invoked just after deleting a OfferOfTheDayBean record in the database.
     *
     * @param bean the OfferOfTheDayBean that was just deleted
     */
    public void afterDelete(OfferOfTheDayBean bean) throws DAOException;

}
