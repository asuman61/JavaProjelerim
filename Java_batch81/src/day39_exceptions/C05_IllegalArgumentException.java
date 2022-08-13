package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {

    public static void main(String[] args) {
        //kullanıcıdan yasını girmesini isteiyn.
        //kodunuzu kullanıcı sıfırdan kucuk bir sayi girerse
        //exception verecek sekilde yazin. GÖZÜ KORKSUN

        Scanner scan = new Scanner(System.in);
        System.out.println("yasini giriniz");
        int yas = scan.nextInt();
        try {
            if (yas < 0) {
                throw new IllegalArgumentException();

            } else {
                System.out.println("yasınızı giriniz" + yas); //code1 dedi. try catch ile handle edlim


            }

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("yas - olamaz");
        }
    }
}
