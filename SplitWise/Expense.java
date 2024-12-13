package Problems.SplitWise;

import java.util.List;

public class Expense {
    public static int counter =0;
    private int expenseId;
    private UserInstance paidUser;
    private List<Split> splits;
    private double totalAmount;
    private String Description;


    public Expense(UserInstance paidUser, List<Split> splits, double totalAmount, String description) {
        this.expenseId = counter++;
        this.paidUser = paidUser;
        this.splits = splits;
        this.totalAmount = totalAmount;
        Description = description;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public UserInstance getPaidUser() {
        return paidUser;
    }

    public void setPaidUser(UserInstance paidUser) {
        this.paidUser = paidUser;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

//    @Override
//    public String toString() {
//        return "Expense{" +
//                "expenseId=" + expenseId +
//                ", paidUser=" + paidUser +
//                ", splits=" + splits +
//                ", totalAmount=" + totalAmount +
//                ", Description='" + Description + '\'' +
//                '}';
//    }
}
