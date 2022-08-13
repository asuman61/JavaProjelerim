package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
         //kullanicidan 2 sayı alip bu sayilarin çarpımını yazdırın
         //1. adim
        Scanner scan=new Scanner(System.in);

        //2.adim

        System.out.println("Lütfen 1. sayiyi girin");

        // 3.adim
        double sayi1= scan.nextDouble();

        System.out.println("Lutfen 2.sayiyi giriniz");
        double sayi2= scan.nextDouble();

        System.out.println("Girilen sayilarin çarpimi: "+sayi1*sayi2);
    }
}

