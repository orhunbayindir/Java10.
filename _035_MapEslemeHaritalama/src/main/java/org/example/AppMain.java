package org.example;

import java.util.HashMap;
import java.util.Map;

public class AppMain {
    public static void main(String[] args) {

       Map mapListesi = new HashMap();//sırayı garanti etmez
                       //key   //value
       mapListesi.put("Ankara","Türkiye");//0
       mapListesi.put("Ottowa","Kanada");
       mapListesi.put("Londra","İngiltere");
       mapListesi.put("Berlin","Almanya");
       mapListesi.put("İstanbul","Türkiye");
        System.out.println(mapListesi);
        mapListesi.replace("Londra","İngiltere","England");
        System.out.println(mapListesi);

        System.out.println(mapListesi.get("Ankara"));
        System.out.println(mapListesi.get("İstanbul"));

        mapListesi.remove("Londra");
        System.out.println(mapListesi);



        System.out.println(mapListesi.size());
       // mapListesi.clear();
        System.out.println(mapListesi.size());
        System.out.println(mapListesi);

//key
        for (Object sehir : mapListesi.keySet()) {
          System.out.println(sehir);
        }
        System.out.println("---------------------");
        //values
        for (Object ulke : mapListesi.values()) {
            System.out.println(ulke);
        }













    }
}