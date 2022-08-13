package day09_Ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        //kullanıcıdan bir harf isteyin
        //kucuk harf ise consola "kucuk harf"
        //buyuk harfse consola "buyuk harf
        //yoksa consola "girdiginiz karakter harf degil" yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);


        /*      String sonuc=(harf>='a' && harf<='z')? ("Kucuk Harf") :
                      ("Buyuk Harf veya gecersiz karakter");

                      ikinci kısma yebni ternary gelecek
                      */
        String sonuc=(harf>='a' && harf<='z')? ("Kucuk Harf"):
                     ((harf>='A' && harf<= 'Z') ? "Buyuk Harf" : "Gecersiz karakter");

        System.out.println(sonuc);

    }
}
