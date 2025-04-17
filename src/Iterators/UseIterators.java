package Iterators;

import java.util.ListIterator;

public class UseIterators {
    public static void main(String[] args) {

        ObjectList<Employee> employees = new ObjectList<>();
        employees.append(new Employee("John", "Doe"));
        employees.append(new Employee("Jack", "Black"));
        employees.append(new Employee("Ryan", "Brown"));
        employees.append(new Employee("Jane", "Doe"));
        employees.append(new Employee("Brian", "List"));

        ObjectListIterator<Employee> employeesListIterator = new ObjectListIterator<>(employees);
        printEmployees(employeesListIterator);
    }

    public static void printEmployees(ObjectIterator<Employee> iterator) {
        iterator.first();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem().printName());
            iterator.next();
        }
    }
}
