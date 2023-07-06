package org.example.v3;

import java.util.Random;

public class CalisanManager <BenimKendiTipim>{
    BenimKendiTipim maas;

    private String  kayitNumarasi;

    String adi,soyadi;

    //TODO random sayi ile kullanacaktır

    private final String SİRKET_ADİ="ABC";


    public String getBilgiAl(){
        return "ADI "+adi+"SOYADI "+soyadi+"MAAS "+maas +" KAYİT NO  "+kayitNumarasi;
    }

    public String getKayitNumarasi() {

        return kayitNumarasi;
    }

    public void setKayitNumarasi(String kayitNumarasi) {


        this.kayitNumarasi = kayitNumarasi;
    }
}
