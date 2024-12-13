package Problems.ATM.State;

import Problems.ATM.ATM;
import Problems.ATM.BankAccount;

public class Authenticate extends State{
    @Override
    public void getAuthenticate(ATM atmMachine, BankAccount accountDetails, int pin) throws Exception {
        if(accountDetails.getPin() != pin) throw new Exception("Your card is incorrect. Please Try again.");
        System.out.println("User Credentails are correct. NOW move to the menu.");
        atmMachine.setStates(new Menu());
    }
}
