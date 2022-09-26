package ru.mirea.lab2.practicework2p3;
import java.util.Arrays;
import java.util.Scanner;

public class Circle {
    private double[] center=new double[2];
    private double r;

    public Circle(double x, double y, double r) {
        this.center[0] = x;
        this.center[1] = y;
        this.r = r;
    }

    public Circle(Point p, double r) {
        this.center[0]=p.getX();
        this.center[1]=p.getY();
        this.r = r;
    }

    public void setCenter(double[] center) {
        this.center = center;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void change_pos(){
        System.out.println("Введите два числа, отвечающие за координаты, на которые вы хотите передвинуть центр окружности.\n координата x+/- введенное значения; координата y+/- введенное значение");
        Scanner in=new Scanner(System.in);
        Mark1:
        for (int i=0; i<2; i++){
            if (in.hasNextDouble()){
                center[i]+= in.nextDouble();
            }
            else{
                System.out.println("ошибка ввода");
                i--;
                in.next();
                continue Mark1;
            }
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + Arrays.toString(center) +
                ", r=" + r +
                '}';
    }
}
