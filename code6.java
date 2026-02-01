class Circle {
    double radius;

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

public class code6 {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 7;

        System.out.println("Radius: " + c1.radius);
        System.out.println("Area of Circle: " + c1.calculateArea());
    }
}
