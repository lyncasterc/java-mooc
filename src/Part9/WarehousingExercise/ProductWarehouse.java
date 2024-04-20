package Part9.WarehousingExercise;

public class ProductWarehouse extends Warehouse {
    private String name;

    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": " + super.toString();
    }
}
