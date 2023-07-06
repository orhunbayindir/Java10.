package org.example;

public class SinirlandirilmisTipOrnek<GelenTip1 extends Number, GelenTip2 extends String> {
    GelenTip1 bilgi;

    public SinirlandirilmisTipOrnek(GelenTip1 bilgi) {
        this.bilgi = bilgi;
    }

    void yazdir(){
        System.out.println("Sınırlandırılmıs tip");
    }

}
