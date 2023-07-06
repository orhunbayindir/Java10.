package org.example.v2;

public class Helikopter extends HavaAraci{
    float ustPervane;
    float arkaPervane;

    public void manevra(){
        System.out.println("Manevra yeteneği");
    }

    public Helikopter() {
        super();
    }

    public Helikopter(float uzunluk, float yükseklik, int hizi, float ağırlık, boolean ucakKonumDurumu,
                      float ustPervane, float arkaPervane) {
        super(uzunluk, yükseklik, hizi, ağırlık, ucakKonumDurumu);
        this.ustPervane = ustPervane;
        this.arkaPervane = arkaPervane;
    }

    @Override
    public String toString() {
        return "Helikopter{" +
                "ustPervane=" + ustPervane +
                ", arkaPervane=" + arkaPervane +
                ", uzunluk=" + uzunluk +
                ", yükseklik=" + yükseklik +
                ", hizi=" + hizi +
                ", ağırlık=" + ağırlık +
                ", ucakKonumDurumu=" + ucakKonumDurumu +
                '}';
    }
}
