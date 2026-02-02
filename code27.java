class ElectronicDevice {
    String brand;

    void powerOn() {
        System.out.println("Electronic device is powered ON");
    }
}

class Laptop extends ElectronicDevice {
    int ramSize;

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM Size: " + ramSize + " GB");
    }
}

public class code27 {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.brand = "Dell";
        laptop.ramSize = 16;

        laptop.powerOn();     // parent method
        laptop.showDetails(); // child method
    }
}
