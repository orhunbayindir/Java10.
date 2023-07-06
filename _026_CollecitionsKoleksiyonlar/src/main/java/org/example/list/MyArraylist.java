package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class MyArraylist {
    public MyArraylist() {
    super();
    }

    @Override
    public String toString() {
        return "MyArraylist{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();
        List<String> list2= new ArrayList<>();

        list1.add(10);
        list1.add(25);

        list2.add("Ahmet");//index 0
        list2.add("Osman");//index 1
        list2.add("Gizem");//index 2

        System.out.println("Elamanları liste 1:"+list1);
        System.out.println("Elamanları liste 2"+list2);

        System.out.println("Arama1 :"+list2.contains("Osman"));//boşluk ve harfa dikkat eder
        System.out.println("Arama 2:"+list2.contains("a"));
        System.out.println("Arama 3:"+list1.contains(25));
        System.out.println("Arama 4: "+list2.contains(list1));
        System.out.println(list2.equals(list1));

        List<String> list3= new ArrayList<>();


        list3.add("Ahmet");//index 0
        list3.add("Osman");//index 1 Sıralama değişirse eşit mi dediğinde false der
        list3.add("Gizem");//index 2
        list3.add("Caner");//index 3
        System.out.println("Arama 5: "+list2.equals(list3));//sıra farklıysa false
        System.out.println("Arama 6: "+list2.containsAll(list3));//sıra farklı olsada true çıkar
        System.out.println("Arama 7 : "+list3.containsAll(list2));//uzunda kısayı arar tersi olmaz

        System.out.println("liste boyutu: " +list3.size());
        System.out.println("Liste dolu mu "+!list3.isEmpty());
        //list3.clear();
        System.out.println("liste sıfırlama boşaltma sonrası liste boyutu: "+list3.size());
        System.out.println(list3.get(0));
        list3.remove(0);
        System.out.println(list3.get(0));

        list3.add("Orhun");
        list3.add("Aysu");
        list3.add("Ünal");
        System.out.println(list3);
        System.out.println(list2);

        list3.removeAll(list2);
        System.out.println("Liste farkları"+list3);

        System.out.println("Hash code :"+list3.hashCode());



    }
}
