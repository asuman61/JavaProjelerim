package day24_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {

    public static void main(String[] args) {

        /*Icınde 200 tane 1000den kucuk pozitif tamsayı olusturun
        kullanıcıdan bir sayi isteyin
        Listede olup olmadıgını kontrol edin
         */

        Random rnd=new Random(); //0 ile 1 arasında sayi uretir
        int sayi=0;
        List<Integer> sayiListesi=new ArrayList<>();

        while (sayiListesi.size()<200){         //su an listeyi olusturuyoruz
            sayi=rnd.nextInt(1000);  //bu soruyu cozme amacı rasgele 200 sayının bir listeye nasıl eklenecegini bulmakm
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);

        boolean bildiMi=false;
        int tahminSayisi=1;
        Scanner scan=new Scanner(System.in);

        while (!bildiMi){

            System.out.println("Lutfen bir sayi tahmininde bulunun");
            sayi= scan.nextInt();
            if (sayiListesi.contains(sayi)) {
                System.out.println("Tebrikler " + tahminSayisi + " adet tahminde listeden bir sayi buldunuz");
                bildiMi = true;
            }else {
                System.out.println(tahminSayisi + "adet sayi söylediniz ama hicbiri listede yok");
                tahminSayisi++;
            }
        }


    }


}
