class Mobile {
    private int batteryLevel;

    // Charge the battery
    public void charge(int amount) {
        if (amount > 0) {
            batteryLevel += amount;
            if (batteryLevel > 100) {
                batteryLevel = 100;
            }
            System.out.println("Charging... Battery: " + batteryLevel + "%");
        } else {
            System.out.println("Invalid charge amount!");
        }
    }

    // Use the battery
    public void use(int amount) {
        if (amount > 0) {
            batteryLevel -= amount;
            if (batteryLevel < 0) {
                batteryLevel = 0;
            }
            System.out.println("Using phone... Battery: " + batteryLevel + "%");
        } else {
            System.out.println("Invalid usage amount!");
        }
    }

    // Getter
    public int getBatteryLevel() {
        return batteryLevel;
    }
}

public class code16 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();

        m1.charge(40);
        m1.charge(80);   // should cap at 100

        m1.use(30);
        m1.use(100);    // should not go below 0

        System.out.println("Final Battery Level: " + m1.getBatteryLevel() + "%");
    }
}
