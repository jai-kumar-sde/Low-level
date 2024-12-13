package DesignPatterns.Observer;

import java.util.List;

public abstract class Iobseravale {
    private List<Observer> observers;

    public Iobseravale(List<Observer> observers) {
        this.observers = observers;
    }

    public void notifyall(String tempratrue){
        for(Observer observer:observers){
            observer.notifyApp(tempratrue);
        }
    }

}
