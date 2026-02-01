class Employee {
    String name;
    double basicSalary;

    double calculateGrossSalary() {
        double hra = 0.20 * basicSalary; // 20% HRA
        double da = 0.10 * basicSalary;  // 10% DA
        return basicSalary + hra + da;
    }

    void displaySalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("Gross Salary: ₹" + calculateGrossSalary());
    }
}

public class code5 {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.name = "Sumukh";
        e1.basicSalary = 30000;

        e1.displaySalary();
    }
}
