/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author muhyideenelias
 */
public class Procedure {
    String procCode, procName, procDesc, cost, aptDateTime, patId, dentId;
    
    public Procedure(){
        this.procCode = "";
        this.procName = "";
        this.procDesc = "";
        this.cost = "";
        aptDateTime = "";
        patId = "";
        dentId = "";     
    }
    
    public Procedure(String procCode, String procName, String procDesc, String cost, String aptDateTime, String patId, String dentId){
        this.procCode = procCode;
        this.procName = procName;
        this.procDesc = procDesc;
        this.cost = cost;
        this.aptDateTime = aptDateTime;
        this.patId = patId;
        this.dentId = dentId;
    }
    
    public void setProcCode(String procCode) {
        this.procCode = procCode;
    }
    
    public void setProcName(String procName){
        this.procName = procName;
    }
    
    public void setProcDesc(String procDesc){
        this.procDesc = procDesc;
    }
    
    public void setCost(String cost){
        this.cost = cost;
    }
    
    public void setAptDatetime(String aptDateTime){
        this.aptDateTime = aptDateTime;
    }
    
    public void setPatId(String patId){
        this.procDesc = patId;
    }
    
    public void setDentId(String dentId){
        this.dentId = dentId;
    }
    
    public String getProcCode(){
        return this.procCode;       
    }
    
    public String getProcName(){
        return this.procName;
    }
    
    public String getAptDatetime(){
        return this.aptDateTime;
    }
    
    public String getPatId(){
        return this.patId;
    }
    
    public String getDentId(){
        return this.dentId;
    }
    
    public String getProcDesc(){
        return this.procDesc;
    }
    
    public String getCost(){
        return this.cost;
    }
    
    
    public void display() {
        System.out.println("--->Start of Appointment Display Method <---");
        System.out.println("Patient ID: " + this.getPatId());
        System.out.println("Dentist ID: " + this.getDentId());
        System.out.println("Procedure Code: " + this.getProcCode());
        System.out.println("Procedure Name: " + this.getProcName());
        System.out.println("Procedure Description: " + this.getProcDesc());
        System.out.println("Procedure Cost: " +  this.getCost());
        System.out.println("Appointment Time: " + this.getAptDatetime());
        System.out.println("---> End of Appointment Display Method <---");
    }
    
    public  void selectPatientProcedure(String procCode) {
        this.setProcCode(procCode);
        System.out.println("---> getAppointment() was called <---");
        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/DentistOfficeACCDB.accdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("---> Database connection successfull <---");
            
            Statement statement = conn.createStatement();
            
            String query = "SELECT * FROM Procedures WHERE procCode='" + this.getProcCode()+ "'";
            System.out.println("--->" + query + "<---");
            
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();

           setProcName(resultSet.getString("procName"));
           setProcDesc(resultSet.getString("procDesc"));
           setCost(resultSet.getString("cost"));
            
            conn.close();
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }
     
    }
    
}
