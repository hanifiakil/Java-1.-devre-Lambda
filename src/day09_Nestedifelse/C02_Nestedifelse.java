package day09_Nestedifelse;

import java.util.Scanner;

public class C02_Nestedifelse {
    public static void main(String[] args) {
        //kullanıcıdan dört basamaklı bir sayı girmesini isteyin.
        //girdiği sayı 5 e bölünüyorsa son rakamını kontrol edin.
        //son rakamı 0 ise "5 e bölünen çift sayı" yazdırın
        //son rakamı 0 değil ise " 5 e bölünen tek sayı" yazdırın
        //girdiği sayı 5 e bölünmüyor ise ekrana "tekrar deneyin" yazdırın.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 4 basamaklı bir sayı giriniz...");

        int sayı=scan.nextInt();

        if (sayı<10000 && sayı>999) {
            if (sayı%5==0) {
                if (sayı%10==0){
                    System.out.println("5 e bölünen çift sayı...");
                }else {
                    System.out.println("5 e bölünen tek sayı...");
                }

            }else {
                System.out.println("tekrar deneyin...");
            }




        }else {
            System.out.println("lütfen 4 basamaklı bir sayı giriniz...");
        }


    }


}
