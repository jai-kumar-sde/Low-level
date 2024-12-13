package Problems.AirlineSystem;

public class Seat {
    public static int counter=0;
    private int seatNumber;
    private ClassType classType;
    private int price;
    private SeatStatus seatStatus;

    public Seat(ClassType classType, int price) {
        counter++;
        this.seatNumber = counter;
        this.classType = classType;
        this.price = price;
        this.seatStatus = SeatStatus.ACTIVE;
    }



    public int getSeatNumber() {
        return seatNumber;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber=" + seatNumber +
                ", classType=" + classType +
                ", price=" + price +
                ", seatStatus=" + seatStatus +
                '}';
    }
}
