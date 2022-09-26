package ru.mirea.lab2.practicework2p7;
import java.util.Scanner;
public class Book {
    private String author, title;
    private int yearOfPub;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPub() {
        return yearOfPub;
    }

    public void setYearOfPub(int yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public Book(String author, String title, int yearOfPub) {
        this.author = author;
        this.title = title;
        this.yearOfPub = yearOfPub;
    }

    public Book(){

    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPub=" + yearOfPub +
                '}';
    }

    public void CreateNewBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название книни");
        this.title = sc.next();
        System.out.println("Введите имя автора");
        this.author = sc.next();
        System.out.println("Введите год издания");
        while (true) {
            if (sc.hasNextInt()) {
                this.yearOfPub = sc.nextInt();
                break;
            } else {
                System.out.println("ошибка ввода");
                sc.next();
                continue;
            }
        }
    }
}
