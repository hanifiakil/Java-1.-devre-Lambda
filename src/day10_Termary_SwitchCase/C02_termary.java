package day10_Termary_SwitchCase;

import java.util.Scanner;

public class C02_termary {
    public static void main(String[] args) {
        //kullanıcıdan bir tam sayı alın vr tek mi çift mi olduğunu yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen bir tane tam sayı yazınız...");

        int sayı=scan.nextInt();
        String sonuç=sayı%2==0 ? "Çift sayı":"tek sayı";

        System.out.println("yazdığınız sayı : " + sonuç + "dır");

    }
}
