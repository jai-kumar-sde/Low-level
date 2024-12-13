package Problems.SplitWise;

import java.util.ArrayList;
import java.util.List;

public class Group {
    public static int counter=0;
    private int groupId;
    private List<UserInstance> users;
    private List<Expense> expenses;

    public Group(List<UserInstance> users) {
        counter++;
        this.groupId = counter;
        this.users = users;
        this.expenses = new ArrayList<>();
    }


    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public UserInstance getUser(int id) {
        return users.get(id);
    }

    public void addUsers(UserInstance user) {
        this.users.add(user);
    }

    public Expense getExpenses(int id) {
        return this.expenses.get(id);
    }

    public void addExpenses(Expense expenses) {
        UserInstance paidUser = expenses.getPaidUser();
        paidUser.getBalanceSheet().updateBalanceSheet(expenses);
//        getUser(paidUser.getUserInstanceId()).setTotalExpense(-expenses.getTotalAmount());
//        for(Split split:expenses.getSplits()){
//            this.getUser(split.getUser().getUserInstanceId()).setTotalExpense(split.getAmount());
//        }
//        this.expenses.add(expenses);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", users=" + users +
                ", expenses=" + expenses +
                '}';
    }
}
