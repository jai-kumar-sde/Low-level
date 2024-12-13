package Problems.CarRentalSystem;

import Problems.CarRentalSystem.Inventory.Inventory;
import Problems.CarRentalSystem.Inventory.InventoryInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
search
Reserve the vehicle
return/collect
payment
notification
cancelbooking
invertory management
Date

things to rememer add location on Inventory
Invetory
Users
Booking
search interface

this is zoom car like app in which book and cancel the reservation not like yullu deleiver vehicle to different inventory
*/
public class CarRentalSystem implements Isearch{

    Inventory  Inventory;
    List<User> users;
    Booking booking;

    public CarRentalSystem(Booking  booking) {
        this.Inventory = new Inventory();
        this.users = new ArrayList<>();
        this.booking = booking;
    }

    public Inventory getInventorys() {
        return Inventory;
    }

//    public void setInventorys(InventoryInstance inventorys) {
//        this.Inventory.add(inventorys);
//    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users.add(users);
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public static void main(String[] args) {
        User user1 = new User(1,new Account("jai","jai@gmail","124"));
        VehicleInstance vehicle1 = new VehicleInstance(1,new Vehicle("1234",VehicleType.CARS), 2000);
        VehicleInstance vehicle2 = new VehicleInstance(2,new Vehicle("1235",VehicleType.SUVs), 3000);
        VehicleInstance vehicle3 = new VehicleInstance(3,new Vehicle("1265",VehicleType.MoterCycles), 500);

        InventoryInstance inventory = new InventoryInstance(Arrays.asList(
                vehicle1,vehicle2,vehicle3
        ) );

        Booking booking = new Booking();

        CarRentalSystem client = new CarRentalSystem(booking);
        client.getInventorys().addInventoryInstance(inventory);
        client.setUsers(user1);
        try{
            Order status = client.getBooking().createBooking(user1,vehicle1, new Interval(10,20), inventory);
            System.out.printf("Vehicle is rent %s ",status);
          //  Order status2 = client.getBooking().createBooking(user1,vehicle1, new Interval(5,20), inventory);
            System.out.println("vehicle booked dates before cancelled: "+ vehicle1.getBookedIntervals());
          // System.out.printf("Vehicle is rent %s ",status2);
            System.out.println("List of orders before cancelled booking "+ status.getBookingStatus());
            client.getBooking().CancleBooking(user1, vehicle1, status);
            System.out.println("List of orders before cancelled booking "+ status.getBookingStatus());
            System.out.println("vehicle booked dates after cancelled: "+ vehicle1.getBookedIntervals());
            System.out.println("list of avaiable vehicles : " + client.searchByDates(1, 6));
        }
        catch (Exception e){
            System.out.println("Slot is not avialble");
        }

    }

    @Override
    public List<VehicleInstance> searchByDates(int start, int end) {
        List<VehicleInstance> avaiableVehilce = new ArrayList<>();
        for(InventoryInstance inventoryInstance:this.Inventory.getInventoryInstances()){
            for(VehicleInstance vehicle:inventoryInstance.getVehiclesInstances()){
                boolean flag = true;
                for(Interval bookedDates:vehicle.getBookedIntervals()){
                    if(bookedDates.getStartDate() <= start && start <= bookedDates.getEndDate()){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    avaiableVehilce.add(vehicle);
                }
            }
        }
        return avaiableVehilce;
    }
}
