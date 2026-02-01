class Shape {
    String color;
}

class Circle extends Shape {
    double radius;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Shape: Circle");
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    void calculateArea() {
        double area = length * width;
        System.out.println("Shape: Rectangle");
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }
}

public class code24 {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.color = "Red";
        c.radius = 7;
        c.calculateArea();

        System.out.println();

        Rectangle r = new Rectangle();
        r.color = "Blue";
        r.length = 10;
        r.width = 5;
        r.calculateArea();
    }
}

