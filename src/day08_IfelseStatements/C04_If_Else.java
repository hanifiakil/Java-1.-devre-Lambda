package day08_IfelseStatements;

import java.util.Scanner;

public class C04_If_Else {
    public static void main(String[] args) {
        //kullanıcıdan bir üçgenin üç kenar uzunluğunu alın.
        //eğer üç kenarıda eşit ise "eşkenar üçgen" yazdırın.
        //değil ise "eşkenar üçgen değildir."yazdırın.

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen üçgenin 1. kenarını giriniz...");

        double kenar1=scan.nextDouble();

        System.out.println("lütfen üçgenin 2. kenarını giriniz...");

        double kenar2=scan.nextDouble();

        System.out.println("lütfen üçgenin 3. kenarını giriniz...");

        double kenar3=scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("EŞKENAR ÜÇGEN...");}
            else{
            System.out.println("EŞKENAR ÜÇGEN DEĞİL...");

        }
        }
    }

