package Problems.EventManagement;

import java.util.Date;

public class EventTime {
    private Date start;
    private Date end;

    public EventTime(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "EventTime{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
