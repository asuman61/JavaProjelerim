package day6_Practice;

import java.util.Scanner;

public class C01_WhileLoop { //TEKRAR BAK

    //girilen sayının basamaklarındaki rakamları toplayın


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();

     //   System.out.println(basamakToplama(sayi));


    }

    private static void basamakToplama(int sayi) {
        int toplam=0;
        while (sayi!=0){
            toplam +=sayi%10;
            sayi/=10;


        }

//return Toplam;


    }


}
