package org.example.soru1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Kutuphane implements IKutuphane {

    private  static final String FIRMA_ADI = "BOB";
    private  static List<Kitap> kitaplar = new ArrayList<>();
    private  static List<Musteri> musteriler = new ArrayList<>();
    private  static List<Kasiyer> kasiyerler = new ArrayList<>();
    private  static List<Kiralama> kiralamalar = new ArrayList<>();


    public static <T> void listeyeEkle(List<T> list, T object) {
        list.add(object);
    }

    public void musteriOlustur() {
        Musteri musteri1 = new Musteri(1, "Orhun");
        Musteri musteri2 = new Musteri(2, "Faruk");
        Musteri musteri3 = new Musteri(3, "Zübeyde");
        Musteri musteri4 = new Musteri(4, "Liza");
        listeyeEkle(musteriler, musteri1);
        listeyeEkle(musteriler, musteri2);
        listeyeEkle(musteriler, musteri3);
        listeyeEkle(musteriler, musteri4);

    }
    public void kasiyerOlustur() {
        Kasiyer kasiyer1 = new Kasiyer(5, "İdil", 32000);
        Kasiyer kasiyer2 = new Kasiyer(6,   "Mina", 30000);
        listeyeEkle(kasiyerler, kasiyer1);
        listeyeEkle(kasiyerler, kasiyer2);
    }

    public static void kitapOlustur() {










        listeyeEkle(kitaplar, new Kitap(1, "Harry Potter"));
        listeyeEkle(kitaplar, new Kitap(2, "Dario Fo"));
        listeyeEkle(kitaplar, new Kitap(3, "Nutuk"));
        listeyeEkle(kitaplar, new Kitap(4, "Çekilin ben doktor değilim"));
        listeyeEkle(kitaplar, new Kitap(5, "Sabah Mucizesi"));
        listeyeEkle(kitaplar, new Kitap(6, "Sırça köşk"));


    }

    public void kiralamaOlustur() {
        Kiralama kiralama1 = new Kiralama(1, kasiyerler.get(1), musteriler.get(0), kitaplar.get(0));
        kitaplar.get(0).setDurum(EDurum.KIRADA);
        Kiralama kiralama2 = new Kiralama(2, kasiyerler.get(0), musteriler.get(1), kitaplar.get(1));
        kitaplar.get(0).setDurum(EDurum.KIRADA);
        Kiralama kiralama3 = new Kiralama(3, kasiyerler.get(1), musteriler.get(2), kitaplar.get(2));
        kitaplar.get(1).setDurum(EDurum.KIRADA);
        kitaplar.get(1).setDurum(EDurum.KUTUPHANEDE);
        Kiralama kiralama4 = new Kiralama(4, kasiyerler.get(0), musteriler.get(3), kitaplar.get(3));
        kitaplar.get(2).setDurum(EDurum.KIRADA);
        Kiralama kiralama5 = new Kiralama(5, kasiyerler.get(1), musteriler.get(4), kitaplar.get(4));
        kitaplar.get(3).setDurum(EDurum.KIRADA);
        Kiralama kiralama6 = new Kiralama(6, kasiyerler.get(0), musteriler.get(4), kitaplar.get(5));
        kitaplar.get(3).setDurum(EDurum.KIRADA);
        listeyeEkle(kiralamalar, kiralama1);
        listeyeEkle(kiralamalar, kiralama2);
        listeyeEkle(kiralamalar, kiralama3);
        listeyeEkle(kiralamalar, kiralama4);
        listeyeEkle(kiralamalar, kiralama5);
        listeyeEkle(kiralamalar, kiralama6);
    }

    @Override
    public boolean kiralamaYap() throws KutuphaneException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Kasiyer id gir");
        int kasiyerId = Integer.parseInt(scanner.nextLine());
        Kasiyer kasiyer = kasiyerler.get(kasiyerId - 1);

        System.out.println("Lütfen müsteri id  gir");
        int musteriId = Integer.parseInt(scanner.nextLine());
        Musteri musteri = musteriler.get(musteriId - 1);


        System.out.println("Kirada Olmayan Kitaplar");
        kitaplar.stream().filter(y -> y.getDurum().equals(EDurum.KUTUPHANEDE)).forEach(x -> {
            System.out.println(x.getId() + "-" + x.getIsim());
        });
        System.out.println("Lütfen bir secim yapınız");
        int kitapId = Integer.parseInt(scanner.nextLine());
        Kitap kitap = kitaplar.get(kitapId - 1);

        if (kitap.getDurum().equals(EDurum.KIRADA)) {
            throw new KutuphaneException("Bu Kitap zaten kirada");
        } else {
            Kiralama kiralama = new Kiralama(kiralamalar.size() + 1, kasiyer, musteri, kitap);
            kiralamalar.add(kiralama);
            return true;
        }

    }

    @Override
    public Kitap kitapAra() throws KutuphaneException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  kitap ismi giriniz");
        String isim = scanner.nextLine();

        Optional<Kitap> kitap = kitaplar
                .stream()
                .filter(k -> k.getIsim().equalsIgnoreCase(isim)).findFirst();

        if (kitap.isEmpty()) {
            throw new KutuphaneException("Kitap bulunamadı");
        }
        return kitap.get();
    }

    @Override
    public Musteri musteriAra() throws KutuphaneException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  musteri ismi giriniz");
        String isim = scanner.nextLine();
        Optional<Musteri> musteri =
                musteriler.stream().filter(x -> x.getIsim().equalsIgnoreCase(isim)).findFirst();
        if (musteri.isEmpty()) {
            throw new KutuphaneException("Musteri bulunamadı");
        }

        return musteri.get();
    }

    @Override
    public List<Kitap> kiralananKitaplar() throws KutuphaneException {
        List<Kitap> kiralananKitaplar = kitaplar.stream().filter(x -> x.getDurum().equals(EDurum.KIRADA))
                .collect(Collectors.toList());

        if (kiralananKitaplar.isEmpty()) {
            throw new KutuphaneException("Suan kirada kitap yok");
        }

        return kiralananKitaplar;
    }


    public Musteri idyeGoreKiralayanKisi(int kitapId) throws KutuphaneException {
        List<Kiralama> kiralama = kiralamalar.stream().filter(x -> x.getKitap().getId() == kitapId)
                .collect(Collectors.toList());
        Musteri musteri = null;
        try {
            musteri = kiralama.get(kiralama.size() - 1).getMusteri();
        } catch (Exception e) {
            throw new KutuphaneException("Bu kitaba ait herhangi kiralama yok");
        }

        return musteri;
    }

    public List<Musteri> kitapAdınaGoreKiralayanMusteriler(String kitapAdı) {

        List<Musteri> musteriList = kiralamalar.stream().filter(x -> x.getKitap().getIsim().equalsIgnoreCase(kitapAdı))
                .map(y -> y.getMusteri()).collect(Collectors.toList());
        return musteriList;
    }

    public List<Musteri> harBaslayanMusteriler() {

        List<Musteri> musteriList = musteriler.stream().filter(x -> x.getIsim().startsWith("Har"))
                .collect(Collectors.toList());


        return musteriList;

    }

    public List<Kitap> musteriIdyeGoreKitaplar(int musteriId) {

        return kiralamalar.stream().filter(x -> x.getMusteri().getId() == musteriId).map(y -> y.getKitap())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(FIRMA_ADI + " Kütüphanesi");
        Kutuphane kutuphane = new Kutuphane();
        kutuphane.musteriOlustur();
        kutuphane.kasiyerOlustur();
        kutuphane.kitapOlustur();


        listeyeEkle(musteriler,new Musteri(5,"Orhun"));
        listeyeEkle(musteriler,new Musteri(6,"Baki"));
        listeyeEkle(musteriler,new Musteri(7,"İlhan"));

        listeyeEkle(kasiyerler, new Kasiyer(3, "Ulaş", 33_000.0));
        listeyeEkle(kitaplar, new Kitap(7, "Zafer Algöz - Cash on the table"));

        kutuphane.kiralamaOlustur();

        try {
            System.out.println(kutuphane.idyeGoreKiralayanKisi(3));

        } catch (KutuphaneException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Har ile başlayanlar");
        kutuphane.harBaslayanMusteriler().forEach(System.out::println);
        System.out.println("kitap adına göre");
        kutuphane.kitapAdınaGoreKiralayanMusteriler("Sırça Kösk").forEach(System.out::println);
        System.out.println("musteri id sine göre");
        kutuphane.musteriIdyeGoreKitaplar(3).forEach(System.out::println);

    }
}