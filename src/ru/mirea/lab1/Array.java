package ru.mirea.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private int[] arr_CF;
    private int Sum_for=0, Sum_while=0, max, min;
    private double av;

    public int[] getArr_CF() {
        return arr_CF;
    }

    public void setArr_CF(int[] arr_CF) {
        this.arr_CF = arr_CF;
    }

    public void Find_arrInf(){
        for (int i=0; i<arr_CF.length; i++){
            Sum_for+=arr_CF[i];
        }
        int N=0;
        max=arr_CF[N];         min=arr_CF[N];
        while (N<arr_CF.length){
            if (arr_CF[N]<min) {
                min=arr_CF[N];
            }
            if (arr_CF[N]>max) {
                max=arr_CF[N];
            }
            Sum_while+=arr_CF[N];
            N++;
        }
        av=1.0*Sum_for/arr_CF.length;

    }
    public void Input_arr () {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите желаемую длинну массива");
        int N=sc.nextInt();
        System.out.println("Введите элименты массива");
        this.arr_CF=new int[N];
        Mark1:
        for (int i=0; i<N; i++) {
            if (sc.hasNextInt()){
                this.arr_CF[i]=sc.nextInt();
            }else {
                System.out.println("input error, repeat the input");
                i--;
                sc.next();
                continue Mark1;
            }
        }

    }
    public static void Print (int[] arr_CF) {
     for (int i=0; i<arr_CF.length; i++) {
         System.out.print(arr_CF[i]+" ");
     }
    }
    @Override
    public String toString() {
        this.Find_arrInf();
        return "Array{" +
                "arr_CF=" + Arrays.toString(arr_CF) +
                ", Sum_for=" + Sum_for +
                ", Sum_while=" + Sum_while +
                ", av=" + av +
                ", max=" + max +
                ", min=" + min +
                '}';
    }
}
