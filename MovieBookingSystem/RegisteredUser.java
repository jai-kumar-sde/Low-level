package Problems.MovieBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class RegisteredUser extends User {
    public static int count=0;
    private int id;
    private String name ;
    private String password;

    private List<Ticket> tickets;

    public RegisteredUser(String name, String password) {
        count++;
        this.id = count;
        this.name = name;
        this.password = password;
        this.tickets= new ArrayList<Ticket>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Ticket ticket) {
        this.tickets.add(ticket) ;
    }
}
