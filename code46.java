interface Remote {

    void turnOn();
    void turnOff();
}

class TV implements Remote {

    @Override
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

class AC implements Remote {

    @Override
    public void turnOn() {
        System.out.println("AC is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is turned OFF");
    }
}

public class code46 {
    public static void main(String[] args) {

        Remote r1 = new TV();
        Remote r2 = new AC();

        r1.turnOn();
        r1.turnOff();

        r2.turnOn();
        r2.turnOff();
    }
}
