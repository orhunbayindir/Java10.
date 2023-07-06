package org.example;

public class AppMain {
    public static void main(String[] args) {
        Kedi obj1 = new Kedi();
        Kopek obj2 = new Kopek();
        Kus obj3 = new Kus();
        obj1.ses();

        if (obj1 instanceof Hayvan) {// yerini gösterir
            System.out.println(obj1);

        }
        if (obj2 instanceof Hayvan) {// yerini gösterir
            System.out.println(obj2);

        }
        if (obj3 instanceof Hayvan) {// yerini gösterir
            System.out.println(obj3);

        }
        Veteriner veteriner = new Veteriner();
        String gelenCevap= veteriner.hayvanBilgisiAl(obj1);
        System.out.println(gelenCevap);

         gelenCevap= veteriner.hayvanBilgisiAl(obj2);
        System.out.println(gelenCevap);

         gelenCevap= veteriner.hayvanBilgisiAl(obj3);
        System.out.println(gelenCevap);





    }
}
