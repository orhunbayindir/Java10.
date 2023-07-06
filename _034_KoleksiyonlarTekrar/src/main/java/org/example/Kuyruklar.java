package org.example;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kuyruklar {
    public static void main(String[] args) {

        Queue myPriorityQueuelist1 = new PriorityQueue<>();//sıralar
        myPriorityQueuelist1.add("Aysu");
        myPriorityQueuelist1.add("Serkan");
        myPriorityQueuelist1.add("Gizem");
        myPriorityQueuelist1.add("Ali");
        //myPriorityQueuelist1.add(null); null girilmez
        //myPriorityQueuelist1.add(null);
        myPriorityQueuelist1.offer("Mehmet");
        System.out.println(myPriorityQueuelist1);

        System.out.println(myPriorityQueuelist1.peek());
        System.out.println(myPriorityQueuelist1);
        System.out.println(myPriorityQueuelist1.poll());//cleardan sonra çalışır
        System.out.println(myPriorityQueuelist1);
        System.out.println(myPriorityQueuelist1.remove());//cleardan sonra çalışmaz
        System.out.println(myPriorityQueuelist1);
        System.out.println("----");

        Queue myArrayQueuelist1 = new ArrayDeque();//sıralamaz
        myArrayQueuelist1.add("Aysu");
        myArrayQueuelist1.add("Serkan");
        myArrayQueuelist1.add("Gizem");
        myArrayQueuelist1.add("Ali");
        //myPriorityQueuelist1.add(null); null girilmez
        //myPriorityQueuelist1.add(null);
        myArrayQueuelist1.offer("Mehmet");
        System.out.println(myArrayQueuelist1);

        System.out.println(myArrayQueuelist1.peek());
        System.out.println(myArrayQueuelist1);
        System.out.println(myArrayQueuelist1.poll());//cleardan sonra çalışır
        System.out.println(myArrayQueuelist1);
        System.out.println( myArrayQueuelist1.remove());//cleardan sonra çalışmaz
        System.out.println(myArrayQueuelist1);


    }
}
