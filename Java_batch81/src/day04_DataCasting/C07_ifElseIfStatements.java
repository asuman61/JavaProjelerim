package day04_DataCasting;

import java.util.Scanner;

public class C07_ifElseIfStatements {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz");
        int yas=scan.nextInt();


        //bir önceki soruda kullanıcı negatşf değer girerse uyaralım
        if (yas<0){
            System.out.println("Lütfen gecerli bir yas yazınız");
        }



        if (yas<65){
            System.out.println("emekli olamazsın, "+(65-yas)+" yil daha çalısmalisin");
        }  else{
            System.out.println("emekli olabilirsin");
        }
    }
}
