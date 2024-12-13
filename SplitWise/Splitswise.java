package Problems.SplitWise;

import java.util.ArrayList;
import java.util.Arrays;

public class Splitswise {
    public GroupController groupContext;

    public Splitswise(GroupController groupContext) {
        this.groupContext = groupContext;
    }

//    public void start(){
//        createUsers();
//        createExpenses();
//        createGroups();
//        showBalance();
//    }
//
//    private void createUsers() {
//
//    }
public void getbalaceSheet(UserInstance user){
    System.out.println(String.format("Balance sheet of %s (user_id: %s)", user.getUser().getName(), user.getUser().getEmail()));
    BalanceSheet balanceSheet = user.getBalanceSheet();
    System.out.println(String.format("total payment: %f", balanceSheet.getTotoalPayment()));
    System.out.println(String.format("total expense: %f", balanceSheet.getTotalExpense()));
    System.out.println(String.format("lend amount: %f", balanceSheet.getLentExpense()));
    System.out.println(String.format("owe amount: %f", balanceSheet.getOweExpense()));

    for (UserInstance u : balanceSheet.getUsers().keySet()) {
        Balance balance = balanceSheet.getUsers().get(u);
        System.out.println(String.format("%s (id: %s) will give back %f and you owe %f", u.getUser().getName(), u.getUserInstanceId(), balance.getOwe(), balance.getLent()));
    }
   // System.out.println("-".repeat(50));
}
    public static void main(String[] args) {
        User user1= new User("Rahul","Rahul@gmail.com");
        User user2= new User("Sham","Sham@gmail.com");
        User user3= new User("David","David@gmail.com");
        User user4= new User("Rohit","Rohit@gmail.com");
        User user5= new User("Virat","Virat@gmail.com");

       // BalanceSheet sheet1 = new BalanceSheet(1)

        UserInstance userInstance1= new UserInstance(user1);
        UserInstance userInstance2= new UserInstance(user2);
        UserInstance userInstance3= new UserInstance(user3);
        UserInstance userInstance4= new UserInstance(user4);
        UserInstance userInstance5= new UserInstance(user5);

        Expense expense1= new Expense(userInstance1, Arrays.asList(
                new Split(userInstance2,200),
                new Split(userInstance3,400),
                new Split(userInstance4,500)
                //new Split(userInstance1,100)
        ),1100,"Food Expenses");

        Expense expense2= new Expense(userInstance2, Arrays.asList(
                new Split(userInstance1,400),
                new Split(userInstance3,400),
                new Split(userInstance4,500)
        ),1100,"Food Expenses");
        Expense expense3= new Expense(userInstance3, Arrays.asList(
                new Split(userInstance2,200),
                new Split(userInstance1,400),
                new Split(userInstance4,500)
        ),1100,"Food Expenses");

        // creating groups

        Group group1 = new Group(Arrays.asList(
                userInstance1,
                userInstance2,
                userInstance3,
                userInstance4
        ));
        group1.addExpenses(expense1);
        group1.addExpenses(expense2);
        group1.addExpenses(expense3);


        Splitswise application = new Splitswise(new GroupController());
        application.groupContext.addGroup(group1);
        //System.out.println(application.groupContext.getGroup(0));
        for(UserInstance user: Arrays.asList(
                userInstance1,
                userInstance2,
                userInstance3,
                userInstance4
        )){
            application.getbalaceSheet(user);
        }
    }
}
