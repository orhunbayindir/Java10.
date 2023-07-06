package org.example.solidprensibleri.rapor.musteri;

import org.example.solidprensibleri.Musteri;
import org.example.solidprensibleri.Rapor;
import org.example.solidprensibleri.rapor.IExcel;

public class MusteriRaporExcel extends Rapor implements IExcel {

    @Override
    public void mustreriRaporBilginiNotEt(Musteri musteri) {
        System.out.println("mustreriRaporBilginiNotEt: " + musteri.getAdi() + " "  + musteri.getSoyadi());

    }
    @Override
    public void mustreriRaporExcel(Musteri musteri) {
        System.out.println("mustreriRaporExcel: " +  musteri.getAdi() + " "  + musteri.getSoyadi() );
    }
}