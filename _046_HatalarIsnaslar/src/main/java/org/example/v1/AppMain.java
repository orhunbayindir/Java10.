package org.example.v1;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
       int a=read.nextInt();
       int b=read.nextInt();
       int sonuc =a/b;
        System.out.println( a+" / "+b+" = "+sonuc);

    }
}