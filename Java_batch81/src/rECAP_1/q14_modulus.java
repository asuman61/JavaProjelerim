package rECAP_1;

import java.util.Scanner;

public class q14_modulus {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı sayı giriniz:");
        int num=scan.nextInt();
                int ilkIki=num/100;

        int sonIki= num%100;

        int ilkIkiTop=(ilkIki/10) + (ilkIki%10);
        int sonIkiTop=(sonIki/10) +(sonIki%10);

        System.out.println("sayilarin toplami :" +(ilkIkiTop + sonIkiTop));


        //kullanıcıdan alacağınız 5 basamaklı sayının ilk 2 ve son iki basamağının rakamları toplamını bulunuz
    }
}
