package Problems.TicTakToe;

public class Player {
    private User user;
    private Piece piece;

    public Player(User user, Piece piece) {
        this.user = user;
        this.piece = piece;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "Player{" +
                "user=" + user +
                ", piece=" + piece +
                '}';
    }
}
