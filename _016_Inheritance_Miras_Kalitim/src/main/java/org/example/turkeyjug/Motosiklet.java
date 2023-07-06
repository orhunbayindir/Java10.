package org.example.turkeyjug;

public class Motosiklet extends Tasit {
    public Motosiklet() {
        super();
        //kodlar superden sonra mülakatta çıkar
    }

    public Motosiklet(int tekerSayisi) {
        super(tekerSayisi);
        //kodlar super sonra
    }
}
