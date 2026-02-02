class Employee {
    void calculateBonus() {
        System.out.println("Calculating employee bonus");
    }
}

class Developer extends Employee {
    @Override
    void calculateBonus() {
        System.out.println("Developer bonus: 10% of salary");
    }
}

class Manager extends Employee {
    @Override
    void calculateBonus() {
        System.out.println("Manager bonus: 20% of salary");
    }
}

public class code39 {
    public static void main(String[] args) {

        Employee e1 = new Developer(); // parent reference
        Employee e2 = new Manager();

        e1.calculateBonus(); // Developer logic
        e2.calculateBonus(); // Manager logic
    }
}
