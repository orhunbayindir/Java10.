package org.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.*;

public class MyLinkedList {
    public static void main(String[] args) {

        // List<String> list1= new ArrayList<>();
        ArrayList<String> list1= new ArrayList<>();
        list1.add("Mehmet");
        list1.add("Aysun");
        list1.add("Osman");
        list1.set(1,"Aysu");
        //list1.toArray();diziye dönüştürme
        // list1.get(list1.size());//2 iş yaptım
        System.out.println(list1);

        System.out.println("---------");
        LinkedList<String> list2= new LinkedList<>();
        list2.add("Mehmet");
        list2.add("Aysun");
        list2.add("Osman");
        list2.set(1,"Aysu");

        System.out.println(list2);
        System.out.println("---------");
        list2.addFirst("Orhun");
        list2.addLast("Serkan");

        Collections.sort(list2);
        for (String str:list2) {
            System.out.print(" "+str);
        }
        System.out.println("----");
        System.out.println(list2);


        System.out.println("Son kayıt "+ list2.getLast());








    }
}
