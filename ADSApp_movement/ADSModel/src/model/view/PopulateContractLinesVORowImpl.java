package model.view;

import model.entity.XxadsRentalContractLinesEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 14 18:22:37 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PopulateContractLinesVORowImpl extends ViewRowImpl {


    public static final int ENTITY_XXADSRENTALCONTRACTLINESEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ActiveFlag,
        CategoryId,
        ContractId,
        ContractLineId,
        CreatedBy,
        CreationDate,
        FuelOption,
        HiringBasisRuleId,
        LastUpdateDate,
        LastUpdatedBy,
        LineNum,
        LineValue,
        MasterContractId,
        MasterContractLineId,
        MinChargeUnit,
        MinChargeValue,
        MobilizationRequired,
        ObjectVersionNumber,
        OffHireDate,
        OnHireDate,
        OperatorOption,
        Ot1Rate,
        Ot2Rate,
        ParentContractId,
        ParentContractLineId,
        Quantity,
        ReferenceId,
        ReferenceLineId,
        ReferenceLineNum,
        Remarks,
        RentalType,
        Shift,
        StandardRate,
        TransRentalType,
        TransCategory,
        TransCategoryDescription,
        TransHiringBasis,
        TransShift,
        TransOpertorRequired,
        TransFuelRequired,
        TransFlag,
        TransQuantityRemaining;
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


    public static final int ACTIVEFLAG = AttributesEnum.ActiveFlag.index();
    public static final int CATEGORYID = AttributesEnum.CategoryId.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
    public static final int CONTRACTLINEID = AttributesEnum.ContractLineId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int FUELOPTION = AttributesEnum.FuelOption.index();
    public static final int HIRINGBASISRULEID = AttributesEnum.HiringBasisRuleId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LINENUM = AttributesEnum.LineNum.index();
    public static final int LINEVALUE = AttributesEnum.LineValue.index();
    public static final int MASTERCONTRACTID = AttributesEnum.MasterContractId.index();
    public static final int MASTERCONTRACTLINEID = AttributesEnum.MasterContractLineId.index();
    public static final int MINCHARGEUNIT = AttributesEnum.MinChargeUnit.index();
    public static final int MINCHARGEVALUE = AttributesEnum.MinChargeValue.index();
    public static final int MOBILIZATIONREQUIRED = AttributesEnum.MobilizationRequired.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int OFFHIREDATE = AttributesEnum.OffHireDate.index();
    public static final int ONHIREDATE = AttributesEnum.OnHireDate.index();
    public static final int OPERATOROPTION = AttributesEnum.OperatorOption.index();
    public static final int OT1RATE = AttributesEnum.Ot1Rate.index();
    public static final int OT2RATE = AttributesEnum.Ot2Rate.index();
    public static final int PARENTCONTRACTID = AttributesEnum.ParentContractId.index();
    public static final int PARENTCONTRACTLINEID = AttributesEnum.ParentContractLineId.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int REFERENCEID = AttributesEnum.ReferenceId.index();
    public static final int REFERENCELINEID = AttributesEnum.ReferenceLineId.index();
    public static final int REFERENCELINENUM = AttributesEnum.ReferenceLineNum.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int RENTALTYPE = AttributesEnum.RentalType.index();
    public static final int SHIFT = AttributesEnum.Shift.index();
    public static final int STANDARDRATE = AttributesEnum.StandardRate.index();
    public static final int TRANSRENTALTYPE = AttributesEnum.TransRentalType.index();
    public static final int TRANSCATEGORY = AttributesEnum.TransCategory.index();
    public static final int TRANSCATEGORYDESCRIPTION = AttributesEnum.TransCategoryDescription.index();
    public static final int TRANSHIRINGBASIS = AttributesEnum.TransHiringBasis.index();
    public static final int TRANSSHIFT = AttributesEnum.TransShift.index();
    public static final int TRANSOPERTORREQUIRED = AttributesEnum.TransOpertorRequired.index();
    public static final int TRANSFUELREQUIRED = AttributesEnum.TransFuelRequired.index();
    public static final int TRANSFLAG = AttributesEnum.TransFlag.index();
    public static final int TRANSQUANTITYREMAINING = AttributesEnum.TransQuantityRemaining.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PopulateContractLinesVORowImpl() {
    }

    /**
     * Gets XxadsRentalContractLinesEO entity object.
     * @return the XxadsRentalContractLinesEO
     */
    public XxadsRentalContractLinesEOImpl getXxadsRentalContractLinesEO() {
        return (XxadsRentalContractLinesEOImpl) getEntity(ENTITY_XXADSRENTALCONTRACTLINESEO);
    }

    /**
     * Gets the attribute value for ACTIVE_FLAG using the alias name ActiveFlag.
     * @return the ACTIVE_FLAG
     */
    public String getActiveFlag() {
        return (String) getAttributeInternal(ACTIVEFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVE_FLAG using the alias name ActiveFlag.
     * @param value value to set the ACTIVE_FLAG
     */
    public void setActiveFlag(String value) {
        setAttributeInternal(ACTIVEFLAG, value);
    }

    /**
     * Gets the attribute value for CATEGORY_ID using the alias name CategoryId.
     * @return the CATEGORY_ID
     */
    public Number getCategoryId() {
        return (Number) getAttributeInternal(CATEGORYID);
    }

    /**
     * Sets <code>value</code> as attribute value for CATEGORY_ID using the alias name CategoryId.
     * @param value value to set the CATEGORY_ID
     */
    public void setCategoryId(Number value) {
        setAttributeInternal(CATEGORYID, value);
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
     * Gets the attribute value for CONTRACT_LINE_ID using the alias name ContractLineId.
     * @return the CONTRACT_LINE_ID
     */
    public Number getContractLineId() {
        return (Number) getAttributeInternal(CONTRACTLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTRACT_LINE_ID using the alias name ContractLineId.
     * @param value value to set the CONTRACT_LINE_ID
     */
    public void setContractLineId(Number value) {
        setAttributeInternal(CONTRACTLINEID, value);
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
     * Gets the attribute value for LINE_VALUE using the alias name LineValue.
     * @return the LINE_VALUE
     */
    public Number getLineValue() {
        return (Number) getAttributeInternal(LINEVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for LINE_VALUE using the alias name LineValue.
     * @param value value to set the LINE_VALUE
     */
    public void setLineValue(Number value) {
        setAttributeInternal(LINEVALUE, value);
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
     * Gets the attribute value for MASTER_CONTRACT_LINE_ID using the alias name MasterContractLineId.
     * @return the MASTER_CONTRACT_LINE_ID
     */
    public Number getMasterContractLineId() {
        return (Number) getAttributeInternal(MASTERCONTRACTLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for MASTER_CONTRACT_LINE_ID using the alias name MasterContractLineId.
     * @param value value to set the MASTER_CONTRACT_LINE_ID
     */
    public void setMasterContractLineId(Number value) {
        setAttributeInternal(MASTERCONTRACTLINEID, value);
    }

    /**
     * Gets the attribute value for MIN_CHARGE_UNIT using the alias name MinChargeUnit.
     * @return the MIN_CHARGE_UNIT
     */
    public String getMinChargeUnit() {
        return (String) getAttributeInternal(MINCHARGEUNIT);
    }

    /**
     * Sets <code>value</code> as attribute value for MIN_CHARGE_UNIT using the alias name MinChargeUnit.
     * @param value value to set the MIN_CHARGE_UNIT
     */
    public void setMinChargeUnit(String value) {
        setAttributeInternal(MINCHARGEUNIT, value);
    }

    /**
     * Gets the attribute value for MIN_CHARGE_VALUE using the alias name MinChargeValue.
     * @return the MIN_CHARGE_VALUE
     */
    public Number getMinChargeValue() {
        return (Number) getAttributeInternal(MINCHARGEVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for MIN_CHARGE_VALUE using the alias name MinChargeValue.
     * @param value value to set the MIN_CHARGE_VALUE
     */
    public void setMinChargeValue(Number value) {
        setAttributeInternal(MINCHARGEVALUE, value);
    }

    /**
     * Gets the attribute value for MOBILIZATION_REQUIRED using the alias name MobilizationRequired.
     * @return the MOBILIZATION_REQUIRED
     */
    public String getMobilizationRequired() {
        return (String) getAttributeInternal(MOBILIZATIONREQUIRED);
    }

    /**
     * Sets <code>value</code> as attribute value for MOBILIZATION_REQUIRED using the alias name MobilizationRequired.
     * @param value value to set the MOBILIZATION_REQUIRED
     */
    public void setMobilizationRequired(String value) {
        setAttributeInternal(MOBILIZATIONREQUIRED, value);
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
     * Gets the attribute value for OT1_RATE using the alias name Ot1Rate.
     * @return the OT1_RATE
     */
    public Number getOt1Rate() {
        return (Number) getAttributeInternal(OT1RATE);
    }

    /**
     * Sets <code>value</code> as attribute value for OT1_RATE using the alias name Ot1Rate.
     * @param value value to set the OT1_RATE
     */
    public void setOt1Rate(Number value) {
        setAttributeInternal(OT1RATE, value);
    }

    /**
     * Gets the attribute value for OT2_RATE using the alias name Ot2Rate.
     * @return the OT2_RATE
     */
    public Number getOt2Rate() {
        return (Number) getAttributeInternal(OT2RATE);
    }

    /**
     * Sets <code>value</code> as attribute value for OT2_RATE using the alias name Ot2Rate.
     * @param value value to set the OT2_RATE
     */
    public void setOt2Rate(Number value) {
        setAttributeInternal(OT2RATE, value);
    }

    /**
     * Gets the attribute value for PARENT_CONTRACT_ID using the alias name ParentContractId.
     * @return the PARENT_CONTRACT_ID
     */
    public Number getParentContractId() {
        return (Number) getAttributeInternal(PARENTCONTRACTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENT_CONTRACT_ID using the alias name ParentContractId.
     * @param value value to set the PARENT_CONTRACT_ID
     */
    public void setParentContractId(Number value) {
        setAttributeInternal(PARENTCONTRACTID, value);
    }

    /**
     * Gets the attribute value for PARENT_CONTRACT_LINE_ID using the alias name ParentContractLineId.
     * @return the PARENT_CONTRACT_LINE_ID
     */
    public Number getParentContractLineId() {
        return (Number) getAttributeInternal(PARENTCONTRACTLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENT_CONTRACT_LINE_ID using the alias name ParentContractLineId.
     * @param value value to set the PARENT_CONTRACT_LINE_ID
     */
    public void setParentContractLineId(Number value) {
        setAttributeInternal(PARENTCONTRACTLINEID, value);
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
     * Gets the attribute value for REFERENCE_ID using the alias name ReferenceId.
     * @return the REFERENCE_ID
     */
    public Number getReferenceId() {
        return (Number) getAttributeInternal(REFERENCEID);
    }

    /**
     * Sets <code>value</code> as attribute value for REFERENCE_ID using the alias name ReferenceId.
     * @param value value to set the REFERENCE_ID
     */
    public void setReferenceId(Number value) {
        setAttributeInternal(REFERENCEID, value);
    }

    /**
     * Gets the attribute value for REFERENCE_LINE_ID using the alias name ReferenceLineId.
     * @return the REFERENCE_LINE_ID
     */
    public Number getReferenceLineId() {
        return (Number) getAttributeInternal(REFERENCELINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for REFERENCE_LINE_ID using the alias name ReferenceLineId.
     * @param value value to set the REFERENCE_LINE_ID
     */
    public void setReferenceLineId(Number value) {
        setAttributeInternal(REFERENCELINEID, value);
    }

    /**
     * Gets the attribute value for REFERENCE_LINE_NUM using the alias name ReferenceLineNum.
     * @return the REFERENCE_LINE_NUM
     */
    public Number getReferenceLineNum() {
        return (Number) getAttributeInternal(REFERENCELINENUM);
    }

    /**
     * Sets <code>value</code> as attribute value for REFERENCE_LINE_NUM using the alias name ReferenceLineNum.
     * @param value value to set the REFERENCE_LINE_NUM
     */
    public void setReferenceLineNum(Number value) {
        setAttributeInternal(REFERENCELINENUM, value);
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
     * Gets the attribute value for SHIFT using the alias name Shift.
     * @return the SHIFT
     */
    public String getShift() {
        return (String) getAttributeInternal(SHIFT);
    }

    /**
     * Sets <code>value</code> as attribute value for SHIFT using the alias name Shift.
     * @param value value to set the SHIFT
     */
    public void setShift(String value) {
        setAttributeInternal(SHIFT, value);
    }

    /**
     * Gets the attribute value for STANDARD_RATE using the alias name StandardRate.
     * @return the STANDARD_RATE
     */
    public Number getStandardRate() {
        return (Number) getAttributeInternal(STANDARDRATE);
    }

    /**
     * Sets <code>value</code> as attribute value for STANDARD_RATE using the alias name StandardRate.
     * @param value value to set the STANDARD_RATE
     */
    public void setStandardRate(Number value) {
        setAttributeInternal(STANDARDRATE, value);
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
     * Gets the attribute value for the calculated attribute TransCategoryDescription.
     * @return the TransCategoryDescription
     */
    public String getTransCategoryDescription() {
        return (String) getAttributeInternal(TRANSCATEGORYDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCategoryDescription.
     * @param value value to set the  TransCategoryDescription
     */
    public void setTransCategoryDescription(String value) {
        setAttributeInternal(TRANSCATEGORYDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransHiringBasis.
     * @return the TransHiringBasis
     */
    public String getTransHiringBasis() {
        return (String) getAttributeInternal(TRANSHIRINGBASIS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransHiringBasis.
     * @param value value to set the  TransHiringBasis
     */
    public void setTransHiringBasis(String value) {
        setAttributeInternal(TRANSHIRINGBASIS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransShift.
     * @return the TransShift
     */
    public String getTransShift() {
        return (String) getAttributeInternal(TRANSSHIFT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransShift.
     * @param value value to set the  TransShift
     */
    public void setTransShift(String value) {
        setAttributeInternal(TRANSSHIFT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransOpertaorRequired.
     * @return the TransOpertaorRequired
     */
    public String getTransOpertorRequired() {
        return (String) getAttributeInternal(TRANSOPERTORREQUIRED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransOpertorRequired.
     * @param value value to set the  TransOpertorRequired
     */
    public void setTransOpertorRequired(String value) {
        setAttributeInternal(TRANSOPERTORREQUIRED, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransFuelRequired.
     * @return the TransFuelRequired
     */
    public String getTransFuelRequired() {
        return (String) getAttributeInternal(TRANSFUELREQUIRED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransFuelRequired.
     * @param value value to set the  TransFuelRequired
     */
    public void setTransFuelRequired(String value) {
        setAttributeInternal(TRANSFUELREQUIRED, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransFlag.
     * @return the TransFlag
     */
    public String getTransFlag() {
        return (String) getAttributeInternal(TRANSFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransFlag.
     * @param value value to set the  TransFlag
     */
    public void setTransFlag(String value) {
        setAttributeInternal(TRANSFLAG, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransQuantityRemaining.
     * @return the TransQuantityRemaining
     */
    public Number getTransQuantityRemaining() {
        return (Number) getAttributeInternal(TRANSQUANTITYREMAINING);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransQuantityRemaining.
     * @param value value to set the  TransQuantityRemaining
     */
    public void setTransQuantityRemaining(Number value) {
        setAttributeInternal(TRANSQUANTITYREMAINING, value);
    }


}

