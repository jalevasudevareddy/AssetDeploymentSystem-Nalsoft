package model.view;

import model.entity.ReplacementCategoriesEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 13 17:04:19 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ReplacementCategoryValidateVORowImpl extends ViewRowImpl {
    public static final int ENTITY_REPLACEMENTCATEGORIESEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ActiveFlag,
        BuId,
        CategoryId,
        CreatedBy,
        CreationDate,
        LastUpdateDate,
        LastUpdatedBy,
        ObjectVersionNumber,
        ReplacementCategoryId,
        ReplacementId;
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
    public static final int ACTIVEFLAG = AttributesEnum.ActiveFlag.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int CATEGORYID = AttributesEnum.CategoryId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int REPLACEMENTCATEGORYID = AttributesEnum.ReplacementCategoryId.index();
    public static final int REPLACEMENTID = AttributesEnum.ReplacementId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ReplacementCategoryValidateVORowImpl() {
    }

    /**
     * Gets ReplacementCategoriesEO entity object.
     * @return the ReplacementCategoriesEO
     */
    public ReplacementCategoriesEOImpl getReplacementCategoriesEO() {
        return (ReplacementCategoriesEOImpl) getEntity(ENTITY_REPLACEMENTCATEGORIESEO);
    }

    /**
     * Gets the attribute value for ACTIVE_FLAG using the alias name ActiveFlag.
     * @return the ACTIVE_FLAG
     */
    public String getActiveFlag() {
        return (String) getAttributeInternal(ACTIVEFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVE_FLAG using the alias name ActiveFlag.
     * @param value value to set the ACTIVE_FLAG
     */
    public void setActiveFlag(String value) {
        setAttributeInternal(ACTIVEFLAG, value);
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
     * Gets the attribute value for CATEGORY_ID using the alias name CategoryId.
     * @return the CATEGORY_ID
     */
    public Number getCategoryId() {
        return (Number) getAttributeInternal(CATEGORYID);
    }

    /**
     * Sets <code>value</code> as attribute value for CATEGORY_ID using the alias name CategoryId.
     * @param value value to set the CATEGORY_ID
     */
    public void setCategoryId(Number value) {
        setAttributeInternal(CATEGORYID, value);
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

    /**
     * Gets the attribute value for REPLACEMENT_CATEGORY_ID using the alias name ReplacementCategoryId.
     * @return the REPLACEMENT_CATEGORY_ID
     */
    public Number getReplacementCategoryId() {
        return (Number) getAttributeInternal(REPLACEMENTCATEGORYID);
    }

    /**
     * Sets <code>value</code> as attribute value for REPLACEMENT_CATEGORY_ID using the alias name ReplacementCategoryId.
     * @param value value to set the REPLACEMENT_CATEGORY_ID
     */
    public void setReplacementCategoryId(Number value) {
        setAttributeInternal(REPLACEMENTCATEGORYID, value);
    }

    /**
     * Gets the attribute value for REPLACEMENT_ID using the alias name ReplacementId.
     * @return the REPLACEMENT_ID
     */
    public Number getReplacementId() {
        return (Number) getAttributeInternal(REPLACEMENTID);
    }

    /**
     * Sets <code>value</code> as attribute value for REPLACEMENT_ID using the alias name ReplacementId.
     * @param value value to set the REPLACEMENT_ID
     */
    public void setReplacementId(Number value) {
        setAttributeInternal(REPLACEMENTID, value);
    }
}

