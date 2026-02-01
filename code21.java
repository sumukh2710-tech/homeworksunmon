class Person {
    String name;
    int age;
}

class Student extends Person {
    int rollNumber;
    double marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class code21 {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Sumukh";
        s.age = 20;
        s.rollNumber = 101;
        s.marks = 88.5;

        s.display();
    }
}
