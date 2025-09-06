abstract class Payment {
    abstract void pay();
}

class CreditCardPayment extends Payment {
    String cardNumber;
    double amount;

    void setDetails(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    @Override
    void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + "  Rs. " + amount + " Paid");
    }
}

class UPIPayment extends Payment {
    String upiId;
    double amount;

    void setDetails(String upiId, double amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    @Override
    void pay() {
        System.out.println("Payment via UPI " + upiId + " Rs. " + amount + " Paid");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        ((CreditCardPayment)p1).setDetails("1234567890123456", 5000);
        p1.pay();

        Payment p2 = new UPIPayment();
        ((UPIPayment)p2).setDetails("rahul@upi", 2000);
        p2.pay();
    }
}
