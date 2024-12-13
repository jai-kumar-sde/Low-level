package Problems.SplitWise;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;

public class BalanceSheet {
    //"Owe" is used to describe a debt or favor that is pending to be returned.
    // "Lend" is the action of giving something to someone for a limited time
    private double totoalPayment;
    private double totalExpense;
    private double lentExpense;
    private double oweExpense;

    private HashMap<UserInstance,Balance> users;

    public BalanceSheet() {
        this.totoalPayment=0;
        this.totalExpense = 0;
        this.lentExpense = 0;
        this.oweExpense = 0;
        this.users = new HashMap<>();
    }


    @Override
    public String toString() {
        return "BalanceSheet{" +
                "totalExpense=" + totalExpense +
                ", lentExpense=" + lentExpense +
                ", oweExpense=" + oweExpense +
               // ", Users= " + users+
                '}';
    }


    public void updateBalanceSheet(Expense expense){
        UserInstance paidUser = expense.getPaidUser();
        //setTotoalPayment(paidUser.getBalanceSheet().getTotoalPayment()+expense.getTotalAmount());
        this.totoalPayment+=expense.getTotalAmount();
        //this.totalExpense+=expense.getTotalAmount();
        this.lentExpense+=expense.getTotalAmount();
//        for(UserInstance user:getUsers().keySet()){
//            user.getBalanceSheet().setOweExpense();
//        }
        // updating the balance sheet of paid lent User
        for(Split split:expense.getSplits()){
            // updating the balance sheet of paid lent User
            UserInstance oweUser = split.getUser();
            Double amount= split.getAmount();
            Balance balance = this.getUserValue(oweUser);
            balance.setOwe(balance.getOwe()+amount);
            //.setOwe(getUserValue(oweUser).getOwe()+amount);

            // update paid user balance in others user
            Balance paidBalance= oweUser.getBalanceSheet().getUserValue(paidUser);
            paidBalance.setLent(paidBalance.getLent() + amount);
            oweUser.getBalanceSheet().addUser(paidUser,paidBalance);
           // .setLent(oweUser.getBalanceSheet().getUserValue(paidUser).getLent()+amount);

            //update the friends user data
            oweUser.getBalanceSheet().totoalPayment+=split.getAmount();
            oweUser.getBalanceSheet().totalExpense+=split.getAmount();
            oweUser.getBalanceSheet().oweExpense+=split.getAmount();
            this.addUser(oweUser,balance);
            // updating the balance of owe user
          //  oweUser.getBalanceSheet().setTotalExpense(oweUser.getTotalExpense()+ split.getAmount());
          //  oweUser.getBalanceSheet().setOweExpense(oweUser.getTotalExpense()+ split.getAmount());

        }



    }


    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public double getLentExpense() {
        return lentExpense;
    }

    public void setLentExpense(double lentExpense) {
        this.lentExpense = lentExpense;
    }

    public double getOweExpense() {
        return oweExpense;
    }

    public void setOweExpense(double oweExpense) {
        this.oweExpense = oweExpense;
    }

    public Balance getUserValue(UserInstance user) {
        return this.users.getOrDefault(user,new Balance(0,0));
    }

    public HashMap<UserInstance, Balance> getUsers() {
        return users;
    }

    public void addUser(UserInstance user,Balance balance) {
        this.users.put(user,balance);
    }

    public double getTotoalPayment() {
        return totoalPayment;
    }

    public void setTotoalPayment(double totoalPayment) {
        this.totoalPayment = totoalPayment;
    }
}
