package Problems.ParkingLot;

import Problems.ParkingLot.Vehicle.Bike;
import Problems.ParkingLot.Vehicle.Car;
import Problems.ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingSystem {
    private List<Floor> floors;
    private List<Entry> entrys;
    private List<Exit> exits;

    public ParkingSystem() {
        this.floors = new ArrayList<>();
        this.entrys = new ArrayList<>();
        this.exits = new ArrayList<>();
    }

    public List<Floor> getFloor() {
        return this.floors;
    }

    public void addFloor(Floor floor) {
        this.floors.add(floor);
    }

    public Entry getEntry(int id) {
        return this.entrys.get(id);
    }

    public void addEntry(Entry entry) {
        this.entrys.add(entry);
    }

    public Exit getExit(int id) {
        return this.exits.get(id);
    }

    public void addExits(Exit exit) {
        this.exits.add(exit);
    }


    public static void main(String[] args) throws Exception {
        System.out.println(" Parking System");
        Vehicle vehicle1 = new Car("KA 12 CA");
        Vehicle vehicle2 = new Bike("KA 23 AB");
        ParkingSpot parkingSpot1 = new ParkingSpot(true,ParkingType.CAR,20);
        ParkingSpot parkingSpot2 = new ParkingSpot(true,ParkingType.BIKE,10);
        ParkingSpot parkingSpot3 = new ParkingSpot(true,ParkingType.HANDICAPPED,5);
        ParkingSpot parkingSpot4 = new ParkingSpot(true,ParkingType.CAR,20);

        Floor floor1 = new Floor();
        floor1.setParkingSpots(parkingSpot1);
        floor1.setParkingSpots(parkingSpot2);
        Floor floor2 = new Floor();
        floor2.setParkingSpots(parkingSpot4);
        floor2.setParkingSpots(parkingSpot3);

        Entry entry1 = new Entry();
        Entry entry2 = new Entry();

        Exit exit1 = new Exit();
        Exit exit2 = new Exit();

        ParkingSystem parkingSystem = new ParkingSystem();
        parkingSystem.addEntry(entry1);
        parkingSystem.addEntry(entry2);

        parkingSystem.addExits(exit1);
        parkingSystem.addExits(exit2);

        parkingSystem.addFloor(floor1);
        parkingSystem.addFloor(floor2);
        try{
            // parkingSpot is available
           Ticket ticket1 = parkingSystem.getEntry(1).getTicket(ParkingType.CAR,vehicle1,null,parkingSystem.getFloor());
            Ticket ticket2 = parkingSystem.getEntry(1).getTicket(ParkingType.CAR,vehicle2,null,parkingSystem.getFloor());
            Ticket ticket3 = parkingSystem.getEntry(1).getTicket(ParkingType.CAR,vehicle1,null,parkingSystem.getFloor());


            System.out.println(ticket2);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
