package day10_Termary_SwitchCase;

import java.util.Scanner;

public class C04_termary {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alın. sayı pozitif ise "sayı pozitif" yazdırın.
        //negatif ise sayının karesini yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");

        double sayı=scan.nextDouble();

        System.out.println(sayı<=0 ? sayı*sayı : "sayı pozitif");


    }
}
