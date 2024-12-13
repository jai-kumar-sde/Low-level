package DesignPatterns.FacadeDesign;

public class Main {
    public static void main(String[] args) {
        Balance balance = new Balance();
        SecurityPin securityPin = new SecurityPin();
        Notification notification = new Notification();

        // client need to call these three method sepratly
        // to remove dependecy from client we create facadeclass that handle request and use all the method
        // provide abstraction

        FacadeBanking client = new FacadeBanking(balance,securityPin,notification);

        client.getBalance(12,"jai@gmail");

    }
}
