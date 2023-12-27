package model.view;

import model.entity.XxadsRentalQuoteLinesEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu May 11 10:35:07 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RentalQuoteLineNumVORowImpl extends ViewRowImpl {
    public static final int ENTITY_XXADSRENTALQUOTELINESEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ActiveFlag,
        CategoryDescription,
        CategoryId,
        CreatedBy,
        CreationDate,
        FuelOption,
        HiringBasisRuleId,
        LastUpdateDate,
        LastUpdatedBy,
        LineNum,
        LineValue,
        MarginPercentage,
        MasterQuotationId,
        MasterQuoteLineId,
        MinChargeUnit,
        MinChargeValue,
        MobilizationRequired,
        ObjectVersionNumber,
        OffHireDate,
        OnHireDate,
        OperatorOption,
        Ot1Rate,
        Ot2Rate,
        ParentQuotationId,
        ParentQuoteLineId,
        Quantity,
        QuotationId,
        QuoteLineId,
        Remarks,
        RentalType,
        RequestId,
        RequestLineId,
        RequestLineNum,
        Shift,
        StandardRate,
        TaxRateCode,
        TaxRateId,
        TaxRatePercent,
        UnitRate,
        VatTaxAmount;
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
    public static final int ACTIVEFLAG = AttributesEnum.ActiveFlag.index();
    public static final int CATEGORYDESCRIPTION = AttributesEnum.CategoryDescription.index();
    public static final int CATEGORYID = AttributesEnum.CategoryId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int FUELOPTION = AttributesEnum.FuelOption.index();
    public static final int HIRINGBASISRULEID = AttributesEnum.HiringBasisRuleId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LINENUM = AttributesEnum.LineNum.index();
    public static final int LINEVALUE = AttributesEnum.LineValue.index();
    public static final int MARGINPERCENTAGE = AttributesEnum.MarginPercentage.index();
    public static final int MASTERQUOTATIONID = AttributesEnum.MasterQuotationId.index();
    public static final int MASTERQUOTELINEID = AttributesEnum.MasterQuoteLineId.index();
    public static final int MINCHARGEUNIT = AttributesEnum.MinChargeUnit.index();
    public static final int MINCHARGEVALUE = AttributesEnum.MinChargeValue.index();
    public static final int MOBILIZATIONREQUIRED = AttributesEnum.MobilizationRequired.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int OFFHIREDATE = AttributesEnum.OffHireDate.index();
    public static final int ONHIREDATE = AttributesEnum.OnHireDate.index();
    public static final int OPERATOROPTION = AttributesEnum.OperatorOption.index();
    public static final int OT1RATE = AttributesEnum.Ot1Rate.index();
    public static final int OT2RATE = AttributesEnum.Ot2Rate.index();
    public static final int PARENTQUOTATIONID = AttributesEnum.ParentQuotationId.index();
    public static final int PARENTQUOTELINEID = AttributesEnum.ParentQuoteLineId.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int QUOTATIONID = AttributesEnum.QuotationId.index();
    public static final int QUOTELINEID = AttributesEnum.QuoteLineId.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int RENTALTYPE = AttributesEnum.RentalType.index();
    public static final int REQUESTID = AttributesEnum.RequestId.index();
    public static final int REQUESTLINEID = AttributesEnum.RequestLineId.index();
    public static final int REQUESTLINENUM = AttributesEnum.RequestLineNum.index();
    public static final int SHIFT = AttributesEnum.Shift.index();
    public static final int STANDARDRATE = AttributesEnum.StandardRate.index();
    public static final int TAXRATECODE = AttributesEnum.TaxRateCode.index();
    public static final int TAXRATEID = AttributesEnum.TaxRateId.index();
    public static final int TAXRATEPERCENT = AttributesEnum.TaxRatePercent.index();
    public static final int UNITRATE = AttributesEnum.UnitRate.index();
    public static final int VATTAXAMOUNT = AttributesEnum.VatTaxAmount.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RentalQuoteLineNumVORowImpl() {
    }

    /**
     * Gets XxadsRentalQuoteLinesEO entity object.
     * @return the XxadsRentalQuoteLinesEO
     */
    public XxadsRentalQuoteLinesEOImpl getXxadsRentalQuoteLinesEO() {
        return (XxadsRentalQuoteLinesEOImpl) getEntity(ENTITY_XXADSRENTALQUOTELINESEO);
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
     * Gets the attribute value for CATEGORY_DESCRIPTION using the alias name CategoryDescription.
     * @return the CATEGORY_DESCRIPTION
     */
    public String getCategoryDescription() {
        return (String) getAttributeInternal(CATEGORYDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for CATEGORY_DESCRIPTION using the alias name CategoryDescription.
     * @param value value to set the CATEGORY_DESCRIPTION
     */
    public void setCategoryDescription(String value) {
        setAttributeInternal(CATEGORYDESCRIPTION, value);
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
     * Gets the attribute value for MARGIN_PERCENTAGE using the alias name MarginPercentage.
     * @return the MARGIN_PERCENTAGE
     */
    public Number getMarginPercentage() {
        return (Number) getAttributeInternal(MARGINPERCENTAGE);
    }

    /**
     * Sets <code>value</code> as attribute value for MARGIN_PERCENTAGE using the alias name MarginPercentage.
     * @param value value to set the MARGIN_PERCENTAGE
     */
    public void setMarginPercentage(Number value) {
        setAttributeInternal(MARGINPERCENTAGE, value);
    }

    /**
     * Gets the attribute value for MASTER_QUOTATION_ID using the alias name MasterQuotationId.
     * @return the MASTER_QUOTATION_ID
     */
    public Number getMasterQuotationId() {
        return (Number) getAttributeInternal(MASTERQUOTATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for MASTER_QUOTATION_ID using the alias name MasterQuotationId.
     * @param value value to set the MASTER_QUOTATION_ID
     */
    public void setMasterQuotationId(Number value) {
        setAttributeInternal(MASTERQUOTATIONID, value);
    }

    /**
     * Gets the attribute value for MASTER_QUOTE_LINE_ID using the alias name MasterQuoteLineId.
     * @return the MASTER_QUOTE_LINE_ID
     */
    public Number getMasterQuoteLineId() {
        return (Number) getAttributeInternal(MASTERQUOTELINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for MASTER_QUOTE_LINE_ID using the alias name MasterQuoteLineId.
     * @param value value to set the MASTER_QUOTE_LINE_ID
     */
    public void setMasterQuoteLineId(Number value) {
        setAttributeInternal(MASTERQUOTELINEID, value);
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
     * Gets the attribute value for PARENT_QUOTATION_ID using the alias name ParentQuotationId.
     * @return the PARENT_QUOTATION_ID
     */
    public Number getParentQuotationId() {
        return (Number) getAttributeInternal(PARENTQUOTATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENT_QUOTATION_ID using the alias name ParentQuotationId.
     * @param value value to set the PARENT_QUOTATION_ID
     */
    public void setParentQuotationId(Number value) {
        setAttributeInternal(PARENTQUOTATIONID, value);
    }

    /**
     * Gets the attribute value for PARENT_QUOTE_LINE_ID using the alias name ParentQuoteLineId.
     * @return the PARENT_QUOTE_LINE_ID
     */
    public Number getParentQuoteLineId() {
        return (Number) getAttributeInternal(PARENTQUOTELINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENT_QUOTE_LINE_ID using the alias name ParentQuoteLineId.
     * @param value value to set the PARENT_QUOTE_LINE_ID
     */
    public void setParentQuoteLineId(Number value) {
        setAttributeInternal(PARENTQUOTELINEID, value);
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
     * Gets the attribute value for QUOTATION_ID using the alias name QuotationId.
     * @return the QUOTATION_ID
     */
    public Number getQuotationId() {
        return (Number) getAttributeInternal(QUOTATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for QUOTATION_ID using the alias name QuotationId.
     * @param value value to set the QUOTATION_ID
     */
    public void setQuotationId(Number value) {
        setAttributeInternal(QUOTATIONID, value);
    }

    /**
     * Gets the attribute value for QUOTE_LINE_ID using the alias name QuoteLineId.
     * @return the QUOTE_LINE_ID
     */
    public Number getQuoteLineId() {
        return (Number) getAttributeInternal(QUOTELINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for QUOTE_LINE_ID using the alias name QuoteLineId.
     * @param value value to set the QUOTE_LINE_ID
     */
    public void setQuoteLineId(Number value) {
        setAttributeInternal(QUOTELINEID, value);
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
     * Gets the attribute value for REQUEST_LINE_ID using the alias name RequestLineId.
     * @return the REQUEST_LINE_ID
     */
    public Number getRequestLineId() {
        return (Number) getAttributeInternal(REQUESTLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUEST_LINE_ID using the alias name RequestLineId.
     * @param value value to set the REQUEST_LINE_ID
     */
    public void setRequestLineId(Number value) {
        setAttributeInternal(REQUESTLINEID, value);
    }

    /**
     * Gets the attribute value for REQUEST_LINE_NUM using the alias name RequestLineNum.
     * @return the REQUEST_LINE_NUM
     */
    public Number getRequestLineNum() {
        return (Number) getAttributeInternal(REQUESTLINENUM);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUEST_LINE_NUM using the alias name RequestLineNum.
     * @param value value to set the REQUEST_LINE_NUM
     */
    public void setRequestLineNum(Number value) {
        setAttributeInternal(REQUESTLINENUM, value);
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
     * Gets the attribute value for TAX_RATE_CODE using the alias name TaxRateCode.
     * @return the TAX_RATE_CODE
     */
    public String getTaxRateCode() {
        return (String) getAttributeInternal(TAXRATECODE);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RATE_CODE using the alias name TaxRateCode.
     * @param value value to set the TAX_RATE_CODE
     */
    public void setTaxRateCode(String value) {
        setAttributeInternal(TAXRATECODE, value);
    }

    /**
     * Gets the attribute value for TAX_RATE_ID using the alias name TaxRateId.
     * @return the TAX_RATE_ID
     */
    public Number getTaxRateId() {
        return (Number) getAttributeInternal(TAXRATEID);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RATE_ID using the alias name TaxRateId.
     * @param value value to set the TAX_RATE_ID
     */
    public void setTaxRateId(Number value) {
        setAttributeInternal(TAXRATEID, value);
    }

    /**
     * Gets the attribute value for TAX_RATE_PERCENT using the alias name TaxRatePercent.
     * @return the TAX_RATE_PERCENT
     */
    public Number getTaxRatePercent() {
        return (Number) getAttributeInternal(TAXRATEPERCENT);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RATE_PERCENT using the alias name TaxRatePercent.
     * @param value value to set the TAX_RATE_PERCENT
     */
    public void setTaxRatePercent(Number value) {
        setAttributeInternal(TAXRATEPERCENT, value);
    }

    /**
     * Gets the attribute value for UNIT_RATE using the alias name UnitRate.
     * @return the UNIT_RATE
     */
    public Number getUnitRate() {
        return (Number) getAttributeInternal(UNITRATE);
    }

    /**
     * Sets <code>value</code> as attribute value for UNIT_RATE using the alias name UnitRate.
     * @param value value to set the UNIT_RATE
     */
    public void setUnitRate(Number value) {
        setAttributeInternal(UNITRATE, value);
    }

    /**
     * Gets the attribute value for VAT_TAX_AMOUNT using the alias name VatTaxAmount.
     * @return the VAT_TAX_AMOUNT
     */
    public Number getVatTaxAmount() {
        return (Number) getAttributeInternal(VATTAXAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for VAT_TAX_AMOUNT using the alias name VatTaxAmount.
     * @param value value to set the VAT_TAX_AMOUNT
     */
    public void setVatTaxAmount(Number value) {
        setAttributeInternal(VATTAXAMOUNT, value);
    }
}

