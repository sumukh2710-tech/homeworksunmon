class BankAccount {
    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class code4 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.accountHolderName = "Sumukh";
        acc.balance = 10000;

        System.out.println("Account Holder: " + acc.accountHolderName);
        acc.displayBalance();

        acc.deposit(5000);
        acc.displayBalance();

        acc.withdraw(3000);
        acc.displayBalance();

        acc.withdraw(15000); // insufficient balance
    }
}
