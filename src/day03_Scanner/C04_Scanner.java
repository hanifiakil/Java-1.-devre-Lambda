package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
         //kullanıcıdan değer almak için 3 adım takip edilir
        //1. adım scanner objesi oluşturmak
        Scanner scan=new Scanner(System.in);
        //2. adım kullanıcıya ne istediğimizi söylemek
        System.out.println("lütfen isminizi yazınız");
        String isim=scan.next();
        System.out.println("isminiz...= " + isim );




        //scan bir Scanner objesidir.

        //isim olarak ferklı bir isim yazsakta çalışır fakat biz scan kullanmayı tercih ederiz

        //scan bir obje olduğu için data türü non-primitive dir.

        //primitive data türleri sadece değer içerirken non-primitivler data türleri değerin yanında
        //birde method lar barındırır.

        //scan. dediğimizde kullanabileceğimiz bu method ları görebiliriz.


    }
}
