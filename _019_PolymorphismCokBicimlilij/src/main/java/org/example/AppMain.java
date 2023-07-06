package org.example;

import java.util.function.Predicate;

public class AppMain {
    public static void main(String[] args) {

        Muhasebe muhasebe = new Muhasebe();
        muhasebe.setAdi("Burak");
        muhasebe.setSoyadi("Delice");
        muhasebe.setMaliYetki(Boolean.TRUE);    // boolean olsaydı küçük b  isMaliYetki();
        muhasebe.setKidemYili((short) 3);
        muhasebe.setUnvani("Mali müşavir");

        System.out.println("ADI: "+ muhasebe.getAdi());
        System.out.println("SOYADI:"+muhasebe.getSoyadi());
        System.out.println("Yetki: "+ muhasebe.getMaliYetki());
        System.out.println("Kıdem:"+muhasebe.getKidemYili());
        System.out.println("Ünvan:"+ muhasebe.getUnvani());


        muhasebe.hesapla();
        muhasebe.hesapla(10000);
        muhasebe.hesapla(10,(byte)20);//belirtmemiz lazım yoksa int yapar
        muhasebe.hesapla(10,(short) 20);


        String gelenCevap= muhasebe.selamVer("Orhun");
        System.out.println(gelenCevap);
    }


}
