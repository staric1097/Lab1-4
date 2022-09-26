package ru.mirea.lab4.practicework4p1p6;

public class Employer {
    private String firstName, lastName;
    private double income;
    public double getIncomePerYear(){
        return income*12;
    }

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", income=" + income +
                '}';
    }
}
