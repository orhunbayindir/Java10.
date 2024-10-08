package org.example.soru1;

import java.time.LocalDate;

public class TeknikPersonel extends Personel {
    private static int idNo = 1;
    private String id;


    public TeknikPersonel(String isim, int yas, float maas, LocalDate iseGiris) {
        super(isim, yas, maas, iseGiris);
        setDepartman(PersonelManager.getDepartmanlar().get(1));
        getDepartman().getDepartmandakiPersoneller().add(this);
        this.id = "TP-" + idNo++;
        PersonelManager.getPersoneller().add(this);
        PersonelManager.getPersonelById().put(this.id, this);
    }

    public static int getIdNo() {
        return idNo;
    }

    public static void setIdNo(int idNo) {
        TeknikPersonel.idNo = idNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "TeknikPersonel{" +
                "id='" + id + '\'' +
                "} " + super.toString();
    }
}

