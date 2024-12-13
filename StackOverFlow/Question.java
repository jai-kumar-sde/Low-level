package Problems.StackOverFlow;

import java.util.ArrayList;
import java.util.List;

public class Question {
    public static int counter = 0;
    private int id;
    private String questionHeadline;
    private String questionDescription;
    List<Comment> comments;
    List<Answer> answers;
    private Status status;
    private User user;

    public Question(String questionHeadline, String questionDescription,User user) {
        counter++;
        this.id = counter;
        this.questionHeadline = questionHeadline;
        this.questionDescription = questionDescription;
        this.comments = new ArrayList<Comment>();
        this.answers = new ArrayList<Answer>();
        this.status = Status.OPEN;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionHeadline() {
        return questionHeadline;
    }

    public void setQuestionHeadline(String questionHeadline) {
        this.questionHeadline = questionHeadline;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void addAnswer(Answer answer) throws Exception {
        if(!(answer.getUser() instanceof  RegisterUser)) throw new Exception(" To add Answer you need to login first.");
        this.answers.add(answer);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionHeadline='" + questionHeadline + '\'' +
                ", questionDescription='" + questionDescription + '\'' +
                ", comments=" + comments +
                ", answers=" + answers +
                ", status=" + status +
                ", user=" + user +
                '}';
    }
}
