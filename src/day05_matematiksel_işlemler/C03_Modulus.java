package day05_matematiksel_işlemler;

import java.util.Scanner;

public class C03_Modulus {
    public static void main(String[] args) {
        //kullanıcıdan üç basamaklı bir sayı alıp rakamlar toplamını yazdıran bi proğram yazınız.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen üç basamaklı bir sayı giriniz...");

        int rakamlarToplamı=0;

        int sayı=scan.nextInt();
        int rakam=sayı%10; //birler basamağının rakam değerini verir.
        rakamlarToplamı+=rakam;
        sayı/=10;  //sayıyı bir basamak alta düşürür
        rakam=sayı%10; //ilk sayının onlar basamağının rakam değerini verir.
        rakamlarToplamı+=rakam;
        sayı/=10;  //sayıyı bir basamak alta düşürür.
        rakam=sayı%10;  //ilk sayının yüzler basamağının rakam değerini verir.
        rakamlarToplamı+=rakam;

        System.out.println("rakamlar toplamı : " + rakamlarToplamı);

    }
}
