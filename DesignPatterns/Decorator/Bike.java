package DesignPatterns.Decorator;

public class Bike implements RentVehicle{
    @Override
    public int calculateRent() {
        return 1000;
    }

    @Override
    public void getVehicleInfo() {
        System.out.println("Rent Bike");
    }
}
