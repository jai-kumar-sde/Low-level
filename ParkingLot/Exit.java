package Problems.ParkingLot;

import java.util.Date;

public class Exit {
    public static int counter=0;
    private int exitId;
//    private Payment payment ;

    public Exit() {
        counter++;
        this.exitId = counter;
    }

    int processTicket(Ticket ticket, Date exitTime){
        return ticket.getParkingSpot().getPrice();
    }
}
