package day24_ArrayListForEachLoop;

public class C07_SayilarinKareToplami {


    public static void main(String[] args) {
        //bir integer list olusturunuz ve tum sayıların kareleri toplamını for each loop kullanarak bulunuz. sonucu ekrana yazdırınız
        int[] sayilar={2,3,4,1,5,7,6,5,4,3};

        int toplam=0;

        for (int each:sayilar
             ) {
            toplam+=each*each;

        }
        System.out.println("kareler toplamı :" +toplam);
    }
}
