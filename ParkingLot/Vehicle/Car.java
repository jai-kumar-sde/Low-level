package Problems.ParkingLot.Vehicle;

import Problems.ParkingLot.ParkingType;

public class Car implements Vehicle{
    private String vehicleNumber;

    public Car(String vehicleNumber) {
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
        return ParkingType.CAR;
    }
}
