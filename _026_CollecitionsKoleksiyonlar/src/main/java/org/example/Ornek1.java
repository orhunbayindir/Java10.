package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ornek1 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(15);
        list1.add(32);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(40);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        //  [15, 32, 10, 40]
        System.out.println(list3.get(2));
        list3.set(2, 99);
        System.out.println(list3.get(2));


    }
    public static     ArrayList<Integer> selamVer(Integer sayi) {
            ArrayList<Integer> list4= new ArrayList<>();
            list4.add(sayi);
            return list4;
    }
}
