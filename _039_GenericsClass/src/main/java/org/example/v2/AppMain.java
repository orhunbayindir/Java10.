package org.example.v2;

public class AppMain {
    public static void main(String[] args) {
        JenerikSinifCiftli <Integer,String> obj1  =new JenerikSinifCiftli<>(1,"Adana");
        JenerikSinifCiftli <String,String> obj2  =new JenerikSinifCiftli<>("6","Ankara");


        obj1.bilgiGoster();
        System.out.println(obj1.getPlaka()+" "+obj1.getSehir());
        System.out.println("---------------------------");
        obj2.bilgiGoster();
        System.out.println(obj2.getPlaka()+" "+obj2.getSehir());
    }
}
