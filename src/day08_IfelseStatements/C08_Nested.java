package day08_IfelseStatements;

import java.util.Scanner;

public class C08_Nested {
    public static void main(String[] args) {
        //çalışan kadınsa 60 yaşından itibaren emekli olabilir
        //çalışan erkekse 65 yaşından itibaren emekli olabilir

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen cinsiyetinizi giriniz \nerkek için E kadın için K ");

        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("lütfen yaşınızı yazınız...");

        double yaş=scan.nextDouble();

        if(cinsiyet=='E'){
            if(yaş<65){
                System.out.println("emekli olamazsınız...");
            }else {
                System.out.println("emekli olabilirsiniz...");
            }
        }
        else if (cinsiyet=='K'){
            if(yaş<60){
                System.out.println("emekli olamazsınız...");
            }else {
                System.out.println("emekli olabilirsiniz...");
            }
        }
        else {
            System.out.println("lütfen doğru cinsiyet giriniz...");
        }



    }}
