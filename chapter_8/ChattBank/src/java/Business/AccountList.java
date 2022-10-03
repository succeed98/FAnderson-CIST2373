/*
    Author     : Fareeda Anderson
    Programme  : Java III
    Document   : Custormer
    Created on : 09-Sep-2022, 10:01:02
    I Promise I wrote this code
*/
package Business;


public class AccountList {
    public int counter;
    public Account accountArray[] = new Account[10];
    
    
    public Account [] getAccountArray () {
        System.out.println("\nLOG: AccountLIst array member called!");
        return this.accountArray;
    }
    
    public void addAccount(Account account){
        System.out.println("\nLOG: Called AccountList addAccount");
        accountArray[counter] = account;
        counter++;
    }
    
    public void displayAccountList(){
        for(int singleAccount = 0; singleAccount < counter; singleAccount++){
           accountArray[singleAccount].display();
            System.out.println("\n");
        }
    }
    
    @Override
    public String toString() {
        return "I have a length of: " + counter;
    }
    
}
