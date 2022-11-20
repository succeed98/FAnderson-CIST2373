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
public class Patient {
    private String patId, passwd, firstName, lastName, addr, email, insCo;
    
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
            
//            getAccounts();
            
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }
   
    }
    
     private void getAppointment() {
        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/DentistOfficeACCDB.accdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("---> Database connection successfull <---");
            
            Statement statement = conn.createStatement();
            
            String query = "Select * from Appointments left join Procedures on Appointment.procCode = Procedures.procCode where patId='" + getPatId() + "'";
            
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            
            Patient patient;
            String an;
            
            do {
                an = resultSet.getString("AcctNo");
                appointments = new Appointments();
                appointments.selectDB(an);
                aList.addAccount(applointment);
            }while(resultSet.next());
            
            conn.close();
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }
     }
}
