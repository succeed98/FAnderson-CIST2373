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
    
    public void addAccount(Account account){
        accountArray[counter] = account;
        counter++;
    }
    
    public void displayAccountList(){
        for(int singleAccount = 1; singleAccount < counter; singleAccount++){
           accountArray[singleAccount].display();
        }
    }
    
}
