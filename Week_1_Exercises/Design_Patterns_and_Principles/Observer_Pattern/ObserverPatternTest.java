package Observer_Pattern;

// ObserverPatternTest.java
public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create StockMarket instance
        StockMarket stockMarket = new StockMarket();

        // Create StockObserver instances
        StockObserver mobileApp = new MobileApp();
        StockObserver webApp = new WebApp();

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Change stock price and notify observers
        stockMarket.setStockPrice(150.00);
        stockMarket.setStockPrice(155.50);

        // Deregister one observer and change stock price
        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setStockPrice(160.00);
    }
}

