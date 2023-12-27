package model.lov;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 28 10:06:33 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AssetRequestSourceBuLOVRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        BuName,
        SourceBuId,
        DivisionRequired,
        DivisionSegNum,
        DeptSegmentNum,
        Precision;
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
    public static final int BUNAME = AttributesEnum.BuName.index();
    public static final int SOURCEBUID = AttributesEnum.SourceBuId.index();
    public static final int DIVISIONREQUIRED = AttributesEnum.DivisionRequired.index();
    public static final int DIVISIONSEGNUM = AttributesEnum.DivisionSegNum.index();
    public static final int DEPTSEGMENTNUM = AttributesEnum.DeptSegmentNum.index();
    public static final int PRECISION = AttributesEnum.Precision.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AssetRequestSourceBuLOVRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute BuName.
     * @return the BuName
     */
    public String getBuName() {
        return (String) getAttributeInternal(BUNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute SourceBuId.
     * @return the SourceBuId
     */
    public Number getSourceBuId() {
        return (Number) getAttributeInternal(SOURCEBUID);
    }

    /**
     * Gets the attribute value for the calculated attribute DivisionRequired.
     * @return the DivisionRequired
     */
    public String getDivisionRequired() {
        return (String) getAttributeInternal(DIVISIONREQUIRED);
    }

    /**
     * Gets the attribute value for the calculated attribute DivisionSegNum.
     * @return the DivisionSegNum
     */
    public Number getDivisionSegNum() {
        return (Number) getAttributeInternal(DIVISIONSEGNUM);
    }

    /**
     * Gets the attribute value for the calculated attribute DeptSegmentNum.
     * @return the DeptSegmentNum
     */
    public Number getDeptSegmentNum() {
        return (Number) getAttributeInternal(DEPTSEGMENTNUM);
    }

    /**
     * Gets the attribute value for the calculated attribute Precision.
     * @return the Precision
     */
    public Integer getPrecision() {
        return (Integer) getAttributeInternal(PRECISION);
    }
}

