package Ecommerce_Platform_Search_Function;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearchTest {
    public static void main(String[] args) {
        // Create some product instances
        Product[] products = {
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Smartphone", "Electronics"),
                new Product("P003", "Tablet", "Electronics")
        };

        // Sort products by productId for binary search
        Arrays.sort(products, Comparator.comparing(Product::getProductId));

        // Test binary search
        Product result = BinarySearch.binarySearch(products, "P002");
        System.out.println(result != null ? result : "Product not found.");
    }
}

