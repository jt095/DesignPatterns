package Composite.Equipment;

import java.util.Iterator;

// base component
public abstract class Equipment {
    public String getName() {
        return name;
    };

    public abstract float power();
    public abstract float netPrice();
    public abstract float discountPrice();

    private final String name;

    public Equipment(String name) {
        this.name = name;
    }
}
