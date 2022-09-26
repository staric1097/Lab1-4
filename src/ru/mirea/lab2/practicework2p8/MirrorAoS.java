package ru.mirea.lab2.practicework2p8;

public class MirrorAoS {
   public static void Swap (String [] StArr){
       for (int i=0; i< StArr.length/2; i++) {
           String temp=StArr[i];
           StArr[i]=StArr[StArr.length-i-1];
           StArr[StArr.length-i-1]=temp;
       }
   }
   public static void Print (String [] StArr){
       for (int i=0; i< StArr.length; i++) {
           System.out.print(StArr[i]+' ');
       }
       System.out.println();
   }
}
