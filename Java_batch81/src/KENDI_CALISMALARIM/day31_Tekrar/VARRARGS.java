package KENDI_CALISMALARIM.day31_Tekrar;

public class VARRARGS {


    public static void main(String[] args) {

        int sayi1=-10;
        int sayi2=22;
        int sayi3=45;

        toplamiYazdir(sayi1, sayi2, sayi3);



    }

    private static void toplamiYazdir(int...sayi) {

       int toplam=0;                         //her bir int olan sayıyı bana topla getir
       int sayiAdedi= sayi.length;

       for(int each: sayi){
           toplam+=each;

       }
        System.out.println("Girilen " +sayiAdedi +" sayinin toplamı " +toplam);




    }




}
