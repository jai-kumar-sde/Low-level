package Problems.ParkingLot;

import Problems.ParkingLot.Vehicle.Vehicle;

public class ParkingSpot {
    public static int counter =0;
    private int spotId;
    private Vehicle vehicle;
    private boolean isAvialable;
    private ParkingType parkingType;
    private int price;

    public ParkingSpot(boolean isAvialable, ParkingType parkingType, int price) {
        counter++;
        this.spotId = counter;
        this.vehicle = null;
        this.isAvialable = isAvialable;
        this.parkingType = parkingType;
        this.price = price;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isAvialable() {
        return isAvialable;
    }

    public void setAvialable(boolean avialable) {
        isAvialable = avialable;
    }

    public ParkingType getParkingType() {
        return parkingType;
    }

    public void setParkingType(ParkingType parkingType) {
        this.parkingType = parkingType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotId=" + spotId +
                ", vehicle=" + vehicle +
                ", isAvialable=" + isAvialable +
                ", parkingType=" + parkingType +
                ", price=" + price +
                '}';
    }
}
