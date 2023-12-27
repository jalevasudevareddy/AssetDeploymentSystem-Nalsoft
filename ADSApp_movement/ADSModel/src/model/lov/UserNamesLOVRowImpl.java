package model.lov;

import java.math.BigDecimal;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 18 12:44:46 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UserNamesLOVRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        UserName,
        UserId,
        EmployeeName,
        PersonNumber,
        EmployeeId;
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


    public static final int USERNAME = AttributesEnum.UserName.index();
    public static final int USERID = AttributesEnum.UserId.index();
    public static final int EMPLOYEENAME = AttributesEnum.EmployeeName.index();
    public static final int PERSONNUMBER = AttributesEnum.PersonNumber.index();
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UserNamesLOVRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute UserName.
     * @return the UserName
     */
    public String getUserName() {
        return (String) getAttributeInternal(USERNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute UserId.
     * @return the UserId
     */
    public oracle.jbo.domain.Number getUserId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(USERID);
    }

    /**
     * Gets the attribute value for the calculated attribute EmployeeName.
     * @return the EmployeeName
     */
    public String getEmployeeName() {
        return (String) getAttributeInternal(EMPLOYEENAME);
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
}

