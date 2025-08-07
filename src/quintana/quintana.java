
package quintana;

import java.util.Scanner;


public class quintana {
    private int accountNum;
    private float initialBalance;
    private int pin;

    public void setAccountNo(int accountNo) {
        this.accountNum = accountNo;
    }

    public int getAccountNo() {
        return accountNum;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
    
    
   
    
    
    
    
    
    
    
    public boolean verifyAccount(int acc, int pn){
        
            if(acc == accountNum && pn == pin){
                return true;
            }else{
                return false;
            }
    }
    
    public int setAccount(){
        return accountNum;
    }
    
    public void viewBalance(){
    
    
    }
    
    
    
}
    
