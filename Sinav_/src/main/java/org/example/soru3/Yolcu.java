package org.example.soru3;

import java.util.Random;

public abstract class Yolcu {
    Random random =new Random();
   private int İd;
    private String Ad;
    private  String soyadı;
    private  int koltukNo;
    boolean checkin;
     final int BASEFİYAT = 100;
    int biletFiyati;

    public Yolcu(int id, String ad, String soyadı) {
        İd = id;
        Ad = ad;
        this.soyadı = soyadı;
        this.koltukNo=random.nextInt(1,100);
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getId() {
        return İd;
    }

    public void setId(int id) {
        İd = id;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyadı() {
        return soyadı;
    }

    public void setSoyadı(String soyadı) {
        this.soyadı = soyadı;
    }

    public int getKoltukNo() {
        return koltukNo;
    }

    public void setKoltukNo(int koltukNo) {
        this.koltukNo = koltukNo;
    }

    public boolean isCheckin() {
        return checkin;
    }

    public void setCheckin(boolean checkin) {
        this.checkin = checkin;
    }

    public int getBASEFİYAT() {
        return BASEFİYAT;
    }

    public int getBiletFiyati() {
        return biletFiyati;
    }

    public void setBiletFiyati(int biletFiyati) {
        this.biletFiyati = biletFiyati;
    }

    @Override
    public String toString() {
        return "Yolcu{" +
                "random=" + random +
                ", İd=" + İd +
                ", Ad='" + Ad + '\'' +
                ", soyadı='" + soyadı + '\'' +
                ", koltukNo=" + koltukNo +
                ", checkin=" + checkin +
                ", BASEFİYAT=" + BASEFİYAT +
                ", biletFiyati=" + biletFiyati +
                '}';
    }

    abstract void yolcuBilgileriniGetir();
    abstract void biletAl(FirmaAdi firmaAdi);
    abstract void checkInYap();
    abstract void uçağaBin();



}
