class SalaryCalculator {

    double calculateSalary(double basic) {
        return basic;
    }

    double calculateSalary(double basic, double bonus) {
        return basic + bonus;
    }
}

public class code34 {
    public static void main(String[] args) {

        SalaryCalculator sc = new SalaryCalculator();

        System.out.println("Salary without bonus: " + sc.calculateSalary(30000));
        System.out.println("Salary with bonus: " + sc.calculateSalary(30000, 5000));
    }
}
