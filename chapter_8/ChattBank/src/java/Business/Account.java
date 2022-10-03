/*
    Author     : Fareeda Anderson
    Programme  : Java III
    Document   : Custormer
    Created on : 09-Sep-2022, 09:19:06
    I Promise I wrote this code
*/
package Business;

import java.sql.*;


public class Account {
    
    private String acctNo, custId, type, balance;
    
    public Account(){
        acctNo = "";
        custId = "";
        type = "";
        balance = "";
    }
    
    public Account(String acctNo, String custId, String type, String balance){
        this.acctNo = acctNo;
        this.custId = custId;
        this.type = type;
        this.balance = balance; 
    }
    
    
    // Setters and Getters
    public void setAcctNo(String acctNo){
        this.acctNo = acctNo;
    }
    
    public String getAcctNo(){
        return acctNo;
    }
    
    public void setCustId(String custId){
        this.custId = custId;
    }
    
    public String getCustId(){
        return custId;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return type;
    }
    
    public void setBalance(String balance){
        this.balance = balance;
    }
    
    public String getBalance(){
        return balance;
    }
    
    public void display(){
        System.out.println("LOG: In Account.display()");
        System.out.println("Account Number: " + getAcctNo());
        System.out.println("Customer ID: " + getCustId());
        System.out.println("Account Type: " + getType());
        System.out.println("Account Balance: " + getBalance());
    }
    
    public void selectDB(String acctNo){
        setAcctNo(acctNo);

        try {
            System.out.println("\nLOG : In Account.selecctDB");
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/ChattBankMDB.mdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("LOG : Database connection successfull");
            
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM Accounts WHERE AcctNo='" + getAcctNo()+ "'";
            System.out.println("LOG  : " + query);
            
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            
            setCustId(resultSet.getString("Cid"));
            setType(resultSet.getString("Type"));
            setBalance(resultSet.getString("Balance"));
            
            conn.close();

        } 
        catch(ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("LOG : Database connection not working");
        }

    }
    

    public void insertDB(String aNo, String cid, String ty, String bal){
        
        setAcctNo(aNo);
        setCustId(cid);
        setType(ty);
        setBalance(bal);
        
        try{
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/ChattBankMDB.mdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("LOG : Database connection is working");
            
            Statement statement = conn.createStatement();
            String query = "INSERT INTO Accounts VALUES("
                    + "'"+getAcctNo()+"',"+
                    "'"+getCustId()+"',"+
                    "'"+getType()+"',"+
                    "'"+getBalance()+"')";
            
            System.out.println("LOG : " + query);
            
            int querySuccess = statement.executeUpdate(query);
            
            System.out.println("LOG : " + (querySuccess == 1 ? "Insert Successful" :"Insert Failed"));
            
            conn.close();
        }
        catch(ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("LOG : Database connection not working");
        }
    }
    
    
    public void deleteDB(){
        
        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/ChattBankMDB.mdb";
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("Database connection is working");
            
            Statement statement = conn.createStatement();
            String query = "Delete from Accounts where Cid='"+getCustId()+"'";
            System.out.println("LOG : "+ query);
            int querySuccess = statement.executeUpdate(query);
            
            System.out.println("LOG : " + (querySuccess == 1 ? "Delete Successful" :"Delete Failed"));
            
            conn.close();
            
        } 
        catch(ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("LOG : Database connection failed!!");
        }
    }
    
    
}
