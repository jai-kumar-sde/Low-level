package Problems.ATM;

import Problems.ATM.State.IdleState;
import Problems.ATM.State.OPTION;
import Problems.ATM.State.State;

public class ATM {
    private State states;
    private CashDispenser cashDispenser;
    private CardReader cardReader;

    public ATM(State states, CashDispenser cashDispenser) {
        this.states = states;
        this.cashDispenser = cashDispenser;
    }

    public void setStates(State states) {
        this.states = states;
    }

    public State getState() {
        return states;
    }

    public CashDispenser getCashDispenser() {
        return cashDispenser;
    }

    public CardReader getCardReader() {
        return cardReader;
    }

    public static void main(String[] args) {
        User user1= new User("Rahul");
        BankAccount bankAccount = new BankAccount("123456",user1,"SBI",60000,123);
        AtmCard card = new AtmCard(bankAccount,"987654321");

        CashDispenser cashDispenser= new CashDispenser(10,10,10);
        State idleState = new IdleState();
        ATM atmMachine = new ATM(idleState,cashDispenser);
        try {
            atmMachine.getState().getIdleState(atmMachine);
            atmMachine.getState().getAuthenticate(atmMachine, bankAccount, 123);
            //atmMachine.getState().selectOption(atmMachine,bankAccount, OPTION.BALANCEENQUERY);
            //atmMachine.getState().getBalance(atmMachine,card);
            atmMachine.getState().selectOption(atmMachine,bankAccount, OPTION.CASHWIDHRAWAL);
            atmMachine.getState().cashWithdrawal(atmMachine,bankAccount,10600);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
