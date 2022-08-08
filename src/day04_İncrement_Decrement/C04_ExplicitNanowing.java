package day04_İncrement_Decrement;

public class C04_ExplicitNanowing {
    public static void main(String[] args) {
        int sayı1=69;
        short sayı2= (short) sayı1;
        System.out.println("sayı2 : " + sayı2);

        double sayı3=15.08;

        int sayı4 = (int) sayı3;
        System.out.println("sayı 4 : " + sayı4 );
        int sayı5=27;
        int sayı6=5;
        System.out.println(sayı5 / sayı6);//her iki sayıda int olduğu için sonuç ta int olarak hesaplanır

        double sayı7=12.5;
        System.out.println(sayı7/sayı6);//farklı türler kullanılırsa hangisi daha genişse ona çevirir


    }
}
