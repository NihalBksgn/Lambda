package team21_lambda;

import java.util.*;
import java.util.stream.IntStream;

public class Q01_Lambda {

    /*
    //Diziler doğrudan Lambda'da kullanılamaz, ancak listeyi dönüştürdükten sonra kullanabilirsiniz


   */
    public static void main(String[] args) {
        int a[] = {12, 9, 13, 5, 8};
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 9, 13, 5, 8));

        System.out.println(tekSayilariTopla(6,100));

        System.out.println(ilk5CiftSayiCarp(5));
        System.out.println(tekTamSayiCArp(6));

        System.out.println(ucdenOnaTopla(list));
    }

    //Konsolda 3'ten 10'a kadar tamsayılar nasıl yazdırılır
    public static void ucdenOna(List<Integer> list) {
        System.out.println(list.stream().filter(t -> t > 3 && t < 10));
    }
    //3 ile 10 arasındaki tam sayıların toplamı nasıl bulunur

    public static int ucdenOnaTopla(List<Integer> list) {
        return list.stream().
                filter(t -> t > 3 && t < 10).
                reduce(Integer::sum).get().intValue();
    }

    //9 faktöriyel nasıl bulunur
    public static int faktoriyel(int a) {
        return IntStream.
                rangeClosed(1, a).
                reduce(1, (t, b) -> t * b);
    }

    //6 ile 100 arasındaki tek tam sayıların toplamı nasıl bulunur

    public static int tekSayilariTopla(int a,int b){
       return IntStream.rangeClosed(a,b).filter(t->t%2!=0).sum();
    }

    //İlk 5 çift sayının çarpımı nasıl bulunur
    public static int ilk5CiftSayiCarp(int a){
       return IntStream.iterate(2,t->t+2).limit(a).reduce(1,(x,y)->x*y);
    }

    //4'ten büyük 6 tek tam sayının çarpımı nasıl bulunur
    public static int tekTamSayiCArp(int a){
       return IntStream.
               iterate(5,t->t+2).
               limit(a).
               reduce(1,(x,y)->x*y);
    }

}
