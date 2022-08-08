package day10_Termary_SwitchCase;

import java.util.Scanner;

public class C09_SwitchCase {
    public static void main(String[] args) {
        //harf olarak girilen notu sayıya çevirelim

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen harf notunuzu giriniz...");

        char harfnotu=scan.next().toUpperCase().charAt(0);
        switch (harfnotu) {
            case 'A':
                System.out.println("notunuz : 85 - 100 arası" );
                break;
            case 'B':
                System.out.println("notunuz : 60 - 85 arası" );
                break;
            case 'C':
                System.out.println("notunuz : 50 - 60 arası" );
                break;
            case 'D':
                System.out.println("notunuz : 35 - 50 arası" );
                break;
            case 'E':
                System.out.println("notunuz : 0 - 35 arası" );
                break;
            default:
                System.out.println("lütfen geçerli bir not gir dayı...");

        }
    }
}
