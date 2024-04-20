package Part9.Interfaces;

public class MainProgram {
    public static void main(String[] args) {
        /*
            An object's type can be otehr than its class.
            (like when you create a variable using a class' superclass.)

        *  Classes that implement interfaces can also be of that type


        * */


        // TextMessage implements Readable
        TextMessage message = new TextMessage("Bob", "Yo hmu lol");

        // creating a variable using the interface as the ref variable type
        Readable readableMessage = message;


        System.out.println(message.hasBeenRead());


        // I can't access methods that are on TextMessage except for the ones known in Readable interface
//        readableMessage.hasBeenRead();

        readableMessage.read(); // works

        System.out.println(message.hasBeenRead());

        // it doesnt work backwords.
        // i can instantiate a TextMessage as a Readable variable type

        Readable readableMessage2 = new TextMessage("Bob", "Hellooo");

        // but I cant assign it to a TextMessage
        // which makes sense bc Readable is meant to be implmeneted by multiple classes.
        // The object can be another class like Ebook

//        TextMessage message2 = readableMessage2;  // doesn't work


        // you can cast if the object is a TextMessage.

        TextMessage message2 = (TextMessage) readableMessage2;
    }
}
