package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {

    public static void main(String[] args) {

        /*list ile çalısırken en kotu özelliği elemanları tek
        tek eklemektir.
         */

        int[] arr={2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};
        /*
        bu kadar cok elemanlı bir listeyi tek tek eleman olarak girmek yerine
        array olusturup, for loop ile olusturdugumuz list e tasıyabiliriz
         */

        List<Integer> sayilar=new ArrayList<>();
        for (int i=0; i< arr.length; i++){
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);
        //YAN ETKİSİ VAR.
        //1-Bu sekilde olusturulan listede and, remove gibi size i degiştiren
        //metodlar kullanılmaz




      // BITMEDİ  List<Integer> sayilar2= Arrays.asList(arr);


    }
}
