import java.util.stream.IntStream;

public class Lambda05 {
    public static void main(String[] args) {
        System.out.println(topla(10));
        System.out.println("***");
        System.out.println(topla1(10));
        System.out.println("***");
        System.out.println(topla2(10));
        System.out.println("***");
        System.out.println(toplaçift(10));
        System.out.println("***");
        System.out.println(toplaçift1(10));
        System.out.println("***");
        System.out.println(toplatek(10));
        System.out.println("***");
        ikiilkxKuvvet(7);

    }
    //structured proğramming ve functional proğraming ile 1 den x e kadar tamsayıları toplayan bir proğram yazınız
//structured proğramming
    public static int topla(int x){
        int toplam=0;
        for (int i =0 ; i <= x;i++){
            toplam+=i;
        }
        return toplam;
    }
    //functional proğraming
    public static int topla1(int x){
        return IntStream.range(1,x+1).//1 2 3 ...x elemanlaarın akışı 1 dahil x+1 hariç
                sum();
    }
    public static int topla2(int x){
        return IntStream.rangeClosed(1,x).//1 2 3 ...x elemanlaarın akışı 1 ve x dahil
                sum();
    }

    //1 den x e kadar çift tamsayıları toplayan bir proğram yazınız
    public static int toplaçift(int x) {//10 a kadar ise bu daha kullanışlıdır
        return IntStream.rangeClosed(1, x).
                filter(t -> t % 2 == 0).
                sum();
    }

    //ilk x pozitif çift tamsayıyı toplayan proğram yazınız
    public static int toplaçift1(int x) {//10 tane derse bu daha uygun
        return IntStream.
                iterate(2,t->t+2).//2 den başlayıp sonsuza kadar 2 artırarak devam eder
                        limit(x).//x ile sınırlar x=10 ise ilk 10 sayıyı toplar
                        sum();//toplar
    }

    //ilk x pozitif tek tamsayıyı toplayan proğram yazınız
    public static int toplatek(int x) {//10 tane derse bu daha uygun
        return IntStream.
                iterate(1,t->t+2).//1 den başlayıp sonsuza kadar 2 artırarak devam eder
                        limit(x).//x ile sınırlar x=10 ise ilk 10 sayıyı toplar
                        sum();//toplar
    }
    public static void printEl(int x){
        System.out.print(x+" ");
    }

    //2 nin ilk x kuvvetini ekrana yazdıran proğram yazınız
    public static void ikiilkxKuvvet(int x) {//10 tane derse bu daha uygun
        IntStream.
                iterate(2, t -> t * 2).//2 4 8 16 32 ... x elemanlarının akışı
                limit(x).//akıştaki ilk x elemanı verir
                forEach(Lambda05::printEl);
    }

    //istenilen bir sayının ilk x kuvvetini ekrana yazdıran proğram yazınız

    //istenilen bir sayının faktöriyelini hesaplayan proğram yazınız



}


