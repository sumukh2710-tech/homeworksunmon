class ATM {
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

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class code8 {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.balance = 10000;

        System.out.println("ATM Simulation Started");
        atm.checkBalance();

        atm.deposit(5000);
        atm.checkBalance();

        atm.withdraw(3000);
        atm.checkBalance();

        atm.withdraw(20000); // insufficient balance
    }
}
