package day03_scanner;

public class c02_Swap {
    public static void main(String[] args) {
        // Verilen sayi1 ve sayi2 nin degerlerini değiştiren bir program yazınız

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;
        //sai3 gecici kovamız
        //adim1 : sayi2yi boş kovaya koyalım

        sayi3 = sayi2;    //10   20    20

        //adim2 -    1. sayıyı 2. sayıya atayacağız

        sayi2 = sayi1;    // 10   10    20

        //adim3: boş kovadaki sayıyı sayı1e atayalım

        sayi1 = sayi3;    //20    10      20

        System.out.println("swaptansonra sayi1: " + sayi1);
        System.out.println("swaptan sonra sayi2: " + sayi2);
    }
}
