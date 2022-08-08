package day10_Termary_SwitchCase;

import java.util.Scanner;

public class C03_termary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");

        double sayı= scan.nextDouble();

        double sonuç=sayı<0 ? sayı*-1 : sayı;

        System.out.println("sayının mutlak değeri : " + sonuç);

    }
}
