package Observer_Pattern;

// MobileApp.java
public class MobileApp implements StockObserver {
    @Override
    public void update(double stockPrice) {
        System.out.println("Mobile App: Stock price updated to $" + stockPrice);
    }
}

