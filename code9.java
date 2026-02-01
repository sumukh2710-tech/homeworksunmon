class Mobile {
    String brand;
    int batteryPercentage;

    void charge(int percent) {
        batteryPercentage = batteryPercentage + percent;
        if (batteryPercentage > 100) {
            batteryPercentage = 100;
        }
        System.out.println("Charging... Battery: " + batteryPercentage + "%");
    }

    void useBattery(int percent) {
        batteryPercentage = batteryPercentage - percent;
        if (batteryPercentage < 0) {
            batteryPercentage = 0;
        }
        System.out.println("Using phone... Battery: " + batteryPercentage + "%");
    }

    void displayStatus() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Battery: " + batteryPercentage + "%");
        System.out.println("--------------------");
    }
}

public class code9 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();

        m1.brand = "Samsung";
        m1.batteryPercentage = 50;

        m1.displayStatus();

        m1.charge(30);
        m1.charge(40);   // should cap at 100

        m1.useBattery(20);
        m1.useBattery(80); // should not go below 0
    }
}
