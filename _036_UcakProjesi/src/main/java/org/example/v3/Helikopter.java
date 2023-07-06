package org.example.v3;

public class Helikopter extends HavaAraci implements Kargo,Savas,Yolcu{
    float ustPervane;
    float arkaPervane;

    public void manevra(){
        System.out.println("Manevra yeteneği");
    }

    public Helikopter() {
        super();
    }

    @Override
    public String bilgiVer(String mesaj) {
        return null;
    }

    public Helikopter(float uzunluk, float yükseklik, int hizi, float ağırlık, boolean ucakKonumDurumu,
                      float ustPervane, float arkaPervane) {
        super(uzunluk, yükseklik, hizi, ağırlık, ucakKonumDurumu);
        this.ustPervane = ustPervane;
        this.arkaPervane = arkaPervane;
    }


    @Override
    public float agirlikDurumu(double yuk) {
        return (float) (yuk+100)*2;
    }
}
