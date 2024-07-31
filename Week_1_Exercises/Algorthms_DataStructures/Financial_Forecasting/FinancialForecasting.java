package Financial_Forecasting;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double principal, double growthRate, int years) {
        if (years == 0) {
            return principal;
        }
        return calculateFutureValue(principal * (1 + growthRate), growthRate, years - 1);
    }
}
