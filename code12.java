class Student {
    private String name;
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks must be between 0 and 100.");
        }
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class code12 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Sumukh");
        s1.setMarks(90);
        s1.setMarks(150);

        System.out.println("Student Name: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
    }
}


