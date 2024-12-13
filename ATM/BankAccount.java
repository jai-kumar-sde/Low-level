package Problems.ATM;

public class BankAccount {
    private String accountNumber;
    private User user;
    private String bankName;
    private double balance;
    private int pin;

    public BankAccount(String accountNumber, User user, String bankName, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.user = user;
        this.bankName = bankName;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", user=" + user +
                ", bankName='" + bankName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
