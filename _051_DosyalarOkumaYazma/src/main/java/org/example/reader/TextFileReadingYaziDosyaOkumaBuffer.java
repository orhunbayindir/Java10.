package org.example.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReadingYaziDosyaOkumaBuffer {
    public static void main(String[] args)  {


        try {
            FileReader reader = new FileReader("src/main/myInput.txt");
            //  FileReader reader = new FileReader("src/main/myInput.json");
            //  FileReader reader = new FileReader("src/main/myInput.xml");

            //  FileReader reader = new FileReader("D:\\demo\\myInput.txt");

            BufferedReader bufferedReader = new BufferedReader(reader);

            int okumaKarakteri;

            while ((okumaKarakteri = bufferedReader.read()) != -1){
                System.out.print((char) okumaKarakteri);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //   reader.close();
        }


    }
}
