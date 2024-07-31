package Ecommerce_Platform_Search_Function;

public class LinearSearchTest {
    public static void main(String[] args) {
        // Create some product instances
        Product[] products = {
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Smartphone", "Electronics"),
                new Product("P003", "Tablet", "Electronics")
        };

        // Test linear search
        Product result = LinearSearch.linearSearch(products, "P002");
        System.out.println(result != null ? result : "Product not found.");
    }
}

