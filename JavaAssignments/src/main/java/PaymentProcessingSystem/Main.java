package PaymentProcessingSystem;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("CREDIT10001");
        creditCard.connect();
        creditCard.processPayment(100.0F);
        Paypal paypal = new Paypal("PAYPAL10001");
        paypal.connect();
        paypal.processPayment(100);
        Upi upi = new Upi("UPI10001");
        upi.connect();
        upi.processPayment(200.0F);
    }
}