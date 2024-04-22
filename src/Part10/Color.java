package Part10;

public enum Color {
    // the constants are enumerated
    RED("#FF0000", 1),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String code;        // object reference variable
    int number;

    private Color(String code) { // constructor
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    private Color(String code, int number) { // constructor
        this(code);
        this.number = number;
    }

    public String getCode() {
        return this.code;
    }
}
