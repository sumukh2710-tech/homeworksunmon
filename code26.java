class Bank {
    double balance;

    Bank(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends Bank {

    SavingsAccount(double balance) {
        super(balance);
    }

    void addInterest() {
        double interest = balance * 0.05; // 5% interest
        balance += interest;
        System.out.println("Savings Account Balance after interest: " + balance);
    }
}

class CurrentAccount extends Bank {

    CurrentAccount(double balance) {
        super(balance);
    }

    void deductCharges() {
        double charges = 500; // fixed service charge
        balance -= charges;
        System.out.println("Current Account Balance after charges: " + balance);
    }
}

public class code26 {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(10000);
        sa.addInterest();

        System.out.println();

        CurrentAccount ca = new CurrentAccount(15000);
        ca.deductCharges();
    }
}
