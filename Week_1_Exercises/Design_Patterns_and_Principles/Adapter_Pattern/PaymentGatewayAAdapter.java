package Adapter_Pattern;

// Adapter for PaymentGatewayA
public class PaymentGatewayAAdapter implements PaymentProcessor {
    private PaymentGatewayA gatewayA;

    public PaymentGatewayAAdapter(PaymentGatewayA gatewayA) {
        this.gatewayA = gatewayA;
    }

    @Override
    public void processPayment(double amount) {
        gatewayA.makePayment(amount);
    }
}

