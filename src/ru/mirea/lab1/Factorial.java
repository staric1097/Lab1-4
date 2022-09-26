package ru.mirea.lab1;

import com.sun.source.tree.ContinueTree;

import java.util.Scanner;

public class Factorial {
    static public int CTF(){
        System.out.println("Введите число");
        Scanner in =new Scanner(System.in);
        int result=1;
        if (in.hasNextInt()){
            int i=in.nextInt();
            if (i<0) {
                System.out.println("input err");
                System.exit(0);
            }
            while (i>1) {
                result *= 1 * i;
                i--;
            }
        } else{
            System.out.println("input err");
            System.exit(0);
        }
        return result;
    }
}
