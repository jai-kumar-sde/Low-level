package Vacination.Service;

import Vacination.Model.Booking;
import Vacination.Repositry.VaccinationRepositry;
import Vacination.Extra.VacinationController;

import java.util.HashMap;

public class BookingService {
    private VaccinationRepositry vaccinationRepositry;
    private HashMap<Integer, Booking> bookings;

    public Booking addBooking(VacinationController vController, String userName, String vaccinationId, int day ){
        return null;
    }

    public void listAllBooking(){
        System.out.println(bookings);
    }

    public void cancleBooking(int bookingID,int userId,String vaccinationId){

    }



}
