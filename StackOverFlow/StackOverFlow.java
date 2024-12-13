package Problems.StackOverFlow;

import java.util.HashMap;
import java.util.List;


public class StackOverFlow {
    HashMap<Integer,User> users;
    HashMap<String,Question> questions;

    public StackOverFlow() {
        this.users = new HashMap<Integer, User>();
        this.questions = new HashMap<String, Question>();
    }

    public User getUser(int id) {
        return users.get(id);
    }

    public void addUser(User user) {
        this.users.put(user.getId(),user);
    }

    public Question getQuestions(String question) throws Exception {

        Question result = questions.get(question);
        if(result != null) return result;
        throw new Exception("Question is not available that you are looking for. Please Try again.");
    }

    public void addQuestion(Question question) throws Exception {
        if(! (question.getUser()  instanceof RegisterUser)) throw new Exception(" You need to login first to post the new question.");
        this.questions.put(question.getQuestionHeadline(),question);
    }

    public void upvote(Question question,Answer answer,User user,int vote) throws Exception {
        if(! (user instanceof RegisterUser)) throw new Exception("You need to login first to upvote/downvote.");
        List<Answer> answers=this.questions.get(question.getQuestionHeadline()).getAnswers();
        for(Answer listAnswer:answers){
            if(answer.equals(listAnswer)){
                listAnswer.setVoteCount(listAnswer.getVoteCount()+vote);
                return ;
            }
        }
        throw new Exception("Answer is not exit");
    }



    public static void main(String[] args) {
        User guest = new Guest();

        User user1 = new RegisterUser("Rahul","123");
        User user2 = new RegisterUser("Deepak","123");
        User user3 = new RegisterUser("Sattyak","123");
        try{
        Question question1 = new Question("Which Data Strucre is used for fast store and retrival data","I am stuck somewhere in the problem. which data strucere will give fast insert and get operation.",user1);
        Answer answer1 = new Answer("Array data strucre will give the fast insert or get time complexity",0,user2);
        Answer answer2 = new Answer("Hashmap will you input and output operation in o(1)",0,user3);
        Comment comment1 = new Comment("Array will insert in o(1), but get time is o(n)",user3);
        Comment comment2 = new Comment("Yes Hashmap will give fast input output operation",user2);
        answer1.addComment(comment1);
        answer2.addComment(comment2);
        question1.addAnswer(answer1);
        question1.addAnswer(answer2);

            StackOverFlow application = new StackOverFlow();
            application.addQuestion(question1);

            application.addUser(user1);
            application.addUser(user2);
            application.addUser(user3);
            System.out.println(application.getQuestions("Which Data Strucre is used for fast store and retrival data"));
            application.upvote(question1,answer2,user3,1);
            System.out.println(application.getQuestions("Which Data Strucre is used for fast store and retrival data"));

        }
        catch (Exception e){
            System.out.println(e);
        }





    }

}
