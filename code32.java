class Area {

    // Area of Square
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    // Area of Rectangle
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    // Area of Circle
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

public class code32 {
    public static void main(String[] args) {

        Area a = new Area();

        a.area(5);          // square
        a.area(10, 4);      // rectangle
        a.area(7.0);        // circle
    }
}
