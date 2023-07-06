package org.example.v2;

public class JenerikSinifCiftli <GelenTip1,GelenTip2>{
    private GelenTip1 plaka;
    private GelenTip2 sehir;

    public JenerikSinifCiftli(GelenTip1 plaka, GelenTip2 sehir) {
        this.plaka = plaka;
        this.sehir = sehir;
    }

    public JenerikSinifCiftli() {
    }

    public GelenTip1 getPlaka() {
        return plaka;
    }

    public void setPlaka(GelenTip1 plaka) {
        this.plaka = plaka;
    }

    public GelenTip2 getSehir() {
        return sehir;
    }

    public void setSehir(GelenTip2 sehir) {
        this.sehir = sehir;
    }

    public void bilgiGoster(){
        System.out.println("GelenTip1 tipi: "+plaka.getClass().getName());

        System.out.println("GelenTip2 tipi: "+sehir.getClass().getName());
    }
}
