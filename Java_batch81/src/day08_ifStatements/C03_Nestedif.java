package day08_ifStatements;

import java.util.Scanner;

public class C03_Nestedif {
    public static void main(String[] args) {

        /*emeklilik kontrolü yapan bir program yazınız. cinsiyet olarak E(erkek) veya K(Kadın) sembollerini içersin
        fsrklı bir harf girerse hata mesajı versin
        emeklilik için k -60 erkeklerde 65 sınırı olsu
        negatif yas veya 80 den buyuk yas girilirse hata mesajı versin  */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi yaziniz" + "\n Kadin icin K erkek icin E harfini giriniz");
        char cinsiyet= scan.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz");
        double yas= scan.nextDouble();

        if (cinsiyet=='E'){
            if (yas<0 || yas>80){
                System.out.println("gecerli bir yas giriniz");
            }else if (yas<65){
                System.out.println("emekli olamazsin");
            } else {
                System.out.println("emekli olabilirsin");
            }



        }else if (cinsiyet=='K') {
            if (yas<0 || yas>80){
                System.out.println("gecerli bir yas giriniz");
        }   else if (yas<60){
            System.out.println("emekli olamazsin");
            } else {
            System.out.println("emekli olabilirsin");
            }

        }else {
            System.out.println("Lütfen gecerli bir tercih giriniz");
        }
        }
    }





