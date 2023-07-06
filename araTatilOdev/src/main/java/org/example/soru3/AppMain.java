package org.example.soru3;

public class AppMain {
    public static void main(String[] args) {

        MyArrayList<String> myList = new MyArrayList<>();  // MyArrayList oluşturma
        myList.add("Orhun");// Eleman ekleme
        myList.add("Faruk");
        myList.add("Zübeyde");

        System.out.println("MyList: " + myList); //  Elemanları ekrana yazdırma
        myList.add(1, "Liza");  // Belirli bir indekse eleman ekleme

        System.out.println("Mango eklendikten sonra MyList: " + myList);  // Elemanları ekrana yazdırma

        myList.set(0, "FarukB"); // Belirli bir indeksteki elemanı değiştirme

        System.out.println("değiştirildikten sonra MyList: " + myList); // Elemanları ekrana yazdırma

        myList.remove(2);// Belirli bir indeksteki elemanı kaldırma

        System.out.println("2.kaldırıldıktan sonra MyList: " + myList);  // Elemanları ekrana yazdırma

        System.out.println("MyList FarukB içeriyor mu? " + myList.contains("FarukB"));// Belirli bir elemanın listede olup olmadığını kontrol etme
        System.out.println("MyList Lizaa içeriyor mu? " + myList.contains("Lizaa"));

        System.out.println("MyList'in boyutu: " + myList.boyut());  // Listenin boyutunu alma

        System.out.println("MyList boş mu? " + myList.isEmpty()); // Listenin boş olup olmadığını kontrol etme
    }
}