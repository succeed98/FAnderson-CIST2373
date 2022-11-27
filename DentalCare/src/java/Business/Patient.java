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
public class Patient {
    private String patId, passwd, firstName, lastName, addr, email, insCo;
    public ProcedureList procedures = new ProcedureList();
    
    public Patient(){
        patId = "";
        passwd = "";
        firstName = "";
        lastName = "";
        addr = "";
        email = "";
        insCo = "";       
    }
    
    public Patient(String patId, String passwd, String firstName, String lastName, String addr, String email, String insCo ) {
        this.patId = patId;
        this.passwd = passwd;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addr = addr;
        this.email = email;
        this.insCo = insCo;
    }
    
    // all patients attributes getter methods
    
    public String getPatId(){
        return this.patId;
    }
    
    public String getPasswd(){
        return this.passwd;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getAddr(){
        return this.addr;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getInsCo(){
        return this.insCo;
    }
    
    
    // all patients setter attributes methods
    
    public void setPatId(String patId){
        this.patId = patId;
    }
    
    public void setPasswd(String passwd){
        this.passwd = passwd;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setAddr(String addr){
        this.addr = addr;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setInsCo(String insCo){
        this.insCo = insCo;
    }
    
    public void display() {
        System.out.println("Patient ID: " + getPatId());
        System.out.println("Patient Password: " + getPasswd());
        System.out.println("Patient First Name: " + getFirstName());
        System.out.println("Patient Last Name: " + getLastName());
        System.out.println("Patient Address: " + getAddr());
        System.out.println("Patient Email: " + getEmail());
        System.out.println("Patient Insurance Company: " + getInsCo());

//        aList.displayAccountList();
    }
    
    public void selectPatient(String email){
        System.out.println("--> selectPatient (method) <---");
        setEmail(email);
        
        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/DentistOfficeACCDB.accdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("---> Database connection successfull <---");

            Statement statement = conn.createStatement();
            String query = "SELECT * FROM Patients WHERE email='" + getEmail() + "'";
            System.out.println("--->" + query + "<---");
            

            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                setPatId(resultSet.getString("patId"));
                setPasswd(resultSet.getString("passwd"));
                setFirstName(resultSet.getString("firstName"));
                setLastName(resultSet.getString("LastName"));
                setAddr(resultSet.getString("addr"));
                setEmail(resultSet.getString("email"));
                setInsCo(resultSet.getString("insCo"));
                
            } 
            System.out.println(getLastName());
            conn.close();
            System.out.println("---> Exiting selectPatient <---");
            this.getPatientProcdures();
            this.procedures.displayProceduresList();
            
            
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }
   
    }
    
    
    public void UpdatePatient(String patId, String firstName, String lastName, String email, String address, String insCo ) {
        
        System.out.println("--> UpdatePatient was called <---");
        
        
        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/DentistOfficeACCDB.accdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("---> Database connection successfull <---");
            
            String UPDATE_QUERY = "UPDATE Patients SET firstName=?, lastName=?, addr=?, email=?, insCo=? WHERE patId=?";
            
            PreparedStatement ps = conn.prepareStatement(UPDATE_QUERY);
            
            System.out.println("--->" + UPDATE_QUERY + "<---");
            int result;
            
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, address);
            ps.setString(4, email);
            ps.setString(5, insCo);
            ps.setString(6, patId);
            
            ps.toString();
            
            result = ps.executeUpdate();
            if(result == 0){
                System.out.println("Result:---> " + result);
                System.out.println("Records not updated");
                
            } else System.out.println("Records updated successfully");
                
            setPatId(patId);
            setFirstName(firstName);
            setLastName(lastName);
            setAddr(address);
            setInsCo(insCo);
            setEmail(email);
            
            this.display();
           
            System.out.println("--> UpdatePatient was closed <---");
            conn.close();
            
            
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }
   
        
    }
    
    
     private void getPatientProcdures() {
         System.out.println("---> getPatientProcedures() was called <---");
        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/DentistOfficeACCDB.accdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("---> Database connection successfull <---");
            
            Statement statement = conn.createStatement();
            
            String query = "SELECT * FROM Appointments WHERE patId='" + getPatId() + "'";
            System.out.println("--->" + query + "<---");
            
            ResultSet resultSet = statement.executeQuery(query);
            

            Procedure procedure;
            String an;
            
            while(resultSet.next()) {
                an = resultSet.getString("procCode");
                procedure = new Procedure();
                procedure.selectPatientProcedure(an);
                procedures.addProcedure(procedure);
            }
            
            conn.close();
            System.out.println("---> getPatientProcdures was closed <---");
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }
     }
}
