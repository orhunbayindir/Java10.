package org.example;

public class Veteriner {

    public String hayvanBilgisiAl(Hayvan hayvan) {


        String cevap = "Hayvan bilgisi bulunamadı";
        if (hayvan instanceof Kedi ) {
           cevap="Kedi nesnesi gönderildi";
       }
        if (hayvan instanceof Kopek) {
            cevap="Kopek nesnesi gönderildi";
        }
        if (hayvan instanceof Kus) {
            cevap="Kus nesnesi gönderildi";
        }


        return cevap;
    }
}
