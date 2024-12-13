package Problems.ParkingLot;

import Problems.ParkingLot.Vehicle.Vehicle;

import java.util.Date;
import java.util.List;

public class Entry {
    public static int counter=0;
    private int entryId;
    private TicketProcess ticketProcess;

    public Entry() {
        counter++;
        this.entryId = counter;
    }

    Ticket getTicket(ParkingType parkingType, Vehicle vehicle, Date entryTime, List<Floor> floors) throws Exception {
        //ticketProces.generateTicket(vechilce,entryTime,floor);
        for(Floor floor: floors) {
            for (ParkingSpot parkingSpot : floor.getParkingSpots()) {
                if (parkingSpot.getParkingType() == parkingType && parkingSpot.isAvialable()) {
                    parkingSpot.setAvialable(false);
                    parkingSpot.setVehicle(vehicle);
                    return new Ticket(vehicle, parkingSpot, entryTime);
                }
            }
        }
            //new throw(" No Parking Spot is avaiable");
            throw new Exception(" No Parking Spot is avaiable");
    }
}
