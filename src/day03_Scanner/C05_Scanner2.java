package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner2 {
    public static void main(String[] args) {
        //kullanıcıdan isim ve soyisimi ayrı ayrı isteyelim
        //girilen ismi aşağıdaki gibi yazdırınız
        //girilen isim: Hanifi Akıl
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi yazınız...");
        String isim=scan.next();
        System.out.println("lütfen soyisminizi yazınız...");
        String soyisim= scan.next();
        System.out.println("girilen isim : " + isim + " " + soyisim);
    }
}
