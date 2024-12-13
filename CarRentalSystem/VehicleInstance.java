package Problems.CarRentalSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleInstance {
    private int vehicleInstaceId;
    private Vehicle vehicle;
    private double price;
    private List<Interval> bookedIntervals;

    public VehicleInstance(int vehicleInstaceId, Vehicle vehicle, double price) {
        this.vehicleInstaceId = vehicleInstaceId;
        this.vehicle = vehicle;
        this.price = price;
        this.bookedIntervals = new ArrayList<>();
    }

    public int getVehicleInstaceId() {
        return vehicleInstaceId;
    }

    public void setVehicleInstaceId(int vehicleInstaceId) {
        this.vehicleInstaceId = vehicleInstaceId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Interval> getBookedIntervals() {
        return bookedIntervals;
    }

    public void setBookedIntervals(Interval bookedInterval) {
        this.bookedIntervals.add(bookedInterval);
    }

    public boolean removeBookingDate(Interval interval){
        for(Interval listDates : getBookedIntervals()){
            if(listDates.equals(interval)){
                getBookedIntervals().remove(interval);
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "VechileInstance{" +
                "vehicleInstaceId=" + vehicleInstaceId +
                ", vehicle=" + vehicle +
                ", price=" + price +
                '}';
    }
}
