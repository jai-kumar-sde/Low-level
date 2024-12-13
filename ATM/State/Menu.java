package Problems.ATM.State;

import Problems.ATM.ATM;
import Problems.ATM.BankAccount;

public class Menu extends State {
    //@Override
    public void selectOption(ATM atmMachine, BankAccount account, OPTION option) {
        if(option == OPTION.BALANCEENQUERY){
            System.out.println("you have select:" + option );
            atmMachine.setStates(new Balance());
        }
        else if(option == OPTION.CASHWIDHRAWAL){
            System.out.println("you have select:" + option );
            atmMachine.setStates(new CashWithdrawal());
        }
    }
}
