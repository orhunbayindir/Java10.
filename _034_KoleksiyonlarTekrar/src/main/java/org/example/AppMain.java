package org.example;

import java.util.*;

public class AppMain {

    public static void main(String[] args) {

        List <String>myArrayList1= new ArrayList();
        myArrayList1.add("Aysu");
        myArrayList1.add("Serkan");
        myArrayList1.add("Gizem");
        myArrayList1.add("Ali");
        System.out.println(myArrayList1.get(0));


        myArrayList1.set(0,"Aysu".toUpperCase());
        System.out.println(myArrayList1.get(0));

        myArrayList1.set(2,myArrayList1.get(2).toUpperCase(Locale.JAPAN));
        System.out.println(myArrayList1.get(2));
        System.out.println("-----------------------------");
        ArrayList <String > myArrayList2= new ArrayList();
        myArrayList2.add("Ali");
        myArrayList2.add("Aysu");
        myArrayList2.add("Serkan");
        myArrayList2.add("Gizem");
        myArrayList2.add("Ali");
        myArrayList2.add(null);
        myArrayList2.add(null);
        System.out.println(myArrayList2);

        myArrayList2.set(0,"Aminenur");
        System.out.println(myArrayList2);

        myArrayList2.remove("Aysu");
        myArrayList2.remove(0);
        System.out.println(myArrayList2);

        System.out.println("---------------------------");
        myArrayList2.clear();
        System.out.println(myArrayList2);



        List <String > myLinkedList1= new LinkedList<>() ;
        myLinkedList1.add("Aysu");
        myLinkedList1.add("Serkan");
        myLinkedList1.add("Gizem");
        myLinkedList1.add("Ali");
        myLinkedList1.add(null);
        myLinkedList1.add(null);

        myLinkedList1.remove(0);
        myLinkedList1.set(0,"Burak");
        System.out.println(myLinkedList1);

        Vector<String > myVectorList1= new Vector<>() ;
        myVectorList1.add("Aysu");
        myVectorList1.add("Serkan");
        myVectorList1.add("Gizem");
        myVectorList1.add("Ali");
        myVectorList1.add(null);
        myVectorList1.add(null);

        myVectorList1.remove(0);
        myVectorList1.set(0,"Burak");
        System.out.println(myVectorList1);
        System.out.println("---------------------------");

        Stack<String > myStackList1= new Stack<>() ;
        myStackList1.push("Aysu");
        myStackList1.push("Serkan");
        myStackList1.push("Gizem");
        myStackList1.push("Ali");
        myStackList1.push(null);
        myStackList1.push(null);
        myStackList1.push("Engin");
        System.out.println(myStackList1);

        myStackList1.pop();
        System.out.println(myStackList1);

        myStackList1.remove(2);
        System.out.println(myStackList1);

        myStackList1.set(4,"Burak");
        System.out.println(myStackList1);
        System.out.println("---------------------------");



    }
}
