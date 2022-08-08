package day06_wrapper;

public class C01_WrapperClass {
    public static void main(String[] args) {

        String sayı1="35648";
        String sayı2="65314";

        System.out.println(sayı1+sayı2);
        System.out.println(Integer.valueOf(sayı1) + Integer.valueOf(sayı2));

        System.out.println(Integer.MAX_VALUE); //interger in alabileceği max değeri verir

    }
}
