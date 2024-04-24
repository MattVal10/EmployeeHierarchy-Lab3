// Matthew Valencia 

// Lab 3: Employee Hierarchy 

// April 23 2024 

// Youtube, W3 Schools, Chatgpt, 


// Employee.java

// This class represents an employee with basic information such as
// first name, last name, and social security number.

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // Constructor for Employee
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Getter for first name
    public String getFirstName() {
        return firstName;
    }

    // Getter for last name
    public String getLastName() {
        return lastName;
    }

    // Getter for social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // Overriding the toString method to include employee details
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n",
                "employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber());
    }
}



