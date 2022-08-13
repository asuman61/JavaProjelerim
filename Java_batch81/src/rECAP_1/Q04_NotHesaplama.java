package rECAP_1;

import java.util.Scanner;

public class Q04_NotHesaplama {

    public static void main(String[] args) {
        //vizenin yüzde 30 u finalin  yüzde yetmişi

        Scanner scan= new Scanner(System.in);

        int vize1;   //burda initialize ettik
        int vize2;
        int finalNot;

        System.out.println("birinci vize :");
        vize1= scan.nextInt();

        System.out.println("ikinci vize:");
        vize2=scan.nextInt();

        System.out.println("final notu:");
        finalNot=scan.nextInt();

        double sonuc= ((vize1+vize2)/2)* 0.3 + finalNot* 0.7;
        System.out.println("sonuc= " +sonuc);




    }
}
