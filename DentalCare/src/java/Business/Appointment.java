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
 * The Appointment Class handles appointment details. 
 * it is mainly a many to many relationship between Dentist class and Procedure class, 
 * Patient class and Procedure class.
 * This class has two constructors. First constructor overrides the default constructor, 
 * and the second takes parameters: procCode, apptDateTime, patId and dentId.
 */
public class Appointment {
    
    private String procCode, apptDatetime, patId, dentId;
    
    /**
     * Default constructor sets all attributes to empty string
     */
    public Appointment () {
        this.procCode = "";
        this.apptDatetime = "";
        this.dentId = "";
        this.patId = "";
    }
    
    /**
     * Parameterised constructor
     * @param procCode
     * @param apptDateTime
     * @param patId
     * @param dentId 
     */
    public Appointment(String procCode, String apptDateTime, String patId, String dentId){
        this.procCode = procCode;
        this.apptDatetime = apptDateTime;
        this.patId = patId;
    }
    
    /**
     * 
     * @param procCode 
     */
    public void setProcCode(String procCode) {
        this.procCode = procCode;
    }
    
    /**
     * 
     * @param aptDatetime 
     */
    public void setAptDateTime(String aptDatetime) {
        this.apptDatetime = aptDatetime;
    }
    
    /**
     * 
     * @param patId 
     */
    public void setPatId(String patId) {
        this.patId = patId;
    }
    
    /**
     * 
     * @param dentId 
     */
    public void setDentId(String dentId) {
        this.dentId = dentId;
    }
    
    
    /**
     * 
     * @return procCode
     */
    public String getProcCode() {
        return this.procCode;
    }
    
    /** 
     * 
     * @return aptDateTime
     */
    public String getAptDateTime(){
        return this.apptDatetime;
    }
    
    /** 
     * 
     * @return patId
     */
    public String getPatId() {
        return this.patId;
    }
    
    /**
     * 
     * @return dentId
     */
    public String getDentId(){
        return this.dentId;
    }
    
    
    /**
     * Update the patient appointment with the params given
     * @return void
     * @param procCode
     * @param apptDateTime 
     */
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
    
    /**
     * Inserts a new patient appointment
     * @return  void
     * @param apptDateTime
     * @param patId
     * @param dentId
     * @param procCode 
     */
    
    public void insertAppointment(String apptDateTime, String patId, String dentId, String procCode){
        System.out.println("--> insertAppointment was called <---");
         try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/DentistOfficeACCDB.accdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("---> Database connection successfull <---");
            
            String QUERY = "INSERT INTO Appointments (apptDateTime, patId, dentId, procCode) VALUES(?, ?, ?, ?)";
            
            PreparedStatement ps = conn.prepareStatement(QUERY);
            
            System.out.println("--->" + QUERY + "<---");
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
