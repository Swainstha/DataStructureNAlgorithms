package Sorting;
public class Employee {
    private long employeeNumber;
    private String firstName;
    private String lastName;
    private String email;

    public Employee(long employeeNumber,String firstName,String lastName, String email) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName =lastName;
        this.email = email;
    }

    public long getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "EmployeeNumber: " + employeeNumber + " Name: " + firstName + " " + lastName + " Email: " + email;
    }
}
