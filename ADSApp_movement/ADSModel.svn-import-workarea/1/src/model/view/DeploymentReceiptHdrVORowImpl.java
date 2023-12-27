package model.view;

import model.entity.AssetDeploymentReceiptHdrEOImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 30 17:41:21 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DeploymentReceiptHdrVORowImpl extends ViewRowImpl {


    public static final int ENTITY_ASSETDEPLOYMENTRECEIPTHDREO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AllocationId,
        ContractId,
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
        DoId,
        DocumentDate,
        DrId,
        DrNumber,
        DrStatus,
        LastUpdateDate,
        LastUpdatedBy,
        MasterContractId,
        ObjectVersionNumber,
        PreparedBy,
        ProjectId,
        Remarks,
        ReqBuId,
        SiteUseId,
        SrcBuId,
        SrcDivFlexValSetId,
        SrcDivFlexValueId,
        SrcDivision,
        TransSrcBu,
        TransReqBu,
        TransCustomerType,
        TransProject,
        TransCustomer,
        TransCustomerSite,
        TransContractNumber,
        TransDrStatus,
        TransDoNumber,
        TransDepartment,
        TransSourceDivRequired,
        TransSrcDivFlexSegmentNum,
        TransSrcDeptFlexSegmentNum,
        TransSrcCurrencyCode,
        TransSrcPrecision,
        TransReqBuDeptSegment,
        TransReqBuDivSegment,
        TransAttachmentCode,
        MasterContractId1,
        DeploymentReceiptLinesVO,
        AttachmentsVO,
        QuoteSourceBuLovVO1,
        QuoteReqBuLovVO1,
        ContractNumberLOV1,
        ReceiptDeploymentNoLOVVO1,
        TimesheetReqBuLovVO1,
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


    public static final int ALLOCATIONID = AttributesEnum.AllocationId.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
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
    public static final int DOID = AttributesEnum.DoId.index();
    public static final int DOCUMENTDATE = AttributesEnum.DocumentDate.index();
    public static final int DRID = AttributesEnum.DrId.index();
    public static final int DRNUMBER = AttributesEnum.DrNumber.index();
    public static final int DRSTATUS = AttributesEnum.DrStatus.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int MASTERCONTRACTID = AttributesEnum.MasterContractId.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int PREPAREDBY = AttributesEnum.PreparedBy.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int REQBUID = AttributesEnum.ReqBuId.index();
    public static final int SITEUSEID = AttributesEnum.SiteUseId.index();
    public static final int SRCBUID = AttributesEnum.SrcBuId.index();
    public static final int SRCDIVFLEXVALSETID = AttributesEnum.SrcDivFlexValSetId.index();
    public static final int SRCDIVFLEXVALUEID = AttributesEnum.SrcDivFlexValueId.index();
    public static final int SRCDIVISION = AttributesEnum.SrcDivision.index();
    public static final int TRANSSRCBU = AttributesEnum.TransSrcBu.index();
    public static final int TRANSREQBU = AttributesEnum.TransReqBu.index();
    public static final int TRANSCUSTOMERTYPE = AttributesEnum.TransCustomerType.index();
    public static final int TRANSPROJECT = AttributesEnum.TransProject.index();
    public static final int TRANSCUSTOMER = AttributesEnum.TransCustomer.index();
    public static final int TRANSCUSTOMERSITE = AttributesEnum.TransCustomerSite.index();
    public static final int TRANSCONTRACTNUMBER = AttributesEnum.TransContractNumber.index();
    public static final int TRANSDRSTATUS = AttributesEnum.TransDrStatus.index();
    public static final int TRANSDONUMBER = AttributesEnum.TransDoNumber.index();
    public static final int TRANSDEPARTMENT = AttributesEnum.TransDepartment.index();
    public static final int TRANSSOURCEDIVREQUIRED = AttributesEnum.TransSourceDivRequired.index();
    public static final int TRANSSRCDIVFLEXSEGMENTNUM = AttributesEnum.TransSrcDivFlexSegmentNum.index();
    public static final int TRANSSRCDEPTFLEXSEGMENTNUM = AttributesEnum.TransSrcDeptFlexSegmentNum.index();
    public static final int TRANSSRCCURRENCYCODE = AttributesEnum.TransSrcCurrencyCode.index();
    public static final int TRANSSRCPRECISION = AttributesEnum.TransSrcPrecision.index();
    public static final int TRANSREQBUDEPTSEGMENT = AttributesEnum.TransReqBuDeptSegment.index();
    public static final int TRANSREQBUDIVSEGMENT = AttributesEnum.TransReqBuDivSegment.index();
    public static final int TRANSATTACHMENTCODE = AttributesEnum.TransAttachmentCode.index();
    public static final int MASTERCONTRACTID1 = AttributesEnum.MasterContractId1.index();
    public static final int DEPLOYMENTRECEIPTLINESVO = AttributesEnum.DeploymentReceiptLinesVO.index();
    public static final int ATTACHMENTSVO = AttributesEnum.AttachmentsVO.index();
    public static final int QUOTESOURCEBULOVVO1 = AttributesEnum.QuoteSourceBuLovVO1.index();
    public static final int QUOTEREQBULOVVO1 = AttributesEnum.QuoteReqBuLovVO1.index();
    public static final int CONTRACTNUMBERLOV1 = AttributesEnum.ContractNumberLOV1.index();
    public static final int RECEIPTDEPLOYMENTNOLOVVO1 = AttributesEnum.ReceiptDeploymentNoLOVVO1.index();
    public static final int TIMESHEETREQBULOVVO1 = AttributesEnum.TimesheetReqBuLovVO1.index();
    public static final int FLEXVALUESACCESSLOVVO1 = AttributesEnum.FlexValuesAccessLovVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DeploymentReceiptHdrVORowImpl() {
    }

    /**
     * Gets AssetDeploymentReceiptHdrEO entity object.
     * @return the AssetDeploymentReceiptHdrEO
     */
    public AssetDeploymentReceiptHdrEOImpl getAssetDeploymentReceiptHdrEO() {
        return (AssetDeploymentReceiptHdrEOImpl) getEntity(ENTITY_ASSETDEPLOYMENTRECEIPTHDREO);
    }

    /**
     * Gets the attribute value for ALLOCATION_ID using the alias name AllocationId.
     * @return the ALLOCATION_ID
     */
    public Number getAllocationId() {
        return (Number) getAttributeInternal(ALLOCATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for ALLOCATION_ID using the alias name AllocationId.
     * @param value value to set the ALLOCATION_ID
     */
    public void setAllocationId(Number value) {
        setAttributeInternal(ALLOCATIONID, value);
    }

    /**
     * Gets the attribute value for CONTRACT_ID using the alias name ContractId.
     * @return the CONTRACT_ID
     */
    public Number getContractId() {
        return (Number) getAttributeInternal(CONTRACTID);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTRACT_ID using the alias name ContractId.
     * @param value value to set the CONTRACT_ID
     */
    public void setContractId(Number value) {
        setAttributeInternal(CONTRACTID, value);
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
     * Gets the attribute value for DOCUMENT_DATE using the alias name DocumentDate.
     * @return the DOCUMENT_DATE
     */
    public Date getDocumentDate() {
        return (Date) getAttributeInternal(DOCUMENTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for DOCUMENT_DATE using the alias name DocumentDate.
     * @param value value to set the DOCUMENT_DATE
     */
    public void setDocumentDate(Date value) {
        setAttributeInternal(DOCUMENTDATE, value);
    }

    /**
     * Gets the attribute value for DR_ID using the alias name DrId.
     * @return the DR_ID
     */
    public Number getDrId() {
        return (Number) getAttributeInternal(DRID);
    }

    /**
     * Sets <code>value</code> as attribute value for DR_ID using the alias name DrId.
     * @param value value to set the DR_ID
     */
    public void setDrId(Number value) {
        setAttributeInternal(DRID, value);
    }

    /**
     * Gets the attribute value for DR_NUMBER using the alias name DrNumber.
     * @return the DR_NUMBER
     */
    public String getDrNumber() {
        return (String) getAttributeInternal(DRNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for DR_NUMBER using the alias name DrNumber.
     * @param value value to set the DR_NUMBER
     */
    public void setDrNumber(String value) {
        setAttributeInternal(DRNUMBER, value);
    }

    /**
     * Gets the attribute value for DR_STATUS using the alias name DrStatus.
     * @return the DR_STATUS
     */
    public String getDrStatus() {
        return (String) getAttributeInternal(DRSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for DR_STATUS using the alias name DrStatus.
     * @param value value to set the DR_STATUS
     */
    public void setDrStatus(String value) {
        setAttributeInternal(DRSTATUS, value);
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
     * Gets the attribute value for MASTER_CONTRACT_ID using the alias name MasterContractId.
     * @return the MASTER_CONTRACT_ID
     */
    public Number getMasterContractId() {
        return (Number) getAttributeInternal(MASTERCONTRACTID);
    }

    /**
     * Sets <code>value</code> as attribute value for MASTER_CONTRACT_ID using the alias name MasterContractId.
     * @param value value to set the MASTER_CONTRACT_ID
     */
    public void setMasterContractId(Number value) {
        setAttributeInternal(MASTERCONTRACTID, value);
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
     * Sets <code>value</code> as attribute value for PREPARED_BY using the alias name PreparedBy.
     * @param value value to set the PREPARED_BY
     */
    public void setPreparedBy(String value) {
        setAttributeInternal(PREPAREDBY, value);
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
     * Gets the attribute value for REMARKS using the alias name Remarks.
     * @return the REMARKS
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for REMARKS using the alias name Remarks.
     * @param value value to set the REMARKS
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for REQ_BU_ID using the alias name ReqBuId.
     * @return the REQ_BU_ID
     */
    public Number getReqBuId() {
        return (Number) getAttributeInternal(REQBUID);
    }

    /**
     * Sets <code>value</code> as attribute value for REQ_BU_ID using the alias name ReqBuId.
     * @param value value to set the REQ_BU_ID
     */
    public void setReqBuId(Number value) {
        setAttributeInternal(REQBUID, value);
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
     * Gets the attribute value for SRC_BU_ID using the alias name SrcBuId.
     * @return the SRC_BU_ID
     */
    public Number getSrcBuId() {
        return (Number) getAttributeInternal(SRCBUID);
    }

    /**
     * Sets <code>value</code> as attribute value for SRC_BU_ID using the alias name SrcBuId.
     * @param value value to set the SRC_BU_ID
     */
    public void setSrcBuId(Number value) {
        setAttributeInternal(SRCBUID, value);
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
     * Gets the attribute value for the calculated attribute TransSrcBu.
     * @return the TransSrcBu
     */
    public String getTransSrcBu() {
        return (String) getAttributeInternal(TRANSSRCBU);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcBu.
     * @param value value to set the  TransSrcBu
     */
    public void setTransSrcBu(String value) {
        setAttributeInternal(TRANSSRCBU, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransReqBu.
     * @return the TransReqBu
     */
    public String getTransReqBu() {
        return (String) getAttributeInternal(TRANSREQBU);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransReqBu.
     * @param value value to set the  TransReqBu
     */
    public void setTransReqBu(String value) {
        setAttributeInternal(TRANSREQBU, value);
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
     * Gets the attribute value for the calculated attribute TransCustomer.
     * @return the TransCustomer
     */
    public String getTransCustomer() {
        return (String) getAttributeInternal(TRANSCUSTOMER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCustomer.
     * @param value value to set the  TransCustomer
     */
    public void setTransCustomer(String value) {
        setAttributeInternal(TRANSCUSTOMER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCustomerSite.
     * @return the TransCustomerSite
     */
    public String getTransCustomerSite() {
        return (String) getAttributeInternal(TRANSCUSTOMERSITE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCustomerSite.
     * @param value value to set the  TransCustomerSite
     */
    public void setTransCustomerSite(String value) {
        setAttributeInternal(TRANSCUSTOMERSITE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransContractNumber.
     * @return the TransContractNumber
     */
    public String getTransContractNumber() {
        return (String) getAttributeInternal(TRANSCONTRACTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransContractNumber.
     * @param value value to set the  TransContractNumber
     */
    public void setTransContractNumber(String value) {
        setAttributeInternal(TRANSCONTRACTNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDrStatus.
     * @return the TransDrStatus
     */
    public String getTransDrStatus() {
        return (String) getAttributeInternal(TRANSDRSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDrStatus.
     * @param value value to set the  TransDrStatus
     */
    public void setTransDrStatus(String value) {
        setAttributeInternal(TRANSDRSTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDoNumber.
     * @return the TransDoNumber
     */
    public String getTransDoNumber() {
        return (String) getAttributeInternal(TRANSDONUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDoNumber.
     * @param value value to set the  TransDoNumber
     */
    public void setTransDoNumber(String value) {
        setAttributeInternal(TRANSDONUMBER, value);
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
     * Gets the attribute value for the calculated attribute TransSourceDivRequired.
     * @return the TransSourceDivRequired
     */
    public String getTransSourceDivRequired() {
        return (String) getAttributeInternal(TRANSSOURCEDIVREQUIRED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSourceDivRequired.
     * @param value value to set the  TransSourceDivRequired
     */
    public void setTransSourceDivRequired(String value) {
        setAttributeInternal(TRANSSOURCEDIVREQUIRED, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcDivFlexSegmentNum.
     * @return the TransSrcDivFlexSegmentNum
     */
    public Number getTransSrcDivFlexSegmentNum() {
        return (Number) getAttributeInternal(TRANSSRCDIVFLEXSEGMENTNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcDivFlexSegmentNum.
     * @param value value to set the  TransSrcDivFlexSegmentNum
     */
    public void setTransSrcDivFlexSegmentNum(Number value) {
        setAttributeInternal(TRANSSRCDIVFLEXSEGMENTNUM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcDeptFlexSegmentNum.
     * @return the TransSrcDeptFlexSegmentNum
     */
    public Number getTransSrcDeptFlexSegmentNum() {
        return (Number) getAttributeInternal(TRANSSRCDEPTFLEXSEGMENTNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcDeptFlexSegmentNum.
     * @param value value to set the  TransSrcDeptFlexSegmentNum
     */
    public void setTransSrcDeptFlexSegmentNum(Number value) {
        setAttributeInternal(TRANSSRCDEPTFLEXSEGMENTNUM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcCurrencyCode.
     * @return the TransSrcCurrencyCode
     */
    public String getTransSrcCurrencyCode() {
        return (String) getAttributeInternal(TRANSSRCCURRENCYCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcCurrencyCode.
     * @param value value to set the  TransSrcCurrencyCode
     */
    public void setTransSrcCurrencyCode(String value) {
        setAttributeInternal(TRANSSRCCURRENCYCODE, value);
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
     * Gets the attribute value for the calculated attribute TransReqBuDeptSegment.
     * @return the TransReqBuDeptSegment
     */
    public Number getTransReqBuDeptSegment() {
        return (Number) getAttributeInternal(TRANSREQBUDEPTSEGMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransReqBuDeptSegment.
     * @param value value to set the  TransReqBuDeptSegment
     */
    public void setTransReqBuDeptSegment(Number value) {
        setAttributeInternal(TRANSREQBUDEPTSEGMENT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransReqBuDivSegment.
     * @return the TransReqBuDivSegment
     */
    public Number getTransReqBuDivSegment() {
        return (Number) getAttributeInternal(TRANSREQBUDIVSEGMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransReqBuDivSegment.
     * @param value value to set the  TransReqBuDivSegment
     */
    public void setTransReqBuDivSegment(Number value) {
        setAttributeInternal(TRANSREQBUDIVSEGMENT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAttachmentCode.
     * @return the TransAttachmentCode
     */
    public String getTransAttachmentCode() {
        return (String) getAttributeInternal(TRANSATTACHMENTCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAttachmentCode.
     * @param value value to set the  TransAttachmentCode
     */
    public void setTransAttachmentCode(String value) {
        setAttributeInternal(TRANSATTACHMENTCODE, value);
    }

    /**
     * Gets the attribute value for MASTER_CONTRACT_ID using the alias name MasterContractId1.
     * @return the MASTER_CONTRACT_ID
     */
    public Number getMasterContractId1() {
        return (Number) getAttributeInternal(MASTERCONTRACTID1);
    }

    /**
     * Sets <code>value</code> as attribute value for MASTER_CONTRACT_ID using the alias name MasterContractId1.
     * @param value value to set the MASTER_CONTRACT_ID
     */
    public void setMasterContractId1(Number value) {
        setAttributeInternal(MASTERCONTRACTID1, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DeploymentReceiptLinesVO.
     */
    public RowIterator getDeploymentReceiptLinesVO() {
        return (RowIterator) getAttributeInternal(DEPLOYMENTRECEIPTLINESVO);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link AttachmentsVO.
     */
    public RowIterator getAttachmentsVO() {
        return (RowIterator) getAttributeInternal(ATTACHMENTSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> QuoteSourceBuLovVO1.
     */
    public RowSet getQuoteSourceBuLovVO1() {
        return (RowSet) getAttributeInternal(QUOTESOURCEBULOVVO1);
    }


    /**
     * Gets the view accessor <code>RowSet</code> QuoteReqBuLovVO1.
     */
    public RowSet getQuoteReqBuLovVO1() {
        return (RowSet) getAttributeInternal(QUOTEREQBULOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ContractNumberLOV1.
     */
    public RowSet getContractNumberLOV1() {
        return (RowSet) getAttributeInternal(CONTRACTNUMBERLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ReceiptDeploymentNoLOVVO1.
     */
    public RowSet getReceiptDeploymentNoLOVVO1() {
        return (RowSet) getAttributeInternal(RECEIPTDEPLOYMENTNOLOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TimesheetReqBuLovVO1.
     */
    public RowSet getTimesheetReqBuLovVO1() {
        return (RowSet) getAttributeInternal(TIMESHEETREQBULOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> FlexValuesAccessLovVO1.
     */
    public RowSet getFlexValuesAccessLovVO1() {
        return (RowSet) getAttributeInternal(FLEXVALUESACCESSLOVVO1);
    }
}

