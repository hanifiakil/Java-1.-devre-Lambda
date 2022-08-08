package day07_IfStatements;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class C01_basit_If_cümleleri {
    public static void main(String[] args) {
        //kullanıcıdan gün isimlerinden birinin ilk harfini isteyin
        //ve o harfle başlayan gün isimlerini yazdırın.
        //örnek: ilk harf=P output = "pazar , pazartesi , perşembe"
        //büyük küçük problemi olmaması için toupperCase metodunu kullanın.

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen günlerden birinin ilk harfini giriniz...");

        char ilkharf = scan.next().charAt(0);

        String gün1 = "pazar";
        String gün2 = "pazartesi";
        String gün3 = "salı";
        String gün4 = "çarşamba";
        String gün5 = "perşembe";
        String gün6 = "cuma";
        String gün7 = "cumartesi";


        if (ilkharf == 'p') {
            System.out.println(gün1 + " " + gün2 + " " + gün5);
        }
        if (ilkharf == 's'){
            System.out.println(gün3);
        }
        if (ilkharf == 'ç'){
            System.out.println(gün4);
        }
        if (ilkharf=='c'){
            System.out.println(gün6 + " " + gün7);
        }


    }

}
