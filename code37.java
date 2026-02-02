class Shape {
    void area() {
        System.out.println("Calculating area of shape");
    }
}

class Circle extends Shape {
    double radius = 7;

    @Override
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class code37 {
    public static void main(String[] args) {

        Shape s1 = new Circle();     // parent reference
        Shape s2 = new Rectangle();  // parent reference

        s1.area(); // Circle's area()
        s2.area(); // Rectangle's area()
    }
}
