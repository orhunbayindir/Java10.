package org.example.soru3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EkonomiYolcu extends Yolcu{
    final int EKONOMIFIYAT = 100;
    private Map<FirmaAdi,Integer> biletler=new HashMap<>();
    public EkonomiYolcu(int id, String ad, String soyadı) {
        super(id, ad, soyadı);
    }

    public int getEKONOMIFIYAT() {
        return EKONOMIFIYAT;
    }

    public Map<FirmaAdi, Integer> getBiletler() {
        return biletler;
    }

    public void setBiletler(Map<FirmaAdi, Integer> biletler) {
        this.biletler = biletler;
    }

    @Override
    void yolcuBilgileriniGetir() {
        System.out.println(getAd() +getBiletler());
    }

    @Override
   void biletAl(FirmaAdi firmaAdi) {
       biletFiyati=getBASEFİYAT()+EKONOMIFIYAT;
        if (biletler.containsKey(firmaAdi)) {
            int a = biletler.get(firmaAdi);
            biletler.replace(firmaAdi, a + biletFiyati);
            System.out.println(firmaAdi + "1bilet daha aldı    " + biletler);
        } else {
            biletler.put(firmaAdi,biletFiyati);
            System.out.println(getAd()+" adlı yolcu "+firmaAdi+" için bilet aldı "+biletler);
        }
    }

    @Override
    void checkInYap() {
       if (checkin==false){
           checkin=true;
           System.out.println("Checkin yapılmıştır");
       }else {
           System.out.println(" Zaten checkin yapılmıştır");
       }
    }

    @Override
    void uçağaBin() {
        if (checkin==true){
            System.out.println(getAd()+getSoyadı()+"ucağa binebilirsiniz");
        }else {

            System.out.println("Ucağa binemezsiniz lütfen check in yapın");
        }

    }


}
