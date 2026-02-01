class Employee {
    String name;
    double salary;
}

class Developer extends Employee {
    void code() {
        System.out.println(name + " is coding.");
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    void manageTeam() {
        System.out.println(name + " is managing the team.");
        System.out.println("Salary: " + salary);
    }
}

public class code25 {
    public static void main(String[] args) {

        Developer dev = new Developer();
        dev.name = "Sumukh";
        dev.salary = 60000;
        dev.code();

        System.out.println();

        Manager mgr = new Manager();
        mgr.name = "Rahul";
        mgr.salary = 90000;
        mgr.manageTeam();
    }
}
