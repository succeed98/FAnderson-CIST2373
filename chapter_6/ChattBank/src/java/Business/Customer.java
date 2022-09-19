/*
    Author     : Fareeda Anderson
    Programme  : Java III
    Document   : Custormer
    Created on : 11-Sep-2022, 08:38:05
    I Promise I wrote this code
 */
package Business;

import java.sql.*;

public class Customer {

    // class member variables
    private String custId, custPassword, custFirstName, custLastName,
            custAddress, custEmail;

    public AccountList aList = new AccountList();

    // Default constructor
    public Customer() {

        custId = "";
        custPassword = "";
        custFirstName = "";
        custLastName = "";
        custAddress = "";
        custEmail = "";
    }

    // Overloaded constructor with 6 args
    public Customer(String custId, String custPassword,
            String custFirstName, String custLastName,
            String custAddress, String custEmail) {

        this.custId = custId;
        this.custPassword = custPassword;
        this.custFirstName = custFirstName;
        this.custLastName = custLastName;
        this.custAddress = custAddress;
        this.custEmail = custEmail;
    }

    // ++++ Setters and Getters +++++
    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustId() {
        return custId;
    }

    //custPassword
    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }

    public String getCustPassword() {
        return custPassword;
    }

    //custFirstName
    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    //custLastName
    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    // custAddress
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustAddress() {
        return custAddress;
    }

    // custEmail
    public void setCustEmail(String custEmail) {
        this.custAddress = custEmail;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void display() {
        System.out.println("Customer ID = " + getCustId());
        System.out.println("Customer Password = " + getCustPassword());
        System.out.println("Customer First Name = " + getCustFirstName());
        System.out.println("Customer Last Name = " + getCustLastName());
        System.out.println("Customer Address = " + getCustAddress());
        System.out.println("Customer Email = " + getCustEmail());

        aList.displayAccountList();
    }

    // ++++++ class member functions +++++++
    public void selectDB(String customerId) {
        setCustId(customerId);

        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/ChattBankMDB.mdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("Database connection successfull");

            Statement statement = conn.createStatement();
            String query = "SELECT * FROM Customers WHERE CustID='" + getCustId() + "'";
            System.out.println("LOG : " + query);

            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();

            setCustPassword(resultSet.getString("CustPassword"));
            setCustFirstName(resultSet.getString("CustFirstName"));
            setCustLastName(resultSet.getString("CustLastName"));
            setCustAddress(resultSet.getString("CustAdress"));
            setCustEmail(resultSet.getString("CustEmail"));

            conn.close();
            
            getAccounts();
            
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("LOG : Database connection not working");
        }

    }

    public void insertDB(String custId, String custPassword, String custFirstName,
            String custLastName, String custAddress, String custEmail) {

        setCustId(custId);
        setCustPassword(custPassword);
        setCustFirstName(custFirstName);
        setCustLastName(custLastName);
        setCustAddress(custAddress);
        setCustEmail(custEmail);

        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/ChattBankMDB.mdb";

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("Database connection is working");

            Statement statement = conn.createStatement();
            String query = "INSERT INTO Customers VALUES('" + getCustId() + "',"
                    + "'" + getCustPassword() + "',"
                    + "'" + getCustFirstName() + "',"
                    + "'" + getCustLastName() + "',"
                    + "'" + getCustAddress() + "',"
                    + "'" + getCustEmail() + "')";

            System.out.println("LOG : " + query);

            int querySuccess = statement.executeUpdate(query);

            System.out.println("LOG : " + (querySuccess == 1 ? "Insert Successful" : "Insert Failed"));

            conn.close();
        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("LOG : Database connection not working");
        }
    }

    public void deleteDB() {

        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/ChattBankMDB.mdb";
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("LOG : Database connection is working");

            Statement statement = conn.createStatement();
            String query = "Delete from Customers where CustID='" + getCustId() + "'";
            System.out.println("LOG : " + query);
            int querySuccess = statement.executeUpdate(query);

            System.out.println("LOG : " + (querySuccess == 1 ? "Delete Successful" : "Delete Failed"));

            conn.close();

        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("LOG : Database connection failed!!");
        }
    }

    private void getAccounts() {
        try {
            String connURL = "jdbc:ucanaccess:///Users/muhyideenelias/Documents/fareeda/project_configs/database/ChattBankMDB.mdb";
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(connURL);
            System.out.println("Database connection is working");

            Statement statement = conn.createStatement();
            String query = "Select acctNo from Accounts where Cid='" + getCustId() + "'";
            System.out.println("LOG : " + query);
            
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            
            Account a1;
            String an;
            
            while (resultSet.next()) {
                an = resultSet.getString(1);
                a1 = new Account();
                aList.addAccount(a1);
            }

            conn.close();

        } catch (ClassNotFoundException | SQLException sqlExcptn) {
            System.out.println(sqlExcptn);
            System.out.println("LOG : Database connection failed!!");
        }
    }

}
