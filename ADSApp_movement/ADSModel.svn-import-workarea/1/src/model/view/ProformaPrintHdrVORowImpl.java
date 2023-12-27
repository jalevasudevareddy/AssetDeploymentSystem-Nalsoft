package model.view;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Apr 26 15:23:42 IST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProformaPrintHdrVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        CustomerName,
        Address,
        OderType,
        BillNumber,
        DateFrom,
        DateTo,
        ContactNumber,
        Fax,
        AssetNumber,
        AssetDescription,
        MinHours,
        HourlyRate,
        HeaderId,
        AssetLineId,
        AssetId,
        TotMachineHrs,
        TotBreakdownHrs,
        TotBillHrs,
        TotMachineAmt,
        MobilizationCharges,
        ProformaPrintLinesVO;
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


    public static final int CUSTOMERNAME = AttributesEnum.CustomerName.index();
    public static final int ADDRESS = AttributesEnum.Address.index();
    public static final int ODERTYPE = AttributesEnum.OderType.index();
    public static final int BILLNUMBER = AttributesEnum.BillNumber.index();
    public static final int DATEFROM = AttributesEnum.DateFrom.index();
    public static final int DATETO = AttributesEnum.DateTo.index();
    public static final int CONTACTNUMBER = AttributesEnum.ContactNumber.index();
    public static final int FAX = AttributesEnum.Fax.index();
    public static final int ASSETNUMBER = AttributesEnum.AssetNumber.index();
    public static final int ASSETDESCRIPTION = AttributesEnum.AssetDescription.index();
    public static final int MINHOURS = AttributesEnum.MinHours.index();
    public static final int HOURLYRATE = AttributesEnum.HourlyRate.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int ASSETLINEID = AttributesEnum.AssetLineId.index();
    public static final int ASSETID = AttributesEnum.AssetId.index();
    public static final int TOTMACHINEHRS = AttributesEnum.TotMachineHrs.index();
    public static final int TOTBREAKDOWNHRS = AttributesEnum.TotBreakdownHrs.index();
    public static final int TOTBILLHRS = AttributesEnum.TotBillHrs.index();
    public static final int TOTMACHINEAMT = AttributesEnum.TotMachineAmt.index();
    public static final int MOBILIZATIONCHARGES = AttributesEnum.MobilizationCharges.index();
    public static final int PROFORMAPRINTLINESVO = AttributesEnum.ProformaPrintLinesVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ProformaPrintHdrVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute CustomerName.
     * @return the CustomerName
     */
    public String getCustomerName() {
        return (String) getAttributeInternal(CUSTOMERNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute Address.
     * @return the Address
     */
    public String getAddress() {
        return (String) getAttributeInternal(ADDRESS);
    }

    /**
     * Gets the attribute value for the calculated attribute OderType.
     * @return the OderType
     */
    public String getOderType() {
        return (String) getAttributeInternal(ODERTYPE);
    }

    /**
     * Gets the attribute value for the calculated attribute BillNumber.
     * @return the BillNumber
     */
    public String getBillNumber() {
        return (String) getAttributeInternal(BILLNUMBER);
    }

    /**
     * Gets the attribute value for the calculated attribute DateFrom.
     * @return the DateFrom
     */
    public Date getDateFrom() {
        return (Date) getAttributeInternal(DATEFROM);
    }

    /**
     * Gets the attribute value for the calculated attribute DateTo.
     * @return the DateTo
     */
    public Date getDateTo() {
        return (Date) getAttributeInternal(DATETO);
    }

    /**
     * Gets the attribute value for the calculated attribute ContactNumber.
     * @return the ContactNumber
     */
    public String getContactNumber() {
        return (String) getAttributeInternal(CONTACTNUMBER);
    }

    /**
     * Gets the attribute value for the calculated attribute Fax.
     * @return the Fax
     */
    public String getFax() {
        return (String) getAttributeInternal(FAX);
    }

    /**
     * Gets the attribute value for the calculated attribute AssetNumber.
     * @return the AssetNumber
     */
    public String getAssetNumber() {
        return (String) getAttributeInternal(ASSETNUMBER);
    }

    /**
     * Gets the attribute value for the calculated attribute AssetDescription.
     * @return the AssetDescription
     */
    public String getAssetDescription() {
        return (String) getAttributeInternal(ASSETDESCRIPTION);
    }

    /**
     * Gets the attribute value for the calculated attribute MinHours.
     * @return the MinHours
     */
    public oracle.jbo.domain.Number getMinHours() {
        return (oracle.jbo.domain.Number) getAttributeInternal(MINHOURS);
    }

    /**
     * Gets the attribute value for the calculated attribute HourlyRate.
     * @return the HourlyRate
     */
    public Number getHourlyRate() {
        return (Number) getAttributeInternal(HOURLYRATE);
    }

    /**
     * Gets the attribute value for the calculated attribute HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number) getAttributeInternal(HEADERID);
    }

    /**
     * Gets the attribute value for the calculated attribute AssetLineId.
     * @return the AssetLineId
     */
    public Number getAssetLineId() {
        return (Number) getAttributeInternal(ASSETLINEID);
    }

    /**
     * Gets the attribute value for the calculated attribute AssetId.
     * @return the AssetId
     */
    public Number getAssetId() {
        return (Number) getAttributeInternal(ASSETID);
    }

    /**
     * Gets the attribute value for the calculated attribute TotMachineHrs.
     * @return the TotMachineHrs
     */
    public Number getTotMachineHrs() {
        return (Number) getAttributeInternal(TOTMACHINEHRS);
    }

    /**
     * Gets the attribute value for the calculated attribute TotBreakdownHrs.
     * @return the TotBreakdownHrs
     */
    public BigDecimal getTotBreakdownHrs() {
        return (BigDecimal) getAttributeInternal(TOTBREAKDOWNHRS);
    }

    /**
     * Gets the attribute value for the calculated attribute TotBillHrs.
     * @return the TotBillHrs
     */
    public BigDecimal getTotBillHrs() {
        return (BigDecimal) getAttributeInternal(TOTBILLHRS);
    }

    /**
     * Gets the attribute value for the calculated attribute TotMachineAmt.
     * @return the TotMachineAmt
     */
    public Number getTotMachineAmt() {
        return (Number) getAttributeInternal(TOTMACHINEAMT);
    }

    /**
     * Gets the attribute value for the calculated attribute MobilizationCharges.
     * @return the MobilizationCharges
     */
    public BigDecimal getMobilizationCharges() {
        return (BigDecimal) getAttributeInternal(MOBILIZATIONCHARGES);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ProformaPrintLinesVO.
     */
    public RowIterator getProformaPrintLinesVO() {
        return (RowIterator) getAttributeInternal(PROFORMAPRINTLINESVO);
    }
}
