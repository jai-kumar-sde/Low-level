package Problems.MovieBookingSystem;

public class Guest extends User{
    public static int counter=0;
    private int id;
    private String Name;

    public Guest( String name) {
        counter++;
        this.id = counter;
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
