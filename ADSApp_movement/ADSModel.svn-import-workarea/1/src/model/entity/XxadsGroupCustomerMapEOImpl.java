package model.entity;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 19 14:12:56 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxadsGroupCustomerMapEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        MappingId,
        BuId,
        FlexValueId,
        RequestingBuId,
        CustAccountId,
        EffectiveFromDate,
        EffectiveToDate,
        CreationDate,
        CreatedBy,
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
    
    private static final byte USERNAME_HISTORY_TYPE = 13;

    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
            if (attr.getHistoryKind() == USERNAME_HISTORY_TYPE) {
                    // Custom History type logic goes here
                    return (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
            }
            return super.getHistoryContextForAttribute(attr);
    }


    public static final int MAPPINGID = AttributesEnum.MappingId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int FLEXVALUEID = AttributesEnum.FlexValueId.index();
    public static final int REQUESTINGBUID = AttributesEnum.RequestingBuId.index();
    public static final int CUSTACCOUNTID = AttributesEnum.CustAccountId.index();
    public static final int EFFECTIVEFROMDATE = AttributesEnum.EffectiveFromDate.index();
    public static final int EFFECTIVETODATE = AttributesEnum.EffectiveToDate.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxadsGroupCustomerMapEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxadsGroupCustomerMapEO");
    }

    /**
     * Gets the attribute value for MappingId, using the alias name MappingId.
     * @return the value of MappingId
     */
    public Number getMappingId() {
        return (Number) getAttributeInternal(MAPPINGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MappingId.
     * @param value value to set the MappingId
     */
    public void setMappingId(Number value) {
        setAttributeInternal(MAPPINGID, value);
    }

    /**
     * Gets the attribute value for BuId, using the alias name BuId.
     * @return the value of BuId
     */
    public Number getBuId() {
        return (Number) getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuId.
     * @param value value to set the BuId
     */
    public void setBuId(Number value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * Gets the attribute value for FlexValueId, using the alias name FlexValueId.
     * @return the value of FlexValueId
     */
    public Number getFlexValueId() {
        return (Number) getAttributeInternal(FLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FlexValueId.
     * @param value value to set the FlexValueId
     */
    public void setFlexValueId(Number value) {
        setAttributeInternal(FLEXVALUEID, value);
    }

    /**
     * Gets the attribute value for RequestingBuId, using the alias name RequestingBuId.
     * @return the value of RequestingBuId
     */
    public Number getRequestingBuId() {
        return (Number) getAttributeInternal(REQUESTINGBUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RequestingBuId.
     * @param value value to set the RequestingBuId
     */
    public void setRequestingBuId(Number value) {
        setAttributeInternal(REQUESTINGBUID, value);
    }

    /**
     * Gets the attribute value for CustAccountId, using the alias name CustAccountId.
     * @return the value of CustAccountId
     */
    public Number getCustAccountId() {
        return (Number) getAttributeInternal(CUSTACCOUNTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustAccountId.
     * @param value value to set the CustAccountId
     */
    public void setCustAccountId(Number value) {
        setAttributeInternal(CUSTACCOUNTID, value);
    }

    /**
     * Gets the attribute value for EffectiveFromDate, using the alias name EffectiveFromDate.
     * @return the value of EffectiveFromDate
     */
    public Date getEffectiveFromDate() {
        return (Date) getAttributeInternal(EFFECTIVEFROMDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveFromDate.
     * @param value value to set the EffectiveFromDate
     */
    public void setEffectiveFromDate(Date value) {
        setAttributeInternal(EFFECTIVEFROMDATE, value);
    }

    /**
     * Gets the attribute value for EffectiveToDate, using the alias name EffectiveToDate.
     * @return the value of EffectiveToDate
     */
    public Date getEffectiveToDate() {
        return (Date) getAttributeInternal(EFFECTIVETODATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveToDate.
     * @param value value to set the EffectiveToDate
     */
    public void setEffectiveToDate(Date value) {
        setAttributeInternal(EFFECTIVETODATE, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the value of CreationDate
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the value of LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Gets the attribute value for ObjectVersionNumber, using the alias name ObjectVersionNumber.
     * @return the value of ObjectVersionNumber
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }


    /**
     * @param mappingId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number mappingId) {
        return new Key(new Object[] { mappingId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        
        SequenceImpl seq = new SequenceImpl("XXADS_GROUP_CUSTOMER_MAP_S", this.getDBTransaction());
        setMappingId(seq.getSequenceNumber());
    }
}

