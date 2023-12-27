package model.searchview;

import java.util.ArrayList;
import java.util.Collection;

import java.util.HashMap;

import oracle.jbo.Key;
import oracle.jbo.RangePagingDataFilter;
import oracle.jbo.ScrollableDataFilter;
import oracle.jbo.server.ProgrammaticViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 03 12:31:26 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TransEmpMasterSearchVOImpl extends ProgrammaticViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public TransEmpMasterSearchVOImpl() {
    }

    /**
     * getRangePagingData - for custom java data source support.
     */
    public Collection<Object> getRangePagingData(RangePagingDataFilter filter) {
        Collection<Object> value = super.getRangePagingData(filter);
        return value;
    }

    /**
     * retrieveDataByKey - for custom java data source support.
     */
    public Collection<Object> retrieveDataByKey(Key key, int size) {
        Collection<Object> value = super.retrieveDataByKey(key, size);
        return value;
    }

    /**
     * getScrollableData - for custom java data source support.
     */
    public Collection<Object> getScrollableData(ScrollableDataFilter filter) {
        ArrayList<Object> rows =  new ArrayList<Object>();         
        HashMap<Object, Object> row = new HashMap<Object, Object>();      
        row.put("TransBuName", null);
        row.put("TransEmpCategory", null);
        row.put("TransEmpCategoryId", null);
        row.put("TransEmpSource", null);
        row.put("TransEmpSourceCode", null);
        row.put("TransDivision", null);
        row.put("TransDivFlexValueId", null);
        row.put("TransEmployeeNumber", null);
        row.put("TransEmployeeName", null);
        row.put("TransEmployeeId", null);
        row.put("TransActiveFlag", null);
        row.put("TransActiveFlag", null);
        row.put("TransBuId", null);
        row.put("TransDivRequired", null);
        row.put("TransDivSegment", null);
        row.put("TransDivFlexValSetId", null);
        
        return rows;
    }
}

