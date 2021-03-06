




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.generated.listener;

import uk.co.planetbeyond.service.generated.exception.DAOException;
import uk.co.planetbeyond.service.generated.OtpVerificationBean;

/**
 * Listener that is notified of otp_verification table changes.
 * @author sql2java
 */
public interface OtpVerificationListener
{
    /**
     * Invoked just before inserting a OtpVerificationBean record into the database.
     *
     * @param bean the OtpVerificationBean that is about to be inserted
     */
    public void beforeInsert(OtpVerificationBean bean) throws DAOException;


    /**
     * Invoked just after a OtpVerificationBean record is inserted in the database.
     *
     * @param bean the OtpVerificationBean that was just inserted
     */
    public void afterInsert(OtpVerificationBean bean) throws DAOException;


    /**
     * Invoked just before updating a OtpVerificationBean record in the database.
     *
     * @param bean the OtpVerificationBean that is about to be updated
     */
    public void beforeUpdate(OtpVerificationBean bean) throws DAOException;


    /**
     * Invoked just after updating a OtpVerificationBean record in the database.
     *
     * @param bean the OtpVerificationBean that was just updated
     */
    public void afterUpdate(OtpVerificationBean bean) throws DAOException;


    /**
     * Invoked just before deleting a OtpVerificationBean record in the database.
     *
     * @param bean the OtpVerificationBean that is about to be deleted
     */
    public void beforeDelete(OtpVerificationBean bean) throws DAOException;


    /**
     * Invoked just after deleting a OtpVerificationBean record in the database.
     *
     * @param bean the OtpVerificationBean that was just deleted
     */
    public void afterDelete(OtpVerificationBean bean) throws DAOException;

}
