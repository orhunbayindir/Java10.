package org.example.soru3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BusinessYolcu extends Yolcu{
    final int BUSINNESFIYAT = 200;
    final int BUSINNESVIPFIYAT = 150;
    boolean vip ;

    private Map<FirmaAdi,Integer> biletler=new HashMap<>();

    public BusinessYolcu(int id, String ad, String soyadı ,boolean vip) {
        super(id, ad, soyadı);
        this.vip = vip;
    }

    public int getBUSINNESFIYAT() {
        return BUSINNESFIYAT;
    }

    public int getBUSINNESVIPFIYAT() {
        return BUSINNESVIPFIYAT;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Map<FirmaAdi, Integer> getBiletler() {
        return biletler;
    }

    public void setBiletler(Map<FirmaAdi, Integer> biletler) {
        this.biletler = biletler;
    }

    @Override
    public String toString() {
        return "BusinessYolcu{" +
                "BUSINNESFIYAT=" + BUSINNESFIYAT +
                ", BUSINNESVIPFIYAT=" + BUSINNESVIPFIYAT +
                ", vip=" + vip +
                ", biletler=" + biletler +
                ", random=" + random +
                ", checkin=" + checkin +
                ", BASEFİYAT=" + BASEFİYAT +
                ", biletFiyati=" + biletFiyati +
                '}';
    }

    @Override
    void yolcuBilgileriniGetir() {
        System.out.println("Yolcu bilgileri Business Yolcusu"+getAd() +getBiletler());

    }

    @Override
    void biletAl(FirmaAdi firmaAdi) {

        if (vip==true){
            biletFiyati=BASEFİYAT+BUSINNESFIYAT+BUSINNESVIPFIYAT;
        }else{
            biletFiyati=BASEFİYAT+BUSINNESFIYAT;
        }
        biletler.put(firmaAdi,biletFiyati);
        System.out.println(getAd()+" Adlı yolcu  "+firmaAdi+" Vip bilet almıştır"+biletler);

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
            System.out.println(getAd()+" "+getSoyadı()+" "+getKoltukNo()+" ucağa binebilirsiniz");
        }else {
            System.out.println("Ucağa binemezsiniz lütfen check in yapın");
        }

    }


}
