package Problems.AirlineSystem;

import java.time.LocalDateTime;

public class Flight {
    public static int counter = 0;
    private int flightNumber;
    private Airport src;
    private Airport dest;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Aircraft aircraft;

    public Flight(int flightNumber, Airport src, Airport dest, LocalDateTime departureTime, LocalDateTime arrivalTime, Aircraft aircraft) {
        counter++;
        this.flightNumber = counter;
        this.src = src;
        this.dest = dest;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraft = aircraft;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public Airport getSrc() {
        return src;
    }

    public void setSrc(Airport src) {
        this.src = src;
    }

    public Airport getDest() {
        return dest;
    }

    public void setDest(Airport dest) {
        this.dest = dest;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", src=" + src +
                ", dest=" + dest +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", aircraft=" + aircraft.toString() +
                '}';
    }
}
