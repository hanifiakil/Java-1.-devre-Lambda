package day09_Nestedifelse;

public class C03_Ternary {
    public static void main(String[] args) {
        int x=10;
        String tekMiçiftMi=x%2==0 ? "çift sayı":"tek sayı";

        System.out.println(tekMiçiftMi);//1. durum


        System.out.println(x%2==0 ? "çift sayı":"tek sayı");//2. durum

        //ternary 2 durumda da yazdırılabilir.

      //  String sonuç=x>5 ? "aferin": 4;//ternary de 2 data türü değer var ise atama yapamayız ve
        // sadece 2. durumda olduğu gibi yapabiliriz.


        System.out.println(x>5 ? "aferin": "4");




    }
}
