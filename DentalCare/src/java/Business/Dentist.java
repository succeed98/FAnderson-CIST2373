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
import org.hsqldb.jdbc.JDBCConnection;

/**
 *
 * @author muhyideenelias
 */
public class Dentist {
        
    private String id, passwd, firstName, lastName, email, office;
    public ProcedureList procedures = new ProcedureList();
    
    public Dentist(){
        id = "";
        passwd = "";
        firstName = "";
        lastName = "";
        email = "";
        office = "";       
    }
    
    public Dentist(String id, String passwd, String firstName, String lastName, String email, String office ) {
        this.id = id;
        this.passwd = passwd;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.office = office;
    }
    
    // all Dentist getter attributes methods
    
    public String getId(){
        return this.id;
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
    
    public String getOffice(){
        return this.office;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    // all Dentist setter attributes methods
    
    public void setId(String id){
        this.id = id;
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
    
    public void setOffice(String office){
        this.office = office;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void display() {
        System.out.println("Dentist ID: " + this.getId());
        System.out.println("Dentist Password: " + this.getPasswd());
        System.out.println("Dentist First Name: " + this.getFirstName());
        System.out.println("Dentist Last Name: " + this.getLastName());
        System.out.println("Dentist Office: " + this.getOffice());
        System.out.println("Dentist Email: " + this.getEmail());
    }
    
    public void selectDentist(String email){
        System.out.println("--> selectDentist (method) <---");
        setEmail(email);
        
        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/DentistOfficeACCDB.accdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("---> Database connection successfull <---");

            Statement statement = conn.createStatement();
            String query = "SELECT * FROM Dentists WHERE email='" + getEmail() + "'";
            System.out.println("--->" + query + "<---");
            

            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                setId(resultSet.getString("id"));
                setPasswd(resultSet.getString("passwd"));
                setFirstName(resultSet.getString("firstName"));
                setLastName(resultSet.getString("LastName"));
                setOffice(resultSet.getString("office"));
                setEmail(resultSet.getString("email"));
                
            } 
            
            this.getDentistProcedures();
            System.out.println("--> selectDentist was closed <---");
            conn.close();
            
            
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }
   
    }
    
    public void UpdateDentist(String firstName, String lastName, String email, String office) {
        
        System.out.println("--> UpdateDentist (method) <---");
        setEmail(email);
        
        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/DentistOfficeACCDB.accdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("---> Database connection successfull <---");
            
            String UPDATE_QUERY = "UPDATE Dentists SET firstName=?, lastName=?, email=?, office=? WHERE email=?";
            
            PreparedStatement ps = conn.prepareStatement(UPDATE_QUERY);
            
            System.out.println("--->" + UPDATE_QUERY + "<---");
            int result;
            
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, email);
            ps.setString(4, office);
            ps.setString(5, this.getEmail());
            
            ps.toString();
            
            result = ps.executeUpdate();
            if(result == 0) System.out.println("Records not updated");
            else System.out.println("Records updated successfully");
                
            
            setFirstName(firstName);
            setLastName(lastName);
            setOffice(office);
            setEmail(email);
            
            this.display();
           
            System.out.println("--> UpdateDentist was closed <---");
            conn.close();
            
            
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }
   
        
    }
    
    private void getDentistProcedures() {
         System.out.println("---> getDentistProcedures() was called <---");
        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/DentistOfficeACCDB.accdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("---> Database connection successfull <---");
            
            Statement statement = conn.createStatement();
            
            String query = "SELECT * FROM Appointments WHERE dentId='" + getId() + "'";
            System.out.println("--->" + query + "<---");
            
            ResultSet resultSet = statement.executeQuery(query);

            Procedure procedure;
            String an;
            
            while(resultSet.next()) {
                an = resultSet.getString("procCode");
                procedure = new Procedure();
                procedure.selectDentistProcedure(an);
                procedures.addProcedure(procedure);
                procedure.display();
            }
            
            conn.close();
            System.out.println("---> getDentistProcedures was closed <---");
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }
    }
}
