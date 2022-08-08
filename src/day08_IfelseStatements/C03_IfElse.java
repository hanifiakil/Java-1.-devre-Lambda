package day08_IfelseStatements;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        //kullanıcıdan yaşını sorun
        //eğer yaş 65 ten küçük ise "emekli olamazsın çalışmalısın" yazsın
        //65 ve büyük ise " emekli olabilirsin" yazsın.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz...");
        int yaş=scan.nextInt();

        if (yaş < 65 ) {
            System.out.println("emekli olamazsın çalışmalısın...");}
            else {
                System.out.println("emekli olabilirsin...");
            }

            scan.close();

        }
    }

