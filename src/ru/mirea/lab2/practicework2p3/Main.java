package ru.mirea.lab2.practicework2p3;

public class Main {
    public static void main(String[] args) {
        //something for thr test
        Point p1=new Point(2,-8);
        Circle c1=new Circle(p1,5);
        Circle c2=new Circle(5,-3,2);
        System.out.println(c2.toString());
        c1.change_pos();
        System.out.println(c1.toString());
    }
}
