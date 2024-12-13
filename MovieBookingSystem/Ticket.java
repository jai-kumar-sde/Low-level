package Problems.MovieBookingSystem;

public class Ticket {
    public static int counter=0;
    private int id;
    private Show show;
    private User user;
    private int  seatBooked;
    private int totalPrice;

    public Ticket(Show show, User user, int seatBooked, int totalPrice) {
        counter++;
        this.id = counter;
        this.show = show;
        this.user = user;
        this.seatBooked = seatBooked;
        this.totalPrice = totalPrice;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(int seatBooked) {
        this.seatBooked = seatBooked;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getTicketInfo(){
       return  "Movie : " + this.getShow().getMovie().getName() +
               "Show Time : " + this.getShow().getShowTime() +
               "Ticket Price: " + this.getShow().getPrice();
               //"User Name: " + this.getUser().getName();
    }
}
