package Part4;

public class Gauge {

    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        if (this.value < 5) {
            this.value++;
        }
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public boolean isFull() {
        return this.value == 5;
    }

    public int getValue() {
        return value;
    }
}
