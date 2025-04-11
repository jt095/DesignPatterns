package Composite.Equipment;

public class Psu extends Equipment {
    public Psu(String name) {
        super(name);
    }

    @Override
    public float power() {
        return 100;
    }

    @Override
    public float netPrice() {
        return 100;
    }

    @Override
    public float discountPrice() {
        return 75;
    }
}
