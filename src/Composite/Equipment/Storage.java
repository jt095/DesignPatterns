package Composite.Equipment;

public class Storage extends Equipment {
    public Storage(String name) {
        super(name);
    }

    @Override
    public float power() {
        return 5;
    }

    @Override
    public float netPrice() {
        return 75;
    }

    @Override
    public float discountPrice() {
        return 50;
    }
}
