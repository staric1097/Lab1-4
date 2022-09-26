package ru.mirea.lab4.practicework4p1p10;

public class Airplane extends Transport {
    @Override
    public void trTimeAndCostPassenger(){
        System.out.println("Применая цена на 100 км пути для одного пассажира: 1667 рублей");
    }
    @Override
    public void trTimeAndCostCargo(){
        System.out.println("Применая цена на 100 км пути для 10кг груза: 1016 рублей");
    }
}
