package ru.mirea.lab1;

public class Main {
    public static void main(String[] args) {
        //аргументы командной строки

/*        System.out.println("Argument count: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }*/
        Array();
        //Factorial();
        //Harmonic_series();
    }
    //Массивы
    static void Array(){
        Array arr1=new Array();
        arr1.Input_arr();
        System.out.println(arr1.toString());
    }
    //факториал числа
    static void Factorial(){
        System.out.print(Factorial.CTF());
    }
    //первые 10 чисел гармонического ряда
    static void Harmonic_series(){
        Harmonic_series.Get_harmonic_series();
    }
}

