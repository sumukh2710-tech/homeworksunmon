abstract class Shape {

    abstract void area();

    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius = 7;

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class code41 {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.display();
        s1.area();

        System.out.println();

        s2.display();
        s2.area();
    }
}

