package Dependency_Injection;

// CustomerRepositoryImpl.java
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        // In a real application, this would retrieve the customer from a database
        // Here, we are returning a dummy customer for simplicity
        return new Customer(id, "John Doe", "john.doe@example.com");
    }
}

