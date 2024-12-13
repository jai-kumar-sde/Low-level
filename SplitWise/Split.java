package Problems.SplitWise;

public class Split {
    private UserInstance user;
    private double amount;

    public Split(UserInstance user, double amount) {
        this.user = user;
        this.amount = amount;
    }

    public UserInstance getUser() {
        return user;
    }

    public void setUser(UserInstance user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

//    @Override
//    public String toString() {
//        return "Split{" +
//                "user=" + user +
//                ", amount=" + amount +
//                '}';
//    }
}
