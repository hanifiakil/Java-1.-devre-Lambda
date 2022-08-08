package day10_Termary_SwitchCase;

public class C13_ToUpperCaseLowerCase {
    public static void main(String[] args) {
        //verilen String in tamamını büyük yada küçük harfe çevirir.
        String isim ="aLİ";

        System.out.println(" " + isim.toUpperCase().charAt(0) + isim.toLowerCase().charAt(1)
                + isim.toLowerCase().charAt(2));
    }
}
