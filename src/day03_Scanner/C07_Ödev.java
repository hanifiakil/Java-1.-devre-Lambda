package day03_Scanner;

import java.util.Scanner;

public class C07_Ödev {
    public static void main(String[] args) {
        //kullanıcıdan 2 tamsayı alıp bu sayıların toplam fark ve çarpımlarını yazdırın.
        //kullanıcıdan karenin bir kenar uzunluğunu alın ve karenin çevresini ve alanını
        //hesaplayıp yazdırın
        //kullanıcıdan dikdörtgenler prizmasının uzun,kısa kenarlarını ve yüksekliğini isteyip
        //prizmanın hacmini hesaplayıp yazdırın
        //kullanıcıdan ismini ve soyismini isteyip aşagıdaki şekilde yazdırın
        //isminiz : mehmet
        //soyisminiz : bulut
        //kursumuza kaydınız alınmıştır teşekkürler
        //kullanıcıdan ismini ve soyismini alıp aralarında bir boşluk oluşturarak aşağıdaki şekilde yazdırın
        //isim - soyisim
        //kullanıcıdan ismini alıp isminin baş harfini yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz...");

        int sayı1=scan.nextInt();

        System.out.println("lütfen bir tamsayı daha giriniz...");


        int sayı2=scan.nextInt();


        System.out.println("sayıların toplamı : " + (sayı1+sayı2)
                + " sayıların farkı : " + (sayı1-sayı2)
                + " sayıların çarpımı : " + (sayı1*sayı2));

        System.out.println("karenin bir kenar uzunluğunu giriniz...");

        int kenaruzunlugu= scan.nextInt();
        System.out.println("karenin alanı : " + (kenaruzunlugu*kenaruzunlugu) + " "
                + "karenin çevresi : " + (kenaruzunlugu*4));

        System.out.println("dikdörtgenler prizmasının kısa kenarını giriniz...");

        int kısakenar= scan.nextInt();

        System.out.println("dikdörtgenler prizmasının uzun kenarını giriniz...");

        int uzunkenar= scan.nextInt();

        System.out.println("dikdörtgenler prizmasının yüksekliğini giriniz...");

        int yükseklik= scan.nextInt();

        System.out.println("dikdörtgenler prizmasının hacmi : " + (kısakenar*uzunkenar*yükseklik));



        System.out.println("lütfen adınızı giriniz...");
        String adınız= scan.next();
        System.out.println("lütfen soyadınızı giriniz...");
        String soyadınız= scan.next();
        System.out.println("adınız : " + adınız );
        System.out.println("soyadınız : " + soyadınız);
        System.out.println("kursumuza kaydınız alınmıştır. teşekkürler...");
        System.out.println("lütfen isminizi giriniz...");
        String isminiz= scan.next();
        System.out.println("lütfen soyisminizi giriniz...");
        String soyisminiz= scan.next();
        System.out.println( isminiz + " " + soyisminiz );

        System.out.println("SENİ SEVİYORUM BU AŞAM BENİM OLUN MU BİTANEM ...");












    }
}
