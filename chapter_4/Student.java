/********************************************
 *  Ron Enz
 *  Student Business Object Example
 ********************************************/
package Business;
import java.sql.*;
public class Student {
		private int id;
		private String fname;
		private String lname;
		private String email;
		private double gpa;
		
		public Student() {
			id=0;
			fname="";
			lname="";
			email="";
			gpa=0.0;
		}
		
		public Student(int i, String fn, String ln, String em, double g) {
			id=i;
			fname=fn;
			lname=ln;
			email=em;
			gpa=g;
		}
		
		public void selectDB(int i) {
                        id=i;
			try {    //Load DB Driver
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            			Connection c1 = DriverManager.getConnection("jdbc:ucanaccess://" + 
                			"C://Users//renz//Documents//CIST 2373//ChattBankMDB.mdb");

				     //Execute SQL Statement
				Statement stmt = c1.createStatement();
				ResultSet rs = stmt.executeQuery("Select * from Students where ID = " + i);
				
				     //Process ResultSet
				rs.next();
				fname = rs.getString(2);
				lname = rs.getString(3);
				email = rs.getString(8);
				gpa = rs.getFloat(9);
				c1.close();
			}
			catch(Exception se) {
				System.out.println(se);
			}
		} //end selectDB()
		
		public int getId() { return id; }
		public void setId(int i) { id=i; }
		
		public String getFname() { return fname; }
		public void setFname(String fn) { fname=fn; }
		
		public String getLname() { return lname; }
		public void setLname(String ln) { lname=ln; }

		public String getEmail() { return email; }
		public void setEmail(String em) { email=em; }
		
		public double getGpa() { return gpa; }
		public void setGpa(double g) { gpa=g; }
		
		public void display() {
			System.out.println("ID             =   "+ id);
			System.out.println("Firat Name     =   "+ fname);
			System.out.println("Last Name      =   "+ lname);
			System.out.println("EMail Address  =   "+ email);
			System.out.println("GPA            =   "+ gpa);
		}
		
		public static void main(String args[]) {
			Student s1;
			s1 = new Student();
			s1.selectDB(5);
			s1.display();
		
		}

}