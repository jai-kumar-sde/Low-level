package DesignPatterns.Observer;

public class WebScreen implements Observer,Screen{
    private  String data;

    public WebScreen(String data) {
        this.data = data;
    }

    @Override
    public void notifyApp(String data) {
        this.data=data;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Temprature is display on Web: " + data);
    }
}
