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
    
    private String procCode, aptDatetime;
    
    public Appointment () {
        this.procCode = "";
        this.aptDatetime = "";
    }
    
    public Appointment(String procCode, String aptDateTime){
        this.procCode = procCode;
        this.aptDatetime = aptDateTime;
    }
    
    public void setProcCode(String procCode) {
        this.procCode = procCode;
    }
    
    public void setAptDateTime(String aptDatetime) {
        this.aptDatetime = aptDatetime;
    }
    
    public String getProcCode() {
        return this.procCode;
    }
    
    public String getAptDateTime(){
        return this.aptDatetime;
    }
    
    public void UpdateDentistAppointment(String procCode, String aptDateTime) {
        
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
            
            ps.setString(1, aptDateTime);
            ps.setString(2, procCode);
            
            
            ps.toString();
            
            result = ps.executeUpdate();
            if(result == 0){
                System.out.println("Result:---> " + result);
                System.out.println("Records not updated");
                
            } else{
                setProcCode(procCode);
                setAptDateTime(aptDateTime);
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
