class Student {
    String name;
    int age;
    double marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

class code1 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Sumukh";
        s1.age = 20;
        s1.marks = 88.5;
        s1.display();
    }
}
