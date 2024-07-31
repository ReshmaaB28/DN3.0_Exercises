package Adapter_Pattern;

// PaymentGatewayA class with its own method
public class PaymentGatewayA {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " processed by PaymentGatewayA.");
    }
}

