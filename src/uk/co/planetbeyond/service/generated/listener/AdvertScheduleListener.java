




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.generated.listener;

import uk.co.planetbeyond.service.generated.exception.DAOException;
import uk.co.planetbeyond.service.generated.AdvertScheduleBean;

/**
 * Listener that is notified of advert_schedule table changes.
 * @author sql2java
 */
public interface AdvertScheduleListener
{
    /**
     * Invoked just before inserting a AdvertScheduleBean record into the database.
     *
     * @param bean the AdvertScheduleBean that is about to be inserted
     */
    public void beforeInsert(AdvertScheduleBean bean) throws DAOException;


    /**
     * Invoked just after a AdvertScheduleBean record is inserted in the database.
     *
     * @param bean the AdvertScheduleBean that was just inserted
     */
    public void afterInsert(AdvertScheduleBean bean) throws DAOException;


    /**
     * Invoked just before updating a AdvertScheduleBean record in the database.
     *
     * @param bean the AdvertScheduleBean that is about to be updated
     */
    public void beforeUpdate(AdvertScheduleBean bean) throws DAOException;


    /**
     * Invoked just after updating a AdvertScheduleBean record in the database.
     *
     * @param bean the AdvertScheduleBean that was just updated
     */
    public void afterUpdate(AdvertScheduleBean bean) throws DAOException;


    /**
     * Invoked just before deleting a AdvertScheduleBean record in the database.
     *
     * @param bean the AdvertScheduleBean that is about to be deleted
     */
    public void beforeDelete(AdvertScheduleBean bean) throws DAOException;


    /**
     * Invoked just after deleting a AdvertScheduleBean record in the database.
     *
     * @param bean the AdvertScheduleBean that was just deleted
     */
    public void afterDelete(AdvertScheduleBean bean) throws DAOException;

}
