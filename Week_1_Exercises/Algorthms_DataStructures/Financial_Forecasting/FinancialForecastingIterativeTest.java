package Financial_Forecasting;

public class FinancialForecastingIterativeTest {
    public static void main(String[] args) {
        double principal = 1000.0; // Initial amount
        double growthRate = 0.05;  // Annual growth rate (5%)
        int years = 10;            // Number of years

        double futureValue = FinancialForecastingIterative.calculateFutureValue(principal, growthRate, years);
        System.out.printf("Future Value after %d years (Iterative): $%.2f%n", years, futureValue);

        // Expected Output: Future Value after 10 years: $1647.01
    }
}

