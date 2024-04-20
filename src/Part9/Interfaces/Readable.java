package Part9.Interfaces;

/*
*  Interfaces define behavior. They can define methods and constants, but not instance variables.
*   Classes that implement interfaces decide how something is implemented.
*
* It's a contract of behavior. A class that implements Readable is saying that it will implement a String read method.
* */
public interface Readable {
    String read(); // always public
}
