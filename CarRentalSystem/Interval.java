package Problems.CarRentalSystem;

import java.util.Date;

public class Interval {
    private int startDate;
    private int endDate;

    public Interval(int startDate, int endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
