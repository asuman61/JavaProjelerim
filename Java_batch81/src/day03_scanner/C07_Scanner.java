package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        //Burada Bir önceki (06nın) sorunun aynısını tek scannerla yapıyoruz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi, soyisminizi ve yasinizi giriniz ve \naralarda enter tusuna basınız");


        String isim= scan.nextLine();

        String soyisim = scan.nextLine();

        int yas=scan.nextInt();

        System.out.println("girilen bilgiler= "+isim+" , "+soyisim+" ,"+yas);


    }

}
