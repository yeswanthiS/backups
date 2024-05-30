package javaday9.assignments;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList; // Import ArrayList
import java.util.Collections;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters and setters for name and salary

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Custom Comparator to compare Employee objects by salary and then by name
    public static Comparator<Employee> salaryThenNameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            // Compare by salary first
            int salaryComparison = Double.compare(emp1.getSalary(), emp2.getSalary());
            if (salaryComparison != 0) {
                return salaryComparison;
            }
            // If salary is the same, compare by name
            return emp1.getName().compareTo(emp2.getName());
        }
    };

    public static void main(String[] args) {
        // Create a mutable list of Employee objects using ArrayList
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Alice", 60000));
        employees.add(new Employee("Bob", 60000));
        employees.add(new Employee("David", 55000));
        employees.add(new Employee("Alice", 55000));

        // Sort the list using the custom Comparator
        Collections.sort(employees, Employee.salaryThenNameComparator);

        // Print the sorted list
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - " + employee.getSalary());
        }
    }
}