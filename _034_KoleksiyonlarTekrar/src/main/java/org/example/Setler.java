package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Setler {
    public static void main(String[] args) {

        Set <Integer>myHashSetList1 = new HashSet();//sırayı garanti etmez
        myHashSetList1.add(55);
        myHashSetList1.add(10);
        myHashSetList1.add(10);
        myHashSetList1.add(33);
        myHashSetList1.add(null);
        myHashSetList1.add(null);
        System.out.println(myHashSetList1);



        Set<Integer> myLinkedHashSetList1 = new LinkedHashSet();//sıralı
        myLinkedHashSetList1.add(55);
        myLinkedHashSetList1.add(10);
        myLinkedHashSetList1.add(10);
        myLinkedHashSetList1.add(33);
        myLinkedHashSetList1.add(null);
        myLinkedHashSetList1.add(null);
        System.out.println(myLinkedHashSetList1);



        Set <Integer> myTreeSetList1 = new TreeSet();//sıralar
        myTreeSetList1.add(55);
        myTreeSetList1.add(10);
        myTreeSetList1.add(10);
        myTreeSetList1.add(33);
       // myTreeSetList1.add(null); sort (sıralama)işlemi yaptığı için olmaz
        System.out.println(myTreeSetList1);
    }
}
