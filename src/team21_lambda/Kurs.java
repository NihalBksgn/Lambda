package team21_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kurs {


    /*Can sınıfını kullanarak 4 nesne oluştur(
         özel String sezonu;
            private String kursuAdı;
            özel int ortalamaPuan;
            private int numOfStudent;
            ) */
    public static void main(String[] args) {

        CanPojo ogr1 = new CanPojo("Kis", "Java", 64, 100);
        CanPojo ogr2 = new CanPojo("Kis", "Sql", 76, 101);
        CanPojo ogr3 = new CanPojo("Yaz", "Deutsch", 87, 102);
        CanPojo ogr4 = new CanPojo("Sonbahar", "Math", 96, 154);

        //Onları bir listeye ekle
        List<CanPojo> list = new ArrayList<>(Arrays.asList(ogr1, ogr2, ogr3, ogr4));


        System.out.println(notOrtKOntrol(list));

        System.out.println(gunIceriyorMu(list));

        System.out.println(ogrSayisi154Mu(list));

        System.out.println(KisMi(list));

        System.out.println(ogrSayisi100Mu(list));

        System.out.println(ortPuanSirala(list));

        ogrSayisininTersineSirala(list);

        System.out.println("************************************");

        kursAdiSirala(list);

    }


    //Tüm ortalama puanların 98'den az olup olmadığını kontrol edin
    public static boolean notOrtKOntrol(List<CanPojo> list) {
        return list.stream().allMatch(t -> t.getOrtPuan() > 98);
    }

    //Tüm ders adlarının "Gün" kelimesini içerip içermediğini kontrol edin
    public static boolean gunIceriyorMu(List<CanPojo> list) {
        return list.stream().allMatch(t -> t.getKursAdi().contains("Gün"));
    }

    //Herhangi bir öğrenci sayısının 154 olup olmadığını kontrol edin

    public static boolean ogrSayisi154Mu(List<CanPojo> list) {
        return list.stream().anyMatch(t -> t.getOgrNo() == 154);
    }

    // Herhangi bir mevsimin Kış olup olmadığını kontrol edin

    public static boolean KisMi(List<CanPojo> list) {
        return list.stream().anyMatch(t -> t.getSezon().equalsIgnoreCase("Kis"));
    }

    //Herhangi bir öğrenci sayısının 100 olup olmadığını kontrol edin
    public static boolean ogrSayisi100Mu(List<CanPojo> list) {
        return list.stream().anyMatch(t -> t.getOgrNo() == 100);
    }

    //Öğeleri ortalama puana göre doğal sırayla sırala
    public static List<CanPojo> ortPuanSirala(List<CanPojo> list) {
        return list.stream().sorted(Comparator.comparing(CanPojo::getOrtPuan)).collect(Collectors.toList());
    }

    //Öğeleri öğrenci sayısına göre ters sırada sırala

    public static void ogrSayisininTersineSirala(List<CanPojo> list) {
      list.stream().sorted(Comparator.comparing(CanPojo::getOgrNo).reversed()).forEach(t-> System.out.println(t + " "));
    }

    //Kurs adına göre öğeleri ters sırada sıralayın

    public static void kursAdiSirala(List<CanPojo> list){
        list.stream().sorted(Comparator.comparing(CanPojo::getKursAdi).reversed()).forEach(t-> System.out.println(t+ " "));
    }

}//class
