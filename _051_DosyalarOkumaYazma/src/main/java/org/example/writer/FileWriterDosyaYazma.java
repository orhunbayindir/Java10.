package org.example.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDosyaYazma {
    public static void main(String[] args)  {

        try {
            FileWriter writer = new FileWriter("src/main/myInput.txt", true);
            writer.write("Abdullah Aktaş\n" +
                    "Ahmet Akkoyun\n" +
                    "Ali Güneş\n" +
                    "Aminenur Göynük\n" +
                    "Aysu Çağışlar\n" +
                    "Burak Delice\n" +
                    "Gizem Kuşçuoğlu\n" +
                    "Mehmet Caner Öksüz\n" +
                    "Orhun Bayındır\n" +
                    "Osman Onur Baş\n" +
                    "Salih Polat Dönmez\n" +
                    "Serkan Şahin Zorlu\n" +
                    "Yiğitcan Abay\n" +
                    "Ünal Gani Berk");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
