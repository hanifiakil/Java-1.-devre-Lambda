import java.util.*;
import java.util.stream.Collectors;

public class Lambda04 {
    public static void main(String[] args) {

        TechPro trGündüz = new TechPro("yaz", "TR Gündüz", 97, 124);
        TechPro trGece = new TechPro("kış", "TR Gece", 95, 131);
        TechPro engGündüz = new TechPro("bahar", "ENG Gündüz", 98, 143);
        TechPro engGece = new TechPro("yaz", "ENG Gece", 93, 151);

        List<TechPro> list = new ArrayList<>(Arrays.asList(trGece, trGündüz, engGece, engGündüz));

        //bu class da ağırlıklı olarak return type çalışacağız

        System.out.println(batchOrt92Byk(list));
        System.out.println();
        System.out.println("*****");
        System.out.println(öğrsayısı110danfazla(list));
        System.out.println();
        System.out.println("*****");
        System.out.println(baharolupOlmaması(list));
        System.out.println();
        System.out.println("*****");
        System.out.println(öğrSayılarıSıralaBykKçğ(list));
        System.out.println();
        System.out.println("*****");
        System.out.println(batchOrtTersSıralıİlk3(list));
        System.out.println();
        System.out.println("*****");
        System.out.println(batchöğrencisayısıaz2(list));
        System.out.println();
        System.out.println("*****");
        System.out.println(Ort95denBüyükÖğrTop(list));
        System.out.println();
        System.out.println("*****");
        System.out.println(Ort95denBüyükÖğrTop1(list));
        System.out.println();
        System.out.println("*****");
        System.out.println(öğrencisyl130danBykOrtOrt(list));
        System.out.println();
        System.out.println("*****");
        System.out.println(gündüzBatchSayısınıyazdır(list));
        System.out.println();
        System.out.println("*****");
        System.out.println(öğrSayısı130fazlaEnBykBatchOrt(list));
        System.out.println();
        System.out.println("*****");
        System.out.println(öğrSayısı150azEnKçkBatchOrt(list));
    }

    //batch ort larının 92 den büyük oldg kontrol eden create ediniz
    public static boolean batchOrt92Byk(List<TechPro> list) {

        return list.
                stream().
                allMatch(t -> t.getBatchOrt() > 92);//akıştaki her eleman batchort field a göre eşleşmesi kontrol eder

    }

    //öğrenci sayılarının hiç birinin 110 dan az olmadığını kontrol eden create ediniz
    public static boolean öğrsayısı110danfazla(List<TechPro> list) {
        return list.
                stream().
                noneMatch(t -> t.getÖğrcSayısı() < 110);//hiç biri 110 dan az değil

    }

    //batch lerde herhangi birin de bahar olup olmadığını kontrol ediniz
    public static boolean baharolupOlmaması(List<TechPro> list) {
        return list.
                stream().
                anyMatch(t -> t.getBatch().equals("bahar"));//
    }

    //batch leri öğrenci sayılarına göre büyükten küçüğe sıralayınız
    public static List<TechPro> öğrSayılarıSıralaBykKçğ(List<TechPro> list) {
        return list.
                stream().
                sorted(Comparator.comparing(TechPro::getÖğrcSayısı).reversed()).//öğrenci sayısı parametresine göre ters sıraladık
                        collect(Collectors.toList());//collect()  akışdaki istenen şarta göre toplar
        //Collectors.toList()   collect e toplanan elemanları list e çevirir
    }

    //batch leri batch ort göre büyükten küçüğe sıralayıp ilk üçü yazdırınız
    public static List<TechPro> batchOrtTersSıralıİlk3(List<TechPro> list) {
        return list.
                stream().
                sorted(Comparator.comparing(TechPro::getBatchOrt).reversed()).
                limit(3).
                collect(Collectors.toList());
    }

    //öğrenci sayısı en az olan 2. batch i yazdırınız
    public static List<TechPro> batchöğrencisayısıaz2(List<TechPro> list) {
        return list.
                stream().
                sorted(Comparator.comparing(TechPro::getÖğrcSayısı)).
                limit(2).//ilk ikiyi alır
                        skip(1).//ilk eleman atlatıldı
                        collect(Collectors.toList());
    }

    //batch ort 95 den büyük olan batch lerin öğrc sayılarının toplamını yazdırınız
    public static Integer Ort95denBüyükÖğrTop(List<TechPro> list) {
        return list.
                stream().
                filter(t -> t.getBatchOrt() > 95).//95 üstü filtrelendi
                        map(t -> t.getÖğrcSayısı()).//ort la öğrenci sayısına update(abteid) edildi
                        reduce(0, Integer::sum);//öğrenci sayısı toplandı
    }

    //
    public static Integer Ort95denBüyükÖğrTop1(List<TechPro> list) {
        return list.
                stream().
                filter(t -> t.getBatchOrt() > 95).//95 üstü filtrelendi
                        mapToInt(t -> t.getÖğrcSayısı()).//mapToInt()   type göre int return ederki sum() çalışır
                // reduse gerek kalmaz daha kısa ve hızlı code imkanı sağlar
                        sum();
    }

    //öğrenci sayıları 130 dan büyük olan batch lerin batch ort bulunuz
    public static OptionalDouble öğrencisyl130danBykOrtOrt(List<TechPro> list) {
        return list.
                stream().
                filter(t -> t.getÖğrcSayısı() > 130).
                mapToDouble(t -> t.getBatchOrt()).
                average();//ortalama değerini verir
    }

    //gündüz batck lerinin sayısını yazdırınız
    public static int gündüzBatchSayısınıyazdır(List<TechPro> list) {

        return (int) list.
                stream().
                filter(t -> t.getBatchName().contains("Gündüz")).count();
    }

    //öğrenci sayılları 130 dan fazla olan batch lerin en büyük batch ort unu bulunuz
    public static OptionalInt öğrSayısı130fazlaEnBykBatchOrt(List<TechPro> list) {

        return  list.
                stream().
                filter(t -> t.getÖğrcSayısı()>130).
                mapToInt(TechPro::getBatchOrt).
                max();
    }
    //öğrenci sayıları 150 den az olan batch lerin en küçük batch ort unu bulunuz
    public static OptionalInt öğrSayısı150azEnKçkBatchOrt(List<TechPro> list) {

        return  list.
                stream().
                filter(t -> t.getÖğrcSayısı()<150).
                mapToInt(TechPro::getBatchOrt).
                min();
    }

}