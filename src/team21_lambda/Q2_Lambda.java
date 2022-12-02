package team21_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q2_Lambda {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Elma");
        list.add("portakal");
        list.add("uzum");
        list.add("cilek");
        list.add("greyfurt");
        list.add("nar");
        list.add("mandalina");
        list.add("armut");
        list.add("elma");
        list.add("keciboynuzu");
        list.add("Ayva");

        //S1: list elemanlarını ilk harf buyuk gerisi kucuk sekılde listeleyelim
        System.out.println(list.
                stream().
                map(t -> t.substring(0, 1).toUpperCase() + t.substring(1).toLowerCase()).
                collect(Collectors.toList()));
        // S2: ilk harfi e veya c olanlari listeleyelim

        System.out.println(list.
                stream().
                filter(t -> t.toLowerCase().startsWith("e") || t.toLowerCase().startsWith("c")).
                collect(Collectors.toList()));

        //S3: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
        list.stream().map(t -> "*" + t + "*").forEach(t -> System.out.print(t + " "));
        System.out.println();

        //S4 : icinde e olanlardan yeni bir list olusturunuz
        System.out.println(list.stream().filter(t -> t.contains("e")).collect(Collectors.toList()));

        //S6: List elemanarını 2.harfe gore sıralayıp
        //    ilk 5 elemandan char sayısı en buyuk elemanı print

        System.out.println(list.stream().sorted(Comparator.comparing(t -> t.charAt(1))).
                limit(5).sorted(Comparator.comparing(String::length).reversed()).findFirst().get().toString());

        list.stream().sorted(Comparator.comparing(t -> t.charAt(1))).
                limit(5).sorted(Comparator.comparing(String::length)).skip(4).forEach(System.out::println);
        //S7: uzunlugu 3 ile 7 arası olan veya a ile biten elemanlardan yeni bir liste olustur

        System.out.println(list.stream().
                filter(t -> t.length() > 3 && t.length() < 7 || t.toLowerCase().endsWith("a")).
                collect(Collectors.toList()));

        //S8:list elemanlarını uzunluklarına ve ikinci harflerine göre benzersiz sıralayıp yazdırın
        System.out.println(list.stream().
                sorted(Comparator.comparing(String::length)).
                distinct().collect(Collectors.toList()));

        System.out.println();

        System.out.println(list.stream().
                sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(1))).
                distinct().collect(Collectors.toList()));

        // S9: uzunlugu 4 ve 8 olanlar haric bir liste olusturunuz
        System.out.println(list.stream().filter(t -> t.length() != 4 && t.length() != 8).collect(Collectors.toList()));


        //S10: List elemanlarını son harfe göre sıralayıp, son 3 elemanı yazdırın

        System.out.println(list.stream().
                sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length() - 1)).reversed()).
                limit(3).
                collect(Collectors.toList()));


        System.out.println(list.stream().
                sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length() - 1))).
                collect(Collectors.toList()));  //son harfine gore siralanmis hali

        System.out.println(list.stream().
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).skip(list.size() - 3).collect(Collectors.toList()));
        //son 3 eleman

    }

    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int ciftTopla(int a) {
        return IntStream.rangeClosed(2, a).filter(t -> t % 2 == 0).sum();
    }
    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.

    public static int xeKadarCiftleriTopla(int a) {
        return IntStream.iterate(2, t -> t + 2).limit(a).sum();
    }

    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int xTekSayiyiTopla(int a) {
        return IntStream.iterate(1, t -> t + 2).limit(a).sum();
    }

    //TASK 05 --> 2'nin ilk pozitif x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void ikininKuvveti(int x) {
        IntStream.iterate(2, t -> t * 2).limit(x).forEach(t -> System.out.println(t + " "));
    }

    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.

    public static void sayininXKuvveti(int istenenSayi, int x) {
        IntStream.
                iterate(istenenSayi, t -> t * istenenSayi).
                limit(x).
                forEach(t -> System.out.println(t + " "));
    }


}
