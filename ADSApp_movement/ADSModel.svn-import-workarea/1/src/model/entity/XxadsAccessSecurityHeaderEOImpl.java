package model.entity;

import java.math.BigDecimal;

import java.sql.Timestamp;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 17 17:38:29 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxadsAccessSecurityHeaderEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        HeaderId,
        BuId,
        Division,
        FlexValueId,
        FlexValueSetId,
        UserId,
        AccessLevel,
        StartDate,
        EndDate,
        CreationDate,
        CreatedBy,
        LastUpdateDate,
        LastUpdatedBy,
        ObjectVersionNumber,
        XxadsAccessSecurityLinesEO;
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


    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int DIVISION = AttributesEnum.Division.index();
    public static final int FLEXVALUEID = AttributesEnum.FlexValueId.index();
    public static final int FLEXVALUESETID = AttributesEnum.FlexValueSetId.index();
    public static final int USERID = AttributesEnum.UserId.index();
    public static final int ACCESSLEVEL = AttributesEnum.AccessLevel.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int XXADSACCESSSECURITYLINESEO = AttributesEnum.XxadsAccessSecurityLinesEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxadsAccessSecurityHeaderEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxadsAccessSecurityHeaderEO");
    }


    /**
     * Gets the attribute value for HeaderId, using the alias name HeaderId.
     * @return the value of HeaderId
     */
    public oracle.jbo.domain.Number getHeaderId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeaderId.
     * @param value value to set the HeaderId
     */
    public void setHeaderId(oracle.jbo.domain.Number value) {
        setAttributeInternal(HEADERID, value);
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
     * Gets the attribute value for Division, using the alias name Division.
     * @return the value of Division
     */
    public String getDivision() {
        return (String) getAttributeInternal(DIVISION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Division.
     * @param value value to set the Division
     */
    public void setDivision(String value) {
        setAttributeInternal(DIVISION, value);
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
     * Gets the attribute value for FlexValueSetId, using the alias name FlexValueSetId.
     * @return the value of FlexValueSetId
     */
    public Number getFlexValueSetId() {
        return (Number) getAttributeInternal(FLEXVALUESETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FlexValueSetId.
     * @param value value to set the FlexValueSetId
     */
    public void setFlexValueSetId(Number value) {
        setAttributeInternal(FLEXVALUESETID, value);
    }

    /**
     * Gets the attribute value for UserId, using the alias name UserId.
     * @return the value of UserId
     */
    public Number getUserId() {
        return (Number) getAttributeInternal(USERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserId.
     * @param value value to set the UserId
     */
    public void setUserId(Number value) {
        setAttributeInternal(USERID, value);
    }

    /**
     * Gets the attribute value for AccessLevel, using the alias name AccessLevel.
     * @return the value of AccessLevel
     */
    public String getAccessLevel() {
        return (String) getAttributeInternal(ACCESSLEVEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccessLevel.
     * @param value value to set the AccessLevel
     */
    public void setAccessLevel(String value) {
        setAttributeInternal(ACCESSLEVEL, value);
    }

    /**
     * Gets the attribute value for StartDate, using the alias name StartDate.
     * @return the value of StartDate
     */
    public Date getStartDate() {
        return (Date) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StartDate.
     * @param value value to set the StartDate
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for EndDate, using the alias name EndDate.
     * @return the value of EndDate
     */
    public Date getEndDate() {
        return (Date) getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EndDate.
     * @param value value to set the EndDate
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getXxadsAccessSecurityLinesEO() {
        return (RowIterator) getAttributeInternal(XXADSACCESSSECURITYLINESEO);
    }


    /**
     * @param headerId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number headerId) {
        return new Key(new Object[] { headerId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    SequenceImpl seq = new SequenceImpl("XXADS_ACCESS_SECURITY_HEADER_S",getDBTransaction());
    setHeaderId(seq.getSequenceNumber());
    //        setAttachmentCode("PROBATION CONFIRMATION");
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

