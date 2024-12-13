package Problems.CarRentalSystem;

public class Account {
    private String name;
    private String email;
    private String DrivingLicnece;

    public Account(String name, String email, String drivingLicnece) {
        this.name = name;
        this.email = email;
        DrivingLicnece = drivingLicnece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDrivingLicnece() {
        return DrivingLicnece;
    }

    public void setDrivingLicnece(String drivingLicnece) {
        DrivingLicnece = drivingLicnece;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", DrivingLicnece='" + DrivingLicnece + '\'' +
                '}';
    }
}
