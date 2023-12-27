package model.entity;

import java.math.BigDecimal;

import java.sql.Timestamp;

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
// ---    Tue Oct 11 16:52:07 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxadsSpecialWorkingDaysEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        SpDayId,
        BuId,
        SpHolidayName,
        SpEffectiveStartDate,
        SpEffectiveEndDate,
        NoOfHrs,
        Ot1Hrs,
        Ot2Hrs,
        CreatedBy,
        CreationDate,
        LastUpdatedBy,
        LastUpdateDate,
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


    public static final int SPDAYID = AttributesEnum.SpDayId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int SPHOLIDAYNAME = AttributesEnum.SpHolidayName.index();
    public static final int SPEFFECTIVESTARTDATE = AttributesEnum.SpEffectiveStartDate.index();
    public static final int SPEFFECTIVEENDDATE = AttributesEnum.SpEffectiveEndDate.index();
    public static final int NOOFHRS = AttributesEnum.NoOfHrs.index();
    public static final int OT1HRS = AttributesEnum.Ot1Hrs.index();
    public static final int OT2HRS = AttributesEnum.Ot2Hrs.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxadsSpecialWorkingDaysEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxadsSpecialWorkingDaysEO");
    }


    /**
     * Gets the attribute value for SpDayId, using the alias name SpDayId.
     * @return the value of SpDayId
     */
    public oracle.jbo.domain.Number getSpDayId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(SPDAYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SpDayId.
     * @param value value to set the SpDayId
     */
    public void setSpDayId(oracle.jbo.domain.Number value) {
        setAttributeInternal(SPDAYID, value);
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
     * Gets the attribute value for SpHolidayName, using the alias name SpHolidayName.
     * @return the value of SpHolidayName
     */
    public String getSpHolidayName() {
        return (String) getAttributeInternal(SPHOLIDAYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for SpHolidayName.
     * @param value value to set the SpHolidayName
     */
    public void setSpHolidayName(String value) {
        setAttributeInternal(SPHOLIDAYNAME, value);
    }

    /**
     * Gets the attribute value for SpEffectiveStartDate, using the alias name SpEffectiveStartDate.
     * @return the value of SpEffectiveStartDate
     */
    public Date getSpEffectiveStartDate() {
        return (Date) getAttributeInternal(SPEFFECTIVESTARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SpEffectiveStartDate.
     * @param value value to set the SpEffectiveStartDate
     */
    public void setSpEffectiveStartDate(Date value) {
        setAttributeInternal(SPEFFECTIVESTARTDATE, value);
    }

    /**
     * Gets the attribute value for SpEffectiveEndDate, using the alias name SpEffectiveEndDate.
     * @return the value of SpEffectiveEndDate
     */
    public Date getSpEffectiveEndDate() {
        return (Date) getAttributeInternal(SPEFFECTIVEENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SpEffectiveEndDate.
     * @param value value to set the SpEffectiveEndDate
     */
    public void setSpEffectiveEndDate(Date value) {
        setAttributeInternal(SPEFFECTIVEENDDATE, value);
    }

    /**
     * Gets the attribute value for NoOfHrs, using the alias name NoOfHrs.
     * @return the value of NoOfHrs
     */
    public Number getNoOfHrs() {
        return (Number) getAttributeInternal(NOOFHRS);
    }

    /**
     * Sets <code>value</code> as the attribute value for NoOfHrs.
     * @param value value to set the NoOfHrs
     */
    public void setNoOfHrs(Number value) {
        setAttributeInternal(NOOFHRS, value);
    }

    /**
     * Gets the attribute value for Ot1Hrs, using the alias name Ot1Hrs.
     * @return the value of Ot1Hrs
     */
    public Number getOt1Hrs() {
        return (Number) getAttributeInternal(OT1HRS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ot1Hrs.
     * @param value value to set the Ot1Hrs
     */
    public void setOt1Hrs(Number value) {
        setAttributeInternal(OT1HRS, value);
    }

    /**
     * Gets the attribute value for Ot2Hrs, using the alias name Ot2Hrs.
     * @return the value of Ot2Hrs
     */
    public Number getOt2Hrs() {
        return (Number) getAttributeInternal(OT2HRS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ot2Hrs.
     * @param value value to set the Ot2Hrs
     */
    public void setOt2Hrs(Number value) {
        setAttributeInternal(OT2HRS, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the value of CreationDate
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the value of LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for ObjectVersionNumber, using the alias name ObjectVersionNumber.
     * @return the value of ObjectVersionNumber
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ObjectVersionNumber.
     * @param value value to set the ObjectVersionNumber
     */
    public void setObjectVersionNumber(Number value) {
        setAttributeInternal(OBJECTVERSIONNUMBER, value);
    }


    /**
     * @param spDayId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number spDayId) {
        return new Key(new Object[] { spDayId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq = new SequenceImpl("XXADS_SPECIAL_WORKING_DAYS_S",getDBTransaction());
        setSpDayId(seq.getSequenceNumber());
    }
    
    private static final byte USERNAME_HISTORY_TYPE =13;
    
    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
    if (attr.getHistoryKind() == USERNAME_HISTORY_TYPE) {
    // Custom History type logic goes here
    return (String) ((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
    }
    return super.getHistoryContextForAttribute(attr);
    }
}

