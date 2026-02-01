class Rectangle {
    double length;
    double width;

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

public class code2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        r1.length = 10;
        r1.width = 5;

        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
    }
}
