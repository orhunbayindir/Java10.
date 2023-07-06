package org.example.v3Detaylı;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        try {
            System.out.println("HATAYA AÇIK KODLAR");
            Integer a = read.nextInt();
            Integer b = read.nextInt();
            Integer sonuc = a / b;

            System.out.println(a + " / " + b + " = " + sonuc);

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException..........." + e);
            System.out.println("catch1:Hatanın açıklaması ve yapılacaklar");

        } catch (RuntimeException e) {

            System.out.println("RuntimeException..........." + e);
            System.out.println("catch2:Hatanın açıklaması ve yapılacaklar");

        } catch (Exception e) {

            System.out.println("catch3: Exception..........." + e);
            System.out.println("Hatanın açıklaması ve yapılacaklar");

        } finally {

            System.out.println("Sonda ne olmasını istiyorsak onlar yapılır");

        }
        System.out.println("--------------------------------");

    }
}