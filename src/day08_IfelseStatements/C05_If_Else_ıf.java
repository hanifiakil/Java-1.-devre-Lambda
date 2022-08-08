package day08_IfelseStatements;

import java.util.Scanner;

public class C05_If_Else_ıf {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı isteyin
        //sayıların ikiside pozitif ise sayıların toplamını yazdırın
        //sayıların ikiside negatif ise sayıların çarpımını yazdırın
        //sayıların ikisi farklı işaretlere sahip ise "farklı işaretlere sahip sayılarla işlem yapamazsın" yazdırın
        //sayılardan sıfıra eşit olan varsa "sıfır çarpmaya göre yutan elemandır" yazdırın
        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen iki sayı giriniz... \nilk sayıdan sonra enter e basınız...");

        double sayı1=scan.nextDouble();
        double sayı2=scan.nextDouble();

        if (sayı1>0 && sayı2>0) {
            System.out.println("sayıların toplamı : " + (sayı1+sayı2));
        }else if (sayı1<0 && sayı2<0){
                System.out.println("sayıların çarpımı : " + sayı1*sayı2);
            }else if (sayı1 < 0 && sayı2 > 0 || sayı1>0 && sayı2<0) {
                    System.out.println("farklı işaretlere sahip sayılarla işlem yapamazsın...");//sayı1*sayı2==0 da olur
                }else{
                    System.out.println("sıfır çarpmaya göre yutan elemandır...");
                }
                }
            }
