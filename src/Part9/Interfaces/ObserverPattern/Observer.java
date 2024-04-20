package Part9.Interfaces.ObserverPattern;

/**
 * Part of the Observer design pattern.
 *
 *
 * It defines a method for objects that need to be notified of an event.
 */
public interface Observer {

    /**
     * This method is called to notify the observer of a new event.
     * @param data Data associated with event.
     */
    void notify (String data);
}
