package Composite.Equipment;

public class Ram extends Equipment {
    public Ram(String name) {
        super(name);
    }

    @Override
    public float power() {
        return 20;
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
