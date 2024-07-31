package Observer_Pattern;

// WebApp.java
public class WebApp implements StockObserver {
    @Override
    public void update(double stockPrice) {
        System.out.println("Web App: Stock price updated to $" + stockPrice);
    }
}

