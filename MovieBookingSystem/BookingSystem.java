package Problems.MovieBookingSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private List<Theater> theaters;
    private List<Movie> movies;
    private List<User> users;

    public Movie searchMovie(String movieName) throws Exception {
        for(Movie movie: this.getMovies()){
            if(movie.getName() == movieName ){
                return movie;
            }
        }
        throw new Exception(" Movie is not find");
    }
    public List<Show> getMovieShows(Movie movie){
        List<Show> shows = new ArrayList<Show>();
        for(Theater theater: this.getTheaters()){
            for(Show show : theater.getShows()){
                if(show.getMovie() == movie){
                    shows.add(show);
                }
            }
        }
        return shows;
    }

    public Ticket createBooking(User user,Show show,int seats) throws Exception {
        if(user  instanceof  RegisteredUser){
            return bookTicket(user,show,seats);
        }
        throw new Exception(" User is not Authorized to book tickets");
    }
    public Ticket bookTicket(User user,Show bookingshow,int seats) throws Exception {

        for(Theater theater : this.getTheaters()){
            for(Show show: theater.getShows()){
                if(show.getSeatCount() >= seats){
                    show.setSeatCount(show.getSeatCount()- seats);
                   return  new Ticket(show,user, seats, show.getPrice()*seats);
                }
            }
        }
        throw new Exception(" seat are not avabile ");
       // System.out.print("Seats are not avaible");
       // return null;
    }

public static void main(String[] args) {
    System.out.println("hello");
    User userRamesh = new RegisteredUser("Ramesh","12345");
    User userSuresh = new Guest("Suresh");
    Movie avengerMovie= new Movie("Avengers",Gener.Action,Language.English);
    Movie herapheriMovie = new Movie ( " Hera Pheri",Gener.Comedy,Language.Hindi);
    Show show1 = new Show(avengerMovie,25,DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(LocalDateTime.now()),300);
    Show show2 = new Show(herapheriMovie,30, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(LocalDateTime.now()) ,200);


    Theater pvrCinema = new Theater();
    pvrCinema.addShow(show1);pvrCinema.addShow(show2);
    BookingSystem bookingSystem = new BookingSystem();
    bookingSystem.setMovies(avengerMovie);bookingSystem.setMovies(herapheriMovie);
    bookingSystem.setTheaters(pvrCinema);
    bookingSystem.setUsers(userRamesh);bookingSystem.setUsers(userSuresh);

    try{
        System.out.print(bookingSystem.searchMovie("Avengers").getName());
        System.out.print(bookingSystem.getMovieShows(avengerMovie));
        System.out.print(bookingSystem.createBooking(userRamesh,show1,40).getTicketInfo());
        System.out.print(bookingSystem.getMovieShows(avengerMovie));
    }
    catch (Exception e){
        System.out.print(e);
    }

}

//    public BookingSystem(List<Theater> theaters, List<Movie> movies, List<User> users) {
//        this.theaters = theaters;
//        this.movies = movies;
//        this.users = users;
//    }

    public BookingSystem() {
                this.theaters = new ArrayList<Theater>();
        this.movies = new ArrayList<Movie>();
        this.users = new ArrayList<User>();

    }

    public void setTheaters(Theater theater) {
        this.theaters.add(theater);
    }

    public void setMovies(Movie movie) {
        this.movies.add(movie) ;
    }

    public void setUsers(User user) {
        this.users.add(user);
    }

    public List<Theater> getTheaters() {
        return theaters;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<User> getUsers() {
        return users;
    }
}
