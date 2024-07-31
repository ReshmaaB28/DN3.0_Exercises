package Ecommerce_Platform_Search_Function;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];

            int comparison = midProduct.getProductId().compareTo(productId);
            if (comparison == 0) {
                return midProduct;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        // Example usage
        Product[] products = {
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Smartphone", "Electronics"),
                new Product("P003", "Tablet", "Electronics")
        };

        // Sort products by productId for binary search
        Arrays.sort(products, Comparator.comparing(Product::getProductId));

        Product result = binarySearch(products, "P002");
        System.out.println(result != null ? result : "Product not found.");
    }
}

