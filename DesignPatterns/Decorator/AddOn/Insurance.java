package DesignPatterns.Decorator.AddOn;

import DesignPatterns.Decorator.RentVehicle;

public class Insurance extends  IAddOn{
    public Insurance(RentVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public int calculateRent() {
        return this.vehicle.calculateRent() + 100;
    }

    @Override
    public void getVehicleInfo() {
        this.vehicle.getVehicleInfo();
        System.out.println(" AddOn: Insurance is selected ");
    }
}
