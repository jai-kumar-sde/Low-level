package Problems.AirlineSystem;

import java.util.ArrayList;
import java.util.List;

public class Staff extends Account {

    private List< Aircraft > aircrafts;
    private List< Flight > flights;

    public Staff(String userName, String password) {
        super(userName, password);
        this.aircrafts = new ArrayList<Aircraft>();
        this.flights = new ArrayList<Flight>();
    }

    public Aircraft getAircrafts(int AircraftNumber) {
        return aircrafts.get(AircraftNumber);
    }

    public void setAircrafts(Aircraft aircrafts) {
        this.aircrafts.add(aircrafts);
    }

    public Flight getFlights(int flightNumber) {
        return this.flights.get(flightNumber);
    }

    public void setFlights(Flight flight) {
        this.flights.add(flight);
    }
}
