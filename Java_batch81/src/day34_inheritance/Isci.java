package day34_inheritance;

public class Isci extends Personel {

    /*Normal hayatımızda parent  cocuk sahibi olmaya karar verir.
Javada ise child classlar ozelliklerini inherit etmek istedikleri
 classları kendilerine inherit edinirler.
 JAVADA TERCİH HAKKI CHILDIN

 EVLAT EDİNMEK YERİNE PARENT EDINMEK DENEN OLAY VAR.
 BİR CLASSI PARENT EXTENDS KEYWORD KULLANMALIYIZ
 */int persNo=1001;
    public static void main(String[] args) {

        Isci isci1 = new Isci();
        System.out.println(isci1.isim); //extends kelimesi personel classı babamızın evi yapar.
        //extendi kaldırınca isim kızarır
//kendi classında isim var. yok o yuzden parent classa bakarsın.
        isci1.isim = "Selim";
        System.out.println(isci1.persNo);  //evinde seker varsa babanın evinden almazsın. Yani 1001
        //bi var. kullandıgında once kendi classında var mı diye bakarsın

        /*bir class baska bir classı parent edındıgınde
        1-parent classdaki tum ozelliklere (variable+metod) otomatik olRk sahip olabilir
        2- parent classdaki ozelliklerden bazılarını kendine uyarlayabilir
        3-parent classda olmayan bazı yeni ozellikler olusturabilir
        NOT:parent classdaki ozelliklerden hicbirini reddedemexz ama degistirebilir
         */

        isci1.maas();



        }


    }


