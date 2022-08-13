package JavaPractice_03;

import java.util.Scanner;

public class Q05_StringMnipulation {

    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.


    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz : \nisim");
        String isim=scan.next();
        System.out.println("soyisim");
        String soyisim= scan.next();

        if(isim.length()>soyisim.length()) {
            System.out.println("isminiz soyisminizden uzundur");

        } else if (isim.length()==soyisim.length()) {
                System.out.println("isminiz ile soyisminiz esit uzunlukta");

            } else System.out.println("soyisminiz isminizden uzundur");
            }
        }








