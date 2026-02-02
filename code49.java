interface OnlinePayment {

    void processPayment();
}

class Paytm implements OnlinePayment {

    @Override
    public void processPayment() {
        System.out.println("Payment processed using Paytm");
    }
}

class GooglePay implements OnlinePayment {

    @Override
    public void processPayment() {
        System.out.println("Payment processed using Google Pay");
    }
}

public class code49 {
    public static void main(String[] args) {

        OnlinePayment p1 = new Paytm();
        OnlinePayment p2 = new GooglePay();

        p1.processPayment();
        p2.processPayment();
    }
}
