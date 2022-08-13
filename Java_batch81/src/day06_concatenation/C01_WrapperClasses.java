package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        /* Wrapper Class, Javanın hazır metodları kullanabilmemeiz için primitive data türlerinin her biri için açtığı classlardır
        

        int---->Integer
        char----->Character
        diğerleri primitive data türleri ile aynı sadece baş harfi büyük
        */


        String str= "Java ile hayat ne güzel";  //JAVA İLE HAYAT NE GUZEL

        System.out.println(str.toUpperCase()); //ctrl ye basıp to upper case in üzerine geldiğinde sana onun ne iş yaptığını anlatır

        // sırf stringle kullanacağımız hazır metodlar için java 3348 satırlık kod hazırlamış

        boolean guzelMi=true;
        //guzel mi boolean primitive oldugundan hazır metodlar içermiyor. Onun yerine ilk harfi büyük yapıyoruz(nonprmtv ayarı)

        Boolean buGuzelMi=true;
        buGuzelMi.toString();    //noktadan sonra hazır metodlar geldi

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);  //Shortun min ve max degerini buldun yani ezberlemene gerek yok

        String ogrNo="123456"; //tıoplama cıkarma yapmıyosN VARİABLERA string yapabilirsin


        //kullanıcıdan bir sifre isteyin
        //eger sifr sadece rakamlarda olusuyosa kabul etmeyin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamaklı bir sifre giriniz");
        String sifre=scan.nextLine();

        Integer sifreSayi= Integer.parseInt(sifre);






        System.out.println("girilen sifre nin 3 fazlası: " + (sifre+3));         //cogu zaman database lerde veriler string olarak tutulur

        System.out.println("Integer sifre nin 3 fazlası: " + (sifreSayi+3));

        // wrapper class lar ilerde kullanacağımız pek çok hazır metod içerir. mesela string eger sayılardan olusuyosa bunu integera cevirebiliriz


    }
}
