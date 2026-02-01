class Car {
    String brand;
    String model;
    double price;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }
}

public class code3 {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.brand = "Toyota";
        c1.model = "Innova";
        c1.price = 2500000;

        c1.display();
    }
}
