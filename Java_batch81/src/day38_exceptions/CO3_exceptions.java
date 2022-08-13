package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CO3_exceptions {

    public static void main(String[] args) {
        /*marketteki tum urunleri bir arrayde tuttugumuzu varsayalım
        Kullanıcıya index sorup , o indexteki urunu yazdıran bir program hazırlayalım
        Kullanıcı urun sayısından buyuk bir index girerse
        exception vermesinin onune gecelım.
         */


        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};

        Scanner scan = new Scanner(System.in);
        System.out.println("İstediğiniz urunun sıra nosunu giriniz");


        int istenenSira = 0;
        try { //yapmak istediğin işlem
            int istenenIndex = scan.nextInt();
        } catch (InputMismatchException e) {   //catch bloğu
            e.printStackTrace(); //detaylı exception raporu gosterir
            System.out.println("index için bir ts girmelisin");
            //hatayı yazdırmak istemezsen bunu kaldır
            // elma yazdık ama.exit code0 yani kod calıstı, bir sorunla karsılasmadı       }
            System.out.println(e);

/*catch blogunu onundeki parantezde excption classının ismi ve
yanında yakalanan exptn i atadıgımız variable ın ismi olur(e)

/* eğer yakalanan ecptn ile ilgili
bilgileri kullanıcıya vermek stersenız
bu objeyi kullanabilirsn.,
 */


    }
        System.out.println("Aradıgınız urun :" + urunler[istenenSira]);
    }
}