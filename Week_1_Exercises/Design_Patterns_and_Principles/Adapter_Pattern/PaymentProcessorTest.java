package Adapter_Pattern;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        // Create instances of payment gateways
        PaymentGatewayA gatewayA = new PaymentGatewayA();
        PaymentGatewayB gatewayB = new PaymentGatewayB();

        // Create adapters for the payment gateways
        PaymentProcessor processorA = new PaymentGatewayAAdapter(gatewayA);
        PaymentProcessor processorB = new PaymentGatewayBAdapter(gatewayB);

        // Test payment processing
        processorA.processPayment(100.00);
        processorB.processPayment(200.00);
    }
}

