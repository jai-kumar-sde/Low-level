package Problems.ParkingLot.Vehicle;

import Problems.ParkingLot.ParkingType;

public class Bike implements Vehicle{
    private String vehicleNumber;

    public Bike(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                '}';
    }
    @Override
    public ParkingType getType() {
        return ParkingType.BIKE;
    }
}
