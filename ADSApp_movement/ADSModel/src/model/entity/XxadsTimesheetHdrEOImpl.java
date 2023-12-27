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
// ---    Tue Jan 03 11:55:33 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxadsTimesheetHdrEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TsHeaderId,
        TimesheetDate,
        TimesheetNumber,
        TimesheetStatus,
        SrcBuId,
        SrcDivision,
        ReqBuId,
        ContractId,
        MasterContractId,
        CustomerType,
        ProjectId,
        Division,
        DepartmentName,
        DepartmentCode,
        CustomerId,
        CustSiteId,
        SiteUseId,
        PreparedBy,
        SrcDivFlexValueId,
        SrcDivFlexValSetId,
        DivFlexValueId,
        DivFlexValueSetId,
        DeptFlexValueId,
        DeptFlexValueSetId,
        CreationDate,
        CreatedBy,
        LastUpdateDate,
        LastUpdatedBy,
        ObjectVersionNumber,
        BatchId,
        TimesheetPeriod;
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


    public static final int TSHEADERID = AttributesEnum.TsHeaderId.index();
    public static final int TIMESHEETDATE = AttributesEnum.TimesheetDate.index();
    public static final int TIMESHEETNUMBER = AttributesEnum.TimesheetNumber.index();
    public static final int TIMESHEETSTATUS = AttributesEnum.TimesheetStatus.index();
    public static final int SRCBUID = AttributesEnum.SrcBuId.index();
    public static final int SRCDIVISION = AttributesEnum.SrcDivision.index();
    public static final int REQBUID = AttributesEnum.ReqBuId.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
    public static final int MASTERCONTRACTID = AttributesEnum.MasterContractId.index();
    public static final int CUSTOMERTYPE = AttributesEnum.CustomerType.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int DIVISION = AttributesEnum.Division.index();
    public static final int DEPARTMENTNAME = AttributesEnum.DepartmentName.index();
    public static final int DEPARTMENTCODE = AttributesEnum.DepartmentCode.index();
    public static final int CUSTOMERID = AttributesEnum.CustomerId.index();
    public static final int CUSTSITEID = AttributesEnum.CustSiteId.index();
    public static final int SITEUSEID = AttributesEnum.SiteUseId.index();
    public static final int PREPAREDBY = AttributesEnum.PreparedBy.index();
    public static final int SRCDIVFLEXVALUEID = AttributesEnum.SrcDivFlexValueId.index();
    public static final int SRCDIVFLEXVALSETID = AttributesEnum.SrcDivFlexValSetId.index();
    public static final int DIVFLEXVALUEID = AttributesEnum.DivFlexValueId.index();
    public static final int DIVFLEXVALUESETID = AttributesEnum.DivFlexValueSetId.index();
    public static final int DEPTFLEXVALUEID = AttributesEnum.DeptFlexValueId.index();
    public static final int DEPTFLEXVALUESETID = AttributesEnum.DeptFlexValueSetId.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int BATCHID = AttributesEnum.BatchId.index();
    public static final int TIMESHEETPERIOD = AttributesEnum.TimesheetPeriod.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxadsTimesheetHdrEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxadsTimesheetHdrEO");
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

    /**
     * Gets the attribute value for TsHeaderId, using the alias name TsHeaderId.
     * @return the value of TsHeaderId
     */
    public Number getTsHeaderId() {
        return (Number) getAttributeInternal(TSHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TsHeaderId.
     * @param value value to set the TsHeaderId
     */
    public void setTsHeaderId(Number value) {
        setAttributeInternal(TSHEADERID, value);
    }

    /**
     * Gets the attribute value for TimesheetDate, using the alias name TimesheetDate.
     * @return the value of TimesheetDate
     */
    public Date getTimesheetDate() {
        return (Date) getAttributeInternal(TIMESHEETDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TimesheetDate.
     * @param value value to set the TimesheetDate
     */
    public void setTimesheetDate(Date value) {
        setAttributeInternal(TIMESHEETDATE, value);
    }

    /**
     * Gets the attribute value for TimesheetNumber, using the alias name TimesheetNumber.
     * @return the value of TimesheetNumber
     */
    public String getTimesheetNumber() {
        return (String) getAttributeInternal(TIMESHEETNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for TimesheetNumber.
     * @param value value to set the TimesheetNumber
     */
    public void setTimesheetNumber(String value) {
        setAttributeInternal(TIMESHEETNUMBER, value);
    }

    /**
     * Gets the attribute value for TimesheetStatus, using the alias name TimesheetStatus.
     * @return the value of TimesheetStatus
     */
    public String getTimesheetStatus() {
        return (String) getAttributeInternal(TIMESHEETSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for TimesheetStatus.
     * @param value value to set the TimesheetStatus
     */
    public void setTimesheetStatus(String value) {
        setAttributeInternal(TIMESHEETSTATUS, value);
    }

    /**
     * Gets the attribute value for SrcBuId, using the alias name SrcBuId.
     * @return the value of SrcBuId
     */
    public Number getSrcBuId() {
        return (Number) getAttributeInternal(SRCBUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SrcBuId.
     * @param value value to set the SrcBuId
     */
    public void setSrcBuId(Number value) {
        setAttributeInternal(SRCBUID, value);
    }

    /**
     * Gets the attribute value for SrcDivision, using the alias name SrcDivision.
     * @return the value of SrcDivision
     */
    public String getSrcDivision() {
        return (String) getAttributeInternal(SRCDIVISION);
    }

    /**
     * Sets <code>value</code> as the attribute value for SrcDivision.
     * @param value value to set the SrcDivision
     */
    public void setSrcDivision(String value) {
        setAttributeInternal(SRCDIVISION, value);
    }

    /**
     * Gets the attribute value for ReqBuId, using the alias name ReqBuId.
     * @return the value of ReqBuId
     */
    public Number getReqBuId() {
        return (Number) getAttributeInternal(REQBUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReqBuId.
     * @param value value to set the ReqBuId
     */
    public void setReqBuId(Number value) {
        setAttributeInternal(REQBUID, value);
    }

    /**
     * Gets the attribute value for ContractId, using the alias name ContractId.
     * @return the value of ContractId
     */
    public Number getContractId() {
        return (Number) getAttributeInternal(CONTRACTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContractId.
     * @param value value to set the ContractId
     */
    public void setContractId(Number value) {
        setAttributeInternal(CONTRACTID, value);
    }

    /**
     * Gets the attribute value for MasterContractId, using the alias name MasterContractId.
     * @return the value of MasterContractId
     */
    public Number getMasterContractId() {
        return (Number) getAttributeInternal(MASTERCONTRACTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MasterContractId.
     * @param value value to set the MasterContractId
     */
    public void setMasterContractId(Number value) {
        setAttributeInternal(MASTERCONTRACTID, value);
    }

    /**
     * Gets the attribute value for CustomerType, using the alias name CustomerType.
     * @return the value of CustomerType
     */
    public String getCustomerType() {
        return (String) getAttributeInternal(CUSTOMERTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustomerType.
     * @param value value to set the CustomerType
     */
    public void setCustomerType(String value) {
        setAttributeInternal(CUSTOMERTYPE, value);
    }

    /**
     * Gets the attribute value for ProjectId, using the alias name ProjectId.
     * @return the value of ProjectId
     */
    public Number getProjectId() {
        return (Number) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectId.
     * @param value value to set the ProjectId
     */
    public void setProjectId(Number value) {
        setAttributeInternal(PROJECTID, value);
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
     * Gets the attribute value for DepartmentName, using the alias name DepartmentName.
     * @return the value of DepartmentName
     */
    public String getDepartmentName() {
        return (String) getAttributeInternal(DEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentName.
     * @param value value to set the DepartmentName
     */
    public void setDepartmentName(String value) {
        setAttributeInternal(DEPARTMENTNAME, value);
    }

    /**
     * Gets the attribute value for DepartmentCode, using the alias name DepartmentCode.
     * @return the value of DepartmentCode
     */
    public String getDepartmentCode() {
        return (String) getAttributeInternal(DEPARTMENTCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentCode.
     * @param value value to set the DepartmentCode
     */
    public void setDepartmentCode(String value) {
        setAttributeInternal(DEPARTMENTCODE, value);
    }

    /**
     * Gets the attribute value for CustomerId, using the alias name CustomerId.
     * @return the value of CustomerId
     */
    public Number getCustomerId() {
        return (Number) getAttributeInternal(CUSTOMERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustomerId.
     * @param value value to set the CustomerId
     */
    public void setCustomerId(Number value) {
        setAttributeInternal(CUSTOMERID, value);
    }

    /**
     * Gets the attribute value for CustSiteId, using the alias name CustSiteId.
     * @return the value of CustSiteId
     */
    public Number getCustSiteId() {
        return (Number) getAttributeInternal(CUSTSITEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustSiteId.
     * @param value value to set the CustSiteId
     */
    public void setCustSiteId(Number value) {
        setAttributeInternal(CUSTSITEID, value);
    }

    /**
     * Gets the attribute value for SiteUseId, using the alias name SiteUseId.
     * @return the value of SiteUseId
     */
    public Number getSiteUseId() {
        return (Number) getAttributeInternal(SITEUSEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SiteUseId.
     * @param value value to set the SiteUseId
     */
    public void setSiteUseId(Number value) {
        setAttributeInternal(SITEUSEID, value);
    }

    /**
     * Gets the attribute value for PreparedBy, using the alias name PreparedBy.
     * @return the value of PreparedBy
     */
    public String getPreparedBy() {
        return (String) getAttributeInternal(PREPAREDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for PreparedBy.
     * @param value value to set the PreparedBy
     */
    public void setPreparedBy(String value) {
        setAttributeInternal(PREPAREDBY, value);
    }

    /**
     * Gets the attribute value for SrcDivFlexValueId, using the alias name SrcDivFlexValueId.
     * @return the value of SrcDivFlexValueId
     */
    public Number getSrcDivFlexValueId() {
        return (Number) getAttributeInternal(SRCDIVFLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SrcDivFlexValueId.
     * @param value value to set the SrcDivFlexValueId
     */
    public void setSrcDivFlexValueId(Number value) {
        setAttributeInternal(SRCDIVFLEXVALUEID, value);
    }

    /**
     * Gets the attribute value for SrcDivFlexValSetId, using the alias name SrcDivFlexValSetId.
     * @return the value of SrcDivFlexValSetId
     */
    public Number getSrcDivFlexValSetId() {
        return (Number) getAttributeInternal(SRCDIVFLEXVALSETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SrcDivFlexValSetId.
     * @param value value to set the SrcDivFlexValSetId
     */
    public void setSrcDivFlexValSetId(Number value) {
        setAttributeInternal(SRCDIVFLEXVALSETID, value);
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
     * Gets the attribute value for DivFlexValueSetId, using the alias name DivFlexValueSetId.
     * @return the value of DivFlexValueSetId
     */
    public Number getDivFlexValueSetId() {
        return (Number) getAttributeInternal(DIVFLEXVALUESETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DivFlexValueSetId.
     * @param value value to set the DivFlexValueSetId
     */
    public void setDivFlexValueSetId(Number value) {
        setAttributeInternal(DIVFLEXVALUESETID, value);
    }

    /**
     * Gets the attribute value for DeptFlexValueId, using the alias name DeptFlexValueId.
     * @return the value of DeptFlexValueId
     */
    public Number getDeptFlexValueId() {
        return (Number) getAttributeInternal(DEPTFLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DeptFlexValueId.
     * @param value value to set the DeptFlexValueId
     */
    public void setDeptFlexValueId(Number value) {
        setAttributeInternal(DEPTFLEXVALUEID, value);
    }

    /**
     * Gets the attribute value for DeptFlexValueSetId, using the alias name DeptFlexValueSetId.
     * @return the value of DeptFlexValueSetId
     */
    public Number getDeptFlexValueSetId() {
        return (Number) getAttributeInternal(DEPTFLEXVALUESETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DeptFlexValueSetId.
     * @param value value to set the DeptFlexValueSetId
     */
    public void setDeptFlexValueSetId(Number value) {
        setAttributeInternal(DEPTFLEXVALUESETID, value);
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
     * Gets the attribute value for BatchId, using the alias name BatchId.
     * @return the value of BatchId
     */
    public Number getBatchId() {
        return (Number) getAttributeInternal(BATCHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BatchId.
     * @param value value to set the BatchId
     */
    public void setBatchId(Number value) {
        setAttributeInternal(BATCHID, value);
    }


    /**
     * Gets the attribute value for TimesheetPeriod, using the alias name TimesheetPeriod.
     * @return the value of TimesheetPeriod
     */
    public String getTimesheetPeriod() {
        return (String) getAttributeInternal(TIMESHEETPERIOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for TimesheetPeriod.
     * @param value value to set the TimesheetPeriod
     */
    public void setTimesheetPeriod(String value) {
        setAttributeInternal(TIMESHEETPERIOD, value);
    }


    /**
     * @param tsHeaderId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number tsHeaderId) {
        return new Key(new Object[] { tsHeaderId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq = new SequenceImpl("XXADS_TIMESHEET_HDR_S", this.getDBTransaction());
        setTsHeaderId(seq.getSequenceNumber());
    }
}

