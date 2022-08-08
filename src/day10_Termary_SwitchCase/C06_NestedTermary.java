package day10_Termary_SwitchCase;

import java.util.Scanner;

public class C06_NestedTermary {
    public static void main(String[] args) {
        //kullanıcıdan bir harf isteyin
        //küçük harf ise konsola "küçük harf" büyük harf ise konsola " büyük harf
        //hiçbiri değilse konsola"girdiğiniz karakter harf değildir" yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir harf giriniz...");

        char harf =scan.next().charAt(0);

        String sonuç =(harf>='a' && harf<='z' || harf>='A' && harf<='Z') ?
                (harf>='a' && harf<='z' ? "küçük harf" : "büyük harf")
                : ("girdiğiniz karakter harf değildir...");

        System.out.println(sonuç);
    }
}
