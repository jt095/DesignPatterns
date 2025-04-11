package Composite.Equipment;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeEquipment extends Equipment{
    private final List<Equipment> _equipment = new ArrayList<Equipment>();
    public CompositeEquipment(String name) {
        super(name);
    }

    public void add(Equipment equipment) {
        _equipment.add(equipment);
    }

    public void remove(Equipment equipment) {
        _equipment.remove(equipment);
    }

    public void printEquipment() {
        for (Equipment e : _equipment) {
            System.out.println(e.getName());
        }
    }

    @Override
    public float power() {
        float p = 0;
        for (Equipment e : _equipment) {
            p += e.power();
        }
        return p;
    }

    @Override
    public float netPrice() {
        float p = 0;
        for (Equipment e : _equipment) {
            p += e.netPrice();
        }
        return p;
    }

    @Override
    public float discountPrice() {
        float p = 0;
        for (Equipment e : _equipment) {
            p += e.discountPrice();
        }
        return p;
    }
}
