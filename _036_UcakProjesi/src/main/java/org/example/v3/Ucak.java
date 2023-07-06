package org.example.v3;

public class Ucak extends HavaAraci implements Savas,Kargo{
    float kanatUzunlugu;

    public boolean suyaİniş(){
        return true;
    }

    public Ucak() {
       super();//yazmasakta var 2 tane super olmaz
       // super(35.2f, 4.3f, 20000, 27500.00f, true);
    }

    @Override
    public String bilgiVer(String mesaj) {
        System.out.println(mesaj);
        return null;
    }

    public Ucak(float uzunluk, float yükseklik, int hizi, float ağırlık, boolean ucakKonumDurumu) {
        super(uzunluk, yükseklik, hizi, ağırlık, ucakKonumDurumu);
    }

    public Ucak(float uzunluk, float yükseklik, int hizi, float ağırlık, boolean ucakKonumDurumu, float kanatUzunlugu) {
        super(uzunluk, yükseklik, hizi, ağırlık, ucakKonumDurumu);
//        this.uzunluk = uzunluk; yukarıda aslında bunu yazıyoruz
//        this.yükseklik = yükseklik;
//        this.hizi = hizi;
//        this.ağırlık = ağırlık;
//        this.ucakKonumDurumu = ucakKonumDurumu;
        this.kanatUzunlugu = kanatUzunlugu;
    }

    @Override
    public String toString() {
        return "Ucak{" +
                "kanatUzunlugu=" + kanatUzunlugu +
                ", uzunluk=" + uzunluk +
                ", yükseklik=" + yükseklik +
                ", hizi=" + hizi +
                ", ağırlık=" + ağırlık +
                ", ucakKonumDurumu=" + ucakKonumDurumu +
                '}';
    }


    @Override
    public float agirlikDurumu(double yuk) {
        return 0;
    }
}
