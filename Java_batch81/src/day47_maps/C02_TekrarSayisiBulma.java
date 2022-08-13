package day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_TekrarSayisiBulma {

    public static void main(String[] args) {

        //verilen bir Stringdeki kullanılan harfleri ve kullanılan
        //harflerin tekrar sayısını
        //H=20 şeklinde yazdırın


        String str = "Heeeeellllooooo Woooorrrrllllllddddd";
        //space leri saymaması için önce onları yok edelim
        str = str.replaceAll("\\W", "");


        //splitle tum harflere ulascaz

        String[] harflerArr = str.split("");

        System.out.println(Arrays.toString(harflerArr));
//[H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]
        Map<String, Integer> harfKullanimSayilarMap = new HashMap<>(); //arreyden eleman cekcez
        Integer harfKullanimsayisi;


        for (String each : harflerArr
        ) {
            if (!harfKullanimSayilarMap.containsKey(each)) {
                harfKullanimSayilarMap.put(each, 1);
            } else {
                harfKullanimsayisi = harfKullanimSayilarMap.get(each);

            }
            System.out.println(harfKullanimSayilarMap); //yoksayı mPE EKLEDİK

        }


    }

}

