package Problems.SnackLadderGame;

public class Player {
    private User user;
    private Integer position;

    public Player(User user, Integer position) {
        this.user = user;
        this.position = position;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "user=" + user +
                ", status=" + position +
                '}';
    }
}
