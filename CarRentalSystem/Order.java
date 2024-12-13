package Problems.CarRentalSystem;

public class Order {
    private static int  counter =0;
    private int orderId;
    private VehicleInstance vechileInstance;
    private Interval bookingDates;
    private BookingStatus bookingStatus;

    public Order(VehicleInstance vechileInstance, Interval bookingDates) {
        this.orderId = ++counter;
        this.vechileInstance = vechileInstance;
        this.bookingDates = bookingDates;
        this.bookingStatus = BookingStatus.BOOKED;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Order.counter = counter;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public VehicleInstance getVechileInstance() {
        return vechileInstance;
    }

    public void setVechileInstance(VehicleInstance vechileInstance) {
        this.vechileInstance = vechileInstance;
    }

    public Interval getBookingDates() {
        return bookingDates;
    }

    public void setBookingDates(Interval bookingDates) {
        this.bookingDates = bookingDates;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}
