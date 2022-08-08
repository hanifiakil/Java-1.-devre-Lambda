package day06_wrapper;

public class C02_Concatenation {
    public static void main(String[] args) {
        String str1="java";
        String str2="Güzel";
        int sayı1=5;
        int sayı2=4;

        //java güzel 54
        //java 5 güzel
        //java94
        //java19
        //54 Güzel

        System.out.println(str1 + " " + str2 + " " + sayı1 + sayı2 );

        System.out.println(str1 + " " + sayı1 + " " + str2);

        System.out.println(str1 + (sayı1+sayı2) + sayı2);

        System.out.println(str1 + (sayı1-sayı2) + (sayı1+sayı2));

        System.out.println(""+sayı1+sayı2+" "+str2);


    }
}
