package org.example;

import java.util.HashMap;
import java.util.TreeMap;

public class MapOrnek4TREE {

    public static void main(String[] args) {

        //Map<String,String> calisanListesi = new HashMap<>();

        TreeMap<String,String> plakaListesi = new TreeMap<>();

        plakaListesi.put("Ankara","06");
        plakaListesi.put("Izmir","35");
        plakaListesi.put("Nevşehir","50");
        plakaListesi.put("Yozgat","66");
        plakaListesi.put("Adana","01");
        plakaListesi.put("Konya","42");

        //plakaListesi.put("Kocaeli",null);
        //plakaListesi.put(null , "27");
       // plakaListesi.put(null,null);
        System.out.println(plakaListesi);

        String sehirAdi ="Gaziantep";
        String plakasi ="27";

        if (sehirAdi!=null) plakaListesi.put(sehirAdi,plakasi);

       // plakaListesi.put(sehirAdi,plakasi);
        System.out.println(plakaListesi);












    }
}


