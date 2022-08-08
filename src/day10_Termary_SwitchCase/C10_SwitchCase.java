package day10_Termary_SwitchCase;

import java.util.Scanner;

public class C10_SwitchCase {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı isteyin
        //sayı 10 ise iki basamaklı en küçük sayı
        //100 ise üç basamaklı en küçük sayı
        //1000 ise dört basamaklı en küçük sayı
        //diğer durumlara girdiğin sayıyı değiştirin yazdırın
        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz...");

        int sayı=scan.nextInt();

        switch (sayı) {
            case 10:
                System.out.println("iki basamaklı en küçük sayı");
                break;
            case 100:
                System.out.println("üç basamaklı en küçük sayı");
                break;
            case 1000:
                System.out.println("dört basamaklı en küçük sayı");
                break;
            default:
                System.out.println("girdiğin sayıyı değiştir dayııı...");
        }

    }
}
