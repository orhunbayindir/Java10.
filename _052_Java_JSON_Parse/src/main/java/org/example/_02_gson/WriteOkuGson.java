package org.example._02_gson;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class WriteOkuGson {
    public static void main(String[] args) {
        Calisan calisan=new Calisan();

        calisan.setCalisanId(1);
        calisan.setAdi("Aysu");
        calisan.setSoyadi("Çağışlar");
        calisan.setDepartman("Bilgi işlem");
        calisan.setMaas(50000F);

        Gson gsonObj=new Gson();

        String jsonStr=gsonObj.toJson(calisan);
        System.out.println(jsonStr);

        try (FileWriter file=new FileWriter("calisanlar2.json")){
            file.write(jsonStr);
            file.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}