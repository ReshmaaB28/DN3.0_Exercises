package Adapter_Pattern;

// Adapter for PaymentGatewayB
public class PaymentGatewayBAdapter implements PaymentProcessor {
    private PaymentGatewayB gatewayB;

    public PaymentGatewayBAdapter(PaymentGatewayB gatewayB) {
        this.gatewayB = gatewayB;
    }

    @Override
    public void processPayment(double amount) {
        gatewayB.executeTransaction(amount);
    }
}

