package team21_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q03_Lambda {
    public static void main(String[] args) {


asalBul(15);



        List<String>arr=new ArrayList<>(Arrays.asList("JOHN","brad","ange","sofya","emily"));
        List<String>brr=new ArrayList<>(Arrays.asList("zerafet","brad","ela","Sofya","emily"));
        List<String>bos=new ArrayList<>();
        // İki Dize Dizisi arasındaki ortak öğeleri bulan bir program yazın (büyük/küçük harf duyarlılığı olmadan)

        for (int i=0;i<brr.size();i++){

            for (int j=0;j<arr.size();j++){
                if (arr.get(i).equalsIgnoreCase(brr.get(j))){
                    bos.add(arr.get(i));
                }
            }
        }
        System.out.println(bos);
        // Bir diziden belirli bir öğeyi kaldıran ve kalan öğeleri yeni bir diziye koyan ve yeni diziyi yazdıran bir Java programı yazın


        List<Integer> list=new ArrayList<>(Arrays.asList(167,245,37,421,52,6890));
        list.remove((Integer) 52);
        System.out.println(list);
        list.add(1);
        System.out.println(list);

        System.out.println(list.stream().filter(t -> t != 52).collect(Collectors.toList()));

    }
    //  Bir tamsayıyı girdi olarak kabul eden ve girdiden büyük olan ilk 10 asal sayıyı ekrana yazdıran bir program yazınız.

    public static void asalBul(int girdi){
        IntStream.iterate(girdi,t->t+1).filter(Q03_Lambda::asalMi).limit(10).forEach(t-> System.out.print(t+ " "));
    }
    public static boolean asalMi(int a){
        int counter=0;
        boolean sonuc=true;
        for(int i=2; i<a; i++){
            if(a%i==0){
                counter++;
                sonuc=false;
                break;
            }
        }
        if(counter==0){
            sonuc=true;
        }return sonuc;
    }




}

