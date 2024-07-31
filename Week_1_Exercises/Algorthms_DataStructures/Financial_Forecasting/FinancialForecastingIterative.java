package Financial_Forecasting;

public class FinancialForecastingIterative {

    // Iterative method to calculate future value
    public static double calculateFutureValue(double principal, double growthRate, int years) {
        double futureValue = principal;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}

