package Problems.StackOverFlow;

public class RegisterUser implements  User{
    public static int counter =0 ;
    private int id;
    private String name;
    private String password;

    public RegisterUser(String name, String password) {
        counter++;
        this.id = counter;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
