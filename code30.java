class Appliance {
    int powerRating;

    void turnOn() {
        System.out.println("Appliance is turned ON");
    }
}

class WashingMachine extends Appliance {

    void washClothes() {
        System.out.println("Washing machine is washing clothes");
        System.out.println("Power Rating: " + powerRating + " watts");
    }
}

public class code30 {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();
        wm.powerRating = 2000;

        wm.turnOn();      // inherited method
        wm.washClothes(); // child-specific method
    }
}
