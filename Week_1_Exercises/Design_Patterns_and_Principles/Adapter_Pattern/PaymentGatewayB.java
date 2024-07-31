package Adapter_Pattern;

// PaymentGatewayB class with its own method
public class PaymentGatewayB {
    public void executeTransaction(double amount) {
        System.out.println("Payment of $" + amount + " processed by PaymentGatewayB.");
    }
}

