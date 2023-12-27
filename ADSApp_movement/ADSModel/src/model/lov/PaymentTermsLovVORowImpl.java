package model.lov;

import java.math.BigDecimal;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 02 15:46:28 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PaymentTermsLovVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TermId,
        Name,
        Description,
        DueDays;
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


    public static final int TERMID = AttributesEnum.TermId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int DUEDAYS = AttributesEnum.DueDays.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PaymentTermsLovVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute TermId.
     * @return the TermId
     */
    public oracle.jbo.domain.Number getTermId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(TERMID);
    }

    /**
     * Gets the attribute value for the calculated attribute Name.
     * @return the Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Gets the attribute value for the calculated attribute Description.
     * @return the Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Gets the attribute value for the calculated attribute DueDays.
     * @return the DueDays
     */
    public Number getDueDays() {
        return (Number) getAttributeInternal(DUEDAYS);
    }
}

