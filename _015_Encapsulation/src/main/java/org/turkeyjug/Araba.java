package org.turkeyjug;

public class Araba {
    private String marka;
    private String renk ;
    private int model ;
    private double motorHacmi;
    final int trafikDurumu = 0;

    public int getTrafikDurumu() {
        return trafikDurumu;
    }

    public Araba(){

    }

    public Araba(String marka, String renk, int model, double motorHacmi) {
        this.marka = marka;
        this.renk = renk;
        this.model = model;
        this.motorHacmi = motorHacmi;
    }

    public String getMarka() {
        return marka;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "marka='" + marka + '\'' +
                ", renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                '}';
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
