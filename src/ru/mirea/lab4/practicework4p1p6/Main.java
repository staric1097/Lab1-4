package ru.mirea.lab4.practicework4p1p6;

public class Main {
    public static void main(String[] args) {
        Manager m1=new Manager("Alex", "Krutov",124000, 50000);
        Employer em1=m1;
        Employer em2=new Employer("Sasha","Matveev", 115000);
        Manager m2=new Manager("Nastya","Antonova", 78000,64000);

        Employer [] arr1={em2,m1,m2};
        for (int i=0; i<arr1.length; i++){
            System.out.println(arr1[i].toString());
            System.out.println(arr1[i].getIncomePerYear());
        }
    }
}
