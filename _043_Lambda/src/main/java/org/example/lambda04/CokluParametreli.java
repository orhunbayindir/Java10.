package org.example.lambda04;

public class CokluParametreli {

    public static void main(String[] args) {
        Bolme bolme = new Bolme() {
            @Override
            public int getBolmeYap(int a, int b) {

                if(b == 0) {
                    return 0;
                }
                else {
                    return a / b;
                }
            }
        };

        System.out.println(bolme.getBolmeYap(10,-10));


        // parametreler -> return sonuc
        Bolme bolme2 = (a, b)     ->  {

            if(b == 0) {
                return 0;
            }
            else {
                return a / b;
            }
        };
        System.out.println(bolme2.getBolmeYap(10,0));

        // parametreler ->   return sonuc
          Bolme bolme3 = (a,  b)     ->    a / b;
        System.out.println(bolme3.getBolmeYap(10,1));






    }
}
