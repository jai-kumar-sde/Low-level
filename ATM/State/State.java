package Problems.ATM.State;

import Problems.ATM.ATM;
import Problems.ATM.BankAccount;
import Problems.ATM.AtmCard;
public abstract class State {
    public void getIdleState(ATM atm){}
    public void getAuthenticate(ATM atmMachine, BankAccount accountDetails, int pin ) throws Exception {}
    public void selectOption(ATM atmMachine, BankAccount account, OPTION option){}
    public void getBalance(ATM atm, AtmCard carddetails){}
    public void cashWithdrawal(ATM atmMachine, BankAccount account, double amount) throws Exception {}
   // public void depositeCash(BankAccount acccount);
}
