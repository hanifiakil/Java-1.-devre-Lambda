package day05_matematiksel_işlemler;

import java.util.Scanner;

public class C04_Modulus {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen dört basamaklı bir sayı giriniz...");

        int sayı=scan.nextInt();
         int rakamlartoplamı=0;
         int rakam=sayı%10;
         rakamlartoplamı+=rakam;
         sayı/=10;
         rakam=sayı%10;
         rakamlartoplamı+=rakam;
         sayı/=10;
         rakam=sayı%10;
         rakamlartoplamı+=rakam;
         sayı/=10;
         rakam=sayı%10;
         rakamlartoplamı+=rakam;
        System.out.println("rakamlar toplamı : " + rakamlartoplamı);


    }
}
