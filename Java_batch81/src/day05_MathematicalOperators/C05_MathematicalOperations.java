package day05_MathematicalOperators;

import java.util.Scanner;

public class C05_MathematicalOperations {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı pozitif bir tamsayı giriniz");
        int sayi= scan.nextInt();

                int birlerBasamagi=0;
                 int rakamlarToplami=0;

                 //su anda sayi 5267 bb=0 rt=0

        birlerBasamagi=sayi%10;
        rakamlarToplami += birlerBasamagi;
        sayi/=10;

        //su anda sayi=526 bb=7 rt=7

        birlerBasamagi=sayi %10; //6
        rakamlarToplami += birlerBasamagi; // 7+6=13

        sayi/=10;

        //su anda sayi 52 bb=6 rt =13

        birlerBasamagi= sayi %10; //2
        rakamlarToplami += birlerBasamagi;  //13+2=15
        sayi/=10; //5
        rakamlarToplami +=birlerBasamagi; // 15+5=20
        sayi/=10; //0



        System.out.println(" sayinin rakamlarToplami : "+ rakamlarToplami);



     }
}
