package ru.mirea.lab4.practicework4p1p10;

public class Main {
    public static void main(String[] args) {
        Car c1=new Car(); Airplane a1=new Airplane();
        System.out.println("Car");
        c1.trTimeAndCostPassenger();
        c1.trTimeAndCostCargo();
        System.out.println("Airplane");
        a1.trTimeAndCostPassenger();
        a1.trTimeAndCostCargo();
    }
}
