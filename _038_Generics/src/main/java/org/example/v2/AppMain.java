package org.example.v2;

import java.util.ArrayList;

public class AppMain {

    public static void main(String[] args) {
        ArrayList <String> listeArrayList = new ArrayList<>();

        ListManager<String> listeBanaOzel = new ListManager<>();
        listeBanaOzel.lisyeEkle("Aminenur");
        listeBanaOzel.lisyeEkle("Aysu");
        listeBanaOzel.lisyeEkle("Gizem");
        System.out.println(listeBanaOzel.listeyiGetir());

        ListManager<Integer> listeBanaOzel2 = new ListManager<>();
        listeBanaOzel2.lisyeEkle(100);
        listeBanaOzel2.lisyeEkle(200);
        listeBanaOzel2.lisyeEkle(300);
        System.out.println(listeBanaOzel2.listeyiGetir());

        ArrayList<String> listeYazdiralacak = listeBanaOzel.listeyiGetir();
        System.out.println("\n-----------------------");
        for (String madde:listeYazdiralacak) {
            System.out.print(madde+" ");

        }


        System.out.println("\n-----------------------");

        for (int i = 0; i <listeYazdiralacak.size() ; i++) {
            System.out.print(listeYazdiralacak.get(i)+" ");

        }
        System.out.println("\n-----------------------");
        listeYazdiralacak.forEach((madde)-> System.out.print(madde+" "));

    }
}