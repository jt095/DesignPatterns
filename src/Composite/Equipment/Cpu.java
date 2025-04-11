package Composite.Equipment;

public class Cpu extends Equipment {
    public Cpu(String name) {
        super(name);
    }

    @Override
    public float power() {
        return 50;
    }

    @Override
    public float netPrice() {
        return 300;
    }

    @Override
    public float discountPrice() {
        return 250;
    }
}
