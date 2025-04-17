package Iterators;

public class Employee {
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String printName() {
        return firstName + " " + lastName;
    }

    private String firstName;
    private String lastName;
}
