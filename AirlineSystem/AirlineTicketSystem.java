package Problems.AirlineSystem;

//import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AirlineTicketSystem {
    private List<Airport> airports;
    private List<Flight> flights;
    private HashMap<String,List<Flight>> flightMapper;

    public AirlineTicketSystem(List<Airport> airports, List<Flight> flights) {
        this.airports = airports;
        this.flights = flights;
        this.flightMapper = new HashMap<>();
        gererateFlightMapper();
    }

    private void gererateFlightMapper(){
        for(Flight flight: this.flights){
            if( flightMapper.containsKey( flight.getDest().getLocation())){
                flightMapper.get(flight.getDest().getLocation()).add(flight);
            }
            else{
                List<Flight> flightList = new ArrayList<>();
                flightList.add(flight);
                flightMapper.put(flight.getDest().getLocation(),flightList);
            }
        }
    }
    private List<Flight> searchFlight(String src,String dest) throws Exception {
        if(this.flightMapper.containsKey(dest)){
            List<Flight> flightResult = new ArrayList<>();
            for(Flight flight:flightMapper.get(dest)){
                if(flight.getSrc().getLocation().equals(src)){
                    flightResult.add(flight);
                }
            }
            return flightResult;
        }
        else{
            throw new Exception(" No Flight is available ");
        }
    }

    private Reservation createbooking(Customer customer, int flightId, Airport src, Airport dest, List<Seat> seats) throws Exception {

        List<Flight> searchResults = searchFlight(src.getLocation(),dest.getLocation());
        for(Flight fligth: searchResults){
            if(fligth.getFlightNumber() == flightId){
                return customer.createBooking(fligth,seats);
            }
        }
        throw new Exception(" Ticket is not booked");
    }
    public static void main(String[] args) {
        Airport delhiAiport = new Airport("Indira Gandhi Airport","Delhi");
        Airport blrAirport = new Airport("Kempoagowda Airport","Bangalore");

        Seat bussinessSeat1 = new Seat(ClassType.BussinessClass,300);
        Seat bussinessSeat2 = new Seat(ClassType.BussinessClass,400);
        Seat economySeat1 = new Seat(ClassType.EconomyClass,100);
        Seat economySeat2 = new Seat(ClassType.EconomyClass,200);
        List<Seat> flightSeats1= new ArrayList<>(); flightSeats1.add(bussinessSeat1);flightSeats1.add(economySeat1);
        List<Seat> flightSeat2 = new ArrayList<>(); flightSeat2.add(bussinessSeat2);flightSeat2.add(economySeat2);
        Aircraft indigoAircraft = new Aircraft(1,"Indigo",flightSeats1);
        Aircraft spriceJetAircraft = new Aircraft(1,"SpriceJet",flightSeat2);

        LocalDateTime localDepartureTime1 = LocalDateTime.of(2023, Month.AUGUST,10,14,00,00);
        LocalDateTime localDepartureTime2 = LocalDateTime.of(2023, Month.AUGUST,10,16,10,00);
        LocalDateTime localArrivalTime1 = LocalDateTime.of(2023, Month.AUGUST,10,17,25,00);
        LocalDateTime localArrivalTime2 = LocalDateTime.of(2023, Month.AUGUST,10,18,45,00);

        Flight flight1 = new Flight(1,delhiAiport,blrAirport,localDepartureTime1,localArrivalTime1,indigoAircraft);
        Flight flight2 = new Flight(2,blrAirport,delhiAiport,localDepartureTime2,localArrivalTime2,spriceJetAircraft);

        Customer rahul = new Customer("Rahul","1234");
        Customer ram = new Customer ("Ram","1234");

        List<Airport> listOfAirports = new ArrayList<>();   listOfAirports.add(delhiAiport);listOfAirports.add(blrAirport);
        List<Flight> listOfFlight = new ArrayList<>();      listOfFlight.add(flight1);listOfFlight.add(flight2);

        AirlineTicketSystem mmtBookingSystem = new AirlineTicketSystem(listOfAirports,listOfFlight);
        try{
            for(Flight flight: mmtBookingSystem.searchFlight("Delhi","Bangalore")){
                System.out.println(" Flights \n");
                System.out.println(flight);
            }
            System.out.println("\n  Reservation \n");
            System.out.print(mmtBookingSystem.createbooking(rahul,1,delhiAiport,blrAirport,flightSeats1));
            System.out.println("\n  After Reservation Seats \n");
            for(Flight flight: mmtBookingSystem.searchFlight("Delhi","Bangalore")){
                System.out.println(flight.toString());
            }
            System.out.print("\n  Rahul Reservation \n");
            for(Reservation reservation:rahul.getReservations()){
                System.out.print(reservation);
            }

        }
        catch(Exception e){
            System.out.print(e);
        }

    }


}
