package org.example._02_gson;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadOkuGSON {
    public static void main(String[] args) {

        BufferedReader reader=null;
        Gson gsonObj=new Gson();

        try {
            reader=new BufferedReader(new FileReader("calisanlar2.json"));
            Calisan calisan=gsonObj.fromJson(reader,Calisan.class);
            System.out.println("ID:"+calisan.getCalisanId());
            System.out.println("Adı :"+calisan.getAdi());
            System.out.println("Soyadi :"+calisan.getSoyadi());
            System.out.println("Departman :"+calisan.getDepartman());
            System.out.println("Maas :"+calisan.getMaas());



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
