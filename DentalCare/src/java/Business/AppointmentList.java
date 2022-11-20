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
    public int dentistCounter;
    public int patientCounter;
    
    public Patient patientAppointmentArray[] = new Patient[20];
    public Dentist dentistAppointmentArray[] = new Dentist[20];
    
    public Patient [] getPatientAppointment () {
        System.out.println("---> patient appointment array member called <---");
        return this.patientAppointmentArray;
    }
    
    public Dentist [] getDentistAppointment () {
        System.out.println("---> Dentist appointment array member called <---");
        return this.dentistAppointmentArray;
    }
    
    public void addPatientAppointment(Patient appointment){
        System.out.println("---> Add patient appointment to the patient array <----");
        patientAppointmentArray[patientCounter] = appointment;
        patientCounter++;
    }
    
     public void addDentistAppointment(Dentist appointment){
        System.out.println("---> Add dentist appointment to the patient array <----");
        dentistAppointmentArray[dentistCounter] = appointment;
        dentistCounter++;
    }
    
//    public void displayAccountList(){
//        for(int singleAppointment = 0; singleAccount < counter; singleAccount++){
//           appointmenttArray[singleAppointment].display();
//            System.out.println("\n");
//        }
//    }
    
//    @Override
//    public String toString() {
//        return "I have a length of: " + counter;
//    }
}
