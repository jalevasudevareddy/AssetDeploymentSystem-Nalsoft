package model.lov;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 10 15:36:54 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TemplatesLOVRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TemplateName,
        TemplateInfo,
        ActiveFlag,
        TemplateId,
        CreatedBy,
        CreationDate;
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


    public static final int TEMPLATENAME = AttributesEnum.TemplateName.index();
    public static final int TEMPLATEINFO = AttributesEnum.TemplateInfo.index();
    public static final int ACTIVEFLAG = AttributesEnum.ActiveFlag.index();
    public static final int TEMPLATEID = AttributesEnum.TemplateId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TemplatesLOVRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute TemplateName.
     * @return the TemplateName
     */
    public String getTemplateName() {
        return (String) getAttributeInternal(TEMPLATENAME);
    }

    /**
     * Gets the attribute value for the calculated attribute TemplateInfo.
     * @return the TemplateInfo
     */
    public String getTemplateInfo() {
        return (String) getAttributeInternal(TEMPLATEINFO);
    }

    /**
     * Gets the attribute value for the calculated attribute ActiveFlag.
     * @return the ActiveFlag
     */
    public String getActiveFlag() {
        return (String) getAttributeInternal(ACTIVEFLAG);
    }

    /**
     * Gets the attribute value for the calculated attribute TemplateId.
     * @return the TemplateId
     */
    public oracle.jbo.domain.Number getTemplateId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(TEMPLATEID);
    }

    /**
     * Gets the attribute value for the calculated attribute CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for the calculated attribute CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }
}

