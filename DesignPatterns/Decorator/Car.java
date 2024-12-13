package DesignPatterns.Decorator;

public class Car implements RentVehicle{

    @Override
    public int calculateRent() {
        return 5000;
    }

    @Override
    public void getVehicleInfo() {
        System.out.println("Rent a Car:");
    }
}
