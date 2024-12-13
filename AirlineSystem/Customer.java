package Problems.AirlineSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Account{



    private List<Reservation> reservations;

    public Customer(String userName, String password) {
        super(userName, password);
        this.reservations = new ArrayList<>();
    }

    public Reservation createBooking(Flight flight, List<Seat> seats) throws Exception {
        List<Seat> flightSeats = new ArrayList<>();
        for(Seat seat: seats){
            Seat bookingSeat = flight.getAircraft().getSeats (seat.getSeatNumber());
            if(bookingSeat.getSeatStatus() == SeatStatus.ACTIVE){
                bookingSeat.setSeatStatus(SeatStatus.BOOK);
                flightSeats.add(bookingSeat);
            }
            else{
                throw new Exception(" Seats are not available");
            }
        }
        int  remmaingSeats = flightSeats.size() - seats.size();
        flight.getAircraft().setSeats(flightSeats);
        Reservation newReservation =  new Reservation(flight,this,"Credit Card ", seats);
        reservations.add(newReservation);
        return newReservation;
    }

    public List<Reservation> getReservations() {
        return this.reservations;
    }
}
