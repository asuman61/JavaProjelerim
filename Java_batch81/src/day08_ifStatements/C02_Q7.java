package day08_ifStatements;

import java.util.Scanner;

public class C02_Q7 {
    public static void main(String[] args) {
        //  Soru7)Kullanıcıdan 100 uzerinden notunu isteyin
        //notu harf sisteminde cevirip yazdırın
        //50den kucukse "d"
        //50-60 arası "c"
        //60-80 arası"B"
        //80 uzerinde ise "A" yazdırın
        //gecersiz not girildiginde uyarı verelim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 0'dan 100'e kadar bir not giriniz");
        double not = scan.nextDouble();

            if (not < 0 || not > 100) {  //if (!(not>=0 || not<=100) bu şekilde de yazabiliyosun
            System.out.println("Lütfen geçerli bir not giriniz");
            //bu satıra geldiysek notumuz 0 ile 100 arasındadır

            } else if (not < 50) {
                System.out.println("Notunuz : D");
                //  bu satıra geldiysek notumuz 50 ile 100 arasındadır
                    //  else if (not < 60) {
                    System.out.println("Notunuz :C");
                }else if (not < 80){
                        System.out.println("Notunuz :B");
                }else {
                        System.out.println("Notunuz : A");
                    }
                }
            }
