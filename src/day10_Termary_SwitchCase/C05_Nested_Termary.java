package day10_Termary_SwitchCase;

import java.util.Scanner;

public class C05_Nested_Termary {
    public static void main(String[] args) {
        //kullanıcıya yaşını sorun
        //eğer çalışan kadınsa 60 yaşından büyükse emekli olabilir
        //eğer çalışan erkekse 65 yaşından büyükse emekli olabilir


        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi yazınız...");

        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz...");

        int yaş=scan.nextInt();

       String sonuç= cinsiyet=='K' ? (
                yaş<60 ? ("emekli olamazsınız çalışmalısınız") : ("emekli olabilirsiniz")
                ) : (
                        yaş<65 ? ("emekli olamazsınız çalışmalısınız") : ("emekli olabilirsiniz")
                );

        System.out.println(sonuç);


}}
