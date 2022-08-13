package JavaPractice_03;

import java.util.Scanner;

public class recap2_Q05StringManipulation {

    public static void main(String[] args) {

   //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz :");

//multiple declaration  yapıyorz

        String firstName= scan.nextLine(), //buraya virgul koyduk istersen yan yana yaz farketmez
           lastName= scan.nextLine();

        String fullName= firstName.concat(" " + lastName).toUpperCase();
        System.out.println("fullName=" + fullName);

        //İSİM VE SOYİSMİ AYRI AYRI OKUMASI İÇİN SCAN.NEXTLİNE YAPTIK

    }




}



