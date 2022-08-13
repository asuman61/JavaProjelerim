package day04_practice;

import java.util.Scanner;

public class q02_methodcreation {

    /*
cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
 */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("metre ve km y :e donustuermek istediğiniz cm degerini giriniz");
       double santiMetreValue=scan.nextDouble();

       convertSM(santiMetreValue);



    }

    private static void convertSM(double santiMetreValue) {
    }


}

