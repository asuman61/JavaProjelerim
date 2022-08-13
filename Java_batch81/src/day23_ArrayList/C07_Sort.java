package day23_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_Sort {

    public static void main(String[] args) {

        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        Collections.sort(urunler); //collections listin bi ust kategorisi

        System.out.println(urunler);

        //list ile gelen sort metodunda sıralama ozelliğini girmek gerekiyor.
        //bunun yerine collections metodundan sort metodunu kullanıyoruz
        //bu metod listemizi natural order listesine gore sıralar








    }



}
