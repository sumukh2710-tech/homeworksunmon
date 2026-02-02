interface BankService {

    void deposit(double amount);
    void withdraw(double amount);
}

class SavingsAccount implements BankService {

    private double balance = 5000;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Account Deposit: " + amount);
        System.out.println("Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings Account Withdraw: " + amount);
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
        System.out.println("Balance: " + balance);
    }
}

class CurrentAccount implements BankService {

    private double balance = 10000;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current Account Deposit: " + amount);
        System.out.println("Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Current Account Withdraw: " + amount);
        } else {
            System.out.println("Insufficient balance in Current Account");
        }
        System.out.println("Balance: " + balance);
    }
}

public class code48 {
    public static void main(String[] args) {

        BankService acc1 = new SavingsAccount();
        BankService acc2 = new CurrentAccount();

        acc1.deposit(2000);
        acc1.withdraw(1500);

        acc2.deposit(3000);
        acc2.withdraw(12000);
    }
}

