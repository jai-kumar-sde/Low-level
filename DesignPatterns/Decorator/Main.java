package DesignPatterns.Decorator;

import DesignPatterns.Decorator.AddOn.IAddOn;
import DesignPatterns.Decorator.AddOn.Insurance;
import DesignPatterns.Decorator.AddOn.Mechanic;

public class Main {
    public static void main(String[] args) {
        RentVehicle car = new Insurance(new Car());

        RentVehicle bike = new Insurance(new Mechanic(new Bike()));

        System.out.println("Car total Rent is: " + car.calculateRent());

        car.getVehicleInfo();

        System.out.println(" Bike total Rent is : " + bike.calculateRent());

        bike.getVehicleInfo();
    }
}
