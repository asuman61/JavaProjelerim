package da30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {

    /* string mi yoksa string builder mi daha hızlıdır?
/*
  String mi yoksa StringBuilder mi daha hizlidir ?
  bunun icin bir String olusturup, 1000 kere sonuna . ekleyelim
  oncesinde ve sonrasinda zamani alip
  aradaki farki bulalim

  ayni islemi string builder icin de yapalim
 */
    public static void main(String[] args) {

        LocalTime baslangic=LocalTime.now();

        String str="Ahhh Java";

        for (int i=0; i<1000; i++){
            str+=".";

        }

        LocalTime bitis=LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String zaman :" + (bitis.getNano()- baslangic.getNano()));













    }






}
