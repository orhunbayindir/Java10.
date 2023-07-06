package org.example.v4İcİceİstisnalar;

public class AppMain {
    public static void main(String[] args) {
        int myArr[]=new int[6];
        try {

           // int myArr[]=new int[6];
            myArr[2]=22;
            myArr[4]=44;
            myArr[0]=myArr[2]/myArr[4];
           //myArr[13]=200;
            try {
                myArr[13]=200;
               }
            catch (ArrayIndexOutOfBoundsException e){//NullPointerException yazarsak 2.catche gider
                System.out.println("İçteki catch1: "+e);
            }

            catch (Exception e){
                System.out.println("İçteki catch2: "+e);
            }finally {
                System.out.println("İçteki finally: ");
            }

        }catch (Exception e){
            System.out.println("Dıştaki catch: "+e);
        }finally {
            System.out.println("Dıştaki finally: ");
        }
        System.out.println(myArr);//tryin içinde görür??? derse bak


    }
}
