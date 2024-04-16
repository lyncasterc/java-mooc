package Part6.Testing;

public class Calculator {

    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void add(int number) {
        this.value = this.value + number;
    }

    public void subtract(int number) {
        this.value = this.value - number;
    }

    public int getValue() {
        return this.value;
    }

    public void multiply(int number) {
        this.value *= number;
    }
}