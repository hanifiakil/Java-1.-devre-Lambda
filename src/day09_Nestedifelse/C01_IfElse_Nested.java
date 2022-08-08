package day09_Nestedifelse;

import java.util.Scanner;

public class C01_IfElse_Nested {
    public static void main(String[] args) {
        //Nested ıf kullanarak aşağıdaki soruyu çözen kodu yazınız
        //kullanıcıdan bir şifre girmesini isteyin
        //eğer ilk harf büyük harf ise "A" olup olmadığını kontrol edin. ilk harf "A" ise "geçerli şifre..."
        // değilse "geçersiz şifre..." yazdırın
        //eğer ilk harf küçük harf ise "z"olup olmadığını kontrol edin.
        //ilk harf "z" ise "geçerli şifre..."
        //değilse "geçersiz şifre...

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir şifre giriniz...");

        char ilkkarakter = scan.next().charAt(0);

        if (ilkkarakter >= 'A' && ilkkarakter <= 'Z') {if (ilkkarakter=='A'){
            System.out.println("Geçerli şifre");
        }else {
            System.out.println("Geçersiz şifre...");
        }

        } else if (ilkkarakter >= 'a' && ilkkarakter <= 'z') {if (ilkkarakter=='z'){
            System.out.println("geçerli şifre...");
        }else {
            System.out.println("Geçersiz şifre...");
        }

        }
        else {
            System.out.println("lütfen harf ile başlayan bir şifre giriniz...");
        }

    }}