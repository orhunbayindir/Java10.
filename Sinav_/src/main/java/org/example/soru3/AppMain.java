package org.example.soru3;

public class AppMain {
    public static void main(String[] args) {


     Yolcu yolcu=new BusinessYolcu(7755,"Mert","Kaya",false);
     Yolcu yolcu2=new EkonomiYolcu(889,"Ahmet","Demir");
     Yolcu yolcu3=new BusinessYolcu(555,"Aslı","Bahar",true);

        System.out.println("-----Business Vıp Yolcu------------");
        yolcu3.biletAl(FirmaAdi.ADJ);
        yolcu3.biletAl(FirmaAdi.THY);
        System.out.println("***");
        yolcu3.uçağaBin();
        yolcu3.uçağaBin();
        yolcu3.checkInYap();
        yolcu3.checkInYap();
        yolcu3.uçağaBin();
        yolcu3.yolcuBilgileriniGetir();


        System.out.println("-------Ekonomi Yolcu-------------");
        yolcu2.biletAl(FirmaAdi.ADJ);
        yolcu2.biletAl(FirmaAdi.THY);
        yolcu2.biletAl(FirmaAdi.THY);
        yolcu2.biletAl(FirmaAdi.THY);
        System.out.println("***");
        yolcu2.uçağaBin();
        yolcu2.uçağaBin();
        yolcu2.checkInYap();
        yolcu2.checkInYap();
        yolcu2.uçağaBin();
        yolcu2.yolcuBilgileriniGetir();






    }

}
