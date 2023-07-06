package org.example.v2Exception;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);



        try {
            System.out.println("HATAYA AÇIK KODLAR");
            int a=read.nextInt();
            int b=read.nextInt();
            int sonuc =a/b;

            System.out.println( a+" / "+b+" = "+sonuc);
        }catch (Exception e){
            System.out.println("Exception..........."+e);
            System.out.println("Hatanın açıklaması ve yapılacaklar");
        }finally {
            System.out.println("Sonda ne olmasını istiyorsak onlar yapılır");
        }
        System.out.println("--------------------------------");

    }
}