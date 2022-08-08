package day08_IfelseStatements;

import java.util.Scanner;

public class C01_IfElse {
    public static void main(String[] args) {
        //kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin ve dikdörtgenin kare olup olmadığını yazdırın.

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen dikdörtgenin bir kenarını giriniz...");

        double kenar1=scan.nextDouble();

        System.out.println("lütfen dikdörtgenin diğer kenarını giriniz...");

        double kenar2=scan.nextDouble();

        String kare1="kare";
        String dikdörtgen="kare değil";

        if (kenar1 == kenar2) {
            System.out.println(kare1);
        }else {
            System.out.println(dikdörtgen);
        }



    }



}
