package ru.mirea.lab2.practicework2p7;
import java.util.Arrays;

public class BookShelf {
   private   Book[] shelf ;

    public BookShelf() {
        shelf =new Book[0];
    }
    public void addBookToTheShelve(Book book1){
        Book[] temp = this.shelf;
        int len=this.shelf.length;
        this.shelf=new Book[len+1];
        for (int i=0; i<len; i++){
            this.shelf[i]=temp[i];
        }
        this.shelf[len]=book1;
    }

    public Book findTheEarliest(){
        int min=shelf[0].getYearOfPub(), minId=0;
        for (int i=0;i<shelf.length;i++){
            if (shelf[i].getYearOfPub()<min){
                min=shelf[i].getYearOfPub();
                minId=i;
            }
        }
        return shelf[minId];
    }

    public Book findTheLatest(){
        int max=shelf[0].getYearOfPub(), maxId=0;
        for (int i=0;i<shelf.length;i++){
            if (shelf[i].getYearOfPub()>max){
                max=shelf[i].getYearOfPub();
                maxId=i;
            }
        }
        return shelf[maxId];
    }

    public void SortShelf(){
        System.out.println("отсортированная по дате издания книг полка:\n");
        for (int i=shelf.length-1; i>0;i--){
            for (int j=0; j<i; j++){
                if (shelf[j].getYearOfPub()>shelf[j+1].getYearOfPub()){
                    Book temp=new Book();
                    temp=shelf[j];
                    shelf[j]=shelf[j+1];
                    shelf[j+1]=temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "shelf=" + Arrays.toString(shelf) +
                '}';
    }
}
