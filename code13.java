class Employee {
    private double salary;

    // Setter with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Salary cannot be negative.");
        }
    }

    // Getter
    public double getSalary() {
        return salary;
    }
}

public class code13 {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setSalary(45000);   // valid
        e1.setSalary(5000);   // invalid

        System.out.println("Employee Salary: ₹" + e1.getSalary());
    }
}
