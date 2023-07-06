package org.example.firma;

import java.util.ArrayList;

public class MerkezMain {
    public static void main(String[] args) {

        Calisan calisan1=new Calisan();
        calisan1.setId(1);
        calisan1.setAdi("Caner");
        calisan1.setSoyadi("Mehmet");
        calisan1.setYasi(22);
        calisan1.setAdres("Ankara Aşağı Ayrancı");

        Calisan calisan2= new Calisan(2,
                33,
                "Serkan",
                "Zorlu",
                "Ankara Yukarı Ayrancı");


        ArrayList<Calisan> calisanlarinListesi =new ArrayList<>();
        calisanlarinListesi.add(calisan1);
        calisanlarinListesi.add(calisan2);
/*
        for (int i = 0; i < calisanlarinListesi.size(); i++) {


            System.out.println(calisanlarinListesi.get(i).getId());
            System.out.println(calisanlarinListesi.get(i).getSoyadi());
            System.out.println(calisanlarinListesi.get(i).getYasi());
            System.out.println(calisanlarinListesi.get(i).getAdi());
            System.out.println(calisanlarinListesi.get(i).getAdres());
        }
        */

        Calisan.getCalisanDetay(calisanlarinListesi);

    }
}
