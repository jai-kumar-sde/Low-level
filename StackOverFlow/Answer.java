package Problems.StackOverFlow;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    public static int counter =0;
    private int id;
    private String answer;
    private int voteCount;
    private User user;
    List<Comment> comments;
    private boolean correct;

    public Answer(String answer, int voteCount, User user) {
        this.id = id;
        this.answer = answer;
        this.voteCount = voteCount;
        this.user = user;
        this.comments = new ArrayList<Comment>();
        this.correct = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) throws Exception {
        if(!(comment.getUser() instanceof RegisterUser)) throw new Exception("To comment on question/answer you need to login.");
        this.comments.add(comment);
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answer='" + answer + '\'' +
                ", voteCount=" + voteCount +
                ", user=" + user +
                ", comments=" + comments +
                ", correct=" + correct +
                '}';
    }

}
