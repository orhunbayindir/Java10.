package org.example.v1;
/*
Class-sınıf-insan -uçak
Object-nesne - new


 */
public class AppMain {
    public static void main(String[] args) {
        Ucak ucak1= new Ucak();
        System.out.println(ucak1);



            Ucak ucak2 = new Ucak(35.2f, 4.3f, 20000, 27500.00f);
            System.out.println(ucak2);
            Ucak ucak3 = new Ucak(35.2f, 4.3f, 20000, 27500.00f, true);
            System.out.println(ucak3);


        System.out.println("Toplam uçak sayısı :"+Ucak.toplamUcakSayisi);//inti static yapmazsak hepsi 1 olur

    }
}