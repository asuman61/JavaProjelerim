package day15_Overloading_ForLoop;

public class C02_Overloading {

    public static void main(String[] args) {

        /*Javada olusturdugumuz metodların isminin yaptıgı islev İLE UYUMLU OLMASINI İSTERİZ
         mesela bir stringin bir bolumunu almaK için java
         2 adet substring metodları veya
        Verilen stringdeki bazı parcaları yenileriyle değişmek için
         2 adet replace() metodu var

         Java aynı isimde birden fazla metod varsa hangisinin kullanılacagına parametre sayisi ve
         parametrelerin data turune gore karar verir.

        AYNI İSİMDE BİRDEN FAZLA METOD OLUSTURABİLİR MİYİZ?------OVERLOADİNG


        */

String str="Bu Java ogrenilecek baska yolu yok";
str.substring(2);
str.replace('c','v');
str.replace('J','H');




    }


}








