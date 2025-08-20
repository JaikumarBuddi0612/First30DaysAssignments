package PaymentProcessingSystem;

public interface PaymentMethod {
    abstract public void processPayment(float amount);

    abstract void processPayment(int amount);

    abstract public void connect();
}
