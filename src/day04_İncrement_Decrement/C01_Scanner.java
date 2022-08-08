package day04_İncrement_Decrement;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen çemberin yarıçapını giriniz...");
        double yarıçap= scan.nextDouble();
        double çevre= 2*3.14*yarıçap;
        double alan= 3.14*yarıçap*yarıçap;

        System.out.println("çemberin çevresi : " + çevre);
        System.out.println("çemberin alanı : " + alan);


    }
}
