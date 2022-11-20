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
public class Dentist {
        
    private String id, passwd, firstName, lastName, email, office;
    
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
            System.out.println(getLastName());
            conn.close();
            
            
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("---> Database connection not working <---");
        }
   
    }
}
