// Matthew Valencia 

// Lab 3: Employee Hierarchy 

// April 23 2024 

// Youtube, W3 Schools, Chatgpt, 


// EmployeeTestClass.java

// This class is the main class that contains the main method. It creates instances
// of the CommissionEmployee and BasePlusCommissionEmployee classes and demonstrates
// their functionality by printing information about the employees.

public class EmployeeTestClass {
    public static void main(String[] args) {
        // Creating a CommissionEmployee instance
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "John", "Doe", "123-45-6789", 5000, 0.05);
        
        // Creating a BasePlusCommissionEmployee instance
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "Jane", "Smith", "987-65-4321", 8000, 0.04, 200);

        // Printing information about commission employee
        System.out.println("Commission Employee:");
        System.out.printf("First Name: %s%n", commissionEmployee.getFirstName());
        System.out.printf("Last Name: %s%n", commissionEmployee.getLastName());
        System.out.printf("Social Security Number: %s%n", commissionEmployee.getSocialSecurityNumber());
        System.out.printf("Gross Sales: %.2f%n", commissionEmployee.getGrossSales());
        System.out.printf("Commission Rate: %.2f%n", commissionEmployee.getCommissionRate());
        System.out.printf("Earnings: %.2f%n", commissionEmployee.earnings());
        System.out.println(commissionEmployee.toString());
        System.out.println();

        // Printing information about base plus commission employee
        System.out.println("Base Plus Commission Employee:");
        System.out.printf("First Name: %s%n", basePlusCommissionEmployee.getFirstName());
        System.out.printf("Last Name: %s%n", basePlusCommissionEmployee.getLastName());
        System.out.printf("Social Security Number: %s%n", basePlusCommissionEmployee.getSocialSecurityNumber());
        System.out.printf("Gross Sales: %.2f%n", basePlusCommissionEmployee.getGrossSales());
        System.out.printf("Commission Rate: %.2f%n", basePlusCommissionEmployee.getCommissionRate());
        System.out.printf("Base Salary: %.2f%n", basePlusCommissionEmployee.getBaseSalary());
        System.out.printf("Earnings: %.2f%n", basePlusCommissionEmployee.earnings());
        System.out.println(basePlusCommissionEmployee.toString());
    }
}
