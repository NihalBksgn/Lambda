package lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        hepsiniYazdir(list);
        System.out.println();
        negatifYaz(list);
        System.out.println();
        ciftYaz(list);
        System.out.println();
        pozVeCift(list);

    }


    // S1:listi aralarinda bosluk birakarak yazdiriniz

    public static void hepsiniYazdir(List<Integer> l) {

        l.stream().forEach(t -> System.out.print(t + " "));
    }

    //S2: sadece negatif olanlari yazdir
    public static void negatifYaz(List<Integer> l) {

        l.stream().filter(t -> t < 0).forEach(t -> System.out.print(t + " "));
    }

    //S3: cift olanlardan yeni bir liste olustur
    public static void ciftYaz(List<Integer> l) {

        l.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));


    }

    //S4:pozitif ve çift olanları yazdırın

    public static void pozVeCift(List<Integer> l) {

        l.stream().filter(t -> t % 2 == 0 && t > 0).forEach(t -> System.out.print(t + " "));
    }

//S5:pozitif veya çift olanları yazdırın

    public static void pozVeyaCiftYaz(List<Integer> l){

    }

    //// S6: list in elemanlarin karelerini aynı satırda bır bosluklu yazdıralım

    public static void kareleriniYazdir(List<Integer> l){
        System.out.println(l.stream().map(t -> t * t));
        l.stream().map(t->t*t).forEach(t-> System.out.println(t+ " "));
    }

    //S7: Listin cift elemanlarının kuplerini  aynı satırda bır bosluklu yazdıralım
    public static void ciftlerinKupleriniYaz(List<Integer> l){

        l.stream().
                filter(t->t%2==0).
                map(t->t*t*t).
                forEach(t-> System.out.println(t+ " "));
    }

    //S8 : list in elemanlarin karelerinden tekrarsiz yazdıralım

}//class