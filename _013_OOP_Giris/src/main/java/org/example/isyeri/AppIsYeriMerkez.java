package org.example.isyeri;

public class AppIsYeriMerkez {
    public static void main(String[] args) {

        Yazilimci yazilimci = new Yazilimci();
        System.out.println("MAAŞ:"+ (yazilimci.agariUcret
                + yazilimci.bonus));
        System.out.println("SGK : "
                +  ((yazilimci.sigorta==true) ? "EVET" : "HAYIR") );
        System.out.println("ÖZEL SAĞLIK SİGORTA:"
                + yazilimci.ozelSaglikSigortasi);
        System.out.println("İZİN HAKKI: " + yazilimci.izinHakki);
/*
         if (şart){
             evet
         }
             else {
             hayır
         }


       şart ? evet : hayır
       */

        Ceo ceo = new Ceo();
        System.out.println(ceo.agariUcret+ceo.bonus);
        System.out.println(ceo.sigorta);
        System.out.println(ceo.izinHakki+ceo.ekIzin);
    }
}
