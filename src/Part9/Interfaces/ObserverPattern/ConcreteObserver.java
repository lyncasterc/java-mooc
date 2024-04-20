package Part9.Interfaces.ObserverPattern;

public class ConcreteObserver implements Observer{
    private int id;

    public ConcreteObserver(int id) {
        this.id = id;
    }

    @Override
    public void notify(String data) {
        System.out.println("ConcreteObserver " + id + " received data: " + data);
    }
}
