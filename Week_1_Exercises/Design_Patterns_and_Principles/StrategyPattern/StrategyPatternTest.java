package StrategyPattern;

// StrategyPatternTest.java
public class StrategyPatternTest {
    public static void main(String[] args) {
        // Create payment strategies
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");

        // Create payment contexts with different strategies
        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        paymentContext.executePayment(250.00);  // Pays $250 using Credit Card

        paymentContext = new PaymentContext(payPalPayment);
        paymentContext.executePayment(150.00);  // Pays $150 using PayPal
    }
}

