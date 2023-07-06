package org.example.tekrar;

import java.util.Scanner;

public class _04_Donguler_________ {

    public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
        System.out.println(i);
    }


    int i = 0;
    while (i < 10) {
        i++;
    }

    Scanner scanner = new Scanner(System.in);
    int secim = 1;

        while (secim != 0 ){
            System.out.print ("1Çıkış için 0 değerine basınız. :   ");
            secim = scanner.nextInt();
        }



    do {
        System.out.print ("Çıkış için 0 değerine basınız. :   ");
        secim = scanner.nextInt();
    } while (secim != 0);


}
}
