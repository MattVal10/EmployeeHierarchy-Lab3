// Matthew Valencia 

// Lab 3: Employee Hierarchy 

// April 23 2024 

// Youtube, W3 Schools, Chatgpt, 

// BasePlusCommissionEmployee.java

// This class extends the CommissionEmployee class and represents an employee
// who earns a base salary in addition to a commission based on sales.

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // base salary per week
 
    // Constructor for BasePlusCommissionEmployee
    public BasePlusCommissionEmployee(String firstName, String lastName, 
                                      String socialSecurityNumber, double grossSales, 
                                      double commissionRate, double baseSalary) {
        // Calling the constructor of the superclass (CommissionEmployee)
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        // Checking if the base salary is valid
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        }
 
        this.baseSalary = baseSalary;
    }
 
    // Setter for base salary
    public void setBaseSalary(double baseSalary) {
        // Checking if the base salary is valid
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        }
 
        this.baseSalary = baseSalary;
    }
 
    // Getter for base salary
    public double getBaseSalary() {
        return baseSalary;
    }
 
    // Overriding the earnings method to include the base salary
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }
 
    // Overriding the toString method to include the base salary
    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());
    }
 }
 

