class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with ignition");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with kick or self-start");
    }
}

public class code40 {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car(),
            new Bike()
        };

        for (Vehicle v : vehicles) {
            v.start(); // runtime polymorphism
        }
    }
}
