package Problems.AirlineSystem;

import java.util.List;

public class Reservation {
        public static int counter=0;
        private int reservationNumber;
        private Flight flight;
        private Customer user;
        private String payment;
        private List<Seat> seats;

        public Reservation(Flight flight, Customer user, String payment, List<Seat> seats) {
            counter++;
            this.reservationNumber = counter;
            this.flight = flight;
            this.user = user;
            this.payment = payment;
            this.seats = seats;
        }

        public int getReservationNumber() {
            return reservationNumber;
        }

        public void setReservationNumber(int reservationNumber) {
            this.reservationNumber = reservationNumber;
        }

        public Flight getFlight() {
            return flight;
        }

        public void setFlight(Flight flight) {
            this.flight = flight;
        }

        public Customer getUser() {
            return user;
        }

        public void setUser(Customer user) {
            this.user = user;
        }

        public String getPayment() {
            return payment;
        }

        public void setPayment(String payment) {
            this.payment = payment;
        }

        public List<Seat> getSeats() {
            return seats;
        }

        public void setSeats(List<Seat> seats) {
            this.seats=seats;
        }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationNumber=" + reservationNumber +
                ", flight=" + flight +
                ", user=" + user +
                ", payment='" + payment + '\'' +
                ", seats=" + seats +
                '}';
    }
}
