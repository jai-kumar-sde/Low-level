package Problems.ATM;

public class AtmCard {
    private BankAccount account;
    private String cardNumber;

    public AtmCard(BankAccount account, String cardNumber) {
        this.account = account;
        this.cardNumber = cardNumber;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Card{" +
                "account=" + account +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
