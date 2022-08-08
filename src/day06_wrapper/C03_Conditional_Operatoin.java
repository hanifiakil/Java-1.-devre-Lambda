package day06_wrapper;

public class C03_Conditional_Operatoin {
    public static void main(String[] args){
        System.out.println(5+6==11 && 5+12==8);//true için tamamının doğru olması gerekir. çünkü ve aanlamı taşır

        System.out.println(15+4==19 || 11+2==10 );//true olması için bir tane dahi doğru olması yeterlidir
                                                    //çünkü veya anlamı taşır

        int sayı1=10;
        int sayı2=20;
        int sayı3=30;

        System.out.println(sayı1>sayı2 || sayı2>sayı3 || sayı1+sayı2>=sayı3 );

    }
}
