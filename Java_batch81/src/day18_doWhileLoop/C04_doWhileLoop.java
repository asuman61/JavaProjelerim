package day18_doWhileLoop;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {

        /*kullanıcıdan tam sayı alın   EKSİK VAR
        kullanıcı cıft sayı girdiğinde sayılaır yazdırın ttek girdiginde işlemi bitir

         */

        //ONCE WHİLE İLE COZELİM

        Scanner scan=new Scanner(System.in);
        int sayi=0;        //burdaki deger iyi dusunulmeli
        //loopta kullanacagımız variable ları oncesinde olusturuyoruz
        //while loopta looptan once olusturdugumuz
        // bu variable a atayacagımız degeri iyi dusunmemiz gerekir
        //yanlıs deger atarsan loop hic devreye girmez

        while (sayi%2==0){
            System.out.println("Lütfen bir sayi giriniz");
            sayi=scan.nextInt();
            System.out.println("girilen sayi cift :" +sayi);

            if (sayi%2==0) {
            }else{
                System.out.println("girilen sayi tek, benden bu kadar");

            }

        }
        //do while ile yapalım
        //do while loopta onceden olusturulan variable a hangi deger atandıgının hiçbir
        //onemi yok kodumuz her durumda calısır.

        /*DO WHİLE IN DEZAVANTAJI: ilk çalıstırma kontrol yapılmadan oldugu için loopun body sinde
        yanlış bir şlem yapılmamasına dikkat etmek gerekir.
         */





    }
}
