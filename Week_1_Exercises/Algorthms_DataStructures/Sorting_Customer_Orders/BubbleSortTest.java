package Sorting_Customer_Orders;

public class BubbleSortTest {
    public static void main(String[] args) {
        // Create some order instances
        Order[] orders = {
                new Order("O001", "Alice", 250.50),
                new Order("O002", "Bob", 150.75),
                new Order("O003", "Charlie", 300.40)
        };

        // Sort orders using Bubble Sort
        BubbleSort.bubbleSort(orders);

        // Print sorted orders
        System.out.println("Orders sorted by total price using Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

