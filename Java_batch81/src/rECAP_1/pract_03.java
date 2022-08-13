package rECAP_1;

import java.util.Scanner;

public class pract_03 {
    public static void main(String[] args) {

        //kullanıcıdan Y/N ikilisinden birisini girdiğinde
        //girdiği değeri ekrana yazdıran java kodunu yazınız
        //ınput Y,N
        //output yes no

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Y/N ikilisinden birini giriniz :");
        char karakter = scan.next().charAt(0);
        if (karakter=='Y' || karakter=='y'){
            System.out.println("YES");
        } else if (karakter=='N' || karakter=='n'){
        System.out.println("NO");
    } else System.out.println("yanlış giriş yaptınız lütfen sadece Y/N ikilisinden birini tercih ediniz.");

        //eğer kod tek satırsa body e gerek yok. (else yazan yer için not)
    }
}
