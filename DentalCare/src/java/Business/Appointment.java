/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author muhyideenelias
 */
public class Appointment {
    
    private String procCode, apptDatetime, patId, dentId;
    
    public Appointment () {
        this.procCode = "";
        this.apptDatetime = "";
        this.dentId = "";
        this.patId = "";
    }
    
    public Appointment(String procCode, String apptDateTime, String patId, String dentId){
        this.procCode = procCode;
        this.apptDatetime = apptDateTime;
        this.patId = patId;
    }
    
    public void setProcCode(String procCode) {
        this.procCode = procCode;
    }
    
    public void setAptDateTime(String aptDatetime) {
        this.apptDatetime = aptDatetime;
    }
    
    public void setPatId(String patId) {
        this.patId = patId;
    }
    
    public void setDentId(String dentId) {
        this.dentId = dentId;
    }
    
    
    
    public String getProcCode() {
        return this.procCode;
    }
    
    public String getAptDateTime(){
        return this.apptDatetime;
    }
    
    
    public String getPatId() {
        return this.patId;
    }
    
    public String getDentId(){
        return this.dentId;
    }
    
    public void UpdateDentistAppointment(String procCode, String apptDateTime) {
        
        System.out.println("--> UpdateDentistAppointment was called <---");
        
        
        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/DentistOfficeACCDB.accdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("---> Database connection successfull <---");
            
            String UPDATE_QUERY = "UPDATE Appointments SET apptDateTime=? WHERE procCode=?";
            
            PreparedStatement ps = conn.prepareStatement(UPDATE_QUERY);
            
            System.out.println("--->" + UPDATE_QUERY + "<---");
            int result;
            
            ps.setString(1, apptDateTime);
            ps.setString(2, procCode);
            
            
            ps.toString();
            
            result = ps.executeUpdate();
            if(result == 0){
                System.out.println("Result:---> " + result);
                System.out.println("Records not updated");
                
            } else{
                setProcCode(procCode);
                setAptDateTime(apptDateTime);
                System.out.println("Records updated successfully");
                
            }
            
            
            
           
            System.out.println("--> UpdateDentistAppointment was closed <---");
            conn.close();
            
            
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }
   
        
    }
    
    public void insertAppointment(String apptDateTime, String patId, String dentId, String procCode){
        System.out.println("--> insertAppointment was called <---");
         try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/DentistOfficeACCDB.accdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("---> Database connection successfull <---");
            
            String UPDATE_QUERY = "INSERT INTO Appointments (apptDateTime, patId, dentId, procCode) VALUES(?, ?, ?, ?)";
            
            PreparedStatement ps = conn.prepareStatement(UPDATE_QUERY);
            
            System.out.println("--->" + UPDATE_QUERY + "<---");
            int result;
            
            ps.setString(1, apptDateTime);
            ps.setString(2, patId);
            ps.setString(3, dentId);
            ps.setString(4, procCode);
            
            
            ps.toString();
            
            result = ps.executeUpdate();
            if(result == 0){
                System.out.println("Result:---> " + result);
                System.out.println("Records not updated");
                
            } else{
                setProcCode(procCode);
                setAptDateTime(apptDateTime);
                System.out.println("Records updated successfully");
                
            }
            
            
            
           
            System.out.println("--> UpdateDentistAppointment was closed <---");
            conn.close();
            
            
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }

    }
}
