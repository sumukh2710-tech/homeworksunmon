class Car {
    private int speed;

    // Setter with validation
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed! Speed must be between 0 and 200.");
        }
    }

    // Getter
    public int getSpeed() {
        return speed;
    }
}

public class code15 {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.setSpeed(120);   // valid
        c1.setSpeed(250);   // invalid
        c1.setSpeed(-10);   // invalid

        System.out.println("Current Speed: " + c1.getSpeed() + " km/h");
    }
}
