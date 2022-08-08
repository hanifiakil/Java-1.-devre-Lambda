package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner3 {
    public static void main(String[] args) {

        //scanner işleminde string için 2 metot vardır.
        //scan.next() dediğimizde sadece bir kelime alır
        // daha fazla kelime gelme ihtimali varsa scan.nextline() kullanılır
        //kullanıcıdan isim ve soyisimi ayrı ayrı isteyelim
        //girilen ismi aşağıdaki gibi yazdırınız
        //girilen isim: Hanifi Akıl


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi yazınız...");
        String isim=scan.nextLine();
        System.out.println("lütfen soyisminizi yazınız...");
        String soyisim= scan.nextLine();
        System.out.println("girilen isim : " + isim + " " + soyisim);

    }
}
