/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author muhyideenelias
 */
public class AppointmentList {
    public int counter;
    public Patient appointmentArray[] = new Patient[20];
    
    public Patient [] getAppoint () {
        System.out.println("\nLOG: AccountLIst array member called!");
        return this.appointmentArray;
    }
    
    public void addAppointment(Patient account){
        System.out.println("\nLOG: Called AccountList addAccount");
        appointmentArray[counter] = account;
        counter++;
    }
    
//    public void displayAccountList(){
//        for(int singleAppointment = 0; singleAccount < counter; singleAccount++){
//           appointmenttArray[singleAppointment].display();
//            System.out.println("\n");
//        }
//    }
    
    @Override
    public String toString() {
        return "I have a length of: " + counter;
    }
}
