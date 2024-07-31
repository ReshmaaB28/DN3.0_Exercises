package Inventory_Management_System;

public class InventoryManagementTest {
    public static void main(String[] args) {
        // Create an instance of InventoryManagement
        InventoryManagement inventory = new InventoryManagement();

        // Create some product instances
        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 599.99);
        Product product3 = new Product("P003", "Tablet", 15, 399.99);

        // Add products to the inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Print the products to verify addition
        System.out.println("Products after addition:");
        System.out.println(inventory.getProduct("P001"));
        System.out.println(inventory.getProduct("P002"));
        System.out.println(inventory.getProduct("P003"));

        // Update a product
        product2.setPrice(549.99);
        inventory.updateProduct(product2);

        // Print the products to verify update
        System.out.println("\nProducts after update:");
        System.out.println(inventory.getProduct("P001"));
        System.out.println(inventory.getProduct("P002"));
        System.out.println(inventory.getProduct("P003"));

        // Delete a product
        inventory.deleteProduct("P003");

        // Print the products to verify deletion
        System.out.println("\nProducts after deletion:");
        System.out.println(inventory.getProduct("P001"));
        System.out.println(inventory.getProduct("P002"));
        Product deletedProduct = inventory.getProduct("P003");
        System.out.println(deletedProduct != null ? deletedProduct : "Product P003 not found.");
    }
}

