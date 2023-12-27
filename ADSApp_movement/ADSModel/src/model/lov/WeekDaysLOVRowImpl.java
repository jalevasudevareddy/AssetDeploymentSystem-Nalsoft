package model.lov;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 13 10:44:50 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WeekDaysLOVRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        WeekDay;
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
    public static final int WEEKDAY = AttributesEnum.WeekDay.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WeekDaysLOVRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute WeekDay.
     * @return the WeekDay
     */
    public String getWeekDay() {
        return (String) getAttributeInternal(WEEKDAY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WeekDay.
     * @param value value to set the  WeekDay
     */
    public void setWeekDay(String value) {
        setAttributeInternal(WEEKDAY, value);
    }
}

