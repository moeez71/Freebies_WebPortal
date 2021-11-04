




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.generated.comparator;

import java.util.Comparator;
import uk.co.planetbeyond.service.generated.FactBean;
import uk.co.planetbeyond.service.generated.FactManager;


/**
 * Comparator class is used to sort the FactBean objects.
 * @author sql2java
 */
public class FactComparator implements Comparator
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
     * Constructor class for FactComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new FactComparator(FactManager.ID_CREATION_TIMESTAMP, bReverse));<code>
     *
     * @param iType the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>FactManager.ID_CREATION_TIMESTAMP
     *   <li>FactManager.ID_TEXT
     *   <li>FactManager.ID_FACT_ID
     * </ul>
     */
    public FactComparator(int iType)
    {
        this(iType, false);
    }

    /**
     * Constructor class for FactComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new FactComparator(FactManager.ID_CREATION_TIMESTAMP, bReverse));<code>
     *
     * @param iType the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>FactManager.ID_CREATION_TIMESTAMP
     *   <li>FactManager.ID_TEXT
     *   <li>FactManager.ID_FACT_ID
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public FactComparator(int iType, boolean bReverse)
    {
        this.iType = iType;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(Object pObj1, Object pObj2)
    {
        FactBean b1 = (FactBean)pObj1;
        FactBean b2 = (FactBean)pObj2;
        int iReturn = 0;
        switch(iType)
        {
            case FactManager.ID_CREATION_TIMESTAMP:
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
            case FactManager.ID_TEXT:
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
            case FactManager.ID_FACT_ID:
                if (b1.getFactId() == null && b2.getFactId() != null) {
                    iReturn = -1;
                } else if (b1.getFactId() == null && b2.getFactId() == null) {
                    iReturn = 0;
                } else if (b1.getFactId() != null && b2.getFactId() == null) {
                    iReturn = 1;
                } else {
                    iReturn = b1.getFactId().compareTo(b2.getFactId());
                }
                break;
            default:
                throw new IllegalArgumentException("Type passed for the field is not supported");
        }

        return bReverse ? (-1 * iReturn) : iReturn;
    }}
