package Problems.ATM.State;

import Problems.ATM.ATM;

public class IdleState extends State {
    @Override
    public void getIdleState(ATM atm) {

        System.out.println("Welcome to the Problems.ATM");
        atm.setStates(new Authenticate());

    }
}
