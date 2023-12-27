package model.view;

import model.entity.XxadsAssetRequestEOImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 11 17:49:24 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AssetRequestHdrVORowImpl extends ViewRowImpl {


    public static final int ENTITY_XXADSASSETREQUESTEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ApprovedDate,
        CreatedBy,
        CreationDate,
        CustSiteId,
        CustomerId,
        CustomerType,
        DepartmentCode,
        DepartmentName,
        DeptFlexValueId,
        DeptFlexValueSetId,
        DivFlexValueId,
        DivFlexValueSetId,
        Division,
        LastUpdateDate,
        LastUpdatedBy,
        Note,
        ObjectVersionNumber,
        PreparedBy,
        PreparedOn,
        ProjectId,
        RequestId,
        RequestNumber,
        RequestStatus,
        RequestType,
        RequestedDate,
        RequestorBuId,
        RequestorId,
        SiteUseId,
        SourceBuId,
        SrcDivFlexValSetId,
        SrcDivFlexValueId,
        SrcDivision,
        SubmittedBy,
        SubmittedDate,
        TransRequestorBuName,
        TransSrcBuName,
        TransSrcDivRequired,
        TransSrcDivSegmentNum,
        TransSrcDeptSegmentNum,
        TransCustomerType,
        TransRequestorName,
        TransProject,
        TransDepartment,
        TransCustName,
        TransCustSiteName,
        TransDivSegmentNumber,
        TransDeptSegmentNumber,
        TransReqBuSetId,
        TransRequestStatus,
        TransLineRows,
        TransAssetRequestAttachCode,
        TransSrcPrecision,
        AssetRequestLinesVO,
        AttachmentsVO,
        StaticRequestTypeLOV1,
        AssetRequestReqBuLOV1,
        AssetRequestSourceBuLOV1,
        AssetRequestCustTypeLOV1,
        EmployeeLovVO1,
        ReqBuBasedProjectLovVO1,
        ReqBuBasedDivisionLovVO1,
        ReqBuBasedDeptLovVO1,
        ReqBuBasedCustomerLovVO1,
        ReqBuBasedCustSiteLovVO1,
        FlexValuesAccessLovVO1;
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


    public static final int APPROVEDDATE = AttributesEnum.ApprovedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CUSTSITEID = AttributesEnum.CustSiteId.index();
    public static final int CUSTOMERID = AttributesEnum.CustomerId.index();
    public static final int CUSTOMERTYPE = AttributesEnum.CustomerType.index();
    public static final int DEPARTMENTCODE = AttributesEnum.DepartmentCode.index();
    public static final int DEPARTMENTNAME = AttributesEnum.DepartmentName.index();
    public static final int DEPTFLEXVALUEID = AttributesEnum.DeptFlexValueId.index();
    public static final int DEPTFLEXVALUESETID = AttributesEnum.DeptFlexValueSetId.index();
    public static final int DIVFLEXVALUEID = AttributesEnum.DivFlexValueId.index();
    public static final int DIVFLEXVALUESETID = AttributesEnum.DivFlexValueSetId.index();
    public static final int DIVISION = AttributesEnum.Division.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int NOTE = AttributesEnum.Note.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int PREPAREDBY = AttributesEnum.PreparedBy.index();
    public static final int PREPAREDON = AttributesEnum.PreparedOn.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int REQUESTID = AttributesEnum.RequestId.index();
    public static final int REQUESTNUMBER = AttributesEnum.RequestNumber.index();
    public static final int REQUESTSTATUS = AttributesEnum.RequestStatus.index();
    public static final int REQUESTTYPE = AttributesEnum.RequestType.index();
    public static final int REQUESTEDDATE = AttributesEnum.RequestedDate.index();
    public static final int REQUESTORBUID = AttributesEnum.RequestorBuId.index();
    public static final int REQUESTORID = AttributesEnum.RequestorId.index();
    public static final int SITEUSEID = AttributesEnum.SiteUseId.index();
    public static final int SOURCEBUID = AttributesEnum.SourceBuId.index();
    public static final int SRCDIVFLEXVALSETID = AttributesEnum.SrcDivFlexValSetId.index();
    public static final int SRCDIVFLEXVALUEID = AttributesEnum.SrcDivFlexValueId.index();
    public static final int SRCDIVISION = AttributesEnum.SrcDivision.index();
    public static final int SUBMITTEDBY = AttributesEnum.SubmittedBy.index();
    public static final int SUBMITTEDDATE = AttributesEnum.SubmittedDate.index();
    public static final int TRANSREQUESTORBUNAME = AttributesEnum.TransRequestorBuName.index();
    public static final int TRANSSRCBUNAME = AttributesEnum.TransSrcBuName.index();
    public static final int TRANSSRCDIVREQUIRED = AttributesEnum.TransSrcDivRequired.index();
    public static final int TRANSSRCDIVSEGMENTNUM = AttributesEnum.TransSrcDivSegmentNum.index();
    public static final int TRANSSRCDEPTSEGMENTNUM = AttributesEnum.TransSrcDeptSegmentNum.index();
    public static final int TRANSCUSTOMERTYPE = AttributesEnum.TransCustomerType.index();
    public static final int TRANSREQUESTORNAME = AttributesEnum.TransRequestorName.index();
    public static final int TRANSPROJECT = AttributesEnum.TransProject.index();
    public static final int TRANSDEPARTMENT = AttributesEnum.TransDepartment.index();
    public static final int TRANSCUSTNAME = AttributesEnum.TransCustName.index();
    public static final int TRANSCUSTSITENAME = AttributesEnum.TransCustSiteName.index();
    public static final int TRANSDIVSEGMENTNUMBER = AttributesEnum.TransDivSegmentNumber.index();
    public static final int TRANSDEPTSEGMENTNUMBER = AttributesEnum.TransDeptSegmentNumber.index();
    public static final int TRANSREQBUSETID = AttributesEnum.TransReqBuSetId.index();
    public static final int TRANSREQUESTSTATUS = AttributesEnum.TransRequestStatus.index();
    public static final int TRANSLINEROWS = AttributesEnum.TransLineRows.index();
    public static final int TRANSASSETREQUESTATTACHCODE = AttributesEnum.TransAssetRequestAttachCode.index();
    public static final int TRANSSRCPRECISION = AttributesEnum.TransSrcPrecision.index();
    public static final int ASSETREQUESTLINESVO = AttributesEnum.AssetRequestLinesVO.index();
    public static final int ATTACHMENTSVO = AttributesEnum.AttachmentsVO.index();
    public static final int STATICREQUESTTYPELOV1 = AttributesEnum.StaticRequestTypeLOV1.index();
    public static final int ASSETREQUESTREQBULOV1 = AttributesEnum.AssetRequestReqBuLOV1.index();
    public static final int ASSETREQUESTSOURCEBULOV1 = AttributesEnum.AssetRequestSourceBuLOV1.index();
    public static final int ASSETREQUESTCUSTTYPELOV1 = AttributesEnum.AssetRequestCustTypeLOV1.index();
    public static final int EMPLOYEELOVVO1 = AttributesEnum.EmployeeLovVO1.index();
    public static final int REQBUBASEDPROJECTLOVVO1 = AttributesEnum.ReqBuBasedProjectLovVO1.index();
    public static final int REQBUBASEDDIVISIONLOVVO1 = AttributesEnum.ReqBuBasedDivisionLovVO1.index();
    public static final int REQBUBASEDDEPTLOVVO1 = AttributesEnum.ReqBuBasedDeptLovVO1.index();
    public static final int REQBUBASEDCUSTOMERLOVVO1 = AttributesEnum.ReqBuBasedCustomerLovVO1.index();
    public static final int REQBUBASEDCUSTSITELOVVO1 = AttributesEnum.ReqBuBasedCustSiteLovVO1.index();
    public static final int FLEXVALUESACCESSLOVVO1 = AttributesEnum.FlexValuesAccessLovVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AssetRequestHdrVORowImpl() {
    }

    /**
     * Gets XxadsAssetRequestEO entity object.
     * @return the XxadsAssetRequestEO
     */
    public XxadsAssetRequestEOImpl getXxadsAssetRequestEO() {
        return (XxadsAssetRequestEOImpl) getEntity(ENTITY_XXADSASSETREQUESTEO);
    }

    /**
     * Gets the attribute value for APPROVED_DATE using the alias name ApprovedDate.
     * @return the APPROVED_DATE
     */
    public Date getApprovedDate() {
        return (Date) getAttributeInternal(APPROVEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for APPROVED_DATE using the alias name ApprovedDate.
     * @param value value to set the APPROVED_DATE
     */
    public void setApprovedDate(Date value) {
        setAttributeInternal(APPROVEDDATE, value);
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
     * Gets the attribute value for CUST_SITE_ID using the alias name CustSiteId.
     * @return the CUST_SITE_ID
     */
    public Number getCustSiteId() {
        return (Number) getAttributeInternal(CUSTSITEID);
    }

    /**
     * Sets <code>value</code> as attribute value for CUST_SITE_ID using the alias name CustSiteId.
     * @param value value to set the CUST_SITE_ID
     */
    public void setCustSiteId(Number value) {
        setAttributeInternal(CUSTSITEID, value);
    }

    /**
     * Gets the attribute value for CUSTOMER_ID using the alias name CustomerId.
     * @return the CUSTOMER_ID
     */
    public Number getCustomerId() {
        return (Number) getAttributeInternal(CUSTOMERID);
    }

    /**
     * Sets <code>value</code> as attribute value for CUSTOMER_ID using the alias name CustomerId.
     * @param value value to set the CUSTOMER_ID
     */
    public void setCustomerId(Number value) {
        setAttributeInternal(CUSTOMERID, value);
    }

    /**
     * Gets the attribute value for CUSTOMER_TYPE using the alias name CustomerType.
     * @return the CUSTOMER_TYPE
     */
    public String getCustomerType() {
        return (String) getAttributeInternal(CUSTOMERTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for CUSTOMER_TYPE using the alias name CustomerType.
     * @param value value to set the CUSTOMER_TYPE
     */
    public void setCustomerType(String value) {
        setAttributeInternal(CUSTOMERTYPE, value);
    }

    /**
     * Gets the attribute value for DEPARTMENT_CODE using the alias name DepartmentCode.
     * @return the DEPARTMENT_CODE
     */
    public String getDepartmentCode() {
        return (String) getAttributeInternal(DEPARTMENTCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPARTMENT_CODE using the alias name DepartmentCode.
     * @param value value to set the DEPARTMENT_CODE
     */
    public void setDepartmentCode(String value) {
        setAttributeInternal(DEPARTMENTCODE, value);
    }

    /**
     * Gets the attribute value for DEPARTMENT_NAME using the alias name DepartmentName.
     * @return the DEPARTMENT_NAME
     */
    public String getDepartmentName() {
        return (String) getAttributeInternal(DEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPARTMENT_NAME using the alias name DepartmentName.
     * @param value value to set the DEPARTMENT_NAME
     */
    public void setDepartmentName(String value) {
        setAttributeInternal(DEPARTMENTNAME, value);
    }

    /**
     * Gets the attribute value for DEPT_FLEX_VALUE_ID using the alias name DeptFlexValueId.
     * @return the DEPT_FLEX_VALUE_ID
     */
    public Number getDeptFlexValueId() {
        return (Number) getAttributeInternal(DEPTFLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPT_FLEX_VALUE_ID using the alias name DeptFlexValueId.
     * @param value value to set the DEPT_FLEX_VALUE_ID
     */
    public void setDeptFlexValueId(Number value) {
        setAttributeInternal(DEPTFLEXVALUEID, value);
    }

    /**
     * Gets the attribute value for DEPT_FLEX_VALUE_SET_ID using the alias name DeptFlexValueSetId.
     * @return the DEPT_FLEX_VALUE_SET_ID
     */
    public Number getDeptFlexValueSetId() {
        return (Number) getAttributeInternal(DEPTFLEXVALUESETID);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPT_FLEX_VALUE_SET_ID using the alias name DeptFlexValueSetId.
     * @param value value to set the DEPT_FLEX_VALUE_SET_ID
     */
    public void setDeptFlexValueSetId(Number value) {
        setAttributeInternal(DEPTFLEXVALUESETID, value);
    }

    /**
     * Gets the attribute value for DIV_FLEX_VALUE_ID using the alias name DivFlexValueId.
     * @return the DIV_FLEX_VALUE_ID
     */
    public Number getDivFlexValueId() {
        return (Number) getAttributeInternal(DIVFLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as attribute value for DIV_FLEX_VALUE_ID using the alias name DivFlexValueId.
     * @param value value to set the DIV_FLEX_VALUE_ID
     */
    public void setDivFlexValueId(Number value) {
        setAttributeInternal(DIVFLEXVALUEID, value);
    }

    /**
     * Gets the attribute value for DIV_FLEX_VALUE_SET_ID using the alias name DivFlexValueSetId.
     * @return the DIV_FLEX_VALUE_SET_ID
     */
    public Number getDivFlexValueSetId() {
        return (Number) getAttributeInternal(DIVFLEXVALUESETID);
    }

    /**
     * Sets <code>value</code> as attribute value for DIV_FLEX_VALUE_SET_ID using the alias name DivFlexValueSetId.
     * @param value value to set the DIV_FLEX_VALUE_SET_ID
     */
    public void setDivFlexValueSetId(Number value) {
        setAttributeInternal(DIVFLEXVALUESETID, value);
    }

    /**
     * Gets the attribute value for DIVISION using the alias name Division.
     * @return the DIVISION
     */
    public String getDivision() {
        return (String) getAttributeInternal(DIVISION);
    }

    /**
     * Sets <code>value</code> as attribute value for DIVISION using the alias name Division.
     * @param value value to set the DIVISION
     */
    public void setDivision(String value) {
        setAttributeInternal(DIVISION, value);
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
     * Gets the attribute value for NOTE using the alias name Note.
     * @return the NOTE
     */
    public String getNote() {
        return (String) getAttributeInternal(NOTE);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTE using the alias name Note.
     * @param value value to set the NOTE
     */
    public void setNote(String value) {
        setAttributeInternal(NOTE, value);
    }

    /**
     * Gets the attribute value for OBJECT_VERSION_NUMBER using the alias name ObjectVersionNumber.
     * @return the OBJECT_VERSION_NUMBER
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Gets the attribute value for PREPARED_BY using the alias name PreparedBy.
     * @return the PREPARED_BY
     */
    public String getPreparedBy() {
        return (String) getAttributeInternal(PREPAREDBY);
    }


    /**
     * Gets the attribute value for PREPARED_ON using the alias name PreparedOn.
     * @return the PREPARED_ON
     */
    public Date getPreparedOn() {
        return (Date) getAttributeInternal(PREPAREDON);
    }


    /**
     * Gets the attribute value for PROJECT_ID using the alias name ProjectId.
     * @return the PROJECT_ID
     */
    public Number getProjectId() {
        return (Number) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PROJECT_ID using the alias name ProjectId.
     * @param value value to set the PROJECT_ID
     */
    public void setProjectId(Number value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for REQUEST_ID using the alias name RequestId.
     * @return the REQUEST_ID
     */
    public Number getRequestId() {
        return (Number) getAttributeInternal(REQUESTID);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUEST_ID using the alias name RequestId.
     * @param value value to set the REQUEST_ID
     */
    public void setRequestId(Number value) {
        setAttributeInternal(REQUESTID, value);
    }

    /**
     * Gets the attribute value for REQUEST_NUMBER using the alias name RequestNumber.
     * @return the REQUEST_NUMBER
     */
    public String getRequestNumber() {
        return (String) getAttributeInternal(REQUESTNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUEST_NUMBER using the alias name RequestNumber.
     * @param value value to set the REQUEST_NUMBER
     */
    public void setRequestNumber(String value) {
        setAttributeInternal(REQUESTNUMBER, value);
    }

    /**
     * Gets the attribute value for REQUEST_STATUS using the alias name RequestStatus.
     * @return the REQUEST_STATUS
     */
    public String getRequestStatus() {
        return (String) getAttributeInternal(REQUESTSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUEST_STATUS using the alias name RequestStatus.
     * @param value value to set the REQUEST_STATUS
     */
    public void setRequestStatus(String value) {
        setAttributeInternal(REQUESTSTATUS, value);
    }

    /**
     * Gets the attribute value for REQUEST_TYPE using the alias name RequestType.
     * @return the REQUEST_TYPE
     */
    public String getRequestType() {
        return (String) getAttributeInternal(REQUESTTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUEST_TYPE using the alias name RequestType.
     * @param value value to set the REQUEST_TYPE
     */
    public void setRequestType(String value) {
        setAttributeInternal(REQUESTTYPE, value);
    }

    /**
     * Gets the attribute value for REQUESTED_DATE using the alias name RequestedDate.
     * @return the REQUESTED_DATE
     */
    public Date getRequestedDate() {
        return (Date) getAttributeInternal(REQUESTEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUESTED_DATE using the alias name RequestedDate.
     * @param value value to set the REQUESTED_DATE
     */
    public void setRequestedDate(Date value) {
        setAttributeInternal(REQUESTEDDATE, value);
    }

    /**
     * Gets the attribute value for REQUESTOR_BU_ID using the alias name RequestorBuId.
     * @return the REQUESTOR_BU_ID
     */
    public Number getRequestorBuId() {
        return (Number) getAttributeInternal(REQUESTORBUID);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUESTOR_BU_ID using the alias name RequestorBuId.
     * @param value value to set the REQUESTOR_BU_ID
     */
    public void setRequestorBuId(Number value) {
        setAttributeInternal(REQUESTORBUID, value);
    }

    /**
     * Gets the attribute value for REQUESTOR_ID using the alias name RequestorId.
     * @return the REQUESTOR_ID
     */
    public Number getRequestorId() {
        return (Number) getAttributeInternal(REQUESTORID);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUESTOR_ID using the alias name RequestorId.
     * @param value value to set the REQUESTOR_ID
     */
    public void setRequestorId(Number value) {
        setAttributeInternal(REQUESTORID, value);
    }

    /**
     * Gets the attribute value for SITE_USE_ID using the alias name SiteUseId.
     * @return the SITE_USE_ID
     */
    public Number getSiteUseId() {
        return (Number) getAttributeInternal(SITEUSEID);
    }

    /**
     * Sets <code>value</code> as attribute value for SITE_USE_ID using the alias name SiteUseId.
     * @param value value to set the SITE_USE_ID
     */
    public void setSiteUseId(Number value) {
        setAttributeInternal(SITEUSEID, value);
    }

    /**
     * Gets the attribute value for SOURCE_BU_ID using the alias name SourceBuId.
     * @return the SOURCE_BU_ID
     */
    public Number getSourceBuId() {
        return (Number) getAttributeInternal(SOURCEBUID);
    }

    /**
     * Sets <code>value</code> as attribute value for SOURCE_BU_ID using the alias name SourceBuId.
     * @param value value to set the SOURCE_BU_ID
     */
    public void setSourceBuId(Number value) {
        setAttributeInternal(SOURCEBUID, value);
    }

    /**
     * Gets the attribute value for SRC_DIV_FLEX_VAL_SET_ID using the alias name SrcDivFlexValSetId.
     * @return the SRC_DIV_FLEX_VAL_SET_ID
     */
    public Number getSrcDivFlexValSetId() {
        return (Number) getAttributeInternal(SRCDIVFLEXVALSETID);
    }

    /**
     * Sets <code>value</code> as attribute value for SRC_DIV_FLEX_VAL_SET_ID using the alias name SrcDivFlexValSetId.
     * @param value value to set the SRC_DIV_FLEX_VAL_SET_ID
     */
    public void setSrcDivFlexValSetId(Number value) {
        setAttributeInternal(SRCDIVFLEXVALSETID, value);
    }

    /**
     * Gets the attribute value for SRC_DIV_FLEX_VALUE_ID using the alias name SrcDivFlexValueId.
     * @return the SRC_DIV_FLEX_VALUE_ID
     */
    public Number getSrcDivFlexValueId() {
        return (Number) getAttributeInternal(SRCDIVFLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as attribute value for SRC_DIV_FLEX_VALUE_ID using the alias name SrcDivFlexValueId.
     * @param value value to set the SRC_DIV_FLEX_VALUE_ID
     */
    public void setSrcDivFlexValueId(Number value) {
        setAttributeInternal(SRCDIVFLEXVALUEID, value);
    }

    /**
     * Gets the attribute value for SRC_DIVISION using the alias name SrcDivision.
     * @return the SRC_DIVISION
     */
    public String getSrcDivision() {
        return (String) getAttributeInternal(SRCDIVISION);
    }

    /**
     * Sets <code>value</code> as attribute value for SRC_DIVISION using the alias name SrcDivision.
     * @param value value to set the SRC_DIVISION
     */
    public void setSrcDivision(String value) {
        setAttributeInternal(SRCDIVISION, value);
    }

    /**
     * Gets the attribute value for SUBMITTED_BY using the alias name SubmittedBy.
     * @return the SUBMITTED_BY
     */
    public String getSubmittedBy() {
        return (String) getAttributeInternal(SUBMITTEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBMITTED_BY using the alias name SubmittedBy.
     * @param value value to set the SUBMITTED_BY
     */
    public void setSubmittedBy(String value) {
        setAttributeInternal(SUBMITTEDBY, value);
    }

    /**
     * Gets the attribute value for SUBMITTED_DATE using the alias name SubmittedDate.
     * @return the SUBMITTED_DATE
     */
    public Date getSubmittedDate() {
        return (Date) getAttributeInternal(SUBMITTEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBMITTED_DATE using the alias name SubmittedDate.
     * @param value value to set the SUBMITTED_DATE
     */
    public void setSubmittedDate(Date value) {
        setAttributeInternal(SUBMITTEDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransRequestorBuName.
     * @return the TransRequestorBuName
     */
    public String getTransRequestorBuName() {
        return (String) getAttributeInternal(TRANSREQUESTORBUNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransRequestorBuName.
     * @param value value to set the  TransRequestorBuName
     */
    public void setTransRequestorBuName(String value) {
        setAttributeInternal(TRANSREQUESTORBUNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcBuName.
     * @return the TransSrcBuName
     */
    public String getTransSrcBuName() {
        return (String) getAttributeInternal(TRANSSRCBUNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcBuName.
     * @param value value to set the  TransSrcBuName
     */
    public void setTransSrcBuName(String value) {
        setAttributeInternal(TRANSSRCBUNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcDivRequired.
     * @return the TransSrcDivRequired
     */
    public String getTransSrcDivRequired() {
        return (String) getAttributeInternal(TRANSSRCDIVREQUIRED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcDivRequired.
     * @param value value to set the  TransSrcDivRequired
     */
    public void setTransSrcDivRequired(String value) {
        setAttributeInternal(TRANSSRCDIVREQUIRED, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcDivSegmentNum.
     * @return the TransSrcDivSegmentNum
     */
    public Number getTransSrcDivSegmentNum() {
        return (Number) getAttributeInternal(TRANSSRCDIVSEGMENTNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcDivSegmentNum.
     * @param value value to set the  TransSrcDivSegmentNum
     */
    public void setTransSrcDivSegmentNum(Number value) {
        setAttributeInternal(TRANSSRCDIVSEGMENTNUM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcDeptSegmentNum.
     * @return the TransSrcDeptSegmentNum
     */
    public Number getTransSrcDeptSegmentNum() {
        return (Number) getAttributeInternal(TRANSSRCDEPTSEGMENTNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcDeptSegmentNum.
     * @param value value to set the  TransSrcDeptSegmentNum
     */
    public void setTransSrcDeptSegmentNum(Number value) {
        setAttributeInternal(TRANSSRCDEPTSEGMENTNUM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCustomerType.
     * @return the TransCustomerType
     */
    public String getTransCustomerType() {
        return (String) getAttributeInternal(TRANSCUSTOMERTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCustomerType.
     * @param value value to set the  TransCustomerType
     */
    public void setTransCustomerType(String value) {
        setAttributeInternal(TRANSCUSTOMERTYPE, value);
    }


    /**
     * Gets the attribute value for the calculated attribute TransRequestorName.
     * @return the TransRequestorName
     */
    public String getTransRequestorName() {
        return (String) getAttributeInternal(TRANSREQUESTORNAME);
    }


    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransRequestorName.
     * @param value value to set the  TransRequestorName
     */
    public void setTransRequestorName(String value) {
        setAttributeInternal(TRANSREQUESTORNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransProject.
     * @return the TransProject
     */
    public String getTransProject() {
        return (String) getAttributeInternal(TRANSPROJECT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransProject.
     * @param value value to set the  TransProject
     */
    public void setTransProject(String value) {
        setAttributeInternal(TRANSPROJECT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDepartment.
     * @return the TransDepartment
     */
    public String getTransDepartment() {
        return (String) getAttributeInternal(TRANSDEPARTMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDepartment.
     * @param value value to set the  TransDepartment
     */
    public void setTransDepartment(String value) {
        setAttributeInternal(TRANSDEPARTMENT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCustName.
     * @return the TransCustName
     */
    public String getTransCustName() {
        return (String) getAttributeInternal(TRANSCUSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCustName.
     * @param value value to set the  TransCustName
     */
    public void setTransCustName(String value) {
        setAttributeInternal(TRANSCUSTNAME, value);
    }


    /**
     * Gets the attribute value for the calculated attribute TransCustSiteName.
     * @return the TransCustSiteName
     */
    public String getTransCustSiteName() {
        return (String) getAttributeInternal(TRANSCUSTSITENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCustSiteName.
     * @param value value to set the  TransCustSiteName
     */
    public void setTransCustSiteName(String value) {
        setAttributeInternal(TRANSCUSTSITENAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDivSegmentNumber.
     * @return the TransDivSegmentNumber
     */
    public Number getTransDivSegmentNumber() {
        return (Number) getAttributeInternal(TRANSDIVSEGMENTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDivSegmentNumber.
     * @param value value to set the  TransDivSegmentNumber
     */
    public void setTransDivSegmentNumber(Number value) {
        setAttributeInternal(TRANSDIVSEGMENTNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDeptSegmentNumber.
     * @return the TransDeptSegmentNumber
     */
    public Number getTransDeptSegmentNumber() {
        return (Number) getAttributeInternal(TRANSDEPTSEGMENTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDeptSegmentNumber.
     * @param value value to set the  TransDeptSegmentNumber
     */
    public void setTransDeptSegmentNumber(Number value) {
        setAttributeInternal(TRANSDEPTSEGMENTNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransReqBuSetId.
     * @return the TransReqBuSetId
     */
    public Number getTransReqBuSetId() {
        return (Number) getAttributeInternal(TRANSREQBUSETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransReqBuSetId.
     * @param value value to set the  TransReqBuSetId
     */
    public void setTransReqBuSetId(Number value) {
        setAttributeInternal(TRANSREQBUSETID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransRequestStatus.
     * @return the TransRequestStatus
     */
    public String getTransRequestStatus() {
        return (String) getAttributeInternal(TRANSREQUESTSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransRequestStatus.
     * @param value value to set the  TransRequestStatus
     */
    public void setTransRequestStatus(String value) {
        setAttributeInternal(TRANSREQUESTSTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransLineRowCount.
     * @return the TransLineRowCount
     */
    public String getTransLineRows() {
        if(getAssetRequestLinesVO().getRowCount() > 0) {
            return "Y";
        }
        else {
            return "N";
        }
//        return (String) getAttributeInternal(TRANSLINEROWS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransLineRows.
     * @param value value to set the  TransLineRows
     */
    public void setTransLineRows(String value) {
        setAttributeInternal(TRANSLINEROWS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAssetRequestAttachCode.
     * @return the TransAssetRequestAttachCode
     */
    public String getTransAssetRequestAttachCode() {
        return (String) getAttributeInternal(TRANSASSETREQUESTATTACHCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAssetRequestAttachCode.
     * @param value value to set the  TransAssetRequestAttachCode
     */
    public void setTransAssetRequestAttachCode(String value) {
        setAttributeInternal(TRANSASSETREQUESTATTACHCODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcPrecision.
     * @return the TransSrcPrecision
     */
    public Integer getTransSrcPrecision() {
        return (Integer) getAttributeInternal(TRANSSRCPRECISION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcPrecision.
     * @param value value to set the  TransSrcPrecision
     */
    public void setTransSrcPrecision(Integer value) {
        setAttributeInternal(TRANSSRCPRECISION, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link AssetRequestLinesVO.
     */
    public RowIterator getAssetRequestLinesVO() {
        return (RowIterator) getAttributeInternal(ASSETREQUESTLINESVO);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link AttachmentsVO.
     */
    public RowIterator getAttachmentsVO() {
        return (RowIterator) getAttributeInternal(ATTACHMENTSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> StaticRequestTypeLOV1.
     */
    public RowSet getStaticRequestTypeLOV1() {
        return (RowSet) getAttributeInternal(STATICREQUESTTYPELOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AssetRequestReqBuLOV1.
     */
    public RowSet getAssetRequestReqBuLOV1() {
        return (RowSet) getAttributeInternal(ASSETREQUESTREQBULOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AssetRequestSourceBuLOV1.
     */
    public RowSet getAssetRequestSourceBuLOV1() {
        return (RowSet) getAttributeInternal(ASSETREQUESTSOURCEBULOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AssetRequestCustTypeLOV1.
     */
    public RowSet getAssetRequestCustTypeLOV1() {
        return (RowSet) getAttributeInternal(ASSETREQUESTCUSTTYPELOV1);
    }


    /**
     * Gets the view accessor <code>RowSet</code> EmployeeLovVO1.
     */
    public RowSet getEmployeeLovVO1() {
        return (RowSet) getAttributeInternal(EMPLOYEELOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ReqBuBasedProjectLovVO1.
     */
    public RowSet getReqBuBasedProjectLovVO1() {
        return (RowSet) getAttributeInternal(REQBUBASEDPROJECTLOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ReqBuBasedDivisionLovVO1.
     */
    public RowSet getReqBuBasedDivisionLovVO1() {
        return (RowSet) getAttributeInternal(REQBUBASEDDIVISIONLOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ReqBuBasedDeptLovVO1.
     */
    public RowSet getReqBuBasedDeptLovVO1() {
        return (RowSet) getAttributeInternal(REQBUBASEDDEPTLOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ReqBuBasedCustomerLovVO1.
     */
    public RowSet getReqBuBasedCustomerLovVO1() {
        return (RowSet) getAttributeInternal(REQBUBASEDCUSTOMERLOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ReqBuBasedCustSiteLovVO1.
     */
    public RowSet getReqBuBasedCustSiteLovVO1() {
        return (RowSet) getAttributeInternal(REQBUBASEDCUSTSITELOVVO1);
    }


    /**
     * Gets the view accessor <code>RowSet</code> FlexValuesAccessLovVO1.
     */
    public RowSet getFlexValuesAccessLovVO1() {
        return (RowSet) getAttributeInternal(FLEXVALUESACCESSLOVVO1);
    }

}

