package org.example.turkeyjug;

public class AppMain {
    public static void main(String[] args) {
        Tasit tasit = new Tasit();
        tasit.yazdir();
        Araba araba = new Araba();
        araba.setTekerSayisi(4);
       // System.out.println("Araba :"+araba.getTekerSayisi());
        araba.yazdir();

        Motosiklet motosiklet = new Motosiklet();
        motosiklet.setTekerSayisi(2);
        System.out.println("Motosiklet :"+araba.getTekerSayisi());

        Bisiklet bisiklet= new Bisiklet(3);
        bisiklet.setTekerSayisi(3);
        System.out.println("Bisiklet :"+bisiklet.getTekerSayisi());



    }
}
