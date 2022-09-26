package ru.mirea.lab3.practicework3p3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] rArr=new int[4];
        Random r=new Random();
        for (int i=0; i<rArr.length; i++) {
            rArr[i] = r.nextInt(10, 100);
        }
        System.out.println(Arrays.toString(rArr));
        boolean IsIncreasingSequence=true;
        for (int i=0; i<rArr.length-1; i++){
            if (rArr[i]>=rArr[i+1]){
                IsIncreasingSequence=false;
            }
        }
        if (IsIncreasingSequence==true){
            System.out.println("массив является строго возрастающей последовательностью");
        } else {
            System.out.println("массив не является строго возрастающей последовательностью");
        }
    }
}
