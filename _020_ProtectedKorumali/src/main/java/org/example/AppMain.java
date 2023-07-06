package org.example;
import lombok.Setter;
import lombok.Getter;

@Setter @Getter
public class AppMain {
    public static void main(String[] args) {
        Cocuk cocuk = new Cocuk();
        cocuk.konustuguDil();
    }
}
