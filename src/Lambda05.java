import java.util.stream.IntStream;

public class Lambda05 {
    public static void main(String[] args) {

        System.out.println(toplaCincix(5));

    }

    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar (x dahil) tamsayilari toplayan bir program create ediniz.

    //Structured
    public static int topla(int x) {
        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam += i;
        }
        return toplam;
    }


    //Functional
    public static int toplaCincix(int x) {
        return IntStream.range(1, x + 1).sum();
    }

    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int ciftleriTopla(int x) {
        return IntStream.range(1, x).filter(Lambda01::ciftBul).sum();

    }

    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static int ilkCftSayiTopla(int x) {
      return   IntStream.rangeClosed(1,x*2).filter(Lambda01::ciftBul).sum();
    }

    public static int toplaCiftIlk(int x){
      return   IntStream.iterate(2,t->t+2).limit(x).sum();
    }

//TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int xTekSayiTopla(int x){
       return IntStream.iterate(1,t->t+2).limit(x).sum();

    }
//TASK 05 --> 2'nin ilk pozitif x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void ikininXKuvveti(int x){
        IntStream.iterate(2,t->2*t).limit(x).forEach(Lambda01::yazdir);
    }
//TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void istenenSayiIlkXKuvvetPrint(int istenenSayi, int x){

        IntStream.iterate(istenenSayi,t->t*istenenSayi).limit(x).forEach(Lambda01::yazdir);
    }

    //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
    public static int faktoriyel(int x){

       return IntStream.rangeClosed(1,x).reduce(1,(t,u)->t*u);
    }
}
