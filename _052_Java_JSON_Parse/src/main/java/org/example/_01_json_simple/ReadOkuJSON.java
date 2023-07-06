package org.example._01_json_simple;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadOkuJSON {


    public static void main(String[] args) {
        JSONParser jsonParser=new JSONParser();
        try (FileReader readerOkuma=new FileReader("calisanlar.json")){

            Object obj=jsonParser.parse(readerOkuma);

            JSONArray calisanlarListesi= (JSONArray) obj;
            System.out.println(calisanlarListesi);
            calisanlarListesi.forEach(calisan->calisanlariYazParse((JSONObject)calisan));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

    private static void calisanlariYazParse(JSONObject calisan) {
        JSONObject calisanObj= (JSONObject) calisan.get("calisan");
        String adi= (String) calisanObj.get("adi");
        String soyadi= (String) calisanObj.get("Soyadi");
        Long yas= (Long) calisanObj.get("yas");


        System.out.println("ADI: "+adi);
        System.out.println("SOYADİ: "+soyadi);
        System.out.println("YAS: "+yas);
    }
}
