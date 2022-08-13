package YENI_GRUP;

import java.util.Scanner;

public class C62_DoWhileLoop {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        int sayac=0;

        do {
            System.out.println("toplamak uzere pozitif sayılar girin");
            sayi = scan.nextInt();
            if (sayi > 0) {
                toplam += sayi;
                sayac++;

            } else if (sayi < 0) {
                System.out.println("negatif sayi girme");
            }
        }while (sayi!=0);
        System.out.println("girilen sayıların toplamı: ");

        }




    }

