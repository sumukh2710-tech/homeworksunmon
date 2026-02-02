abstract class Payment {

    // abstract method
    abstract void pay(double amount);
}

class UPI extends Payment {

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CreditCard extends Payment {

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

public class code44 {
    public static void main(String[] args) {

        Payment p1 = new UPI();
        Payment p2 = new CreditCard();

        p1.pay(1500);
        p2.pay(3000);
    }
}
