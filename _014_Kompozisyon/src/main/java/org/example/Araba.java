package org.example;

public class Araba {
    //Yakit yakit = new Yakit();
private Yakit yakit;
private Ayna ayna;
private Far far;
  public Araba() {
        yakit = new Yakit();
        ayna = new Ayna();
        far = new Far();

        System.out.println("Araba");
    }



    /*
                public Araba(int sayi) {
                this.sayi=sayi;
                }
                */
    public void hareketeGec(){
        yakit.depo();
        System.out.println("Harekete geç");
    }

}
