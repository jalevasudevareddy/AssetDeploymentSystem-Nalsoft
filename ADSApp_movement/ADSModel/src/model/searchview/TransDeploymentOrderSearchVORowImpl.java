package model.searchview;

import java.util.HashMap;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ProgrammaticViewRowImpl;
import oracle.jbo.server.ViewAttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 21 17:23:37 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TransDeploymentOrderSearchVORowImpl extends ProgrammaticViewRowImpl {
    /**
     * createRowData - for custom java data source support.
     * Overridden to initialize the dataProvier for newly created row.
     * Used for updateable View Objects.
     */
    public Object createRowData(HashMap attrNameValueMap) {
        Object value = super.createRowData(attrNameValueMap);
        return value;
    }

    /**
     * convertToSourceType - for custom java data source support.
     * Overridden to provide custom implementation for conversions of a value
     * from attribute java type to datasource column/field type.
     * Not required in most cases.
     */
    public Object convertToSourceType(ViewAttributeDefImpl attrDef, String sourceType, Object val) {
        Object value = super.convertToSourceType(attrDef, sourceType, val);
        return value;
    }

    /**
     * convertToAttributeType - for custom java data source support.
     * Overridden to provide custom implementation for conversions of a value
     *  from datasource/column field type to attribute java type.
     * Not required in most cases.
     */
    public Object convertToAttributeType(ViewAttributeDefImpl attrDef, Class javaTypeClass, Object val) {
        Object value = super.convertToAttributeType(attrDef, javaTypeClass, val);
        return value;
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TransSrcBuId,
        TransSrcBuName,
        TransSrcDivision,
        TransSrcDivFlexValueId,
        TransSrcDivFlexValueSetId,
        TransReqBuId,
        TransReqBuName,
        TransContractNumber,
        TransContractId,
        TransCustTypeCode,
        TransCustType,
        TransProjectId,
        TransProject,
        TransDivision,
        TransDivFlexValueId,
        TransDeptName,
        TransDeptFlexValueId,
        TransCustomerName,
        TransCustomerId,
        TransSrcDivRequired,
        TransOrderNumber,
        TransOrderDate,
        TransSrcDivSegmentNumber,
        TransReqDivSegmentNumber,
        TransReqDeptSegmentNumber,
        QuoteSourceBuLovVO1,
        QuoteReqBuLovVO1,
        FlexValuesLOV1,
        ReqBuBasedCustomerLovVO1,
        ReqBuBasedDeptLovVO1,
        ReqBuBasedDivisionLovVO1,
        ReqBuBasedProjectLovVO1,
        ContractNumberLOV1,
        DONumberLOV1,
        AllocationCustTypesLOV1,
        TimesheetReqBuLovVO1,
        FlexValuesAccessLovVO1;
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


    public static final int TRANSSRCBUID = AttributesEnum.TransSrcBuId.index();
    public static final int TRANSSRCBUNAME = AttributesEnum.TransSrcBuName.index();
    public static final int TRANSSRCDIVISION = AttributesEnum.TransSrcDivision.index();
    public static final int TRANSSRCDIVFLEXVALUEID = AttributesEnum.TransSrcDivFlexValueId.index();
    public static final int TRANSSRCDIVFLEXVALUESETID = AttributesEnum.TransSrcDivFlexValueSetId.index();
    public static final int TRANSREQBUID = AttributesEnum.TransReqBuId.index();
    public static final int TRANSREQBUNAME = AttributesEnum.TransReqBuName.index();
    public static final int TRANSCONTRACTNUMBER = AttributesEnum.TransContractNumber.index();
    public static final int TRANSCONTRACTID = AttributesEnum.TransContractId.index();
    public static final int TRANSCUSTTYPECODE = AttributesEnum.TransCustTypeCode.index();
    public static final int TRANSCUSTTYPE = AttributesEnum.TransCustType.index();
    public static final int TRANSPROJECTID = AttributesEnum.TransProjectId.index();
    public static final int TRANSPROJECT = AttributesEnum.TransProject.index();
    public static final int TRANSDIVISION = AttributesEnum.TransDivision.index();
    public static final int TRANSDIVFLEXVALUEID = AttributesEnum.TransDivFlexValueId.index();
    public static final int TRANSDEPTNAME = AttributesEnum.TransDeptName.index();
    public static final int TRANSDEPTFLEXVALUEID = AttributesEnum.TransDeptFlexValueId.index();
    public static final int TRANSCUSTOMERNAME = AttributesEnum.TransCustomerName.index();
    public static final int TRANSCUSTOMERID = AttributesEnum.TransCustomerId.index();
    public static final int TRANSSRCDIVREQUIRED = AttributesEnum.TransSrcDivRequired.index();
    public static final int TRANSORDERNUMBER = AttributesEnum.TransOrderNumber.index();
    public static final int TRANSORDERDATE = AttributesEnum.TransOrderDate.index();
    public static final int TRANSSRCDIVSEGMENTNUMBER = AttributesEnum.TransSrcDivSegmentNumber.index();
    public static final int TRANSREQDIVSEGMENTNUMBER = AttributesEnum.TransReqDivSegmentNumber.index();
    public static final int TRANSREQDEPTSEGMENTNUMBER = AttributesEnum.TransReqDeptSegmentNumber.index();
    public static final int QUOTESOURCEBULOVVO1 = AttributesEnum.QuoteSourceBuLovVO1.index();
    public static final int QUOTEREQBULOVVO1 = AttributesEnum.QuoteReqBuLovVO1.index();
    public static final int FLEXVALUESLOV1 = AttributesEnum.FlexValuesLOV1.index();
    public static final int REQBUBASEDCUSTOMERLOVVO1 = AttributesEnum.ReqBuBasedCustomerLovVO1.index();
    public static final int REQBUBASEDDEPTLOVVO1 = AttributesEnum.ReqBuBasedDeptLovVO1.index();
    public static final int REQBUBASEDDIVISIONLOVVO1 = AttributesEnum.ReqBuBasedDivisionLovVO1.index();
    public static final int REQBUBASEDPROJECTLOVVO1 = AttributesEnum.ReqBuBasedProjectLovVO1.index();
    public static final int CONTRACTNUMBERLOV1 = AttributesEnum.ContractNumberLOV1.index();
    public static final int DONUMBERLOV1 = AttributesEnum.DONumberLOV1.index();
    public static final int ALLOCATIONCUSTTYPESLOV1 = AttributesEnum.AllocationCustTypesLOV1.index();
    public static final int TIMESHEETREQBULOVVO1 = AttributesEnum.TimesheetReqBuLovVO1.index();
    public static final int FLEXVALUESACCESSLOVVO1 = AttributesEnum.FlexValuesAccessLovVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TransDeploymentOrderSearchVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcBuId.
     * @return the TransSrcBuId
     */
    public Number getTransSrcBuId() {
        return (Number) getAttributeInternal(TRANSSRCBUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcBuId.
     * @param value value to set the  TransSrcBuId
     */
    public void setTransSrcBuId(Number value) {
        setAttributeInternal(TRANSSRCBUID, value);
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
     * Gets the attribute value for the calculated attribute TransSrcDivision.
     * @return the TransSrcDivision
     */
    public String getTransSrcDivision() {
        return (String) getAttributeInternal(TRANSSRCDIVISION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcDivision.
     * @param value value to set the  TransSrcDivision
     */
    public void setTransSrcDivision(String value) {
        setAttributeInternal(TRANSSRCDIVISION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcDivFlexValueId.
     * @return the TransSrcDivFlexValueId
     */
    public Number getTransSrcDivFlexValueId() {
        return (Number) getAttributeInternal(TRANSSRCDIVFLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcDivFlexValueId.
     * @param value value to set the  TransSrcDivFlexValueId
     */
    public void setTransSrcDivFlexValueId(Number value) {
        setAttributeInternal(TRANSSRCDIVFLEXVALUEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcDivFlexValueSetId.
     * @return the TransSrcDivFlexValueSetId
     */
    public Number getTransSrcDivFlexValueSetId() {
        return (Number) getAttributeInternal(TRANSSRCDIVFLEXVALUESETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcDivFlexValueSetId.
     * @param value value to set the  TransSrcDivFlexValueSetId
     */
    public void setTransSrcDivFlexValueSetId(Number value) {
        setAttributeInternal(TRANSSRCDIVFLEXVALUESETID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransReqBuId.
     * @return the TransReqBuId
     */
    public Number getTransReqBuId() {
        return (Number) getAttributeInternal(TRANSREQBUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransReqBuId.
     * @param value value to set the  TransReqBuId
     */
    public void setTransReqBuId(Number value) {
        setAttributeInternal(TRANSREQBUID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransReqBuName.
     * @return the TransReqBuName
     */
    public String getTransReqBuName() {
        return (String) getAttributeInternal(TRANSREQBUNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransReqBuName.
     * @param value value to set the  TransReqBuName
     */
    public void setTransReqBuName(String value) {
        setAttributeInternal(TRANSREQBUNAME, value);
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
     * Gets the attribute value for the calculated attribute TransContractId.
     * @return the TransContractId
     */
    public Number getTransContractId() {
        return (Number) getAttributeInternal(TRANSCONTRACTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransContractId.
     * @param value value to set the  TransContractId
     */
    public void setTransContractId(Number value) {
        setAttributeInternal(TRANSCONTRACTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCustTypeCode.
     * @return the TransCustTypeCode
     */
    public String getTransCustTypeCode() {
        return (String) getAttributeInternal(TRANSCUSTTYPECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCustTypeCode.
     * @param value value to set the  TransCustTypeCode
     */
    public void setTransCustTypeCode(String value) {
        setAttributeInternal(TRANSCUSTTYPECODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCustType.
     * @return the TransCustType
     */
    public String getTransCustType() {
        return (String) getAttributeInternal(TRANSCUSTTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCustType.
     * @param value value to set the  TransCustType
     */
    public void setTransCustType(String value) {
        setAttributeInternal(TRANSCUSTTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransProjectId.
     * @return the TransProjectId
     */
    public Number getTransProjectId() {
        return (Number) getAttributeInternal(TRANSPROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransProjectId.
     * @param value value to set the  TransProjectId
     */
    public void setTransProjectId(Number value) {
        setAttributeInternal(TRANSPROJECTID, value);
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
     * Gets the attribute value for the calculated attribute TransDivision.
     * @return the TransDivision
     */
    public String getTransDivision() {
        return (String) getAttributeInternal(TRANSDIVISION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDivision.
     * @param value value to set the  TransDivision
     */
    public void setTransDivision(String value) {
        setAttributeInternal(TRANSDIVISION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDivFlexValueId.
     * @return the TransDivFlexValueId
     */
    public Number getTransDivFlexValueId() {
        return (Number) getAttributeInternal(TRANSDIVFLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDivFlexValueId.
     * @param value value to set the  TransDivFlexValueId
     */
    public void setTransDivFlexValueId(Number value) {
        setAttributeInternal(TRANSDIVFLEXVALUEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDeptName.
     * @return the TransDeptName
     */
    public String getTransDeptName() {
        return (String) getAttributeInternal(TRANSDEPTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDeptName.
     * @param value value to set the  TransDeptName
     */
    public void setTransDeptName(String value) {
        setAttributeInternal(TRANSDEPTNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDeptFlexValueId.
     * @return the TransDeptFlexValueId
     */
    public Number getTransDeptFlexValueId() {
        return (Number) getAttributeInternal(TRANSDEPTFLEXVALUEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDeptFlexValueId.
     * @param value value to set the  TransDeptFlexValueId
     */
    public void setTransDeptFlexValueId(Number value) {
        setAttributeInternal(TRANSDEPTFLEXVALUEID, value);
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
     * Gets the attribute value for the calculated attribute TransCustomerId.
     * @return the TransCustomerId
     */
    public Number getTransCustomerId() {
        return (Number) getAttributeInternal(TRANSCUSTOMERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCustomerId.
     * @param value value to set the  TransCustomerId
     */
    public void setTransCustomerId(Number value) {
        setAttributeInternal(TRANSCUSTOMERID, value);
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
     * Gets the attribute value for the calculated attribute TransOrderNumber.
     * @return the TransOrderNumber
     */
    public String getTransOrderNumber() {
        return (String) getAttributeInternal(TRANSORDERNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransOrderNumber.
     * @param value value to set the  TransOrderNumber
     */
    public void setTransOrderNumber(String value) {
        setAttributeInternal(TRANSORDERNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransOrderDate.
     * @return the TransOrderDate
     */
    public Date getTransOrderDate() {
        return (Date) getAttributeInternal(TRANSORDERDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransOrderDate.
     * @param value value to set the  TransOrderDate
     */
    public void setTransOrderDate(Date value) {
        setAttributeInternal(TRANSORDERDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSrcDivSegmentNumber.
     * @return the TransSrcDivSegmentNumber
     */
    public Number getTransSrcDivSegmentNumber() {
        return (Number) getAttributeInternal(TRANSSRCDIVSEGMENTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcDivSegmentNumber.
     * @param value value to set the  TransSrcDivSegmentNumber
     */
    public void setTransSrcDivSegmentNumber(Number value) {
        setAttributeInternal(TRANSSRCDIVSEGMENTNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransReqDivSegmentNumber.
     * @return the TransReqDivSegmentNumber
     */
    public Number getTransReqDivSegmentNumber() {
        return (Number) getAttributeInternal(TRANSREQDIVSEGMENTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransReqDivSegmentNumber.
     * @param value value to set the  TransReqDivSegmentNumber
     */
    public void setTransReqDivSegmentNumber(Number value) {
        setAttributeInternal(TRANSREQDIVSEGMENTNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransReqDeptSegmentNumber.
     * @return the TransReqDeptSegmentNumber
     */
    public Number getTransReqDeptSegmentNumber() {
        return (Number) getAttributeInternal(TRANSREQDEPTSEGMENTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransReqDeptSegmentNumber.
     * @param value value to set the  TransReqDeptSegmentNumber
     */
    public void setTransReqDeptSegmentNumber(Number value) {
        setAttributeInternal(TRANSREQDEPTSEGMENTNUMBER, value);
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
     * Gets the view accessor <code>RowSet</code> FlexValuesLOV1.
     */
    public RowSet getFlexValuesLOV1() {
        return (RowSet) getAttributeInternal(FLEXVALUESLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ReqBuBasedCustomerLovVO1.
     */
    public RowSet getReqBuBasedCustomerLovVO1() {
        return (RowSet) getAttributeInternal(REQBUBASEDCUSTOMERLOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ReqBuBasedDeptLovVO1.
     */
    public RowSet getReqBuBasedDeptLovVO1() {
        return (RowSet) getAttributeInternal(REQBUBASEDDEPTLOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ReqBuBasedDivisionLovVO1.
     */
    public RowSet getReqBuBasedDivisionLovVO1() {
        return (RowSet) getAttributeInternal(REQBUBASEDDIVISIONLOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ReqBuBasedProjectLovVO1.
     */
    public RowSet getReqBuBasedProjectLovVO1() {
        return (RowSet) getAttributeInternal(REQBUBASEDPROJECTLOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ContractNumberLOV1.
     */
    public RowSet getContractNumberLOV1() {
        return (RowSet) getAttributeInternal(CONTRACTNUMBERLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> DONumberLOV1.
     */
    public RowSet getDONumberLOV1() {
        return (RowSet) getAttributeInternal(DONUMBERLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AllocationCustTypesLOV1.
     */
    public RowSet getAllocationCustTypesLOV1() {
        return (RowSet) getAttributeInternal(ALLOCATIONCUSTTYPESLOV1);
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

