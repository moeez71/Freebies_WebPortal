




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.generated.comparator;

import java.util.Comparator;
import uk.co.planetbeyond.service.generated.MessageAlertsBean;
import uk.co.planetbeyond.service.generated.MessageAlertsManager;


/**
 * Comparator class is used to sort the MessageAlertsBean objects.
 * @author sql2java
 */
public class MessageAlertsComparator implements Comparator
{
    /**
     * Holds the field on which the comparison is performed.
     */
    private int iType;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for MessageAlertsComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MessageAlertsComparator(MessageAlertsManager.ID_SCHEDULED_TIME, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MessageAlertsManager.ID_SCHEDULED_TIME
     *   <li>MessageAlertsManager.ID_TEXT
     *   <li>MessageAlertsManager.ID_ALERT_ID
     * </ul>
     */
    public MessageAlertsComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for MessageAlertsComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MessageAlertsComparator(MessageAlertsManager.ID_SCHEDULED_TIME, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MessageAlertsManager.ID_SCHEDULED_TIME
     *   <li>MessageAlertsManager.ID_TEXT
     *   <li>MessageAlertsManager.ID_ALERT_ID
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public MessageAlertsComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        MessageAlertsBean b1 = (MessageAlertsBean)pObj1;
        MessageAlertsBean b2 = (MessageAlertsBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case MessageAlertsManager.ID_SCHEDULED_TIME:
                if (b1.getScheduledTime() == null && b2.getScheduledTime() != null) {
                    iReturn = -1;
                } else if (b1.getScheduledTime() == null && b2.getScheduledTime() == null) {
                    iReturn = 0;
                } else if (b1.getScheduledTime() != null && b2.getScheduledTime() == null) {
                    iReturn = 1;
                } else {
                    iReturn = b1.getScheduledTime().compareTo(b2.getScheduledTime());
                }
                break;
            case MessageAlertsManager.ID_TEXT:
                if (b1.getText() == null && b2.getText() != null) {
                    iReturn = -1;
                } else if (b1.getText() == null && b2.getText() == null) {
                    iReturn = 0;
                } else if (b1.getText() != null && b2.getText() == null) {
                    iReturn = 1;
                } else {
                    iReturn = b1.getText().compareTo(b2.getText());
                }
                break;
            case MessageAlertsManager.ID_ALERT_ID:
                if (b1.getAlertId() == null && b2.getAlertId() != null) {
                    iReturn = -1;
                } else if (b1.getAlertId() == null && b2.getAlertId() == null) {
                    iReturn = 0;
                } else if (b1.getAlertId() != null && b2.getAlertId() == null) {
                    iReturn = 1;
                } else {
                    iReturn = b1.getAlertId().compareTo(b2.getAlertId());
                }
                break;
            default:
                throw new IllegalArgumentException("Type passed for the field is not supported");
        }

        return bReverse ? (-1 * iReturn) : iReturn;
    }}
