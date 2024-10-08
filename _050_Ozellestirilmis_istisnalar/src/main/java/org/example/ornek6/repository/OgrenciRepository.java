package org.example.ornek6.repository;

import org.example.ornek6.exp.MesajTipleri;
import org.example.ornek6.exp.OgrenciException;
import org.example.ornek6.model.Ogrenci;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OgrenciRepository {

    //  degisken - dizi - liste - dosya - veritabani

    private List<Ogrenci> ogrenciListesi;

    public OgrenciRepository() {
        ogrenciListesi = new ArrayList<>();
    }

    public void ogrenciEkle(String ad, String soyad) {
        ogrenciListesi.add(new Ogrenci(ad, soyad));
    }




    public List<Ogrenci> getOgrenciListesi() {
        return ogrenciListesi;
    }

    public void setOgrenciListesi(List<Ogrenci> ogrenciListesi) {
        this.ogrenciListesi = ogrenciListesi;
    }

    public void ogrenciGuncelle(Ogrenci ogrenci) {

    }


    public Optional<Ogrenci> ogrenciAra(Long id) throws OgrenciException {

        Optional<Ogrenci> ogrenci = ogrenciListesi.stream()
                .filter(ogr -> ogr.getId().equals(id))
                .findFirst();

        if (ogrenci.isEmpty()){
            throw new OgrenciException(MesajTipleri.ARANAN_BULUNAMADI);
        }

        return ogrenci;
    }


}
