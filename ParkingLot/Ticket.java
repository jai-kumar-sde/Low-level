package Problems.ParkingLot;

import Problems.ParkingLot.Vehicle.Vehicle;

import java.util.Date;

public class Ticket {
    public static int counter=0;
    private int id;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Date EntryTime;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot, Date entryTime) {
        counter++;
        this.id = counter;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        EntryTime = entryTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Date getEntryTime() {
        return EntryTime;
    }

    public void setEntryTime(Date entryTime) {
        EntryTime = entryTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", vehicle=" + vehicle +
                ", parkingSpot=" + parkingSpot +
                ", EntryTime=" + EntryTime +
                '}';
    }
}
