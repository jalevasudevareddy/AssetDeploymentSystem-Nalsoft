package model.view;

import model.entity.XxadsLookupTypesEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 10 18:41:12 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LookupTypeValidateVORowImpl extends ViewRowImpl {
    public static final int ENTITY_XXADSLOOKUPTYPESEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ApplicationCode,
        ApplicationId,
        CreatedBy,
        CreationDate,
        Description,
        LastUpdateDate,
        LastUpdatedBy,
        LookupType,
        LookupTypeId,
        Meaning;
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
    public static final int APPLICATIONCODE = AttributesEnum.ApplicationCode.index();
    public static final int APPLICATIONID = AttributesEnum.ApplicationId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LOOKUPTYPE = AttributesEnum.LookupType.index();
    public static final int LOOKUPTYPEID = AttributesEnum.LookupTypeId.index();
    public static final int MEANING = AttributesEnum.Meaning.index();

    /**
     * This is the default constructor (do not remove).
     */
    public LookupTypeValidateVORowImpl() {
    }

    /**
     * Gets XxadsLookupTypesEO entity object.
     * @return the XxadsLookupTypesEO
     */
    public XxadsLookupTypesEOImpl getXxadsLookupTypesEO() {
        return (XxadsLookupTypesEOImpl) getEntity(ENTITY_XXADSLOOKUPTYPESEO);
    }

    /**
     * Gets the attribute value for APPLICATION_CODE using the alias name ApplicationCode.
     * @return the APPLICATION_CODE
     */
    public String getApplicationCode() {
        return (String) getAttributeInternal(APPLICATIONCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for APPLICATION_CODE using the alias name ApplicationCode.
     * @param value value to set the APPLICATION_CODE
     */
    public void setApplicationCode(String value) {
        setAttributeInternal(APPLICATIONCODE, value);
    }

    /**
     * Gets the attribute value for APPLICATION_ID using the alias name ApplicationId.
     * @return the APPLICATION_ID
     */
    public Number getApplicationId() {
        return (Number) getAttributeInternal(APPLICATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for APPLICATION_ID using the alias name ApplicationId.
     * @param value value to set the APPLICATION_ID
     */
    public void setApplicationId(Number value) {
        setAttributeInternal(APPLICATIONID, value);
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
     * Gets the attribute value for DESCRIPTION using the alias name Description.
     * @return the DESCRIPTION
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for DESCRIPTION using the alias name Description.
     * @param value value to set the DESCRIPTION
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
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
     * Gets the attribute value for LOOKUP_TYPE using the alias name LookupType.
     * @return the LOOKUP_TYPE
     */
    public String getLookupType() {
        return (String) getAttributeInternal(LOOKUPTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for LOOKUP_TYPE using the alias name LookupType.
     * @param value value to set the LOOKUP_TYPE
     */
    public void setLookupType(String value) {
        setAttributeInternal(LOOKUPTYPE, value);
    }

    /**
     * Gets the attribute value for LOOKUP_TYPE_ID using the alias name LookupTypeId.
     * @return the LOOKUP_TYPE_ID
     */
    public Number getLookupTypeId() {
        return (Number) getAttributeInternal(LOOKUPTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for LOOKUP_TYPE_ID using the alias name LookupTypeId.
     * @param value value to set the LOOKUP_TYPE_ID
     */
    public void setLookupTypeId(Number value) {
        setAttributeInternal(LOOKUPTYPEID, value);
    }

    /**
     * Gets the attribute value for MEANING using the alias name Meaning.
     * @return the MEANING
     */
    public String getMeaning() {
        return (String) getAttributeInternal(MEANING);
    }

    /**
     * Sets <code>value</code> as attribute value for MEANING using the alias name Meaning.
     * @param value value to set the MEANING
     */
    public void setMeaning(String value) {
        setAttributeInternal(MEANING, value);
    }
}
