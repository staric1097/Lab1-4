package ru.mirea.lab4.practicework4p3;

import java.util.Arrays;
import java.util.Scanner;

public class OnlineShop {
    public static void Buy(){
        System.out.println("Оплата проведена успешна, заказ получен и обробатывается.\nВ ближайшее время наши менеджеры свяжутся с вами для ,уточнения деталей заказа, по номеру, указанному в вашем аккаунте");
        System.exit(0);
    }
    public enum Catalog {VideoCards, Processors, Motherboard, SSD;
        private static String ListVideocards[]={"1: NVIDIA GeForce GTX 1650\n","2: GeForce 3060 Ti\n","3: GeForce GTX 1050 Ti\n","4: GeForce GT 1030\n"};
        private static String ListProcessors[]={"1: INTEL Core i5 - 10400F\n", "2: AMD Ryzen 5 2600\n", "3: Intel Core i3 12100F OEM\n"};
        private static String ListMotherboard[]={"1: ASUS Prime A320M-C\n", "2: GIGABYTE B450M\n"};
        private static String ListSSD[]={"1: Sumsung 970 EVO plus\n","2: WESTERN DIGITAL Blue 2.5\n"};
        private static void Showlist(String [] list){
            for (int i=0; i<list.length; i++){
                System.out.print(list[i]);
            }
        }
        private static void ShowShopList(String [] ShList){
            System.out.println("Ваша корзина:  ");
            for (int i=1; i<ShList.length; i++){
                System.out.print(ShList[i]);
            }
        }
        public static int ShowVideoCards(){
            System.out.println("Список видеокарта доступных для покупки:\n");
            Showlist(ListVideocards);
            System.out.println("Добавьте товар в корзину, нажав соответсвующее ему число");
            if (AddToShopList(1)==0){
                return 0;
            }
            else return 1;
        }
        public static int ShowProcessors(){
            System.out.println("Список процессоров доступных для покупки:\n");
            Showlist(ListProcessors);
            System.out.println("Добавьте товар в корзину, нажав соответсвующее ему число");
            if (AddToShopList(2)==0){
                return 0;
            }
            else return 1;
        }
        public static int ShowMotherboard(){
            System.out.println("Список материнских плат доступных для покупки:\n");
            Showlist(ListMotherboard);
            System.out.println("Добавьте товар в корзину, нажав соответсвующее ему число");
            if (AddToShopList(3)==0){
                return 0;
            }
            else return 1;
        }
        public static int ShowSSD(){
            System.out.println("Список SSD доступных для покупки:\n");
            Showlist(ListSSD);
            System.out.println("Добавьте товар в корзину, нажав соответсвующее ему число");
            if (AddToShopList(4)==0){
                return 0;
            }
            else return 1;
        }
        private static String [] ShopList=new String[1];
        public static void Add(String buy){
            int len=ShopList.length;
            String temp []=ShopList;
            ShopList=new String[len+1];
            for (int i=0; i<len; i++){
                ShopList[i]=temp[i];
            }
            ShopList[len]=buy.substring(2);
        }
        public static int AddToShopList(int code){
            Scanner sc=new Scanner(System.in);
            System.out.println("Чтобы вернуться к каталлогу введите '-1'. Чтобы закончить покупки и перейти к оплате введите '-2'");
             Mark3: while (true) {
                if (sc.hasNextInt()) {
                    int i = sc.nextInt();
                    if (i==-1) {return 0;}
                    if (i==-2) {Buy();}
                    switch (code) {
                        case 1:
                            if ((i>ListVideocards.length) ||(i<=0)){
                                System.out.println("Ошибка ввода");
                                continue Mark3;
                            }
                            Add(ListVideocards[i - 1]);
                            ShowShopList(ShopList);
                            break;
                        case 2:
                            if ((i>ListProcessors.length)||(i<=0)){
                                System.out.println("Ошибка ввода");
                               continue Mark3;
                            }
                            Add(ListProcessors[i - 1]);
                            ShowShopList(ShopList);
                            break;
                        case 3:
                            if ((i>ListMotherboard.length)||(i<=0)){
                                System.out.println("Ошибка ввода");
                                continue Mark3;
                            }
                            Add(ListMotherboard[i - 1]);
                            ShowShopList(ShopList);
                            break;
                        case 4:
                            if ((i>ListSSD.length)||(i<=0)){
                                System.out.println("Ошибка ввода");
                                continue Mark3;
                            }
                            Add(ListSSD[i - 1]);
                            ShowShopList(ShopList);
                            break;
                    }
                } else {
                    System.out.println("ошибка ввода");
                    sc.next();
                    continue Mark3;
                }
            }
        }
    }
    public static void OpenShopPage (){
        System.out.println("Добро пожаловать в магазин! \nВы можете перейти в один из каталогов, нажав соответсвующее ему число");
        System.out.println("1.Видеокарты\n2.Процессоры\n3.Материнские платы\n4.SSD");

        Mark2: while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()){
            int code1 = sc.nextInt();
            if (code1==-2){Buy();}
            Catalog catalog = Catalog.VideoCards;
            switch (code1) {
                case 1:
                    catalog = Catalog.VideoCards;
                    if (Catalog.ShowVideoCards()==0){
                        System.out.println("1.Видеокарты\n2.Процессоры\n3.Материнские платы\n4.SSD");
                        continue Mark2;
                    }
                    break;
                case 2:
                    catalog = Catalog.Processors;
                    if (Catalog.ShowProcessors()==0){
                        System.out.println("1.Видеокарты\n2.Процессоры\n3.Материнские платы\n4.SSD");
                        continue Mark2;
                    }
                    break;
                case 3:
                    catalog = Catalog.Motherboard;
                    if (Catalog.ShowMotherboard()==0){
                        System.out.println("1.Видеокарты\n2.Процессоры\n3.Материнские платы\n4.SSD");
                        continue Mark2;
                    }
                    break;
                case 4:
                    catalog = Catalog.SSD;
                    if (Catalog.ShowSSD()==0){
                        System.out.println("1.Видеокарты\n2.Процессоры\n3.Материнские платы\n4.SSD");
                        continue Mark2;
                    }
                    break ;
                default:
                    System.out.println("Ошибка ввода");
                    continue Mark2;
               }
               break ;
            }
            else {
                System.out.println("Ошибка ввода");
                sc.next();
                continue Mark2;
            }
        }

    }
}
