package day12_StringManipulation;

public class C03_Substring {
    public static void main(String[] args) {

        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo=" 1234 6589 7458 9658";

        System.out.println(isim.substring(3));
        System.out.println(soyisim.substring(soyisim.length()-3));

        //iki parametreli de gireriz

        System.out.println(isim.substring(2,4)); //le

        //isim ve soyısmın ilk harfi buyuk harf, geriye kalan *
        //kredi kartının ilk 4 rakamı gorunsun, geriye kalan *

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar= isim.substring(1).replaceAll("\\w","*");


        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar=soyisim.substring(1).replaceAll("\\w","*");

        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar=" **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                soyisimIlkHarf+soyisimGeriyeKalanlar+ ""+ kkIlk4+ kkGeriyeKalanlar); ;
    }
}
