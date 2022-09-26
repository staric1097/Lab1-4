package ru.mirea.lab3.formatting;

public class Employee {
    private String fullname;
    private double salary;

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
