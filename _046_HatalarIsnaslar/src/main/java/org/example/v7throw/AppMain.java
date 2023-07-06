package org.example.v7throw;

public class AppMain {

    public static void main(String[] args) {

        try {
            sifiraBolmeHatasi();
        } catch (Exception e){
            System.out.println("hata"+e);
        } finally {
            System.out.println("--------------");
        }

    }

    private static void sifiraBolmeHatasi() {
        throw new ArithmeticException("Denedik sıfıra bölme olmadi be gülüm!");
    }
}
