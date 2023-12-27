package model.applicationModule;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.HashMap;
import java.util.Map;

import model.applicationModule.common.CommonAM;
import java.sql.Types;

import model.searchview.NotificationsCountVOImpl;
import model.searchview.NotificationsCountVORowImpl;
import model.searchview.UserRolesVOImpl;

import model.searchview.UserRolesVORowImpl;

import oracle.adf.share.ADFContext;

import oracle.jbo.JboException;
import oracle.jbo.RowSetIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 27 09:37:41 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CommonAMImpl extends ApplicationModuleImpl implements CommonAM {
    /**
     * This is the default constructor (do not remove).
     */
    public CommonAMImpl() {
    }
     
    private String JWT_ROW = "select jwt_key,jwt_value from xx_jwt_config_t";
    
    private final String AME_PROCESS =
        "begin xxame_pkg.handle_request" + "(:p_document_type_id,:p_request_id,:p_action_code,:p_employee_id,:p_remarks,:p_req_doc_no,:p_message);end;";
    
    
    /**
     * Container's getter for UserRolesVO1.
     * @return UserRolesVO1
     */
    public UserRolesVOImpl getUserRolesVO1() {
        return (UserRolesVOImpl) findViewObject("UserRolesVO1");
    }
    
    public Map loadJWTData() {
        Statement st = null;
        //        String returnCode = null;
        Map JwtMap = new HashMap();
        try {
            st = getDBTransaction().createPreparedStatement(JWT_ROW, 0);
            ResultSet rs = st.executeQuery(JWT_ROW);
            while (rs.next()) {
                JwtMap.put(rs.getString("JWT_KEY"), rs.getString("JWT_VALUE"));
            }
        } catch (SQLException e) {
            throw new JboException(e);
        } finally {
            if (st != null) {
                try {
                    // 7. Close the statement
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return JwtMap;
    }
    
    public Map getCurrentSessionScope() {
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        return sessionScope;
    }
    
    public String UserRoles() {
        String message = "Success";
        try {
            UserRolesVOImpl vo = getUserRolesVO1();
            vo.setNamedWhereClauseParam("p_user_id", ((Map) ADFContext.getCurrent()
                                                                      .getSessionScope()
                                                                      .get("userMap")).get("UserId"));
            vo.executeQuery();
            RowSetIterator allRows = vo.createRowSetIterator(null);
            while (allRows.hasNext()) {
                UserRolesVORowImpl crow = (UserRolesVORowImpl) allRows.next();
                getCurrentSessionScope().put(crow.getRoleName(), "Y");
            }
            NotificationsCountVOImpl notVO = getNotificationsCountVO1();
            notVO.executeQuery();
            NotificationsCountVORowImpl currRow = (NotificationsCountVORowImpl)notVO.first();            
            getCurrentSessionScope().put("notificationsCount", currRow.getApprCount().intValue());
        } catch (Exception e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        return message;
    }

    /**
     * Container's getter for NotificationsCountVO1.
     * @return NotificationsCountVO1
     */
    public NotificationsCountVOImpl getNotificationsCountVO1() {
        return (NotificationsCountVOImpl) findViewObject("NotificationsCountVO1");
    }
    
    public Number getCurrentEmployeeId() {
        Map userMap = (Map)getCurrentSessionScope().get("userMap");
        Number employeeId = null;
        try {
            employeeId = new Number(userMap.get("personId"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeId;
    }
    
    public String decodeUrl(){
        String message ="Success";  
        try{
            String scopeValues = null;
            String actual = null;
            String encodeUrl = (String)ADFContext.getCurrent().getPageFlowScope().get("target"); 
            CallableStatement cs=getDBTransaction().createCallableStatement("begin ? := XXPA_MAIL_DATA_PKG.encodeurl(?); end;",0);
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, encodeUrl);
            cs.executeUpdate();
            actual = cs.getString(1);
           
            String[] paramValues = actual.split("&");  
            for (int i = 0;i<paramValues.length;i++) {
                scopeValues = paramValues[i];
                if(scopeValues != null){
                    String[] params = scopeValues.split("=");
                    String key = "";
                    String value = "";
                    for (int j = 0;j<params.length;j++) {
                        if(j == 0){
                            key = params[j];
                        }if(j==1){
                            value = params[j];
                        }
                    }
                    if("personId".equalsIgnoreCase(key) || "userName".equalsIgnoreCase(key)){
                        ADFContext.getCurrent().getSessionScope().put(key, value);
                    }else{
                      ADFContext.getCurrent().getPageFlowScope().put(key, value);
                    }
                }
            }            
        }catch(Exception e){
            e.printStackTrace();
        }
        return message;
    }
    
    public String callAMEProcess(Map paramsMap) {
             CallableStatement callableStatement = null;
             Number docTypeId = null;
             Number docId = null;
             Number empId = null;
             try {
                 docTypeId = new Number(paramsMap.get("docTypeId").toString());
                 docId = new Number(paramsMap.get("docId").toString());
                 empId = new Number(paramsMap.get("currEmpId").toString());
             } catch (SQLException e) {
                 e.printStackTrace();
             }
             String actionItem = (String)paramsMap.get("ActionCode");
             String remarks = (String)paramsMap.get("remarks");
             String docNum = (String)paramsMap.get("docNum");
             String msg = "";
             try {
                 if (docTypeId != null && docId != null && actionItem != null) {
                      callableStatement =
                             getDBTransaction().createCallableStatement(AME_PROCESS,
                                                                        0);
                     callableStatement.setLong("p_document_type_id",
                                               docTypeId.longValue());
                     callableStatement.setLong("p_request_id", docId.longValue());
                     callableStatement.setString("p_action_code", actionItem);
                     callableStatement.setLong("p_employee_id", empId.longValue());
                     callableStatement.setString("p_remarks", remarks);
                     callableStatement.setString("p_req_doc_no", docNum);
                     callableStatement.registerOutParameter("p_message",
                                                            Types.VARCHAR);
                     callableStatement.execute();
                     msg = callableStatement.getString("p_message");
                 }
             } catch (Exception e) {
                 e.printStackTrace();
                 return e.getLocalizedMessage();
             } finally {
                 try {
                     if (callableStatement != null) {
                         callableStatement.close();
                     }
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
             return msg;

    

         }
    
}

