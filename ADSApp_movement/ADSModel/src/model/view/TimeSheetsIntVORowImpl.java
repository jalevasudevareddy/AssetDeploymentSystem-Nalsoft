package model.view;

import java.math.BigDecimal;

import java.sql.Timestamp;

import model.entity.XxadsTimeSheetsIntEOImpl;

import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Mar 11 17:26:50 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TimeSheetsIntVORowImpl extends ViewRowImpl {

    public static final int ENTITY_XXADSTIMESHEETSINTEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AssetNumber,
        EmployeeNumber,
        EndTime,
        ExpType,
        HeaderId,
        Remarks,
        SlipNumber,
        StartTime,
        Task,
        TransactionDate,
        TransactionType,
        UploadId;
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

    public static final int ASSETNUMBER = AttributesEnum.AssetNumber.index();
    public static final int EMPLOYEENUMBER = AttributesEnum.EmployeeNumber.index();
    public static final int ENDTIME = AttributesEnum.EndTime.index();
    public static final int EXPTYPE = AttributesEnum.ExpType.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int SLIPNUMBER = AttributesEnum.SlipNumber.index();
    public static final int STARTTIME = AttributesEnum.StartTime.index();
    public static final int TASK = AttributesEnum.Task.index();
    public static final int TRANSACTIONDATE = AttributesEnum.TransactionDate.index();
    public static final int TRANSACTIONTYPE = AttributesEnum.TransactionType.index();
    public static final int UPLOADID = AttributesEnum.UploadId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TimeSheetsIntVORowImpl() {
    }

    /**
     * Gets XxadsTimeSheetsIntEO entity object.
     * @return the XxadsTimeSheetsIntEO
     */
    public XxadsTimeSheetsIntEOImpl getXxadsTimeSheetsIntEO() {
        return (XxadsTimeSheetsIntEOImpl) getEntity(ENTITY_XXADSTIMESHEETSINTEO);
    }

    /**
     * Gets the attribute value for ASSET_NUMBER using the alias name AssetNumber.
     * @return the ASSET_NUMBER
     */
    public String getAssetNumber() {
        return (String) getAttributeInternal(ASSETNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_NUMBER using the alias name AssetNumber.
     * @param value value to set the ASSET_NUMBER
     */
    public void setAssetNumber(String value) {
        setAttributeInternal(ASSETNUMBER, value);
    }

    /**
     * Gets the attribute value for EMPLOYEE_NUMBER using the alias name EmployeeNumber.
     * @return the EMPLOYEE_NUMBER
     */
    public String getEmployeeNumber() {
        return (String) getAttributeInternal(EMPLOYEENUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for EMPLOYEE_NUMBER using the alias name EmployeeNumber.
     * @param value value to set the EMPLOYEE_NUMBER
     */
    public void setEmployeeNumber(String value) {
        setAttributeInternal(EMPLOYEENUMBER, value);
    }

    /**
     * Gets the attribute value for END_TIME using the alias name EndTime.
     * @return the END_TIME
     */
    public oracle.jbo.domain.Timestamp getEndTime() {
        return (oracle.jbo.domain.Timestamp) getAttributeInternal(ENDTIME);
    }

    /**
     * Sets <code>value</code> as attribute value for END_TIME using the alias name EndTime.
     * @param value value to set the END_TIME
     */
    public void setEndTime(oracle.jbo.domain.Timestamp value) {
        setAttributeInternal(ENDTIME, value);
    }

    /**
     * Gets the attribute value for EXP_TYPE using the alias name ExpType.
     * @return the EXP_TYPE
     */
    public String getExpType() {
        return (String) getAttributeInternal(EXPTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for EXP_TYPE using the alias name ExpType.
     * @param value value to set the EXP_TYPE
     */
    public void setExpType(String value) {
        setAttributeInternal(EXPTYPE, value);
    }

    /**
     * Gets the attribute value for HEADER_ID using the alias name HeaderId.
     * @return the HEADER_ID
     */
    public oracle.jbo.domain.Number getHeaderId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as attribute value for HEADER_ID using the alias name HeaderId.
     * @param value value to set the HEADER_ID
     */
    public void setHeaderId(oracle.jbo.domain.Number value) {
        setAttributeInternal(HEADERID, value);
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
     * Gets the attribute value for SLIP_NUMBER using the alias name SlipNumber.
     * @return the SLIP_NUMBER
     */
    public String getSlipNumber() {
        return (String) getAttributeInternal(SLIPNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for SLIP_NUMBER using the alias name SlipNumber.
     * @param value value to set the SLIP_NUMBER
     */
    public void setSlipNumber(String value) {
        setAttributeInternal(SLIPNUMBER, value);
    }

    /**
     * Gets the attribute value for START_TIME using the alias name StartTime.
     * @return the START_TIME
     */
    public oracle.jbo.domain.Timestamp getStartTime() {
        return (oracle.jbo.domain.Timestamp) getAttributeInternal(STARTTIME);
    }

    /**
     * Sets <code>value</code> as attribute value for START_TIME using the alias name StartTime.
     * @param value value to set the START_TIME
     */
    public void setStartTime(oracle.jbo.domain.Timestamp value) {
        setAttributeInternal(STARTTIME, value);
    }

    /**
     * Gets the attribute value for TASK using the alias name Task.
     * @return the TASK
     */
    public String getTask() {
        return (String) getAttributeInternal(TASK);
    }

    /**
     * Sets <code>value</code> as attribute value for TASK using the alias name Task.
     * @param value value to set the TASK
     */
    public void setTask(String value) {
        setAttributeInternal(TASK, value);
    }

    /**
     * Gets the attribute value for TRANSACTION_DATE using the alias name TransactionDate.
     * @return the TRANSACTION_DATE
     */
    public Date getTransactionDate() {
        return (Date) getAttributeInternal(TRANSACTIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TRANSACTION_DATE using the alias name TransactionDate.
     * @param value value to set the TRANSACTION_DATE
     */
    public void setTransactionDate(Date value) {
        setAttributeInternal(TRANSACTIONDATE, value);
    }

    /**
     * Gets the attribute value for TRANSACTION_TYPE using the alias name TransactionType.
     * @return the TRANSACTION_TYPE
     */
    public String getTransactionType() {
        return (String) getAttributeInternal(TRANSACTIONTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for TRANSACTION_TYPE using the alias name TransactionType.
     * @param value value to set the TRANSACTION_TYPE
     */
    public void setTransactionType(String value) {
        setAttributeInternal(TRANSACTIONTYPE, value);
    }

    /**
     * Gets the attribute value for UPLOAD_ID using the alias name UploadId.
     * @return the UPLOAD_ID
     */
    public oracle.jbo.domain.Number getUploadId() {
        return (oracle.jbo.domain.Number) getAttributeInternal(UPLOADID);
    }

    /**
     * Sets <code>value</code> as attribute value for UPLOAD_ID using the alias name UploadId.
     * @param value value to set the UPLOAD_ID
     */
    public void setUploadId(oracle.jbo.domain.Number value) {
        setAttributeInternal(UPLOADID, value);
    }
}

