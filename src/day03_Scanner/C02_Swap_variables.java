package day03_Scanner;

public class C02_Swap_variables {
    public static void main(String[] args) {
        int sayı1=30;
        int sayı2=10;
        System.out.println("başlangıçta sayı1 = " + sayı1 + " ve sayı2 = " + sayı2 );
        System.out.println("işlem sonrası sayı1 = " + sayı2 + " ve sayı2 = " + sayı1 );

        int bos;
        bos=sayı2;
        sayı2=sayı1;
        sayı1=bos;
        System.out.println("sonucta sayı1 = " + sayı1 + " ve sayı2 = " + sayı2 );
    }
}
