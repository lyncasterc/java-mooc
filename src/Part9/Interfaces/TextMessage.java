package Part9.Interfaces;

public class TextMessage implements Readable {
    private String sender;
    private String content;
    private boolean hasBeenRead;

    public TextMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
        this.hasBeenRead = false;
    }

    public String getSender() {
        return this.sender;
    }

    public String read() {
        this.hasBeenRead = true;
        return this.content;
    }

    public boolean hasBeenRead() {
        return hasBeenRead;
    }
}
