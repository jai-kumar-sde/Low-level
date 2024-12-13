package Problems.StackOverFlow;

public class Comment {
    public static int counter =0;
    private int id;
    private String commentDescription;
    private User user;

    public Comment(String commentDescription, User user) {
        counter++;
        this.id = counter;
        this.commentDescription = commentDescription;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentDescription() {
        return commentDescription;
    }

    public void setCommentDescription(String commentDescription) {
        this.commentDescription = commentDescription;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentDescription='" + commentDescription + '\'' +
                ", user=" + user +
                '}';
    }
}
