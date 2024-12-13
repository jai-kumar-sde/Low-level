package Problems.AirlineSystem;

import java.util.HashMap;
import java.util.List;

public class Aircraft {

    private int id;
    private String modelName;
    private HashMap<Integer,Seat> seats;

    public Aircraft(int id, String modelName, List<Seat> seats) {
        this.id = id;
        this.modelName = modelName;
        this.seats= new HashMap<>();
        for(Seat seat:seats){
            this.seats.put(seat.getSeatNumber(),seat);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Seat getSeats(int id) {
        return seats.get(id);
    }

    public void setSeats(List<Seat> seats) {
        for(Seat seat:seats){
            this.seats.put(seat.getSeatNumber(),seat);
        }
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", seats=" + seats +
                '}';
    }
}
