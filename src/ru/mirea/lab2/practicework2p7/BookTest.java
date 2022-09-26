package ru.mirea.lab2.practicework2p7;

public class BookTest {
    public static void main(String[] args) {
    Book book1=new Book();
    Book book2=new Book("Remarque","All quiet on the Western front", 1929);
    Book book3=new Book("Tolkien","The lord of the ring", 1954);
    Book book4=new Book("Arthur Conan Doyle","The hound oh the Baskervlles", 1902);
    book1.CreateNewBook();
        //конструктор создает полку с длиной 0; которую впоследствии можно заполнить книгами
        BookShelf shelf1=new BookShelf();
        //заполним полку книгами, выводим результатаы в консоль, чтобы убедиться, в правильности программы
    shelf1.addBookToTheShelve(book1);
    System.out.println(shelf1.toString());
    shelf1.addBookToTheShelve(book2);
    System.out.println(shelf1.toString());
    shelf1.addBookToTheShelve(book3);
    shelf1.addBookToTheShelve(book4);
    System.out.println(shelf1.toString());
        // проверим работу методов нахождения книги с самой ранней\поздней датой издания
    System.out.println(shelf1.findTheEarliest().toString());
    System.out.println(shelf1.findTheLatest().toString());
    // проверим работу соритровки полки
    shelf1.SortShelf();
    System.out.println(shelf1.toString());
    }
}
