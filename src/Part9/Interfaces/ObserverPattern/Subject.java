package Part9.Interfaces.ObserverPattern;

import java.util.ArrayList;


/*
* This class would also make sense as an abstract class in a
* system where some objects can notify other objects
* */
public class Subject {
    private ArrayList<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(String data) {
        for (Observer observer : observers) {
            observer.notify(data);
        }
    }

    public void triggerSomeEvent(String data) {
        this.notifyObservers(data);
    }
}
