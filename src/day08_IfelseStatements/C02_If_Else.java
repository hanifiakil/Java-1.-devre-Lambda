package day08_IfelseStatements;

import java.util.Scanner;

public class C02_If_Else {
    public static void main(String[] args) {
        //kullanıcıdan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadığını yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz...");

        char karakter=scan.next().charAt(0);

        if (karakter >='A' && karakter<='Z' || karakter>='a' && karakter<='z') {
            System.out.println("girdiğiniz : " + karakter + " bir harftir...");}
            else{
                System.out.println("girdiğiniz : " + karakter + " bir harf değildir...");
            }

        }
    }

