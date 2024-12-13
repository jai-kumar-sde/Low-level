package Problems.SplitWise;


public class UserInstance   {
    public static int counter = 0;
    private int userInstanceId;
    private User user;
    private int totalExpense;
    private BalanceSheet balanceSheet;

    public UserInstance(User user) {
        this.userInstanceId = counter++;
        this.user=user;
        this.totalExpense = 0;
        this.balanceSheet= new BalanceSheet();
    }

    public int getUserInstanceId() {
        return userInstanceId;
    }

    public void setUserInstanceId(int userInstanceId) {
        this.userInstanceId = userInstanceId;
    }

    public int getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(Expense totalExpense) {
       // this.totalExpense+=totalExpense;
        this.getBalanceSheet().updateBalanceSheet(totalExpense);
    }

    public BalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    public void setBalanceSheet(BalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        UserInstance.counter = counter;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setTotalExpense(int totalExpense) {
        this.totalExpense = totalExpense;
    }

    @Override
    public String toString() {
        return "UserInstance{" +
                "userInstanceId=" + userInstanceId +
                ", user=" + user +
                ", totalExpense=" + totalExpense +
                "---------------BalanceSheet-------------- "+
                balanceSheet+
                '}';
    }
}
