package org.example.a;

public class Dikdortgen {
     private int uzunKenar ;
    private int kisaKenar;
    public Dikdortgen(int uzunKenar,int kisaKenar){

        this.uzunKenar=uzunKenar;
        this.kisaKenar=kisaKenar;
    }
    public int getCevreHesapla(){
        /*int sonuc = 2*(this.uzunKenar+this.kisaKenar);
        return sonuc;*/
        return 2*(uzunKenar+kisaKenar);//thissizde olur
    }
   public int getAlamHesapla(){
       /* int sonuc = this.uzunKenar*this.kisaKenar;
        return sonuc;*/
        return this.uzunKenar*this.kisaKenar;
    }


}
