package org.example.v4;
/*
uzunluk
yükseklik
hizi
ağırlık


 */

public abstract class HavaAraci {
    float uzunluk;
    float yükseklik;
    int hizi;
    float ağırlık;
    boolean ucakKonumDurumu;
    static int toplamUcakSayisi;
    static final int MAX_YOLCU_SAYISI=200;
   static int pilotSayi;

    public HavaAraci(){
      //  uzunluk=99;2.çalışır 99 alır

        ++toplamUcakSayisi;
        pilotSayi+=2;
        //System.out.println("Parametresiz hazırlıyıcı");
    }
    {
        // uzunluk=150; hepsini 150 yapar
        ++toplamUcakSayisi;
       // System.out.println("static block Uçak oluşturuldu ilk bu çalışır");
    }

    static {
        System.out.println("Bu ikinci ve bikere çağırılır");
    }

    public boolean inisKontrolu() {
        ucakKonumDurumu=true;

        return ucakKonumDurumu;
    }


    public boolean kalkisKontrolu() {
     ucakKonumDurumu=false;
        return ucakKonumDurumu;
    }


    public abstract String bilgiVer(String mesaj);


    public HavaAraci(float uzunluk, float yükseklik, int hizi, float ağırlık) {//ucakkonumdurumunu çalışma zamanında değişebilceği için en yüksek hız sabit
        this.uzunluk = uzunluk;
        this.yükseklik = yükseklik;
        this.hizi = hizi;
        this.ağırlık = ağırlık;
       // ++toplamUcakSayisi;
       // System.out.println("4 parametreli çalıştırıcı");
    }

    public HavaAraci(float uzunluk, float yükseklik) {
        this.uzunluk = uzunluk;
        this.yükseklik = yükseklik;
       // ++toplamUcakSayisi;
    }

    public HavaAraci(float uzunluk, float yükseklik, int hizi, float ağırlık, boolean ucakKonumDurumu) {
        this.uzunluk = uzunluk;
        this.yükseklik = yükseklik;
        this.hizi = hizi;
        this.ağırlık = ağırlık;
        this.ucakKonumDurumu = ucakKonumDurumu;
       // ++toplamUcakSayisi;
       // System.out.println("5 parametreli çalıştırıcı");
    }

    @Override
    public String toString() {
        return "Hava Aracı{" +
                "uzunluk=" + uzunluk +
                ", yükseklik=" + yükseklik +
                ", hizi=" + hizi +
                ", ağırlık=" + ağırlık +
                ", ucakKonumDurumu=" + ucakKonumDurumu +
                '}';
    }
}
