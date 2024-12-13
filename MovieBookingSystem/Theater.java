package Problems.MovieBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    public static int counter =0;
    private int id;
    private List<Show> shows;

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public Theater() {
        counter++;
        this.id=counter;
        this.shows = new ArrayList<Show>();
    }

    void addShow(Show show){
        this.shows.add(show);
    }
    void editShow(Show show){

    }

    List<Show> getShows(Movie movie){
        List<Show> movieShows = new ArrayList<Show>();
        for(Show show:this.getShows()){
            if(show.getMovie().getName() == movie.getName()){
                movieShows.add(show);
            }
        }
        return movieShows;
    }
}
