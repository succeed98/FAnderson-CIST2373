/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author muhyideenelias
 */
public class Procedure {
    String procCode, procName, procDesc, cost, aptDateTime, patId, dentId, dentistFirstName, dentistLastName, dentistOffice, dentistEmail, patientFirstName, patientLastName, patientEmail;
    
    public Procedure(){
        this.procCode = "";
        this.procName = "";
        this.procDesc = "";
        this.cost = "";
        this.aptDateTime = "";
        this.patId = "";
        this.dentId = "";     
        this.dentistFirstName = "";
        this.dentistLastName = "";
        this.dentistOffice = "";
        this.patientFirstName = "";
        this.patientLastName = "";
        this.patientEmail = "";
        
    }
    
    public Procedure(String procCode, String procName, String procDesc, String cost, String aptDateTime, String patId, String dentId, String dentistFirstName, String dentistLastName, String dentistOffice, String dentistEmail, String patientFirstName, String patientLastName, String patientEmail){
        this.procCode = procCode;
        this.procName = procName;
        this.procDesc = procDesc;
        this.cost = cost;
        this.aptDateTime = aptDateTime;
        this.patId = patId;
        this.dentId = dentId;
        
        // for dentist
        this.dentistFirstName = dentistFirstName;
        this.dentistLastName = dentistLastName;
        this.dentistOffice = dentistOffice;
        this.dentistEmail = dentistEmail;
        
        // for patient
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.patientEmail = patientEmail;
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
        this.patId = patId;
    }
    
    public void setDentId(String dentId){
        this.dentId = dentId;
    }
    
    // set dentist info
    public void setDentistFirstName(String dentistFirstName){
        this.dentistFirstName = dentistFirstName;
    }
    
    public void setDentistLastName(String dentistLastName){
        this.dentistLastName = dentistLastName;
    }
    
    public void setDentistOffice(String dentistOffice){
        this.dentistOffice = dentistOffice;
    }
    
    public void setDentistEmail(String dentistEmail){
        this.dentistEmail = dentistEmail;
    }
    
    // set patient info
    public void setPatientFirstName(String patientFirstName){
        this.patientFirstName = patientFirstName;
    }
    
    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }
    
    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }
    
    
    // Getters
    
    public String getProcCode(){
        return this.procCode;       
    }
    
    public String getProcName(){
        return this.procName;
    }
    
    public String getAptDateTime(){
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
    
    // Dentist info
    public String getDentistFirstName(){
        return this.dentistFirstName;
    }
    
    public String getDentistLastName(){
        return this.dentistLastName;
    }
    
    public String getDentistOffice(){
        return this.dentistOffice;
    }
    
     public String getDentistEmail(){
        return this.dentistEmail;
    }
    
    // patient info
    public String getPatientFirstName(){
        return this.patientFirstName;
    }
    
    public String getPatientLastName(){
        return this.patientLastName;
    }
    
    public String getPatientEmail(){
        return this.patientEmail;
    }
    
    
    public void display() {
        System.out.println("--->Start of Appointment Display Method <---");
        System.out.println("Patient ID: " + this.getPatId());
        System.out.println("Dentist ID: " + this.getDentId());
        System.out.println("Procedure Code: " + this.getProcCode());
        System.out.println("Procedure Name: " + this.getProcName());
        System.out.println("Procedure Description: " + this.getProcDesc());
        System.out.println("Procedure Cost: " +  this.getCost());
        System.out.println("Appointment Time: " + this.getAptDateTime());
        
        // Dentist Info
        System.out.println("Dentist First Name: " + this.getDentistFirstName());
        System.out.println("Dentist Last Name: " + this.getDentistLastName());
        System.out.println("Dentist office: " + this.getDentistOffice());
        
        // Patient info
        System.out.println("Patient First Name: " + this.getPatientFirstName());
        System.out.println("Patient Last Name: " + this.getPatientLastName());
        System.out.println("Patient Email: " + this.getPatientEmail());
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
            
            String query = "SELECT * FROM Procedures JOIN Appointments ON Procedures.procCode = Appointments.procCode JOIN Dentists ON Appointments.dentId = Dentists.id WHERE procCode='" + this.getProcCode()+ "'";
            System.out.println("--->" + query + "<---");
            
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
           
           setPatId(resultSet.getString("patId"));
           setDentId(resultSet.getString("dentId"));
           setProcName(resultSet.getString("procName"));
           setProcDesc(resultSet.getString("procDesc"));
           setCost(resultSet.getString("cost"));
           setAptDatetime(resultSet.getString("apptDateTime"));
           setDentistFirstName(resultSet.getString("firstName"));
           setDentistLastName(resultSet.getString("lastName"));
           setDentistOffice(resultSet.getString("office"));
           setDentistEmail(resultSet.getString("email"));
            
           
            
            
            conn.close();
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }
     
    }
    
    public  void selectDentistProcedure(String procCode) {
        System.out.println("---> selectDentistProcedure was called <---");

        this.setProcCode(procCode);
        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/DentistOfficeACCDB.accdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("---> Database connection successfull <---");
            
            Statement statement = conn.createStatement();
            
            String query = "SELECT * FROM Procedures JOIN Appointments ON Procedures.procCode = Appointments.procCode JOIN Patients ON Appointments.patId = Patients.patId WHERE procCode='" + this.getProcCode()+ "'";
            System.out.println("--->" + query + "<---");
            
            ResultSet resultSet = statement.executeQuery(query);
            
           
           while(resultSet.next()){
               setPatId(resultSet.getString("patId"));
               setDentId(resultSet.getString("dentId"));
               setProcName(resultSet.getString("procName"));
               setProcDesc(resultSet.getString("procDesc"));
               setCost(resultSet.getString("cost"));
               setAptDatetime(resultSet.getString("apptDateTime"));
               setPatientFirstName(resultSet.getString("firstName"));
               setPatientLastName(resultSet.getString("lastName"));
               setPatientEmail(resultSet.getString("email"));
           }
            
           
           System.out.println("---> selectDentistProcedure was closed <---");

            conn.close();
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }
     
    }
    
    
    public void insertProcedure(String procCode, String procName, String procDesc, String cost){
        System.out.println("--> insertProcedure was called <---");
         try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/DentistOfficeACCDB.accdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("---> Database connection successfull <---");
            
            String UPDATE_QUERY = "INSERT INTO Procedures (procCode, procName, procDesc, cost) VALUES(?, ?, ?, ?)";
            
            PreparedStatement ps = conn.prepareStatement(UPDATE_QUERY);
            
            System.out.println("--->" + UPDATE_QUERY + "<---");
            int result;
            
            ps.setString(1, procCode);
            ps.setString(2, procName);
            ps.setString(3, procDesc);
            ps.setString(4, cost);
            
            
            ps.toString();
            
            result = ps.executeUpdate();
            if(result == 0){
                System.out.println("Result:---> " + result);
                System.out.println("Records not updated");
                
            } else{
                
                System.out.println("Records updated successfully");
                
            }
            
            
            
           
            System.out.println("--> insertProcedure was closed <---");
            conn.close();
            
            
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }

    }
    
}
