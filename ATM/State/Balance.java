package Problems.ATM.State;

import Problems.ATM.ATM;
import Problems.ATM.AtmCard;

public class Balance extends State{
    @Override
    public void getBalance(ATM atm, AtmCard carddetails) {
        System.out.println(carddetails.getAccount().getBalance());
        atm.setStates(new IdleState());
    }
}
