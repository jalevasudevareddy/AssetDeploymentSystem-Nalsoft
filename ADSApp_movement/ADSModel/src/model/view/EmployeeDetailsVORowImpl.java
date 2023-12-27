package model.view;

import java.math.BigDecimal;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 04 19:15:13 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeeDetailsVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        PersonNumber,
        EmployeeId,
        EmployeeName;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int PERSONNUMBER = AttributesEnum.PersonNumber.index();
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int EMPLOYEENAME = AttributesEnum.EmployeeName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EmployeeDetailsVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute PersonNumber.
     * @return the PersonNumber
     */
    public String getPersonNumber() {
        return (String) getAttributeInternal(PERSONNUMBER);
    }

    /**
     * Gets the attribute value for the calculated attribute EmployeeId.
     * @return the EmployeeId
     */
    public Number getEmployeeId() {
        return (Number) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Gets the attribute value for the calculated attribute EmployeeName.
     * @return the EmployeeName
     */
    public String getEmployeeName() {
        return (String) getAttributeInternal(EMPLOYEENAME);
    }
}
