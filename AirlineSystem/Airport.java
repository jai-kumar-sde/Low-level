package Problems.AirlineSystem;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String airportName;
    private String location;
    private List<Flight> flights;

    public Airport(String airportName, String location) {
        this.airportName = airportName;
        this.location = location;
        this.flights = new ArrayList<Flight>();
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Flight> searchFlight(String Src,String Dest,String Date) {
        return flights;
    }

}
