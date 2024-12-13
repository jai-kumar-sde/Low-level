package Problems.EventManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private static int counter=0;
    private int userId;
    private Account account;
    private List<EventTime> reservedDates;

    public User(Account account) {
        this.userId = ++counter;
        this.account = account;
        this.reservedDates = new ArrayList<EventTime>();
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

    public List<EventTime> getReservedDates() {
        return reservedDates;
    }

    public void addReservedDates(EventTime reservedDates) {
        this.reservedDates.add(reservedDates);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", account=" + account +
                ", events=" + reservedDates +
                '}';
    }
}
