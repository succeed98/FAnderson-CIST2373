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
public class ProcedureList {
    
    public int counter = 0;
    
    public Procedure procedureArray[] = new Procedure[20];
    
    
    public Procedure [] getProcedure () {
        System.out.println("---> getProcedure array was called <---");
        return this.procedureArray;
    }
   
    
    public void addProcedure(Procedure procedure){
        System.out.println("---> addProcedure array was called <----");
        procedureArray[counter] = procedure;
        counter++;
    }
    
    
    
    public void displayProceduresList(){
        System.out.println("displayProcedureList was called");
        for(int singleProcedure = 0; singleProcedure < counter; singleProcedure++){
           procedureArray[singleProcedure].display();
            System.out.println("\n");
        }
        System.out.println("displayProcedureList was closed");
    }
    
    @Override
    public String toString() {
        return "I have a length of: " + counter;
    }
}
