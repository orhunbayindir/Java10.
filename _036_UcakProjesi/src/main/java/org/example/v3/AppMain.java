package org.example.v3;

/*
Class-sınıf-insan -uçak
Object-nesne - new


 */
public class AppMain {
   static Helikopter helikopter3= new Helikopter();//null
    String soyadi ;//null
    public static void main(String[] args) {
        Ucak ucak1= new Ucak();
        System.out.println(ucak1);


        Ucak ucak2= new Ucak(1.0f,2.0f,3,4.0f,true,5.0f);
        System.out.println(ucak2);

        Helikopter helikopter1= new Helikopter();
        System.out.println("Helikopter "+helikopter1);

        Helikopter helikopter2=new Helikopter(10.f,20.0f,30,40.f,false,50.0f,6.0f);
        System.out.println(AppMain.helikopter3);





        System.out.println("Toplam uçak sayısı :"+ HavaAraci.toplamUcakSayisi);//inti static yapmazsak hepsi 1 olur
        System.out.println("Pilot Sayisi"+ HavaAraci.pilotSayi);
    }
}