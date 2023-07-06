package org.example.solidprensibleri.rapor.musteri;

import org.example.solidprensibleri.Musteri;
import org.example.solidprensibleri.Rapor;
import org.example.solidprensibleri.rapor.IJson;

public class MusteriRaporJson  extends Rapor implements IJson {

    @Override
    public void mustreriRaporBilginiNotEt(Musteri musteri) {
        System.out.println("MusteriRaporJson: " + musteri.getAdi() + " "  + musteri.getSoyadi());
    }

    @Override
    public void musteriRaporJson(Musteri musteri) {
        System.out.println("musteriRaporJson: " +  musteri.getAdi() + " "  + musteri.getSoyadi() );
    }
}
