package org.example.methods;

import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {


        int myArray [] = {1,2,3,4,5,6,7,8,9};

        int toplam = 0;

 /*       for (int i = 0; i <myArray.length ; i++) {
            //toplam  = toplam + myArray[i];
              toplam += myArray[i];
        }
        System.out.println("Toplam  : " + toplam);
        System.out.println("Ortalama: " + toplam/myArray.length);
*/

        System.out.println("Toplam  : " +Arrays.stream(myArray).sum());
        System.out.println("Ort  : " +Arrays.stream(myArray).sum()/myArray.length);

        Arrays
                .stream(myArray)
                .forEach(eleman -> System.out.print(eleman + " "));


    }
}