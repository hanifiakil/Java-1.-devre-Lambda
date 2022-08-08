package day10_Termary_SwitchCase;

import java.util.Scanner;

public class C01_termary {
    public static void main(String[] args) {
        // kullanıcıdan 2 sayı alın ve büyük olmayanı yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz");

        double sayı1=scan.nextDouble();

        System.out.println("lütfen  bir sayı daha giriniz");

        double sayı2=scan.nextDouble();

        double sonuç = sayı1<sayı2 ? sayı1 : sayı2;

        System.out.println("yazılan sayılardan büyük olmayan : " + sonuç);


    }
}
