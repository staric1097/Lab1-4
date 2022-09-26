package ru.mirea.lab2.practicework2p8;

public class Main {
    public static void main(String[] args) {
        //test strings
        String [] StArr1={"a", "b", "c", "d", "e"};
        String [] StArr2={"a", "b", "c", "d"};
        String [] StArr3={"a"};
        String [] StArr4={"a","d"};
        MirrorAoS.Swap(StArr1);
        MirrorAoS.Swap(StArr2);
        MirrorAoS.Swap(StArr3);
        MirrorAoS.Swap(StArr4);
        MirrorAoS.Print(StArr1);
        MirrorAoS.Print(StArr2);
        MirrorAoS.Print(StArr3);
        MirrorAoS.Print(StArr4);
    }
}
