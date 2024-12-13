package DesignPatterns.FacadeDesign;

public class FacadeBanking {
    private  Balance balance;
    private  SecurityPin securityPin;
    private  Notification notification;

    public FacadeBanking(Balance balance, SecurityPin securityPin, Notification notification) {
        this.balance = balance;
        this.securityPin = securityPin;
        this.notification = notification;
    }

    public void  getBalance(int pin,String email){
        securityPin.verifyPin(pin);
        balance.getBalance();
        notification.sendNotification(email);
    }
}
