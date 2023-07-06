package org.example._01_json_simple;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteYazJSON {
    public static void main(String[] args) {

        JSONObject calisanDetayi=new JSONObject();
        calisanDetayi.put("adi","Serkan");//K,V
        calisanDetayi.put("Soyadi","Zorlu");//key, value
        calisanDetayi.put("yas",25L);

        JSONObject calisanlarObj=new JSONObject();
        calisanlarObj.put("calisan",calisanDetayi);



        JSONObject calisanDetayi2=new JSONObject();
        calisanDetayi2.put("adi","Burak");//K,V
        calisanDetayi2.put("Soyadi","Delice");//key, value
        calisanDetayi2.put("yas",33L);

        JSONObject calisanlarObj2=new JSONObject();
        calisanlarObj2.put("calisan",calisanDetayi2);


        JSONArray calisanList=new JSONArray();
        calisanList.add(calisanlarObj);
        calisanList.add(calisanlarObj2);

        try (FileWriter file=new FileWriter("calisanlar.json")){//en dıştaki isim üsttekiyle alakası yok
            file.write(calisanList.toJSONString());
            file.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
