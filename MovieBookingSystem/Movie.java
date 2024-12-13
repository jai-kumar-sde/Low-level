package Problems.MovieBookingSystem;

public class Movie {
    private String name;
    private Gener gener;
    private Language languages;

    public Movie(String name, Gener gener, Language languages) {
        this.name = name;
        this.gener = gener;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gener getGener() {
        return gener;
    }

    public void setGener(Gener gener) {
        this.gener = gener;
    }

    public Language getLanguages() {
        return languages;
    }

    public void setLanguages(Language languages) {
        this.languages = languages;
    }
}
