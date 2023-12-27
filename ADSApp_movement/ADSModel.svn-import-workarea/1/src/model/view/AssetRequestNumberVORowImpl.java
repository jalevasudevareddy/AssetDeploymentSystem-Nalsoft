package model.view;

import java.math.BigDecimal;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 17 13:00:52 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AssetRequestNumberVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        MaxReqNum;
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


    public static final int MAXREQNUM = AttributesEnum.MaxReqNum.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AssetRequestNumberVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute MaxReqNum.
     * @return the MaxReqNum
     */
    public oracle.jbo.domain.Number getMaxReqNum() {
        return (oracle.jbo.domain.Number) getAttributeInternal(MAXREQNUM);
    }

}

