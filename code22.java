class Vehicle {
    String brand;
    int speed;

    // Parent class constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Car extends Vehicle {
    String fuelType;

    // Child class constructor using super
    Car(String brand, int speed, String fuelType) {
        super(brand, speed); // calls Vehicle constructor
        this.fuelType = fuelType;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class code22 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, "Petrol");
        car.display();
    }
}

