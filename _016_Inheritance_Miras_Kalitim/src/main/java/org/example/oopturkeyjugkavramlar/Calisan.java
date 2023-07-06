package org.example.oopturkeyjugkavramlar;
//class
public class Calisan {
    //Fields //Veriables
    private Long kimlikNo;
    private String adi;
    private String soyadi;
    private Float maas;
    private Boolean sigorta;
    //erişim belirteçleri private public protected encapsulation(koruma)
   //hazırlayıcı constructor
    public Calisan() {

    }

    public Calisan(Long kimlikNo, String adi, String soyadi, Float maas, Boolean sigorta) {
        this.kimlikNo = kimlikNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.maas = maas;
        this.sigorta = sigorta;
    }
    //Setter Getter
    //yazma
    public void setKimlikNo(Long kimlikNo) {//sadece admin değiştirebilir tc sürekli değişmez
        this.kimlikNo = kimlikNo;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public void setMaas(Float maas) {
        this.maas = maas;
    }

    public void setSigorta(Boolean sigorta) {
        this.sigorta = sigorta;
    }
    //okuma setler olmazsa read only
    public Long getKimlikNo() {
        return kimlikNo;
    }

    public String getAdi() {
        return adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public Float getMaas() {
        return maas;
    }

    public Boolean getSigorta() {
        return sigorta;
    }

    @Override //ezme
    public String toString() {
        return "Calisan{" +
                "kimlikNo=" + kimlikNo +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", maas=" + maas +
                ", sigorta=" + sigorta +
                '}';
    }

    public Float getMaasSon(float maas,float bonus) {
        return maas*3+bonus;
    }
    //pollymorphism
    public Float getMaasSon(float maas,float bonus,int izin) {
        return maas*3+bonus;
    }
}
