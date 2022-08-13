package day03_scanner;

import java.util.Scanner;

public class CO8_ScannerIlkHarf {
    public static void main(String[] args) {

        //3. ders 2:44 çözüm

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        char IlkHarf= scan.next().toUpperCase().charAt(0);

        System.out.println("Ismin ilk harfi : " + IlkHarf);
    }
}
