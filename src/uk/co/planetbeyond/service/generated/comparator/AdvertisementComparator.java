




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.generated.comparator;

import java.util.Comparator;
import uk.co.planetbeyond.service.generated.AdvertisementBean;
import uk.co.planetbeyond.service.generated.AdvertisementManager;


/**
 * Comparator class is used to sort the AdvertisementBean objects.
 * @author sql2java
 */
public class AdvertisementComparator implements Comparator
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
     * Constructor class for AdvertisementComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AdvertisementComparator(AdvertisementManager.ID_SCHEDULE_ID, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AdvertisementManager.ID_SCHEDULE_ID
     *   <li>AdvertisementManager.ID_DURATION
     *   <li>AdvertisementManager.ID_BUDGET
     *   <li>AdvertisementManager.ID_PATH
     *   <li>AdvertisementManager.ID_FILENAME
     *   <li>AdvertisementManager.ID_CREATION_TIMESTAMP
     *   <li>AdvertisementManager.ID_NAME
     *   <li>AdvertisementManager.ID_ADVERTISEMENT_ID
     * </ul>
     */
    public AdvertisementComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for AdvertisementComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AdvertisementComparator(AdvertisementManager.ID_SCHEDULE_ID, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AdvertisementManager.ID_SCHEDULE_ID
     *   <li>AdvertisementManager.ID_DURATION
     *   <li>AdvertisementManager.ID_BUDGET
     *   <li>AdvertisementManager.ID_PATH
     *   <li>AdvertisementManager.ID_FILENAME
     *   <li>AdvertisementManager.ID_CREATION_TIMESTAMP
     *   <li>AdvertisementManager.ID_NAME
     *   <li>AdvertisementManager.ID_ADVERTISEMENT_ID
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public AdvertisementComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        AdvertisementBean b1 = (AdvertisementBean)pObj1;
        AdvertisementBean b2 = (AdvertisementBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case AdvertisementManager.ID_SCHEDULE_ID:
                if (b1.getScheduleId() == null && b2.getScheduleId() != null) {
                    iReturn = -1;
                } else if (b1.getScheduleId() == null && b2.getScheduleId() == null) {
                    iReturn = 0;
                } else if (b1.getScheduleId() != null && b2.getScheduleId() == null) {
                    iReturn = 1;
                } else {
                    iReturn = b1.getScheduleId().compareTo(b2.getScheduleId());
                }
                break;
            case AdvertisementManager.ID_DURATION:
                if (b1.getDuration() == null && b2.getDuration() != null) {
                    iReturn = -1;
                } else if (b1.getDuration() == null && b2.getDuration() == null) {
                    iReturn = 0;
                } else if (b1.getDuration() != null && b2.getDuration() == null) {
                    iReturn = 1;
                } else {
                    iReturn = b1.getDuration().compareTo(b2.getDuration());
                }
                break;
            case AdvertisementManager.ID_BUDGET:
                if (b1.getBudget() == null && b2.getBudget() != null) {
                    iReturn = -1;
                } else if (b1.getBudget() == null && b2.getBudget() == null) {
                    iReturn = 0;
                } else if (b1.getBudget() != null && b2.getBudget() == null) {
                    iReturn = 1;
                } else {
                    iReturn = b1.getBudget().compareTo(b2.getBudget());
                }
                break;
            case AdvertisementManager.ID_PATH:
                if (b1.getPath() == null && b2.getPath() != null) {
                    iReturn = -1;
                } else if (b1.getPath() == null && b2.getPath() == null) {
                    iReturn = 0;
                } else if (b1.getPath() != null && b2.getPath() == null) {
                    iReturn = 1;
                } else {
                    iReturn = b1.getPath().compareTo(b2.getPath());
                }
                break;
            case AdvertisementManager.ID_FILENAME:
                if (b1.getFilename() == null && b2.getFilename() != null) {
                    iReturn = -1;
                } else if (b1.getFilename() == null && b2.getFilename() == null) {
                    iReturn = 0;
                } else if (b1.getFilename() != null && b2.getFilename() == null) {
                    iReturn = 1;
                } else {
                    iReturn = b1.getFilename().compareTo(b2.getFilename());
                }
                break;
            case AdvertisementManager.ID_CREATION_TIMESTAMP:
                if (b1.getCreationTimestamp() == null && b2.getCreationTimestamp() != null) {
                    iReturn = -1;
                } else if (b1.getCreationTimestamp() == null && b2.getCreationTimestamp() == null) {
                    iReturn = 0;
                } else if (b1.getCreationTimestamp() != null && b2.getCreationTimestamp() == null) {
                    iReturn = 1;
                } else {
                    iReturn = b1.getCreationTimestamp().compareTo(b2.getCreationTimestamp());
                }
                break;
            case AdvertisementManager.ID_NAME:
                if (b1.getName() == null && b2.getName() != null) {
                    iReturn = -1;
                } else if (b1.getName() == null && b2.getName() == null) {
                    iReturn = 0;
                } else if (b1.getName() != null && b2.getName() == null) {
                    iReturn = 1;
                } else {
                    iReturn = b1.getName().compareTo(b2.getName());
                }
                break;
            case AdvertisementManager.ID_ADVERTISEMENT_ID:
                if (b1.getAdvertisementId() == null && b2.getAdvertisementId() != null) {
                    iReturn = -1;
                } else if (b1.getAdvertisementId() == null && b2.getAdvertisementId() == null) {
                    iReturn = 0;
                } else if (b1.getAdvertisementId() != null && b2.getAdvertisementId() == null) {
                    iReturn = 1;
                } else {
                    iReturn = b1.getAdvertisementId().compareTo(b2.getAdvertisementId());
                }
                break;
            default:
                throw new IllegalArgumentException("Type passed for the field is not supported");
        }

        return bReverse ? (-1 * iReturn) : iReturn;
    }}