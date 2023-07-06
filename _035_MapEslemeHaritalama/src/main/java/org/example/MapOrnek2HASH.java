package org.example;

import java.util.HashMap;

public class MapOrnek2HASH {

    public static void main(String[] args) {

        //Map<String,String> calisanListesi = new HashMap<>();

        HashMap<String,String> plakaListesi = new HashMap<>();
                         //key   //value
        plakaListesi.put("Ankara","06");
        plakaListesi.put("İzmir","35");
        plakaListesi.put("Nevşehir","50");
        plakaListesi.put("Yozgat","66");
        plakaListesi.put("Adana","01");
        plakaListesi.put("Konya","42");
        plakaListesi.put("Kocaeli",null);
        System.out.println(plakaListesi);

        for (String anahtar:plakaListesi.keySet()) {
            System.out.println("Şehirlerin plaka numaraları"+anahtar+" "+plakaListesi.get(anahtar) );
        }










    }
}


