package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexOf {
    public static void main(String[] args) {
        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("cay");

        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram"));
        System.out.println(urunler);

        //indexof bize bilgi donudurur. listimizi degistirmez

        System.out.println(urunler.lastIndexOf("Ikram"));

        /*ındexof urunu aramaya 0. indexten
        lastindexof ise armaya son Indexten basslar

        arama bitip, urun bulundugunda,ikisi de bulunan urunun inexini verir


         */

       urunler.add("Ikram");
        System.out.println(urunler);

        System.out.println(urunler.indexOf("Ikram"));
        System.out.println(urunler.lastIndexOf("Ikram"));

        System.out.println(urunler.indexOf("hobby"));
        System.out.println(urunler.lastIndexOf("hobby"));

    }

}
