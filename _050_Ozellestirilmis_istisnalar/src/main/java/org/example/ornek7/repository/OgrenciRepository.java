package org.example.ornek7.repository;

import org.example.ornek7.exp.MesajTipleri;
import org.example.ornek7.exp.OgrenciException;
import org.example.ornek7.model.Ogrenci;

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

        Optional<Ogrenci> ogrenciBulunan = ogrenciListesi.stream()
                .filter(ogr -> ogr.getId().equals(ogrenci.getId()))
                .findFirst();

        if(ogrenciBulunan.isPresent()) // VARLIGI KONTROL EDER
        {
            ogrenciBulunan.get().setAd(ogrenci.getAd());
            ogrenciBulunan.get().setSoyad(ogrenci.getSoyad());
        } else {
            throw new OgrenciException(MesajTipleri.GUNECELLEME_YAPILAMADI);
        }

    }


    public Optional<Ogrenci> ogrenciAraId(Long id) throws OgrenciException {

        Optional<Ogrenci> ogrenci = ogrenciListesi.stream()
                .filter(ogr -> ogr.getId().equals(id))
                .findFirst();

        if (ogrenci.isEmpty()){ // YOKLUGU KONTROLE EDER
            throw new OgrenciException(MesajTipleri.ARANAN_BULUNAMADI);
        }

        return ogrenci;
    }


}