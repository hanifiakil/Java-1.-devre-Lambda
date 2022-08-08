package day08_IfelseStatements;

import java.util.Scanner;

public class C07_Ifelseif {
    public static void main(String[] args) {
        //kullanıcıdan maaş için bir teklif isteyin ve aşagıdaki değerlere göre cevap yazdırın
        //teklif 80.000 in üzerinde ise "kabul ediyorum"
        //60 80.000 arasında ise "konuşabiliriz"
        //60.000 in altında ise "malesef kabul edemem."
        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen maaş teklifinizi belirtiniz...");

        double maaş=scan.nextDouble();

        if (maaş>80000){
            System.out.println("teklifinizi kabul ediyorum...");}
        else if (maaş<60000){
            System.out.println("teklifinizi malesef kabul edemem...");}
        else {
            System.out.println("teklifinizi konuşabiliriz...");

        }

    }
}
