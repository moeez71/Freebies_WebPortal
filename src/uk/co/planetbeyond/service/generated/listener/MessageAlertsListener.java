




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.generated.listener;

import uk.co.planetbeyond.service.generated.exception.DAOException;
import uk.co.planetbeyond.service.generated.MessageAlertsBean;

/**
 * Listener that is notified of message_alerts table changes.
 * @author sql2java
 */
public interface MessageAlertsListener
{
    /**
     * Invoked just before inserting a MessageAlertsBean record into the database.
     *
     * @param bean the MessageAlertsBean that is about to be inserted
     */
    public void beforeInsert(MessageAlertsBean bean) throws DAOException;


    /**
     * Invoked just after a MessageAlertsBean record is inserted in the database.
     *
     * @param bean the MessageAlertsBean that was just inserted
     */
    public void afterInsert(MessageAlertsBean bean) throws DAOException;


    /**
     * Invoked just before updating a MessageAlertsBean record in the database.
     *
     * @param bean the MessageAlertsBean that is about to be updated
     */
    public void beforeUpdate(MessageAlertsBean bean) throws DAOException;


    /**
     * Invoked just after updating a MessageAlertsBean record in the database.
     *
     * @param bean the MessageAlertsBean that was just updated
     */
    public void afterUpdate(MessageAlertsBean bean) throws DAOException;


    /**
     * Invoked just before deleting a MessageAlertsBean record in the database.
     *
     * @param bean the MessageAlertsBean that is about to be deleted
     */
    public void beforeDelete(MessageAlertsBean bean) throws DAOException;


    /**
     * Invoked just after deleting a MessageAlertsBean record in the database.
     *
     * @param bean the MessageAlertsBean that was just deleted
     */
    public void afterDelete(MessageAlertsBean bean) throws DAOException;

}
