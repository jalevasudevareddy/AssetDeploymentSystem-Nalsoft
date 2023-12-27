package model.view;

import model.entity.XxadsGroupCustomerMapEOImpl;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 19 14:36:37 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GroupCustomerMapVORowImpl extends ViewRowImpl {


    public static final int ENTITY_XXADSGROUPCUSTOMERMAPEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        BuId,
        CreatedBy,
        CreationDate,
        CustAccountId,
        EffectiveFromDate,
        EffectiveToDate,
        FlexValueId,
        LastUpdateDate,
        LastUpdatedBy,
        MappingId,
        ObjectVersionNumber,
        RequestingBuId,
        TransRequestingBU,
        TransCustomerName,
        TransSourceLedgerId,
        TransEffFromDateEditFlag,
        ActiveBusinessUnitsLOV1,
        CustomerLovVO1;
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


    public static final int BUID = AttributesEnum.BuId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CUSTACCOUNTID = AttributesEnum.CustAccountId.index();
    public static final int EFFECTIVEFROMDATE = AttributesEnum.EffectiveFromDate.index();
    public static final int EFFECTIVETODATE = AttributesEnum.EffectiveToDate.index();
    public static final int FLEXVALUEID = AttributesEnum.FlexValueId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int MAPPINGID = AttributesEnum.MappingId.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int REQUESTINGBUID = AttributesEnum.RequestingBuId.index();
    public static final int TRANSREQUESTINGBU = AttributesEnum.TransRequestingBU.index();
    public static final int TRANSCUSTOMERNAME = AttributesEnum.TransCustomerName.index();
    public static final int TRANSSOURCELEDGERID = AttributesEnum.TransSourceLedgerId.index();
    public static final int TRANSEFFFROMDATEEDITFLAG = AttributesEnum.TransEffFromDateEditFlag.index();
    public static final int ACTIVEBUSINESSUNITSLOV1 = AttributesEnum.ActiveBusinessUnitsLOV1.index();
    public static final int CUSTOMERLOVVO1 = AttributesEnum.CustomerLovVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public GroupCustomerMapVORowImpl() {
    }

    /**
     * Gets XxadsGroupCustomerMapEO entity object.
     * @return the XxadsGroupCustomerMapEO
     */
    public XxadsGroupCustomerMapEOImpl getXxadsGroupCustomerMapEO() {
        return (XxadsGroupCustomerMapEOImpl) getEntity(ENTITY_XXADSGROUPCUSTOMERMAPEO);
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
     * Gets the attribute value for CUST_ACCOUNT_ID using the alias name CustAccountId.
     * @return the CUST_ACCOUNT_ID
     */
    public Number getCustAccountId() {
        return (Number) getAttributeInternal(CUSTACCOUNTID);
    }

    /**
     * Sets <code>value</code> as attribute value for CUST_ACCOUNT_ID using the alias name CustAccountId.
     * @param value value to set the CUST_ACCOUNT_ID
     */
    public void setCustAccountId(Number value) {
        setAttributeInternal(CUSTACCOUNTID, value);
    }

    /**
     * Gets the attribute value for EFFECTIVE_FROM_DATE using the alias name EffectiveFromDate.
     * @return the EFFECTIVE_FROM_DATE
     */
    public Date getEffectiveFromDate() {
        return (Date) getAttributeInternal(EFFECTIVEFROMDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for EFFECTIVE_FROM_DATE using the alias name EffectiveFromDate.
     * @param value value to set the EFFECTIVE_FROM_DATE
     */
    public void setEffectiveFromDate(Date value) {
        setAttributeInternal(EFFECTIVEFROMDATE, value);
    }

    /**
     * Gets the attribute value for EFFECTIVE_TO_DATE using the alias name EffectiveToDate.
     * @return the EFFECTIVE_TO_DATE
     */
    public Date getEffectiveToDate() {
        return (Date) getAttributeInternal(EFFECTIVETODATE);
    }

    /**
     * Sets <code>value</code> as attribute value for EFFECTIVE_TO_DATE using the alias name EffectiveToDate.
     * @param value value to set the EFFECTIVE_TO_DATE
     */
    public void setEffectiveToDate(Date value) {
        setAttributeInternal(EFFECTIVETODATE, value);
    }

    /**
     * Gets the attribute value for FLEX_VALUE_ID using the alias name FlexValueId.
     * @return the FLEX_VALUE_ID
     */
    public Number getFlexValueId() {
        return (Number) getAttributeInternal(FLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as attribute value for FLEX_VALUE_ID using the alias name FlexValueId.
     * @param value value to set the FLEX_VALUE_ID
     */
    public void setFlexValueId(Number value) {
        setAttributeInternal(FLEXVALUEID, value);
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
     * Gets the attribute value for MAPPING_ID using the alias name MappingId.
     * @return the MAPPING_ID
     */
    public Number getMappingId() {
        return (Number) getAttributeInternal(MAPPINGID);
    }

    /**
     * Sets <code>value</code> as attribute value for MAPPING_ID using the alias name MappingId.
     * @param value value to set the MAPPING_ID
     */
    public void setMappingId(Number value) {
        setAttributeInternal(MAPPINGID, value);
    }

    /**
     * Gets the attribute value for OBJECT_VERSION_NUMBER using the alias name ObjectVersionNumber.
     * @return the OBJECT_VERSION_NUMBER
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Gets the attribute value for REQUESTING_BU_ID using the alias name RequestingBuId.
     * @return the REQUESTING_BU_ID
     */
    public Number getRequestingBuId() {
        return (Number) getAttributeInternal(REQUESTINGBUID);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUESTING_BU_ID using the alias name RequestingBuId.
     * @param value value to set the REQUESTING_BU_ID
     */
    public void setRequestingBuId(Number value) {
        setAttributeInternal(REQUESTINGBUID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransRequestingBU.
     * @return the TransRequestingBU
     */
    public String getTransRequestingBU() {
        return (String) getAttributeInternal(TRANSREQUESTINGBU);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransRequestingBU.
     * @param value value to set the  TransRequestingBU
     */
    public void setTransRequestingBU(String value) {
        setAttributeInternal(TRANSREQUESTINGBU, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCustomerName.
     * @return the TransCustomerName
     */
    public String getTransCustomerName() {
        return (String) getAttributeInternal(TRANSCUSTOMERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCustomerName.
     * @param value value to set the  TransCustomerName
     */
    public void setTransCustomerName(String value) {
        setAttributeInternal(TRANSCUSTOMERNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSourceLedgerId.
     * @return the TransSourceLedgerId
     */
    public Number getTransSourceLedgerId() {
        return (Number) getAttributeInternal(TRANSSOURCELEDGERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSourceLedgerId.
     * @param value value to set the  TransSourceLedgerId
     */
    public void setTransSourceLedgerId(Number value) {
        setAttributeInternal(TRANSSOURCELEDGERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEffFromDateEditFlag.
     * @return the TransEffFromDateEditFlag
     */
    public String getTransEffFromDateEditFlag() {
        return (String) getAttributeInternal(TRANSEFFFROMDATEEDITFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransEffFromDateEditFlag.
     * @param value value to set the  TransEffFromDateEditFlag
     */
    public void setTransEffFromDateEditFlag(String value) {
        setAttributeInternal(TRANSEFFFROMDATEEDITFLAG, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ActiveBusinessUnitsLOV1.
     */
    public RowSet getActiveBusinessUnitsLOV1() {
        return (RowSet) getAttributeInternal(ACTIVEBUSINESSUNITSLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CustomerLovVO1.
     */
    public RowSet getCustomerLovVO1() {
        return (RowSet) getAttributeInternal(CUSTOMERLOVVO1);
    }
}
