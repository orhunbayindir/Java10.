package org.example.solidprensibleri.rapor.musteri;

import org.example.solidprensibleri.Musteri;
import org.example.solidprensibleri.Rapor;
import org.example.solidprensibleri.rapor.IPdf;

public class MusteriRaporPdf extends Rapor implements IPdf {

    @Override
    public void mustreriRaporBilginiNotEt(Musteri musteri) {
        System.out.println("MusteriRaporPdf: " + musteri.getAdi() + " "  + musteri.getSoyadi());
    }

    @Override
    public void musteriRaporPdf(Musteri musteri) {
        System.out.println("musteriRaporPdf: " +  musteri.getAdi() + " "  + musteri.getSoyadi() );
    }
}

