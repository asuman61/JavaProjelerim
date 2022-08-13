package day17_NestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {



    /*kullanıcıdan toplanmak uzere sayılar alın. sayıların toplamı
    500ü gecince
    sayıların toplamını ve kac sayı toplandıgınısu sekilde yazdırın

    13 sayı girdiniz toplamları 567 */

    public static void main(String[] args) {
        int toplam=0;
        int sayi=0;
        int sayac=1;
        Scanner scan=new Scanner(System.in);

        while (toplam<500) {
            System.out.println("Lutfen toplamak için sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
        }
            System.out.println(sayac+ "sayi girdiniz ve toplamları :" +toplam);
        }



    }












