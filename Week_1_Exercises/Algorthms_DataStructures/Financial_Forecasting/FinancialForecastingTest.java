package Financial_Forecasting;

public class FinancialForecastingTest {
    public static void main(String[] args) {
        double principal = 1000.0; // Initial amount
        double growthRate = 0.05;  // Annual growth rate (5%)
        int years = 10;            // Number of years

        double futureValue = FinancialForecasting.calculateFutureValue(principal, growthRate, years);
        System.out.printf("Future Value after %d years (Recursive): $%.2f%n", years, futureValue);

        // Expected Output: Future Value after 10 years: $1647.01
    }
}

