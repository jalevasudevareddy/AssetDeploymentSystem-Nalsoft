package model.lov;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jan 27 19:08:32 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BillNumberLOVRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        BillNumber,
        BillSeq;
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


    public static final int BILLNUMBER = AttributesEnum.BillNumber.index();
    public static final int BILLSEQ = AttributesEnum.BillSeq.index();

    /**
     * This is the default constructor (do not remove).
     */
    public BillNumberLOVRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute BillNumber.
     * @return the BillNumber
     */
    public String getBillNumber() {
        return (String) getAttributeInternal(BILLNUMBER);
    }

    /**
     * Gets the attribute value for the calculated attribute BillSeq.
     * @return the BillSeq
     */
    public BigDecimal getBillSeq() {
        return (BigDecimal) getAttributeInternal(BILLSEQ);
    }
}

