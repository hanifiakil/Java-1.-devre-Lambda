package day10_Termary_SwitchCase;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {
        //gün numarasına göre gün isimlerini yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen gün sayısını giriniz");

        int günsayısı=scan.nextInt();

        switch (günsayısı) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("dayııı haftanın yedi günü var");
        }
    }
}
