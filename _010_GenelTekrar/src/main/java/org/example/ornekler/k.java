package org.example.ornekler;

public class k {
    public static int topla(int number1,int number2){

    return number1+number2;
}


    public static int carpma(){
        int number1=5;
        return number1*10;
    }


    public static int bolme(int number1){
        int number2=5;
        int sonuc=number1/number2;
        return sonuc;
    }

    public static boolean yazdır(){
        System.out.println("Hello world");
        return true;
    }


    public static void main(String[] args) {

        System.out.println(yazdır());
        int toplam=topla(5,10);
        System.out.println(toplam);
    }
}
