package Employee_Management_System;

public class EmployeeManagementSystemTest {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        // Create some employee instances
        Employee emp1 = new Employee("E001", "Taylor", "Manager", 75000);
        Employee emp2 = new Employee("E002", "IU", "Developer", 55000);
        Employee emp3 = new Employee("E003", "Reshmaa", "Designer", 50000);

        // Add employees
        ems.addEmployee(emp1);
        ems.addEmployee(emp2);
        ems.addEmployee(emp3);

        // Traverse and print employees
        System.out.println("Employees in the system:");
        ems.traverseEmployees();

        // Search for an employee
        System.out.println("\nSearch for employee with ID E002:");
        Employee foundEmp = ems.searchEmployee("E002");
        System.out.println(foundEmp != null ? foundEmp : "Employee not found.");

        // Delete an employee
        System.out.println("\nDelete employee with ID E003:");
        ems.deleteEmployee("E003");

        // Traverse and print employees after deletion
        System.out.println("\nEmployees in the system after deletion:");
        ems.traverseEmployees();
    }
}

