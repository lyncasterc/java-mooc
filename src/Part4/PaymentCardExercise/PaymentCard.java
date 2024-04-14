package Part4.PaymentCardExercise;

public class PaymentCard {
    private double balance;
    private static final double AFFORDABLE_PRICE = 2.60;
    private static final double HEARTY_PRICE = 4.60;

    private static final double MAX_BALANCE = 150;

    public PaymentCard(double balance) {
        this.balance = (balance > 150) ? 150 : balance;
    }

    @Override
    public String toString() {
        String message = "The card has a balance of %.2f euros".formatted(this.balance);

        return message;
    }

    public void eatAffordably() {
        if (this.balance >= AFFORDABLE_PRICE) {
            this.balance -= AFFORDABLE_PRICE;
        }
    }

    public void eatHeartily() {
        if (this.balance >= HEARTY_PRICE) {
            this.balance -= HEARTY_PRICE;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            double newBalance = this.balance + amount;

            this.balance = (newBalance > 150) ? 150 : newBalance;
        }
    }

}
