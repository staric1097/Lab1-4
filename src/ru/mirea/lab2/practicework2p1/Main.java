package ru.mirea.lab2.practicework2p1;

public class Main {
    public static void main(String[] args) {
        Author auth1=new Author("Remark", "matveev.sds@yandex.ru", 'm');
        System.out.println(auth1.getEmail());
        System.out.println(auth1.getGender());
        System.out.println(auth1.getName());
        auth1.setEmail("matveev2sds@gmail.com");
        System.out.println(auth1.toString());
    }
}
