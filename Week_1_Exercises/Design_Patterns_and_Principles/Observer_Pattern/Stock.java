package Observer_Pattern;

// Stock.java
import java.util.List;

public interface Stock {
    void registerObserver(StockObserver observer);
    void deregisterObserver(StockObserver observer);
    void notifyObservers();
}

