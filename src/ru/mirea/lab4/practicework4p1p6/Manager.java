package ru.mirea.lab4.practicework4p1p6;

public class Manager extends Employer {
    private double avarageSum;
    @Override
    public double getIncomePerYear(){
       return super.getIncomePerYear()+avarageSum;
    }

    public Manager(String firstName, String lastName, double income, double avarageSum) {
        super(firstName, lastName, income);
        this.avarageSum = avarageSum;
    }

    @Override
    public String toString() {
        return super.toString()+ "Manager{" +
                "avarageSum=" + avarageSum +
                '}';
    }
}
