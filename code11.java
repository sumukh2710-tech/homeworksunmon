class BankAccount {
    private double balance;

    // Deposit method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }
}

public class code11 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(5000);
        acc.deposit(-100);   // invalid

        acc.withdraw(2000);
        acc.withdraw(4000); // insufficient balance

        System.out.println("Final Balance: ₹" + acc.getBalance());
    }
}
