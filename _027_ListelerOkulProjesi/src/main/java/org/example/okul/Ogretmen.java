package org.example.okul;


import org.example.utils.Branslar;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogretmen {

    // TODO miras yapılacak
    private String ad;
    private String soyad;
    private String telefon;
    private String adres;
    private  Branslar brans;

}
