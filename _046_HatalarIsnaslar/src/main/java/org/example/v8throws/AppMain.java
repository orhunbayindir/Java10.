package org.example.v8throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AppMain {
    public static void main(String[] args) throws FileNotFoundException {
      try {
          dosyaOku();
      }catch (Exception e) {
          System.out.println("istisna" + e);
      }
    }

    private static void dosyaOku() throws FileNotFoundException {
        File yeniDosya =new File("M:\\myText.txt");
          FileInputStream inputStream=new FileInputStream(yeniDosya);
    }
}
