package org.example.v3Detaylı;

public class Diziİstisna {
    public static void main(String[] args) {
        int benimArr[]=new int[5];//benim listem diye diziye liste adı vermeyin
        try {


            benimArr[2]=27;
            benimArr[4]=11;
            System.out.println(benimArr[0]);
            System.out.println(benimArr[1]);
            System.out.println(benimArr[2]);
            System.out.println(benimArr[3]);
            System.out.println(benimArr[4]);

            benimArr[125]=88;//ArrayIndexOutOfBoundsException
            System.out.println(benimArr[125]);
        }catch (Exception e){
            System.out.println("istisna"+e);
            benimArr[0]=18;
           // System.out.println(benimArr[0]);

        }finally {
            benimArr[1]=96;
            System.out.println(benimArr[1]);
            System.out.println(benimArr[0]);
            System.out.println(benimArr[1]);
            System.out.println(benimArr[2]);
            System.out.println(benimArr[3]);
            System.out.println(benimArr[4]);
        }

    }
}
