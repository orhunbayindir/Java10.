package org.example.soru4;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppMain {
    public static void main(String[] args) {
        List<Urun>urunArr=new ArrayList<>();

        Urun urun1=new Urun("Bal",300);
        Urun urun2=new Urun("Kaymak",200);
        Urun urun3=new Urun("Pekmez",150);
        Urun urun4=new Urun("Tahin",50);

        urunArr.add(urun1);
        urunArr.add(urun2);
        urunArr.add(urun3);
        urunArr.add(urun4);

        Map<String,Double> urunMap=urunArr.stream().filter(x->x.getFiyat()<100)
                .collect(Collectors.toMap(y->y.getAd(),z->z.getFiyat()));
        urunMap.forEach((k,v)->System.out.println(k+"nın fiyatı :"+v));

    }
}
