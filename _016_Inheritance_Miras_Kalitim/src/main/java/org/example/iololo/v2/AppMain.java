package org.example.iololo.v2;

public class AppMain {
    public static void main(String[] args) {
        Mudur mudur= new Mudur();
        mudur.setAd("Mehmet Caner");
        mudur.setSoyadi("Öksüz");
        mudur.setAdres("Antalya");
        mudur.setMudurDerecesi("Genel Müdür");
        mudur.setTahsisliPersonel("lisans");
        mudur.setYoneticiDepartman("Büyükelçi");
        mudur.setGorevTazminati(1_000_000L);
        mudur.setMaasKatSayi(50);
        mudur.setTc("12345678901");

        System.out.println("Adı Soyadı"+mudur.getAd()+" "+mudur.getSoyadi());
        System.out.println(mudur.getMudurDerecesi());
        System.out.println(mudur.getYoneticiDepartman());
        System.out.println(mudur.getAdres());
        System.out.println(mudur.getTahsisliPersonel());
        System.out.println(mudur.getTc());
        System.out.println("--------------------------------");

        Hizmetli hizmetli=new Hizmetli();
        int [] sorumlulukKatları= new int[] {2,5};
        hizmetli.setKatGorevAlani(sorumlulukKatları);

        System.out.println(hizmetli.getKatGorevAlani());
        System.out.println(hizmetli);

       for (int kat: hizmetli.getKatGorevAlani( )) {
            System.out.println(kat+"  ");

        }
        System.out.println(hizmetli.getKatGorevAlani());
        System.out.println(hizmetli);



    }
}
