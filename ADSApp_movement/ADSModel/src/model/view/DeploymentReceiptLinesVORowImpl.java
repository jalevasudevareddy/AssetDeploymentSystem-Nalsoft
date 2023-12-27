package model.view;

import model.entity.AssetDeploymentReceiptLinesEOImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 30 17:46:37 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DeploymentReceiptLinesVORowImpl extends ViewRowImpl {


    public static final int ENTITY_ASSETDEPLOYMENTRECEIPTLINESE1 = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AllocationId,
        AllocationLineId,
        AssetId,
        ContractId,
        ContractLineId,
        CreatedBy,
        CreationDate,
        DoId,
        DoLineId,
        DoLineNum,
        DrId,
        DrLineId,
        LastUpdateDate,
        LastUpdatedBy,
        MasterContractId,
        MasterContractLineId,
        ObjectVersionNumber,
        ReceiptDate,
        ReceiptMeterReading,
        ReceivedBy,
        ReferenceNote,
        TransAssetNumber,
        TransAssetDesc,
        TransOnHiredate,
        TransOffHiredate,
        TransDeployMeterReading,
        TransDeploymentDate,
        TransShiftType,
        TransOperatorName,
        TransReceivedBy,
        TransReceivedByEmpName,
        TransSrcBuId,
        AllocationDetailId,
        DeploymentRcptAccessoriesVO,
        DeploymentRcptMobilizationVO,
        DOEmployeeLOV1;
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
    public static final int ALLOCATIONLINEID = AttributesEnum.AllocationLineId.index();
    public static final int ASSETID = AttributesEnum.AssetId.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
    public static final int CONTRACTLINEID = AttributesEnum.ContractLineId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int DOID = AttributesEnum.DoId.index();
    public static final int DOLINEID = AttributesEnum.DoLineId.index();
    public static final int DOLINENUM = AttributesEnum.DoLineNum.index();
    public static final int DRID = AttributesEnum.DrId.index();
    public static final int DRLINEID = AttributesEnum.DrLineId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int MASTERCONTRACTID = AttributesEnum.MasterContractId.index();
    public static final int MASTERCONTRACTLINEID = AttributesEnum.MasterContractLineId.index();
    public static final int OBJECTVERSIONNUMBER = AttributesEnum.ObjectVersionNumber.index();
    public static final int RECEIPTDATE = AttributesEnum.ReceiptDate.index();
    public static final int RECEIPTMETERREADING = AttributesEnum.ReceiptMeterReading.index();
    public static final int RECEIVEDBY = AttributesEnum.ReceivedBy.index();
    public static final int REFERENCENOTE = AttributesEnum.ReferenceNote.index();
    public static final int TRANSASSETNUMBER = AttributesEnum.TransAssetNumber.index();
    public static final int TRANSASSETDESC = AttributesEnum.TransAssetDesc.index();
    public static final int TRANSONHIREDATE = AttributesEnum.TransOnHiredate.index();
    public static final int TRANSOFFHIREDATE = AttributesEnum.TransOffHiredate.index();
    public static final int TRANSDEPLOYMETERREADING = AttributesEnum.TransDeployMeterReading.index();
    public static final int TRANSDEPLOYMENTDATE = AttributesEnum.TransDeploymentDate.index();
    public static final int TRANSSHIFTTYPE = AttributesEnum.TransShiftType.index();
    public static final int TRANSOPERATORNAME = AttributesEnum.TransOperatorName.index();
    public static final int TRANSRECEIVEDBY = AttributesEnum.TransReceivedBy.index();
    public static final int TRANSRECEIVEDBYEMPNAME = AttributesEnum.TransReceivedByEmpName.index();
    public static final int TRANSSRCBUID = AttributesEnum.TransSrcBuId.index();
    public static final int ALLOCATIONDETAILID = AttributesEnum.AllocationDetailId.index();
    public static final int DEPLOYMENTRCPTACCESSORIESVO = AttributesEnum.DeploymentRcptAccessoriesVO.index();
    public static final int DEPLOYMENTRCPTMOBILIZATIONVO = AttributesEnum.DeploymentRcptMobilizationVO.index();
    public static final int DOEMPLOYEELOV1 = AttributesEnum.DOEmployeeLOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DeploymentReceiptLinesVORowImpl() {
    }

    /**
     * Gets AssetDeploymentReceiptLinesE1 entity object.
     * @return the AssetDeploymentReceiptLinesE1
     */
    public AssetDeploymentReceiptLinesEOImpl getAssetDeploymentReceiptLinesE1() {
        return (AssetDeploymentReceiptLinesEOImpl) getEntity(ENTITY_ASSETDEPLOYMENTRECEIPTLINESE1);
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
     * Gets the attribute value for ALLOCATION_LINE_ID using the alias name AllocationLineId.
     * @return the ALLOCATION_LINE_ID
     */
    public Number getAllocationLineId() {
        return (Number) getAttributeInternal(ALLOCATIONLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for ALLOCATION_LINE_ID using the alias name AllocationLineId.
     * @param value value to set the ALLOCATION_LINE_ID
     */
    public void setAllocationLineId(Number value) {
        setAttributeInternal(ALLOCATIONLINEID, value);
    }

    /**
     * Gets the attribute value for ASSET_ID using the alias name AssetId.
     * @return the ASSET_ID
     */
    public Number getAssetId() {
        return (Number) getAttributeInternal(ASSETID);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSET_ID using the alias name AssetId.
     * @param value value to set the ASSET_ID
     */
    public void setAssetId(Number value) {
        setAttributeInternal(ASSETID, value);
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
     * Gets the attribute value for DO_LINE_ID using the alias name DoLineId.
     * @return the DO_LINE_ID
     */
    public Number getDoLineId() {
        return (Number) getAttributeInternal(DOLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for DO_LINE_ID using the alias name DoLineId.
     * @param value value to set the DO_LINE_ID
     */
    public void setDoLineId(Number value) {
        setAttributeInternal(DOLINEID, value);
    }

    /**
     * Gets the attribute value for DO_LINE_NUM using the alias name DoLineNum.
     * @return the DO_LINE_NUM
     */
    public Number getDoLineNum() {
        return (Number) getAttributeInternal(DOLINENUM);
    }

    /**
     * Sets <code>value</code> as attribute value for DO_LINE_NUM using the alias name DoLineNum.
     * @param value value to set the DO_LINE_NUM
     */
    public void setDoLineNum(Number value) {
        setAttributeInternal(DOLINENUM, value);
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
     * Gets the attribute value for DR_LINE_ID using the alias name DrLineId.
     * @return the DR_LINE_ID
     */
    public Number getDrLineId() {
        return (Number) getAttributeInternal(DRLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for DR_LINE_ID using the alias name DrLineId.
     * @param value value to set the DR_LINE_ID
     */
    public void setDrLineId(Number value) {
        setAttributeInternal(DRLINEID, value);
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
     * Gets the attribute value for OBJECT_VERSION_NUMBER using the alias name ObjectVersionNumber.
     * @return the OBJECT_VERSION_NUMBER
     */
    public Number getObjectVersionNumber() {
        return (Number) getAttributeInternal(OBJECTVERSIONNUMBER);
    }

    /**
     * Gets the attribute value for RECEIPT_DATE using the alias name ReceiptDate.
     * @return the RECEIPT_DATE
     */
    public Date getReceiptDate() {
        return (Date) getAttributeInternal(RECEIPTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for RECEIPT_DATE using the alias name ReceiptDate.
     * @param value value to set the RECEIPT_DATE
     */
    public void setReceiptDate(Date value) {
        setAttributeInternal(RECEIPTDATE, value);
    }

    /**
     * Gets the attribute value for RECEIPT_METER_READING using the alias name ReceiptMeterReading.
     * @return the RECEIPT_METER_READING
     */
    public Number getReceiptMeterReading() {
        return (Number) getAttributeInternal(RECEIPTMETERREADING);
    }

    /**
     * Sets <code>value</code> as attribute value for RECEIPT_METER_READING using the alias name ReceiptMeterReading.
     * @param value value to set the RECEIPT_METER_READING
     */
    public void setReceiptMeterReading(Number value) {
        setAttributeInternal(RECEIPTMETERREADING, value);
    }

    /**
     * Gets the attribute value for RECEIVED_BY using the alias name ReceivedBy.
     * @return the RECEIVED_BY
     */
    public Number getReceivedBy() {
        return (Number) getAttributeInternal(RECEIVEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for RECEIVED_BY using the alias name ReceivedBy.
     * @param value value to set the RECEIVED_BY
     */
    public void setReceivedBy(Number value) {
        setAttributeInternal(RECEIVEDBY, value);
    }

    /**
     * Gets the attribute value for REFERENCE_NOTE using the alias name ReferenceNote.
     * @return the REFERENCE_NOTE
     */
    public String getReferenceNote() {
        return (String) getAttributeInternal(REFERENCENOTE);
    }

    /**
     * Sets <code>value</code> as attribute value for REFERENCE_NOTE using the alias name ReferenceNote.
     * @param value value to set the REFERENCE_NOTE
     */
    public void setReferenceNote(String value) {
        setAttributeInternal(REFERENCENOTE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAssetNumber.
     * @return the TransAssetNumber
     */
    public String getTransAssetNumber() {
        return (String) getAttributeInternal(TRANSASSETNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAssetNumber.
     * @param value value to set the  TransAssetNumber
     */
    public void setTransAssetNumber(String value) {
        setAttributeInternal(TRANSASSETNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAssetDesc.
     * @return the TransAssetDesc
     */
    public String getTransAssetDesc() {
        return (String) getAttributeInternal(TRANSASSETDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAssetDesc.
     * @param value value to set the  TransAssetDesc
     */
    public void setTransAssetDesc(String value) {
        setAttributeInternal(TRANSASSETDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransOnHiredate.
     * @return the TransOnHiredate
     */
    public Date getTransOnHiredate() {
        return (Date) getAttributeInternal(TRANSONHIREDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransOnHiredate.
     * @param value value to set the  TransOnHiredate
     */
    public void setTransOnHiredate(Date value) {
        setAttributeInternal(TRANSONHIREDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransOffHiredate.
     * @return the TransOffHiredate
     */
    public Date getTransOffHiredate() {
        return (Date) getAttributeInternal(TRANSOFFHIREDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransOffHiredate.
     * @param value value to set the  TransOffHiredate
     */
    public void setTransOffHiredate(Date value) {
        setAttributeInternal(TRANSOFFHIREDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDeployMeterReading.
     * @return the TransDeployMeterReading
     */
    public Number getTransDeployMeterReading() {
        return (Number) getAttributeInternal(TRANSDEPLOYMETERREADING);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDeployMeterReading.
     * @param value value to set the  TransDeployMeterReading
     */
    public void setTransDeployMeterReading(Number value) {
        setAttributeInternal(TRANSDEPLOYMETERREADING, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDeploymentDate.
     * @return the TransDeploymentDate
     */
    public Date getTransDeploymentDate() {
        return (Date) getAttributeInternal(TRANSDEPLOYMENTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDeploymentDate.
     * @param value value to set the  TransDeploymentDate
     */
    public void setTransDeploymentDate(Date value) {
        setAttributeInternal(TRANSDEPLOYMENTDATE, value);
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
     * Gets the attribute value for the calculated attribute TransOperatorName.
     * @return the TransOperatorName
     */
    public String getTransOperatorName() {
        return (String) getAttributeInternal(TRANSOPERATORNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransOperatorName.
     * @param value value to set the  TransOperatorName
     */
    public void setTransOperatorName(String value) {
        setAttributeInternal(TRANSOPERATORNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransReceivedBy.
     * @return the TransReceivedBy
     */
    public String getTransReceivedBy() {
        return (String) getAttributeInternal(TRANSRECEIVEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransReceivedBy.
     * @param value value to set the  TransReceivedBy
     */
    public void setTransReceivedBy(String value) {
        setAttributeInternal(TRANSRECEIVEDBY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransReceivedByEmpName.
     * @return the TransReceivedByEmpName
     */
    public String getTransReceivedByEmpName() {
        return (String) getAttributeInternal(TRANSRECEIVEDBYEMPNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransReceivedByEmpName.
     * @param value value to set the  TransReceivedByEmpName
     */
    public void setTransReceivedByEmpName(String value) {
        setAttributeInternal(TRANSRECEIVEDBYEMPNAME, value);
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
     * Gets the attribute value for ALLOCATION_DETAIL_ID using the alias name AllocationDetailId.
     * @return the ALLOCATION_DETAIL_ID
     */
    public Number getAllocationDetailId() {
        return (Number) getAttributeInternal(ALLOCATIONDETAILID);
    }

    /**
     * Sets <code>value</code> as attribute value for ALLOCATION_DETAIL_ID using the alias name AllocationDetailId.
     * @param value value to set the ALLOCATION_DETAIL_ID
     */
    public void setAllocationDetailId(Number value) {
        setAttributeInternal(ALLOCATIONDETAILID, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DeploymentRcptAccessoriesVO.
     */
    public RowIterator getDeploymentRcptAccessoriesVO() {
        return (RowIterator) getAttributeInternal(DEPLOYMENTRCPTACCESSORIESVO);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DeploymentRcptMobilizationVO.
     */
    public RowIterator getDeploymentRcptMobilizationVO() {
        return (RowIterator) getAttributeInternal(DEPLOYMENTRCPTMOBILIZATIONVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> DOEmployeeLOV1.
     */
    public RowSet getDOEmployeeLOV1() {
        return (RowSet) getAttributeInternal(DOEMPLOYEELOV1);
    }
}

