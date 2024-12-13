package Problems.StackOverFlow;

public class Guest implements User {
    public static int counter =0;
    private int id;

    public Guest() {
        counter++;
        this.id = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                '}';
    }
}
