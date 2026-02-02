class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with name
    Student(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with name and age
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class code35 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Sumukh");
        Student s3 = new Student("Sumukh", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}
