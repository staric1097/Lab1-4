package ru.mirea.lab3.obolochki;

public class Main {
     public static void main(String[] args) {
         //1
        Double d1=Double.valueOf(3.4);
        Double d2=Double.valueOf(-0.5);
         //2
        Double d3=Double.parseDouble("3.14");
         //3
        Double d4=Double.valueOf(10);
        System.out.println(d4.byteValue());
        System.out.println(d4.doubleValue());
        System.out.println(d4.floatValue());
        System.out.println(d4.intValue());
        System.out.println(d4.longValue());
        System.out.println(d4.shortValue());
        //4
         System.out.println(d4);
         //5
         String s1=Double.toString(d4);
    }
}
