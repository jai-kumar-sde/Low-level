package Problems.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    public static int counter =0;
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;

    public Floor() {
        counter++;
        this.floorNumber = counter;
        this.parkingSpots = new ArrayList<>();
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return this.parkingSpots;
    }

    public void setParkingSpots(ParkingSpot parkingSpots) {
        this.parkingSpots.add(parkingSpots);
    }

    @Override
    public String toString() {
        return "Floor{" +
                "floorNumber=" + floorNumber +
                ", parkingSpots=" + parkingSpots +
                '}';
    }
}
