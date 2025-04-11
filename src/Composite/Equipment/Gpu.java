package Composite.Equipment;

public class Gpu extends Equipment {
    public Gpu(String name) {
        super(name);
    }

    @Override
    public float power() {
        return 200;
    }

    @Override
    public float netPrice() {
        return 500;
    }

    @Override
    public float discountPrice() {
        return 400;
    }
}
