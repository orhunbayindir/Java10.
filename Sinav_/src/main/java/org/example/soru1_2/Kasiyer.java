package org.example.soru1_2;

public class Kasiyer extends Kisi {

    private double maas;

    public Kasiyer(int id, String isim, double maas) {
        super(id, isim);
        this.maas = maas;

    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Kasiyer{" +
                "maas=" + maas +
                "} " + super.toString();
    }
}
