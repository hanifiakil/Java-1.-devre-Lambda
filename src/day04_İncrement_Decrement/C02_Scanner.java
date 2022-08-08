package day04_İncrement_Decrement;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen adınızı yazınız...");
        char ilkHarf = scan.next().charAt(0);
        System.out.println("isminizin ilk harfi : " + " " + ilkHarf);


    }
}
