class Printer {

    void print(int number) {
        System.out.println("Number: " + number);
    }

    void print(String message) {
        System.out.println("Message: " + message);
    }

    void print(int number, String message) {
        System.out.println("Number: " + number + ", Message: " + message);
    }
}

public class code33 {
    public static void main(String[] args) {

        Printer p = new Printer();

        p.print(10);
        p.print("Hello World");
        p.print(5, "Java Polymorphism");
    }
}
