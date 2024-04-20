package Part9.Interfaces.ObserverPattern;

public class MainProgram {
    public static void main(String[] args) {
        ConcreteObserver observer1 = new ConcreteObserver(1);
        Subject subject = new Subject();

        subject.registerObserver(observer1);

        subject.triggerSomeEvent("New event!!");
    }
}
