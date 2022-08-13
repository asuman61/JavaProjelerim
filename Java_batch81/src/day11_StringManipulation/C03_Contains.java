package day11_StringManipulation;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        /*kullanıcıdan email adresini girmesini isteyin
        mail@gmail.com icermiyorsa "Lutfen gmail adresini giriniz"
        @gmail.com ile bitiyorsa "email adresiniz kaydedildi"
        gmail.com ile bitmiyorsa "lutfen yazımı kontrol edin" yazdırın
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gmail adresinizi giriniz");
        String email=scan.nextLine();

        if (!email.contains("gmail")) {
            System.out.println("Lutfen gmail adresi giriniz"); //bitmiyorsa


        }else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("email adresiniz kaydedildi");

        }  else {
                System.out.print("lutfen yazımı kontrol edin");
            }

        }


    }

