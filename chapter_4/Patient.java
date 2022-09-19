package Business;
 
import java.sql.*;
/*****************************************************************************
  Ron Enz
  Procedure Class
  
 *****************************************************************************/
public class Patient extends Person{
    // ======================  Properties  =============================
    private String pid, ppw;
    private String addr, insco;
    
    
    // ======================== Constructors ============================
    public Patient() {
        super();
        pid="";
        ppw="";
        addr="";
        insco="";
    }
    public Patient(String id, String pw, String fn, String ln, String em, String ad, String ins) {
        super(fn, ln, em);
        pid=id;
        ppw=pw;
        addr=ad;
        insco=ins;
        
    }
    
    // ==================================  Behaviors ===============================
     
    
    public void setPid(String id){pid=id;}
    public String getPid() {return pid; }
    
    public void setPpw(String pw){ppw=pw;}
    public String getPpw() {return ppw; }
    
    public void setAddr(String ad){addr=ad;}
    public String getAddr() {return addr; }
    
    public void setInsCo(String ic){insco=ic;}
    public String getInsCo() {return insco; }
    
    public void display() {
        System.out.println("Patient ID                = "+getPid());
        System.out.println("Patient PW                = "+getPpw());
        super.display();
        System.out.println("Patient Addr              = "+getAddr());
        System.out.println("Patient Ins Co            = "+getInsCo());
        System.out.println("=============================");
        appt.display();
       
         
    }
    
    
    // ++++++++++ DB Behaviors +++++++++++++
    public void selectDB(String id){
        pid = id;
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + 
                "C://Users//renz//Documents//CIST 2373//ChattBankMDB.mdb");
            
            Statement stmt = con1.createStatement();
            String sql = "Select * from Patients where patid='"+getPid()+"'";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            setPpw(rs.getString(2));
            setFname(rs.getString(3));
            setLname(rs.getString(4));
            setAddr(rs.getString(5));
            setEmail(rs.getString(6));
            setInsCo(rs.getString(7));
             
            
            
        }
        catch(Exception e){
            System.out.println(e);
        }
      
    }//end selectDB()
    
    public void insertDB(String id, String pw, String fn, String ln, String em, String ad, String ins){
        
        setFname(fn);
        setLname(ln);
        setEmail(em);
        pid=id;
        ppw=pw;
        addr=ad;
        insco=ins;
       
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + 
                "C://Users//renz//Documents//CIST 2373//ChattBankMDB.mdb");
            
            Statement stmt = con1.createStatement();
            String sql = "Insert into Patients values('"+getPid()+"',"+
                                                      "'"+getPpw()+"',"+ 
                                                      "'"+getFname()+"',"+ 
                                                      "'"+getLname()+"',"+ 
                                                      "'"+getAddr()+"',"+ 
                                                      "'"+getEmail()+"',"+ 
                                                      "'"+getInsCo()+"')"; 
            System.out.println(sql);
            int n1 = stmt.executeUpdate(sql);
            if (n1==1)
                System.out.println("INSERT Successful!!!");
            else
                System.out.println("INSERT FAILED***********");
            con1.close();
        }
        catch(Exception e1){
            System.out.println(e1);
        }
      
    }//end insertDB()
    
    public void updateDB(){
         
       
        try{
           Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + 
                "C://Users//renz//Documents//CIST 2373//ChattBankMDB.mdb");
            Connection con1 = DriverManager.getConnection("jdbc:odbc:DentDB");
            
            Statement stmt = con1.createStatement();
            String sql = "update Patients set passwd = '"+getPpw() + "',"+ 
                                            " firstName ='"+getFname()+"',"+
                                            " lastName = '"+getLname() +"',"+
                                            " addr ='"+getAddr()+"',"+
                                            " email = '"+getEmail() +"',"+
                                            " insCo ='"+getInsCo()+"' "+
                                            " where patId='"+getPid()+"'";
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);
            if (n==1)
                System.out.println("UPDATE Successful!!!");
            else
                System.out.println("UPDATE FAILED***********");
            con1.close();
        }
        catch(Exception e1){
            System.out.println(e1);
        }
      
    }//end updateDB()
    
    public void deleteDB(){
         
       
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + 
                "C://Users//renz//Documents//CIST 2373//ChattBankMDB.mdb");
            
            Statement stmt = con1.createStatement();
            String sql = "Delete from Patients where patid='"+getPid()+"'";
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);
            if (n==1)
                System.out.println("DELETE Successful!!!");
            else
                System.out.println("DELETE FAILED***********");
            con1.close();
        }
        catch(Exception e1){
            System.out.println(e1);
        }
      
    }//end deleteDB()
    
    
    
    public static void main(String args[]) {
         
        // Test SELECT
        Patient p1 = new Patient();
        p1.selectDB("A902");
        p1.display();
         
		// Test DELETE
        Patient p2 = new Patient();
        p2.selectDB("A902");
		p2.delectDB();  //"A902" is now removed from the database
        
		
		// Test INSERT
        Patient p3 = new Patient();
        p3.insertDB("A999", "9999", "Bill", "Clinton", "bc@yahoo.com", "1313 Mockingbird Lane", "Cigna");
             // "A999" is now inserted into the Patient table
		
		// Test Update
        Patient p4 = new Patient();
        p4.selectDB("A902");
		p4.setLastName("Smith");
		p4.setInsCo("Aetna");
		p4.upsdateDB();      //data in database has now been updated, just the 2 items changes above
        p4.display();
         
    }//end main
}
