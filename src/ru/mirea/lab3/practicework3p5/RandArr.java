package ru.mirea.lab3.practicework3p5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandArr {
    private int[] rArr;
    private int n;

    public RandArr() {
        System.out.println("Введите число - желаемый размер массива");
        Scanner sc = new Scanner(System.in);
        Mark1: while (true) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n<=0) {
                    System.out.println("ошибка ввода");
                    continue Mark1;
                }
                    break;
            } else {
                System.out.println("ошибка ввода");
                sc.next();
                continue Mark1;
            }
        }
        rArr=new int[n];
        Random r=new Random();
        int countOfEven=0, j=0;
        for (int i=0; i<rArr.length; i++){
            rArr[i]=r.nextInt(0,n+1);
            if (rArr[i]%2==0) {countOfEven++;}
        }
        int [] rArrEven=new int[countOfEven];
        System.out.println("Сгенерированный массив:");
        System.out.println(Arrays.toString(rArr));
        for (int i=0; i<rArr.length; i++){
            if (rArr[i] % 2 == 0){
                rArrEven[j]=rArr[i];
                j++;
            }
        }
        System.out.println("Массив только из четных элементов первого массива");
        System.out.println(Arrays.toString(rArrEven));
    }
}
