package day03_scanner;

import java.util.Scanner;

public class c04_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan ismini isteyin
        //girilen ismi
        // isminiz : Ismail seklinde yazdiriniçin

        //insanların dunyasından kodların dunyasına deger almak için
        //scanner classını kullanırız

        //1- Scanner objesini oluşturalım

        Scanner scan =new Scanner(System.in);

        //2-Kullanıcıya ne istediğinizi söyleyin

        System.out.println("Lütfen isminizi giriniz");

        //3- Oluşturduğumuz scan objesi ile kullanıcının girdiği değeri alıp
        //oluşturacağımız uygun bir variable'ı atayalım

        String kullaniciIsmi=scan.next();
        System.out.println("Isminiz: "+ kullaniciIsmi );

    }
}
