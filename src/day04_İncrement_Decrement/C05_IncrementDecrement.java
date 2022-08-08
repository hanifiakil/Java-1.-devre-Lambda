package day04_İncrement_Decrement;

public class C05_IncrementDecrement {
    public static void main(String[] args) {
        int numA = 13;
        numA= numA+3;
        System.out.println("numA : " + numA);

        int numB =12;
        numB*=7;

        System.out.println("numB : " + numB);
        int sayı1= 19;

        sayı1++;

        System.out.println(sayı1*=11);

        System.out.println("sayı1 : " + (sayı1+=19));

    }
}
