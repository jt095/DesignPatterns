package Composite.Equipment;

public class BuildPc {
    public static void main(String[] args) {
        System.out.println("Let's build a PC");

        Case pcCase = new Case("NZXT");
        Motherboard mobo = new Motherboard("Gaming Motherboard");

        Cpu cpu = new Cpu("Ryzen 7");
        Gpu gpu = new Gpu("RTX 4070 Super");
        Psu psu = new Psu("500W Psu");
        Ram ram = new Ram("Corsair 64GB RAM");
        Storage storage = new Storage("Samsung Evo 970 1TB SSD");

        pcCase.add(mobo);
        pcCase.add(cpu);
        pcCase.add(gpu);
        pcCase.add(psu);
        pcCase.add(ram);
        pcCase.add(storage);

        System.out.println("This PC contains the following components:");
        pcCase.printEquipment();

        System.out.println("At a total power usage of: "+ pcCase.power());
        System.out.println("Total Cost: " + pcCase.netPrice());
        System.out.println("Discount Total Cost: " + pcCase.discountPrice());

    }
}
