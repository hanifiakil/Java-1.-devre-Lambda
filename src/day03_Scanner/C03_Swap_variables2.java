package day03_Scanner;

public class C03_Swap_variables2 {
    public static void main(String[] args) {
        int sayı1=15;
        int sayı2=25;
        System.out.println("başlangıçta sayı1 = " + sayı1 + " ve sayı2 = " + sayı2 );
        sayı1= sayı1-sayı2;

        sayı2= sayı2+sayı1;
        sayı1= sayı2-sayı1;
        
        System.out.println("sonuç sayı1 = " + sayı1 + " ve sayı2 = " + sayı2 );



    }
}
