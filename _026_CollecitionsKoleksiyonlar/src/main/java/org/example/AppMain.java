package org.example;

import java.util.ArrayList;
import java.util.*;

public class AppMain {
    public static void main(String[] args) {
        List liste1= new ArrayList<>();
        liste1.add(10);
        liste1.add("Serkan");
        liste1.add(30.0f);
        liste1.add("Salih");
        // int sayi =40;//çalışır
        //liste1.add(sayi);//integer.valueofla çevirir
        System.out.println(liste1);
        // map varsa key value vardır

        List<String> liste2 = new ArrayList<>();//string sınırlandırır
        liste2.add("Aysu");//0
        liste2.add("Osman");//1
        liste2.add("Abdullah");//2
        liste2.add("Gizem");//3
        liste2.add(String.valueOf(10.5f));//4
        System.out.println(liste2);
        System.out.println(liste2.size());
        System.out.println(liste2.get(0));
        System.out.println(liste2.get(1));
       // System.out.println(liste2.get(5)); IndexOutOfBoundsException
        List<Integer> liste3 = new ArrayList<>();
       // liste3.add(0,0);
        //liste3.add(1,100);
        //liste3.add(2,200);//-****????
        System.out.println(liste3);//çalışmaz mulakatta çıktı sırasıda değişse çalışmaz
     //  for (int i= 0 ; i<10;i++){
         //  liste3.add(i,i*10);
        // liste3.add(0,10*i);
        //0 1 2 3 4 5
        //0
        //10 0
        //20 10 0
        //30 20 10 0
        //40 30 20 10 0

       // }
       // System.out.println("-------");
      // System.out.println(liste3);
        //  liste3.add(0,100);
        //  liste3.add(0,200);

        //0 100   1 200 sona atar
        //sonunu izle 1.dersin sonu
        // Index -2 out of bounds for length 4
        //System.out.println(liste2.get(-2));

        List<Integer> liste4 = new ArrayList<>();
        liste4.add(0, 1000); // 0
        liste4.add(0, 2000); // 1
        liste4.add(0, 3000); // 2

        for (int i = 0; i < 5 ; i++) {
            liste4.add(0, 10*i);
        }
        //  0   1     2     3    4
        //  0
        //  10  0
        //  20  10    0
        //  30  20    10   0
        //  40  30    20  10    0
        System.out.println(liste4);
        //  0   1   2   3  4    5    6     7
        // [40, 30, 20, 10, 0, 3000, 2000, 1000]

        System.out.println(liste4.get(7));

        liste4 = null;
        System.out.println(liste4);






    }
}