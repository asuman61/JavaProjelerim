package KENDI_CALISMALARIM;

import java.util.Scanner;

public class replitkontrol {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen double bir deger giriniz");

        double sayi = scan.nextDouble();

        Integer yeni = (int) sayi;
        System.out.println(yeni);


    }
}
