class ATM {
    private double balance = 10000; // initial balance
    private int pin = 1234;         // default PIN

    // Validate PIN
    private boolean validatePin(int enteredPin) {
        return enteredPin == pin;
    }

    // Withdraw money only if PIN is correct
    public void withdraw(int enteredPin, double amount) {
        if (!validatePin(enteredPin)) {
            System.out.println("Incorrect PIN!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful: ₹" + amount);
            System.out.println("Remaining Balance: ₹" + balance);
        }
    }
}

public class code14 {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.withdraw(1234, 3000);  // correct PIN
        atm.withdraw(1111, 2000);  // wrong PIN
        atm.withdraw(1234, 15000); // insufficient balance
    }
}
