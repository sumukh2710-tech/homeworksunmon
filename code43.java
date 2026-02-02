abstract class Employee {

    // abstract method
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {

    double monthlySalary = 40000;

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    int hoursWorked = 80;
    double ratePerHour = 300;

    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

public class code43 {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        System.out.println("Full Time Employee Salary: " + e1.calculateSalary());
        System.out.println("Part Time Employee Salary: " + e2.calculateSalary());
    }
}
