package Problems.CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private Account account;
    private List<Order> history;

    public User(int userId, Account account) {
        this.userId = userId;
        this.account = account;
        this.history = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Order> getHistory() {
        return history;
    }

    public void setHistory(Order order) {
        this.history.add(order);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", account=" + account +
                ", history=" + history +
                '}';
    }
}
