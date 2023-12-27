package model.entity;

import java.math.BigDecimal;

import java.sql.Timestamp;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 09 15:26:59 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxadsTermsCondTemplatesEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TemplateId,
        TemplateName,
        TemplateInfo,
        ActiveFlag,
        CreatedBy,
        CreationDate,
        LastUpdatedBy,
        LastUpdateDate,
        ObjectVersionNumber,
        BuId,
        Division,
        DivFlexValueId;
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


    public static final int TEMPLATEID = AttributesEnum.TemplateId.index();
    public static final int TEMPLATENAME = AttributesEnum.TemplateName.index();
    public static final int TEMPLATEINFO = AttributesEnum.TemplateInfo.index();
    public static final int ACTIVEFLAG = AttributesEnum.ActiveFlag.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int DIVISION = AttributesEnum.Division.index();
    public static final int DIVFLEXVALUEID = AttributesEnum.DivFlexValueId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxadsTermsCondTemplatesEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxadsTermsCondTemplatesEO");
    }


    /**
     * Gets the attribute value for TemplateId, using the alias name TemplateId.
     * @return the value of TemplateId
     */
    public oracle.jbo.domain.Number getTemplateId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(TEMPLATEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TemplateId.
     * @param value value to set the TemplateId
     */
    public void setTemplateId(oracle.jbo.domain.Number value) {
        setAttributeInternal(TEMPLATEID, value);
    }

    /**
     * Gets the attribute value for TemplateName, using the alias name TemplateName.
     * @return the value of TemplateName
     */
    public String getTemplateName() {
        return (String) getAttributeInternal(TEMPLATENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for TemplateName.
     * @param value value to set the TemplateName
     */
    public void setTemplateName(String value) {
        setAttributeInternal(TEMPLATENAME, value);
    }

    /**
     * Gets the attribute value for TemplateInfo, using the alias name TemplateInfo.
     * @return the value of TemplateInfo
     */
    public String getTemplateInfo() {
        return (String) getAttributeInternal(TEMPLATEINFO);
    }

    /**
     * Sets <code>value</code> as the attribute value for TemplateInfo.
     * @param value value to set the TemplateInfo
     */
    public void setTemplateInfo(String value) {
        setAttributeInternal(TEMPLATEINFO, value);
    }

    /**
     * Gets the attribute value for ActiveFlag, using the alias name ActiveFlag.
     * @return the value of ActiveFlag
     */
    public String getActiveFlag() {
        return (String) getAttributeInternal(ACTIVEFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActiveFlag.
     * @param value value to set the ActiveFlag
     */
    public void setActiveFlag(String value) {
        setAttributeInternal(ACTIVEFLAG, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }


    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the value of CreationDate
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }


    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }


    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the value of LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }


    /**
     * Gets the attribute value for ObjectVersionNumber, using the alias name ObjectVersionNumber.
     * @return the value of ObjectVersionNumber
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
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
     * Gets the attribute value for DivFlexValueId, using the alias name DivFlexValueId.
     * @return the value of DivFlexValueId
     */
    public Number getDivFlexValueId() {
        return (Number) getAttributeInternal(DIVFLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DivFlexValueId.
     * @param value value to set the DivFlexValueId
     */
    public void setDivFlexValueId(Number value) {
        setAttributeInternal(DIVFLEXVALUEID, value);
    }


    /**
     * @param templateId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number templateId) {
        return new Key(new Object[] { templateId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq = new SequenceImpl("XXADS_TERMS_COND_TEMPLATES_S",getDBTransaction());
        setTemplateId(seq.getSequenceNumber());
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

