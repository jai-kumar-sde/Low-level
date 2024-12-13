package Problems.MovieBookingSystem;

public class Show {
    public static int counter=0;
    private int id;
    private Movie movie;
    private int seatCount;
    private String showTime;
    private int price;

    public Show(Movie movie, int seatCount, String showTime, int price) {
        counter++;
        this.id = counter;
        this.movie = movie;
        this.seatCount = seatCount;
        this.showTime = showTime;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
