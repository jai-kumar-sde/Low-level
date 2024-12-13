package Problems.ATM.State;

import Problems.ATM.ATM;
import Problems.ATM.BankAccount;

public class CashWithdrawal extends State {
    @Override
    public void cashWithdrawal(ATM atmMachine, BankAccount account, double amount) throws Exception {
        if(account.getBalance()<amount) throw new Exception("Account have insufficient balance.");
        System.out.println(atmMachine.getCashDispenser().withdrawCash((int)amount));
    }
}
