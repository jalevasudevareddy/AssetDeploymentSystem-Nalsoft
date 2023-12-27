package model.view;

import model.entity.XxadsDoMobilizationEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jan 05 11:43:01 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RctDeployOrderMobilizationVORowImpl extends ViewRowImpl {


    public static final int ENTITY_XXADSDOMOBILIZATIONEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AssetId,
        CreatedBy,
        CreationDate,
        DoId,
        DoLineId,
        DoMobilizationId,
        LastUpdateDate,
        LastUpdatedBy,
        MobilizationAssetId,
        ObjectVersionNumber,
        TripDate,
        TransAssetType,
        TransAssetNumber,
        TransAssetDesc,
        TransShiftType,
        TransMobilizationAsset;
        private static AttributesEnum[] vals = null;
        ;
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


    public static final int ASSETID = AttributesEnum.AssetId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int DOID = AttributesEnum.DoId.index();
    public static final int DOLINEID = AttributesEnum.DoLineId.index();
    public static final int DOMOBILIZATIONID = AttributesEnum.DoMobilizationId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int MOBILIZATIONASSETID = AttributesEnum.MobilizationAssetId.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int TRIPDATE = AttributesEnum.TripDate.index();
    public static final int TRANSASSETTYPE = AttributesEnum.TransAssetType.index();
    public static final int TRANSASSETNUMBER = AttributesEnum.TransAssetNumber.index();
    public static final int TRANSASSETDESC = AttributesEnum.TransAssetDesc.index();
    public static final int TRANSSHIFTTYPE = AttributesEnum.TransShiftType.index();
    public static final int TRANSMOBILIZATIONASSET = AttributesEnum.TransMobilizationAsset.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RctDeployOrderMobilizationVORowImpl() {
    }

    /**
     * Gets XxadsDoMobilizationEO entity object.
     * @return the XxadsDoMobilizationEO
     */
    public XxadsDoMobilizationEOImpl getXxadsDoMobilizationEO() {
        return (XxadsDoMobilizationEOImpl) getEntity(ENTITY_XXADSDOMOBILIZATIONEO);
    }

    /**
     * Gets the attribute value for ASSET_ID using the alias name AssetId.
     * @return the ASSET_ID
     */
    public Number getAssetId() {
        return (Number) getAttributeInternal(ASSETID);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_ID using the alias name AssetId.
     * @param value value to set the ASSET_ID
     */
    public void setAssetId(Number value) {
        setAttributeInternal(ASSETID, value);
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
     * Gets the attribute value for DO_ID using the alias name DoId.
     * @return the DO_ID
     */
    public Number getDoId() {
        return (Number) getAttributeInternal(DOID);
    }

    /**
     * Sets <code>value</code> as attribute value for DO_ID using the alias name DoId.
     * @param value value to set the DO_ID
     */
    public void setDoId(Number value) {
        setAttributeInternal(DOID, value);
    }

    /**
     * Gets the attribute value for DO_LINE_ID using the alias name DoLineId.
     * @return the DO_LINE_ID
     */
    public Number getDoLineId() {
        return (Number) getAttributeInternal(DOLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for DO_LINE_ID using the alias name DoLineId.
     * @param value value to set the DO_LINE_ID
     */
    public void setDoLineId(Number value) {
        setAttributeInternal(DOLINEID, value);
    }

    /**
     * Gets the attribute value for DO_MOBILIZATION_ID using the alias name DoMobilizationId.
     * @return the DO_MOBILIZATION_ID
     */
    public Number getDoMobilizationId() {
        return (Number) getAttributeInternal(DOMOBILIZATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for DO_MOBILIZATION_ID using the alias name DoMobilizationId.
     * @param value value to set the DO_MOBILIZATION_ID
     */
    public void setDoMobilizationId(Number value) {
        setAttributeInternal(DOMOBILIZATIONID, value);
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
     * Gets the attribute value for MOBILIZATION_ASSET_ID using the alias name MobilizationAssetId.
     * @return the MOBILIZATION_ASSET_ID
     */
    public Number getMobilizationAssetId() {
        return (Number) getAttributeInternal(MOBILIZATIONASSETID);
    }

    /**
     * Sets <code>value</code> as attribute value for MOBILIZATION_ASSET_ID using the alias name MobilizationAssetId.
     * @param value value to set the MOBILIZATION_ASSET_ID
     */
    public void setMobilizationAssetId(Number value) {
        setAttributeInternal(MOBILIZATIONASSETID, value);
    }

    /**
     * Gets the attribute value for OBJECT_VERSION_NUMBER using the alias name ObjectVersionNumber.
     * @return the OBJECT_VERSION_NUMBER
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Gets the attribute value for TRIP_DATE using the alias name TripDate.
     * @return the TRIP_DATE
     */
    public Date getTripDate() {
        return (Date) getAttributeInternal(TRIPDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TRIP_DATE using the alias name TripDate.
     * @param value value to set the TRIP_DATE
     */
    public void setTripDate(Date value) {
        setAttributeInternal(TRIPDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAssetType.
     * @return the TransAssetType
     */
    public String getTransAssetType() {
        return (String) getAttributeInternal(TRANSASSETTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAssetType.
     * @param value value to set the  TransAssetType
     */
    public void setTransAssetType(String value) {
        setAttributeInternal(TRANSASSETTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAssetNumber.
     * @return the TransAssetNumber
     */
    public String getTransAssetNumber() {
        return (String) getAttributeInternal(TRANSASSETNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAssetNumber.
     * @param value value to set the  TransAssetNumber
     */
    public void setTransAssetNumber(String value) {
        setAttributeInternal(TRANSASSETNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAssetDesc.
     * @return the TransAssetDesc
     */
    public String getTransAssetDesc() {
        return (String) getAttributeInternal(TRANSASSETDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAssetDesc.
     * @param value value to set the  TransAssetDesc
     */
    public void setTransAssetDesc(String value) {
        setAttributeInternal(TRANSASSETDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransShiftType.
     * @return the TransShiftType
     */
    public String getTransShiftType() {
        return (String) getAttributeInternal(TRANSSHIFTTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransShiftType.
     * @param value value to set the  TransShiftType
     */
    public void setTransShiftType(String value) {
        setAttributeInternal(TRANSSHIFTTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransMobilizationAsset.
     * @return the TransMobilizationAsset
     */
    public String getTransMobilizationAsset() {
        return (String) getAttributeInternal(TRANSMOBILIZATIONASSET);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransMobilizationAsset.
     * @param value value to set the  TransMobilizationAsset
     */
    public void setTransMobilizationAsset(String value) {
        setAttributeInternal(TRANSMOBILIZATIONASSET, value);
    }
}

