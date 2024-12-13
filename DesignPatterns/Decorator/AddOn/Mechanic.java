package DesignPatterns.Decorator.AddOn;

import DesignPatterns.Decorator.RentVehicle;

public class Mechanic extends IAddOn{
    public Mechanic(RentVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public int calculateRent() {
        return this.vehicle.calculateRent() + 200;
    }

    @Override
    public void getVehicleInfo() {
        this.vehicle.getVehicleInfo();
        System.out.println(" AddOn: Mehchanic service is selected ");
    }
}
