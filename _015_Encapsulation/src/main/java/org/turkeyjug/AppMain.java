package org.turkeyjug;

public class AppMain {
    public static void main(String[] args) {

        Araba araba= new Araba("Mercedes","Mavi",2023,10000);

        System.out.println(araba);

              araba= new Araba("Sercedes","Kırmızı",2000,250);
        System.out.println(araba);
        araba.setMarka("Volvo");
        System.out.println(araba);

        int modelSayi = araba.getModel();
        System.out.println(modelSayi);
        System.out.println(araba.getMotorHacmi()*2);

//System.out.println(new Araba("Anadol","Sarı",1000,75));
    }
}
