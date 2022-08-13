package day07_ifStatement;

import java.util.Scanner;

public class C06_ifElseStatements {
    public static void main(String[] args) {
        //Kullanıcıya yaşını sorun. Eğer 65'ten küçükse "emekli olamazsın. Değilse "emekli olabilirsin" yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz");
        int yas=scan.nextInt();
        if (yas<65){
            System.out.println("emekli olamazsın, "+(65-yas)+" yil daha çalısmalisin");
        }  else{
            System.out.println("emekli olabilirsin");
        }
    }
}
