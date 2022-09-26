package ru.mirea.lab4.practicework4p3;

public class OnlineShopTest {
    public static void main(String[] args) {
        //Создаем имитацию пустой базы данных пользователей
        UserDatabase database1=new UserDatabase();
        //Наполняем базу данных ранодмными пользователями
        MyUser u1=new MyUser("1","1");
        MyUser u2=new MyUser("Someone16","123");
        MyUser u3=new MyUser("Bob787898","ball");
        database1.addNewUser(u1);
        database1.addNewUser(u2);
        database1.addNewUser(u3);
        database1.IsAuthorized();
        OnlineShop.OpenShopPage();
    }
}
