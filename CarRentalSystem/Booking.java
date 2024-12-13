package Problems.CarRentalSystem;


import Problems.CarRentalSystem.Inventory.InventoryInstance;

import java.util.ArrayList;
import java.util.List;

public class Booking {

    List<Order> orders;

    public Booking() {
        this.orders = new ArrayList<>();
    }

    public Order getOrder(int orderId) {
        return orders.get(orderId);
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Order createBooking(User user, VehicleInstance vehicleInstance, Interval interval , InventoryInstance inventory) throws Exception {
        List<Interval> bookedIntervals = vehicleInstance.getBookedIntervals();
        for(Interval bookedInterval: bookedIntervals){
            if( (bookedInterval.getStartDate() <= interval.getStartDate()) &&
                    (interval.getStartDate() <= bookedInterval.getEndDate()) ){
                throw new Exception("Vehicle is not avaible at this these dates");
            }
            if( (bookedInterval.getStartDate() <= interval.getEndDate()) &&
                    (interval.getEndDate() <= bookedInterval.getEndDate()) ){
                throw new Exception("Vehicle is not avaible at this these dates");
            }
        }

        bookedIntervals.add(interval);
        //vehicleInstance.getBookedIntervals().add(interval);
        Order newOrder = new Order(vehicleInstance,interval);
        user.setHistory(newOrder);
        addOrder(newOrder);
        return newOrder;
    }
    public boolean pickupVehicle(Order order){
        //update the status to pickedUp
        return true;
    }
    public boolean dropVehicle(Order order){
        // update the status flag to return
        return true;
    }
    public boolean CancleBooking(User user,VehicleInstance vehicleInstance,Order order){
        Interval bookingDates = order.getBookingDates();
        int currentDate = 10;
        if(bookingDates.getStartDate() >= currentDate ){
            return false;
        }
        if(!vehicleInstance.removeBookingDate(bookingDates)){
            return false;
        }
        order.setBookingStatus(BookingStatus.Cancelled);
        return true;
    }
}
