package DesignPatterns.Observer;

public class PhoneScreen implements Observer,Screen{
    private String data;

    public PhoneScreen(String data) {
        this.data = data;
    }

    @Override
    public void notifyApp(String temprature) {
        this.data=temprature;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Temprature is display on PhonScreen: " + data);
    }
}
