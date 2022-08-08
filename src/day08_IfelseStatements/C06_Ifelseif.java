package day08_IfelseStatements;

import java.util.Scanner;

public class C06_Ifelseif {
    public static void main(String[] args) {
        //kullanıcıdan yüz üzerinden not isteyin
        //notu harf sistemine çevirip yazdırın
        //50 den küçükse d 50 60 arası c 60 80 arası b 80 üzeri a yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz...");

        double not = scan.nextDouble();

        if (not < 0 || not > 100) {
            System.out.println("lütfen geçerli bir not yazınız...");
        } else if (not < 50) {
            System.out.println("notunuz : D");
        } else if (not < 60) {
            System.out.println("notunuz : C");
        } else if (not < 80) {
            System.out.println("notunuz : B");
        } else {
            System.out.println("notunuz : A");
        }
    }

    }
