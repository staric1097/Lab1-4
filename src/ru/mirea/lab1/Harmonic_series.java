package ru.mirea.lab1;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Harmonic_series {
     static public void Get_harmonic_series (){
         DecimalFormat df = new DecimalFormat("#.####");
         df.setRoundingMode(RoundingMode.CEILING);
         for (int i=1; i<10; i++ ){
             System.out.println(df.format(1./i)+' ');
         }
     }
}
