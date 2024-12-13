package DesignPatterns.Decorator.AddOn;

import DesignPatterns.Decorator.RentVehicle;

public abstract class IAddOn implements RentVehicle {
    protected RentVehicle vehicle;

    public IAddOn(RentVehicle vehicle) {
        this.vehicle = vehicle;
    }
}
