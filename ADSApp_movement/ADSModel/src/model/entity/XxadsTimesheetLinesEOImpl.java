package model.entity;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.domain.TimestampTZ;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 08 14:47:19 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxadsTimesheetLinesEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TsLineId,
        TsHeaderId,
        TransactionType,
        TimesheetDate,
        RentalType,
        AssetId,
        EmployeeId,
        SlipNumber,
        StartTime,
        EndTime,
        TotalHours,
        StandardHours,
        Ot1Hours,
        Ot2Hours,
        DailyAllowance,
        TravelAllowance,
        TaskId,
        ExpTypeId,
        ContractLineId,
        MasterContractLineId,
        AllocationLineId,
        AllocationDetailId,
        DoLineId,
        Remarks,
        BillingFlag,
        BillingHdrId,
        BillingLineId,
        TimesheetFlag,
        CreationDate,
        CreatedBy,
        LastUpdateDate,
        LastUpdatedBy,
        ObjectVersionNumber;
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


    public static final int TSLINEID = AttributesEnum.TsLineId.index();
    public static final int TSHEADERID = AttributesEnum.TsHeaderId.index();
    public static final int TRANSACTIONTYPE = AttributesEnum.TransactionType.index();
    public static final int TIMESHEETDATE = AttributesEnum.TimesheetDate.index();
    public static final int RENTALTYPE = AttributesEnum.RentalType.index();
    public static final int ASSETID = AttributesEnum.AssetId.index();
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int SLIPNUMBER = AttributesEnum.SlipNumber.index();
    public static final int STARTTIME = AttributesEnum.StartTime.index();
    public static final int ENDTIME = AttributesEnum.EndTime.index();
    public static final int TOTALHOURS = AttributesEnum.TotalHours.index();
    public static final int STANDARDHOURS = AttributesEnum.StandardHours.index();
    public static final int OT1HOURS = AttributesEnum.Ot1Hours.index();
    public static final int OT2HOURS = AttributesEnum.Ot2Hours.index();
    public static final int DAILYALLOWANCE = AttributesEnum.DailyAllowance.index();
    public static final int TRAVELALLOWANCE = AttributesEnum.TravelAllowance.index();
    public static final int TASKID = AttributesEnum.TaskId.index();
    public static final int EXPTYPEID = AttributesEnum.ExpTypeId.index();
    public static final int CONTRACTLINEID = AttributesEnum.ContractLineId.index();
    public static final int MASTERCONTRACTLINEID = AttributesEnum.MasterContractLineId.index();
    public static final int ALLOCATIONLINEID = AttributesEnum.AllocationLineId.index();
    public static final int ALLOCATIONDETAILID = AttributesEnum.AllocationDetailId.index();
    public static final int DOLINEID = AttributesEnum.DoLineId.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int BILLINGFLAG = AttributesEnum.BillingFlag.index();
    public static final int BILLINGHDRID = AttributesEnum.BillingHdrId.index();
    public static final int BILLINGLINEID = AttributesEnum.BillingLineId.index();
    public static final int TIMESHEETFLAG = AttributesEnum.TimesheetFlag.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxadsTimesheetLinesEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.XxadsTimesheetLinesEO");
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
     * Gets the attribute value for TsLineId, using the alias name TsLineId.
     * @return the value of TsLineId
     */
    public Number getTsLineId() {
        return (Number) getAttributeInternal(TSLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TsLineId.
     * @param value value to set the TsLineId
     */
    public void setTsLineId(Number value) {
        setAttributeInternal(TSLINEID, value);
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
     * Gets the attribute value for TransactionType, using the alias name TransactionType.
     * @return the value of TransactionType
     */
    public String getTransactionType() {
        return (String) getAttributeInternal(TRANSACTIONTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransactionType.
     * @param value value to set the TransactionType
     */
    public void setTransactionType(String value) {
        setAttributeInternal(TRANSACTIONTYPE, value);
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
     * Gets the attribute value for RentalType, using the alias name RentalType.
     * @return the value of RentalType
     */
    public String getRentalType() {
        return (String) getAttributeInternal(RENTALTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RentalType.
     * @param value value to set the RentalType
     */
    public void setRentalType(String value) {
        setAttributeInternal(RENTALTYPE, value);
    }

    /**
     * Gets the attribute value for AssetId, using the alias name AssetId.
     * @return the value of AssetId
     */
    public Number getAssetId() {
        return (Number) getAttributeInternal(ASSETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssetId.
     * @param value value to set the AssetId
     */
    public void setAssetId(Number value) {
        setAttributeInternal(ASSETID, value);
    }

    /**
     * Gets the attribute value for EmployeeId, using the alias name EmployeeId.
     * @return the value of EmployeeId
     */
    public Number getEmployeeId() {
        return (Number) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeId.
     * @param value value to set the EmployeeId
     */
    public void setEmployeeId(Number value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for SlipNumber, using the alias name SlipNumber.
     * @return the value of SlipNumber
     */
    public String getSlipNumber() {
        return (String) getAttributeInternal(SLIPNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for SlipNumber.
     * @param value value to set the SlipNumber
     */
    public void setSlipNumber(String value) {
        setAttributeInternal(SLIPNUMBER, value);
    }

    /**
     * Gets the attribute value for StartTime, using the alias name StartTime.
     * @return the value of StartTime
     */
    public Timestamp getStartTime() {
        return (Timestamp) getAttributeInternal(STARTTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for StartTime.
     * @param value value to set the StartTime
     */
    public void setStartTime(Timestamp value) {
        setAttributeInternal(STARTTIME, value);
    }

    /**
     * Gets the attribute value for EndTime, using the alias name EndTime.
     * @return the value of EndTime
     */
    public oracle.jbo.domain.Timestamp getEndTime() {
        return (oracle.jbo.domain.Timestamp) getAttributeInternal(ENDTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for EndTime.
     * @param value value to set the EndTime
     */
    public void setEndTime(oracle.jbo.domain.Timestamp value) {
        setAttributeInternal(ENDTIME, value);
    }

    /**
     * Gets the attribute value for TotalHours, using the alias name TotalHours.
     * @return the value of TotalHours
     */
    public Number getTotalHours() {
        return (Number) getAttributeInternal(TOTALHOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalHours.
     * @param value value to set the TotalHours
     */
    public void setTotalHours(Number value) {
        setAttributeInternal(TOTALHOURS, value);
    }

    /**
     * Gets the attribute value for StandardHours, using the alias name StandardHours.
     * @return the value of StandardHours
     */
    public Number getStandardHours() {
        return (Number) getAttributeInternal(STANDARDHOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for StandardHours.
     * @param value value to set the StandardHours
     */
    public void setStandardHours(Number value) {
        setAttributeInternal(STANDARDHOURS, value);
    }

    /**
     * Gets the attribute value for Ot1Hours, using the alias name Ot1Hours.
     * @return the value of Ot1Hours
     */
    public Number getOt1Hours() {
        return (Number) getAttributeInternal(OT1HOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ot1Hours.
     * @param value value to set the Ot1Hours
     */
    public void setOt1Hours(Number value) {
        setAttributeInternal(OT1HOURS, value);
    }

    /**
     * Gets the attribute value for Ot2Hours, using the alias name Ot2Hours.
     * @return the value of Ot2Hours
     */
    public Number getOt2Hours() {
        return (Number) getAttributeInternal(OT2HOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ot2Hours.
     * @param value value to set the Ot2Hours
     */
    public void setOt2Hours(Number value) {
        setAttributeInternal(OT2HOURS, value);
    }

    /**
     * Gets the attribute value for DailyAllowance, using the alias name DailyAllowance.
     * @return the value of DailyAllowance
     */
    public Number getDailyAllowance() {
        return (Number) getAttributeInternal(DAILYALLOWANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DailyAllowance.
     * @param value value to set the DailyAllowance
     */
    public void setDailyAllowance(Number value) {
        setAttributeInternal(DAILYALLOWANCE, value);
    }

    /**
     * Gets the attribute value for TravelAllowance, using the alias name TravelAllowance.
     * @return the value of TravelAllowance
     */
    public Number getTravelAllowance() {
        return (Number) getAttributeInternal(TRAVELALLOWANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TravelAllowance.
     * @param value value to set the TravelAllowance
     */
    public void setTravelAllowance(Number value) {
        setAttributeInternal(TRAVELALLOWANCE, value);
    }

    /**
     * Gets the attribute value for TaskId, using the alias name TaskId.
     * @return the value of TaskId
     */
    public Number getTaskId() {
        return (Number) getAttributeInternal(TASKID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaskId.
     * @param value value to set the TaskId
     */
    public void setTaskId(Number value) {
        setAttributeInternal(TASKID, value);
    }

    /**
     * Gets the attribute value for ExpTypeId, using the alias name ExpTypeId.
     * @return the value of ExpTypeId
     */
    public Number getExpTypeId() {
        return (Number) getAttributeInternal(EXPTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpTypeId.
     * @param value value to set the ExpTypeId
     */
    public void setExpTypeId(Number value) {
        setAttributeInternal(EXPTYPEID, value);
    }

    /**
     * Gets the attribute value for ContractLineId, using the alias name ContractLineId.
     * @return the value of ContractLineId
     */
    public Number getContractLineId() {
        return (Number) getAttributeInternal(CONTRACTLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContractLineId.
     * @param value value to set the ContractLineId
     */
    public void setContractLineId(Number value) {
        setAttributeInternal(CONTRACTLINEID, value);
    }

    /**
     * Gets the attribute value for MasterContractLineId, using the alias name MasterContractLineId.
     * @return the value of MasterContractLineId
     */
    public Number getMasterContractLineId() {
        return (Number) getAttributeInternal(MASTERCONTRACTLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MasterContractLineId.
     * @param value value to set the MasterContractLineId
     */
    public void setMasterContractLineId(Number value) {
        setAttributeInternal(MASTERCONTRACTLINEID, value);
    }

    /**
     * Gets the attribute value for AllocationLineId, using the alias name AllocationLineId.
     * @return the value of AllocationLineId
     */
    public Number getAllocationLineId() {
        return (Number) getAttributeInternal(ALLOCATIONLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AllocationLineId.
     * @param value value to set the AllocationLineId
     */
    public void setAllocationLineId(Number value) {
        setAttributeInternal(ALLOCATIONLINEID, value);
    }

    /**
     * Gets the attribute value for AllocationDetailId, using the alias name AllocationDetailId.
     * @return the value of AllocationDetailId
     */
    public Number getAllocationDetailId() {
        return (Number) getAttributeInternal(ALLOCATIONDETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AllocationDetailId.
     * @param value value to set the AllocationDetailId
     */
    public void setAllocationDetailId(Number value) {
        setAttributeInternal(ALLOCATIONDETAILID, value);
    }

    /**
     * Gets the attribute value for DoLineId, using the alias name DoLineId.
     * @return the value of DoLineId
     */
    public Number getDoLineId() {
        return (Number) getAttributeInternal(DOLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DoLineId.
     * @param value value to set the DoLineId
     */
    public void setDoLineId(Number value) {
        setAttributeInternal(DOLINEID, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for BillingFlag, using the alias name BillingFlag.
     * @return the value of BillingFlag
     */
    public String getBillingFlag() {
        return (String) getAttributeInternal(BILLINGFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for BillingFlag.
     * @param value value to set the BillingFlag
     */
    public void setBillingFlag(String value) {
        setAttributeInternal(BILLINGFLAG, value);
    }

    /**
     * Gets the attribute value for BillingHdrId, using the alias name BillingHdrId.
     * @return the value of BillingHdrId
     */
    public Number getBillingHdrId() {
        return (Number) getAttributeInternal(BILLINGHDRID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BillingHdrId.
     * @param value value to set the BillingHdrId
     */
    public void setBillingHdrId(Number value) {
        setAttributeInternal(BILLINGHDRID, value);
    }

    /**
     * Gets the attribute value for BillingLineId, using the alias name BillingLineId.
     * @return the value of BillingLineId
     */
    public Number getBillingLineId() {
        return (Number) getAttributeInternal(BILLINGLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BillingLineId.
     * @param value value to set the BillingLineId
     */
    public void setBillingLineId(Number value) {
        setAttributeInternal(BILLINGLINEID, value);
    }

    /**
     * Gets the attribute value for TimesheetFlag, using the alias name TimesheetFlag.
     * @return the value of TimesheetFlag
     */
    public String getTimesheetFlag() {
        return (String) getAttributeInternal(TIMESHEETFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for TimesheetFlag.
     * @param value value to set the TimesheetFlag
     */
    public void setTimesheetFlag(String value) {
        setAttributeInternal(TIMESHEETFLAG, value);
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
     * @param tsLineId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number tsLineId) {
        return new Key(new Object[] { tsLineId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        
        SequenceImpl seq = new SequenceImpl("xxads_timesheet_lines_s", this.getDBTransaction());
        setTsLineId(seq.getSequenceNumber());
    }
}
