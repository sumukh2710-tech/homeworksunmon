class Account {
    int accountNumber;

    Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}

class LoanAccount extends Account {
    double loanAmount;

    LoanAccount(int accountNumber, double loanAmount) {
        super(accountNumber);
        this.loanAmount = loanAmount;
    }

    void calculateEMI() {
        int tenure = 12;          // months
        double rate = 0.10;       // 10% annual interest

        double emi = (loanAmount * rate) / tenure;
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Monthly EMI: " + emi);
    }
}

public class code29 {
    public static void main(String[] args) {
        LoanAccount loan = new LoanAccount(12345, 120000);
        loan.calculateEMI();
    }
}
