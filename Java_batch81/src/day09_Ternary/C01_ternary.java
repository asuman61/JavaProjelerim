package day09_Ternary;

import java.util.Scanner;

public class C01_ternary {
    public static void main(String[] args) {


//kullanıcıdan bir sayı alın ve sayının mutlak degerini yazdırın
//0dan cıkararak ya da - ile carparak bulma metodunu kullan


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();


        System.out.println(sayi>0 ? sayi :(-1*sayi));

    }
}
