package lambda_practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
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

        lSil(list);
    }

    //S1: List elemanlarini ilk harf buyuk gerisi kucuk olacak sekilde listeleyelim
    public static List<String> ilkHarfBykGerisiKck(List<String> list) {
        return list.stream().map(t -> t.substring(0, 1).toUpperCase() + t.substring(1).toLowerCase()).collect(Collectors.toList());
    }

    public static List<String> ecIleBaslayan(List<String> liste) {
        return liste.stream().filter(t -> t.toLowerCase().startsWith("e") || t.toLowerCase().startsWith("c")).collect(Collectors.toList());
    }

    //S3: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim

    public static void yildizEkle(List<String> liste) {
        liste.stream().map(t -> "*" + t + "*").forEach(Utils::yazSitring);

    }
    //S4 : icinde e olanlardan yeni bir list olusturunuz

    public static List<String> eOlanList(List<String> liste) {
        return liste.stream().filter(t -> t.toLowerCase().contains("e")).collect(Collectors.toList());
    }

    //S5: tum 'l' leri silelim yazdiralim
    public static void lSil(List<String> liste) {
        liste.stream().map(t -> t.toLowerCase().replace("l", "")).forEach(Utils::yazSitring);
    }

    //S6: List elemanarını 2.harfe gore sıralayıp
    //ilk 5 elemandan char sayısı en buyuk elemanı print
    public static void ikiyeGoreSirala(List<String> liste) {
        System.out.println(liste.
                stream().
                sorted(Comparator.comparing(t -> t.charAt(1))).
                limit(5).
                sorted(Comparator.comparing(String::length).
                        reversed()).findFirst());
    }


}