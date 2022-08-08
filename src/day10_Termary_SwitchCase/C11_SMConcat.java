package day10_Termary_SwitchCase;

public class C11_SMConcat {
    public static void main(String[] args) {
        //string olarak verilen bir değişkeni + ile başka bir değişkenle işleme sokulursa java bunları yanyana ekler
        //buna Concatenation (konkateneşın) denir.

        String isim ="ali";
        String soyisim="can";

        System.out.println(isim + " " + soyisim);

        //aynı işlemi concat() metodu ile de yapabiliriz...

        System.out.println(isim.concat(soyisim));

        System.out.println(isim.concat(" ").concat(soyisim));

    }
}
