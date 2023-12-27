package model.view;

import model.entity.XxadsAssetRequestLinesEOImpl;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 11 17:51:36 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AssetRequestLinesVORowImpl extends ViewRowImpl {


    public static final int ENTITY_XXADSASSETREQUESTLINESEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AssetCategoryId,
        CreatedBy,
        CreationDate,
        ExpenditureTypeId,
        FuelOption,
        HiringBasisRuleId,
        LastUpdateDate,
        LastUpdatedBy,
        LineId,
        LineNum,
        LineStatus,
        NeedByDate,
        ObjectVersionNumber,
        OffHireDate,
        OnHireDate,
        OperatorOption,
        Quantity,
        Remarks,
        RentalType,
        RequestId,
        ShiftType,
        TaskId,
        TransOperatorOptionCode,
        TransFuelOptionCode,
        TransCategory,
        TransRentalType,
        TransShiftType,
        TransCategoryDesc,
        TransHiringBasisRule,
        TransTask,
        TransExpenditureType,
        TransSetId,
        TransHdrProjectId,
        TransNoOfDays,
        TransLineStatus,
        TransSrcBuId,
        TransSrcDivFlexValId,
        LookupsLOV1,
        OptionsLOVVO1,
        OptionsLOVVO2,
        LookupsLOV2,
        RentalTypeBasedCategoryLOV1,
        HiringBasisLOVVO1,
        TasksLOV1,
        ExpenditureTypesLOV1;
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


    public static final int ASSETCATEGORYID = AttributesEnum.AssetCategoryId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int EXPENDITURETYPEID = AttributesEnum.ExpenditureTypeId.index();
    public static final int FUELOPTION = AttributesEnum.FuelOption.index();
    public static final int HIRINGBASISRULEID = AttributesEnum.HiringBasisRuleId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int LINENUM = AttributesEnum.LineNum.index();
    public static final int LINESTATUS = AttributesEnum.LineStatus.index();
    public static final int NEEDBYDATE = AttributesEnum.NeedByDate.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int OFFHIREDATE = AttributesEnum.OffHireDate.index();
    public static final int ONHIREDATE = AttributesEnum.OnHireDate.index();
    public static final int OPERATOROPTION = AttributesEnum.OperatorOption.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int RENTALTYPE = AttributesEnum.RentalType.index();
    public static final int REQUESTID = AttributesEnum.RequestId.index();
    public static final int SHIFTTYPE = AttributesEnum.ShiftType.index();
    public static final int TASKID = AttributesEnum.TaskId.index();
    public static final int TRANSOPERATOROPTIONCODE = AttributesEnum.TransOperatorOptionCode.index();
    public static final int TRANSFUELOPTIONCODE = AttributesEnum.TransFuelOptionCode.index();
    public static final int TRANSCATEGORY = AttributesEnum.TransCategory.index();
    public static final int TRANSRENTALTYPE = AttributesEnum.TransRentalType.index();
    public static final int TRANSSHIFTTYPE = AttributesEnum.TransShiftType.index();
    public static final int TRANSCATEGORYDESC = AttributesEnum.TransCategoryDesc.index();
    public static final int TRANSHIRINGBASISRULE = AttributesEnum.TransHiringBasisRule.index();
    public static final int TRANSTASK = AttributesEnum.TransTask.index();
    public static final int TRANSEXPENDITURETYPE = AttributesEnum.TransExpenditureType.index();
    public static final int TRANSSETID = AttributesEnum.TransSetId.index();
    public static final int TRANSHDRPROJECTID = AttributesEnum.TransHdrProjectId.index();
    public static final int TRANSNOOFDAYS = AttributesEnum.TransNoOfDays.index();
    public static final int TRANSLINESTATUS = AttributesEnum.TransLineStatus.index();
    public static final int TRANSSRCBUID = AttributesEnum.TransSrcBuId.index();
    public static final int TRANSSRCDIVFLEXVALID = AttributesEnum.TransSrcDivFlexValId.index();
    public static final int LOOKUPSLOV1 = AttributesEnum.LookupsLOV1.index();
    public static final int OPTIONSLOVVO1 = AttributesEnum.OptionsLOVVO1.index();
    public static final int OPTIONSLOVVO2 = AttributesEnum.OptionsLOVVO2.index();
    public static final int LOOKUPSLOV2 = AttributesEnum.LookupsLOV2.index();
    public static final int RENTALTYPEBASEDCATEGORYLOV1 = AttributesEnum.RentalTypeBasedCategoryLOV1.index();
    public static final int HIRINGBASISLOVVO1 = AttributesEnum.HiringBasisLOVVO1.index();
    public static final int TASKSLOV1 = AttributesEnum.TasksLOV1.index();
    public static final int EXPENDITURETYPESLOV1 = AttributesEnum.ExpenditureTypesLOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AssetRequestLinesVORowImpl() {
    }

    /**
     * Gets XxadsAssetRequestLinesEO entity object.
     * @return the XxadsAssetRequestLinesEO
     */
    public XxadsAssetRequestLinesEOImpl getXxadsAssetRequestLinesEO() {
        return (XxadsAssetRequestLinesEOImpl) getEntity(ENTITY_XXADSASSETREQUESTLINESEO);
    }

    /**
     * Gets the attribute value for ASSET_CATEGORY_ID using the alias name AssetCategoryId.
     * @return the ASSET_CATEGORY_ID
     */
    public String getAssetCategoryId() {
        return (String) getAttributeInternal(ASSETCATEGORYID);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_CATEGORY_ID using the alias name AssetCategoryId.
     * @param value value to set the ASSET_CATEGORY_ID
     */
    public void setAssetCategoryId(String value) {
        setAttributeInternal(ASSETCATEGORYID, value);
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
     * Gets the attribute value for EXPENDITURE_TYPE_ID using the alias name ExpenditureTypeId.
     * @return the EXPENDITURE_TYPE_ID
     */
    public Number getExpenditureTypeId() {
        return (Number) getAttributeInternal(EXPENDITURETYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for EXPENDITURE_TYPE_ID using the alias name ExpenditureTypeId.
     * @param value value to set the EXPENDITURE_TYPE_ID
     */
    public void setExpenditureTypeId(Number value) {
        setAttributeInternal(EXPENDITURETYPEID, value);
    }

    /**
     * Gets the attribute value for FUEL_OPTION using the alias name FuelOption.
     * @return the FUEL_OPTION
     */
    public String getFuelOption() {
        return (String) getAttributeInternal(FUELOPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for FUEL_OPTION using the alias name FuelOption.
     * @param value value to set the FUEL_OPTION
     */
    public void setFuelOption(String value) {
        setAttributeInternal(FUELOPTION, value);
    }

    /**
     * Gets the attribute value for HIRING_BASIS_RULE_ID using the alias name HiringBasisRuleId.
     * @return the HIRING_BASIS_RULE_ID
     */
    public Number getHiringBasisRuleId() {
        return (Number) getAttributeInternal(HIRINGBASISRULEID);
    }

    /**
     * Sets <code>value</code> as attribute value for HIRING_BASIS_RULE_ID using the alias name HiringBasisRuleId.
     * @param value value to set the HIRING_BASIS_RULE_ID
     */
    public void setHiringBasisRuleId(Number value) {
        setAttributeInternal(HIRINGBASISRULEID, value);
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
     * Gets the attribute value for LINE_ID using the alias name LineId.
     * @return the LINE_ID
     */
    public Number getLineId() {
        return (Number) getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for LINE_ID using the alias name LineId.
     * @param value value to set the LINE_ID
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for LINE_NUM using the alias name LineNum.
     * @return the LINE_NUM
     */
    public Number getLineNum() {
        return (Number) getAttributeInternal(LINENUM);
    }

    /**
     * Sets <code>value</code> as attribute value for LINE_NUM using the alias name LineNum.
     * @param value value to set the LINE_NUM
     */
    public void setLineNum(Number value) {
        setAttributeInternal(LINENUM, value);
    }

    /**
     * Gets the attribute value for LINE_STATUS using the alias name LineStatus.
     * @return the LINE_STATUS
     */
    public String getLineStatus() {
        return (String) getAttributeInternal(LINESTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for LINE_STATUS using the alias name LineStatus.
     * @param value value to set the LINE_STATUS
     */
    public void setLineStatus(String value) {
        setAttributeInternal(LINESTATUS, value);
    }

    /**
     * Gets the attribute value for NEED_BY_DATE using the alias name NeedByDate.
     * @return the NEED_BY_DATE
     */
    public Date getNeedByDate() {
        return (Date) getAttributeInternal(NEEDBYDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for NEED_BY_DATE using the alias name NeedByDate.
     * @param value value to set the NEED_BY_DATE
     */
    public void setNeedByDate(Date value) {
        setAttributeInternal(NEEDBYDATE, value);
    }

    /**
     * Gets the attribute value for OBJECT_VERSION_NUMBER using the alias name ObjectVersionNumber.
     * @return the OBJECT_VERSION_NUMBER
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Gets the attribute value for OFF_HIRE_DATE using the alias name OffHireDate.
     * @return the OFF_HIRE_DATE
     */
    public Date getOffHireDate() {
        return (Date) getAttributeInternal(OFFHIREDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for OFF_HIRE_DATE using the alias name OffHireDate.
     * @param value value to set the OFF_HIRE_DATE
     */
    public void setOffHireDate(Date value) {
        setAttributeInternal(OFFHIREDATE, value);
    }

    /**
     * Gets the attribute value for ON_HIRE_DATE using the alias name OnHireDate.
     * @return the ON_HIRE_DATE
     */
    public Date getOnHireDate() {
        return (Date) getAttributeInternal(ONHIREDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for ON_HIRE_DATE using the alias name OnHireDate.
     * @param value value to set the ON_HIRE_DATE
     */
    public void setOnHireDate(Date value) {
        setAttributeInternal(ONHIREDATE, value);
    }

    /**
     * Gets the attribute value for OPERATOR_OPTION using the alias name OperatorOption.
     * @return the OPERATOR_OPTION
     */
    public String getOperatorOption() {
        return (String) getAttributeInternal(OPERATOROPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for OPERATOR_OPTION using the alias name OperatorOption.
     * @param value value to set the OPERATOR_OPTION
     */
    public void setOperatorOption(String value) {
        setAttributeInternal(OPERATOROPTION, value);
    }

    /**
     * Gets the attribute value for QUANTITY using the alias name Quantity.
     * @return the QUANTITY
     */
    public Number getQuantity() {
        return (Number) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for QUANTITY using the alias name Quantity.
     * @param value value to set the QUANTITY
     */
    public void setQuantity(Number value) {
        setAttributeInternal(QUANTITY, value);
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
     * Gets the attribute value for RENTAL_TYPE using the alias name RentalType.
     * @return the RENTAL_TYPE
     */
    public String getRentalType() {
        return (String) getAttributeInternal(RENTALTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for RENTAL_TYPE using the alias name RentalType.
     * @param value value to set the RENTAL_TYPE
     */
    public void setRentalType(String value) {
        setAttributeInternal(RENTALTYPE, value);
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
     * Gets the attribute value for SHIFT_TYPE using the alias name ShiftType.
     * @return the SHIFT_TYPE
     */
    public String getShiftType() {
        return (String) getAttributeInternal(SHIFTTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for SHIFT_TYPE using the alias name ShiftType.
     * @param value value to set the SHIFT_TYPE
     */
    public void setShiftType(String value) {
        setAttributeInternal(SHIFTTYPE, value);
    }

    /**
     * Gets the attribute value for TASK_ID using the alias name TaskId.
     * @return the TASK_ID
     */
    public Number getTaskId() {
        return (Number) getAttributeInternal(TASKID);
    }

    /**
     * Sets <code>value</code> as attribute value for TASK_ID using the alias name TaskId.
     * @param value value to set the TASK_ID
     */
    public void setTaskId(Number value) {
        setAttributeInternal(TASKID, value);
    }


    /**
     * Gets the attribute value for the calculated attribute TransOperatorOptionCode.
     * @return the TransOperatorOptionCode
     */
    public String getTransOperatorOptionCode() {
        return (String) getAttributeInternal(TRANSOPERATOROPTIONCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransOperatorOptionCode.
     * @param value value to set the  TransOperatorOptionCode
     */
    public void setTransOperatorOptionCode(String value) {
        setAttributeInternal(TRANSOPERATOROPTIONCODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransFuelOptionCode.
     * @return the TransFuelOptionCode
     */
    public String getTransFuelOptionCode() {
        return (String) getAttributeInternal(TRANSFUELOPTIONCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransFuelOptionCode.
     * @param value value to set the  TransFuelOptionCode
     */
    public void setTransFuelOptionCode(String value) {
        setAttributeInternal(TRANSFUELOPTIONCODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCategory.
     * @return the TransCategory
     */
    public String getTransCategory() {
        return (String) getAttributeInternal(TRANSCATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCategory.
     * @param value value to set the  TransCategory
     */
    public void setTransCategory(String value) {
        setAttributeInternal(TRANSCATEGORY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransRentalType.
     * @return the TransRentalType
     */
    public String getTransRentalType() {
        return (String) getAttributeInternal(TRANSRENTALTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransRentalType.
     * @param value value to set the  TransRentalType
     */
    public void setTransRentalType(String value) {
        setAttributeInternal(TRANSRENTALTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransShiftType.
     * @return the TransShiftType
     */
    public String getTransShiftType() {
        return (String) getAttributeInternal(TRANSSHIFTTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransShiftType.
     * @param value value to set the  TransShiftType
     */
    public void setTransShiftType(String value) {
        setAttributeInternal(TRANSSHIFTTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCategoryDesc.
     * @return the TransCategoryDesc
     */
    public String getTransCategoryDesc() {
        return (String) getAttributeInternal(TRANSCATEGORYDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCategoryDesc.
     * @param value value to set the  TransCategoryDesc
     */
    public void setTransCategoryDesc(String value) {
        setAttributeInternal(TRANSCATEGORYDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransHiringBasisRule.
     * @return the TransHiringBasisRule
     */
    public String getTransHiringBasisRule() {
        return (String) getAttributeInternal(TRANSHIRINGBASISRULE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransHiringBasisRule.
     * @param value value to set the  TransHiringBasisRule
     */
    public void setTransHiringBasisRule(String value) {
        setAttributeInternal(TRANSHIRINGBASISRULE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransTask.
     * @return the TransTask
     */
    public String getTransTask() {
        return (String) getAttributeInternal(TRANSTASK);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransTask.
     * @param value value to set the  TransTask
     */
    public void setTransTask(String value) {
        setAttributeInternal(TRANSTASK, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransExpenditureType.
     * @return the TransExpenditureType
     */
    public String getTransExpenditureType() {
        return (String) getAttributeInternal(TRANSEXPENDITURETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransExpenditureType.
     * @param value value to set the  TransExpenditureType
     */
    public void setTransExpenditureType(String value) {
        setAttributeInternal(TRANSEXPENDITURETYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSetId.
     * @return the TransSetId
     */
    public Number getTransSetId() {
        return (Number) getAttributeInternal(TRANSSETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSetId.
     * @param value value to set the  TransSetId
     */
    public void setTransSetId(Number value) {
        setAttributeInternal(TRANSSETID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransHdrProjectId.
     * @return the TransHdrProjectId
     */
    public Number getTransHdrProjectId() {
        return (Number) getAttributeInternal(TRANSHDRPROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransHdrProjectId.
     * @param value value to set the  TransHdrProjectId
     */
    public void setTransHdrProjectId(Number value) {
        setAttributeInternal(TRANSHDRPROJECTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransNoOfDays.
     * @return the TransNoOfDays
     */
    public Long getTransNoOfDays() {
        return (Long) getAttributeInternal(TRANSNOOFDAYS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransNoOfDays.
     * @param value value to set the  TransNoOfDays
     */
    public void setTransNoOfDays(Long value) {
        setAttributeInternal(TRANSNOOFDAYS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransLineSttaus.
     * @return the TransLineSttaus
     */
    public String getTransLineStatus() {
        return (String) getAttributeInternal(TRANSLINESTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransLineSttaus.
     * @param value value to set the  TransLineSttaus
     */
    public void setTransLineStatus(String value) {
        setAttributeInternal(TRANSLINESTATUS, value);
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
     * Gets the attribute value for the calculated attribute TransSrcDivFlexValId.
     * @return the TransSrcDivFlexValId
     */
    public Number getTransSrcDivFlexValId() {
        return (Number) getAttributeInternal(TRANSSRCDIVFLEXVALID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSrcDivFlexValId.
     * @param value value to set the  TransSrcDivFlexValId
     */
    public void setTransSrcDivFlexValId(Number value) {
        setAttributeInternal(TRANSSRCDIVFLEXVALID, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LookupsLOV1.
     */
    public RowSet getLookupsLOV1() {
        return (RowSet) getAttributeInternal(LOOKUPSLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> OptionsLOVVO1.
     */
    public RowSet getOptionsLOVVO1() {
        return (RowSet) getAttributeInternal(OPTIONSLOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> OptionsLOVVO2.
     */
    public RowSet getOptionsLOVVO2() {
        return (RowSet) getAttributeInternal(OPTIONSLOVVO2);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LookupsLOV2.
     */
    public RowSet getLookupsLOV2() {
        return (RowSet) getAttributeInternal(LOOKUPSLOV2);
    }

    /**
     * Gets the view accessor <code>RowSet</code> RentalTypeBasedCategoryLOV1.
     */
    public RowSet getRentalTypeBasedCategoryLOV1() {
        return (RowSet) getAttributeInternal(RENTALTYPEBASEDCATEGORYLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> HiringBasisLOVVO1.
     */
    public RowSet getHiringBasisLOVVO1() {
        return (RowSet) getAttributeInternal(HIRINGBASISLOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TasksLOV1.
     */
    public RowSet getTasksLOV1() {
        return (RowSet) getAttributeInternal(TASKSLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ExpenditureTypesLOV1.
     */
    public RowSet getExpenditureTypesLOV1() {
        return (RowSet) getAttributeInternal(EXPENDITURETYPESLOV1);
    }


}

