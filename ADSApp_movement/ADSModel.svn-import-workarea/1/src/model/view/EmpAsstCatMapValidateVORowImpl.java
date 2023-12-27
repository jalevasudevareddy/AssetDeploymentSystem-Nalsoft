package model.view;

import model.entity.XxadsEmpAsstCatMapEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 19 11:43:34 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmpAsstCatMapValidateVORowImpl extends ViewRowImpl {
    public static final int ENTITY_XXADSEMPASSTCATMAPEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AssetActiveFlag,
        AssetCategoryId,
        BuId,
        CreatedBy,
        CreationDate,
        EmpCategoryId,
        HeaderId,
        LastUpdateDate,
        LastUpdatedBy,
        ObjectVersionNumber;
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
    public static final int ASSETACTIVEFLAG = AttributesEnum.AssetActiveFlag.index();
    public static final int ASSETCATEGORYID = AttributesEnum.AssetCategoryId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int EMPCATEGORYID = AttributesEnum.EmpCategoryId.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EmpAsstCatMapValidateVORowImpl() {
    }

    /**
     * Gets XxadsEmpAsstCatMapEO entity object.
     * @return the XxadsEmpAsstCatMapEO
     */
    public XxadsEmpAsstCatMapEOImpl getXxadsEmpAsstCatMapEO() {
        return (XxadsEmpAsstCatMapEOImpl) getEntity(ENTITY_XXADSEMPASSTCATMAPEO);
    }

    /**
     * Gets the attribute value for ASSET_ACTIVE_FLAG using the alias name AssetActiveFlag.
     * @return the ASSET_ACTIVE_FLAG
     */
    public String getAssetActiveFlag() {
        return (String) getAttributeInternal(ASSETACTIVEFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_ACTIVE_FLAG using the alias name AssetActiveFlag.
     * @param value value to set the ASSET_ACTIVE_FLAG
     */
    public void setAssetActiveFlag(String value) {
        setAttributeInternal(ASSETACTIVEFLAG, value);
    }

    /**
     * Gets the attribute value for ASSET_CATEGORY_ID using the alias name AssetCategoryId.
     * @return the ASSET_CATEGORY_ID
     */
    public Number getAssetCategoryId() {
        return (Number) getAttributeInternal(ASSETCATEGORYID);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_CATEGORY_ID using the alias name AssetCategoryId.
     * @param value value to set the ASSET_CATEGORY_ID
     */
    public void setAssetCategoryId(Number value) {
        setAttributeInternal(ASSETCATEGORYID, value);
    }

    /**
     * Gets the attribute value for BU_ID using the alias name BuId.
     * @return the BU_ID
     */
    public Number getBuId() {
        return (Number) getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as attribute value for BU_ID using the alias name BuId.
     * @param value value to set the BU_ID
     */
    public void setBuId(Number value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Gets the attribute value for EMP_CATEGORY_ID using the alias name EmpCategoryId.
     * @return the EMP_CATEGORY_ID
     */
    public Number getEmpCategoryId() {
        return (Number) getAttributeInternal(EMPCATEGORYID);
    }

    /**
     * Sets <code>value</code> as attribute value for EMP_CATEGORY_ID using the alias name EmpCategoryId.
     * @param value value to set the EMP_CATEGORY_ID
     */
    public void setEmpCategoryId(Number value) {
        setAttributeInternal(EMPCATEGORYID, value);
    }

    /**
     * Gets the attribute value for HEADER_ID using the alias name HeaderId.
     * @return the HEADER_ID
     */
    public Number getHeaderId() {
        return (Number) getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as attribute value for HEADER_ID using the alias name HeaderId.
     * @param value value to set the HEADER_ID
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Gets the attribute value for OBJECT_VERSION_NUMBER using the alias name ObjectVersionNumber.
     * @return the OBJECT_VERSION_NUMBER
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }
}
