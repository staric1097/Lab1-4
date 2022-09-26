package ru.mirea.lab4.practicework4p3;


import java.util.Arrays;
import java.util.Scanner;

public class UserDatabase {
    private MyUser Database[];
    public void addNewUser(MyUser myUser1){
        MyUser[] temp = this.Database;
        int len=this.Database.length;
        this.Database=new MyUser[len+1];
        for (int i=0; i<len; i++){
            this.Database[i]=temp[i];
        }
        this.Database[len]= myUser1;
    }

    public void IsAuthorized(){
        Scanner sc=new Scanner(System.in);
        Boolean IsAuthorized=false;
        Mark1: while (true) {
         System.out.println("Введите логин");
         String entLogin=sc.next();
         System.out.println("Введите пароль");
         String entPassword= sc.next();
         if (IsAuthorized==true) {break ;}
            for (int i = 0; i < Database.length; i++) {
                if ((Database[i].getLogin().equals(entLogin)) & (Database[i].getPassword().equals(entPassword))) {
                    IsAuthorized = true;
                    System.out.println("Вход выполнен успешно");
                    break Mark1;
                }
            }
            if (IsAuthorized == false) {
                System.out.println("Неправильный логин или пароль");
                continue Mark1;
            }
        }
    }

    public UserDatabase() {
        Database = new MyUser[0];
    }

}
