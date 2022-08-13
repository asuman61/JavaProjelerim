package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

        //verilen bir arraydeki tekrar eden elementri silip
       //tekrarsız halini array e atayan kod yazınız

       int[] arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};

        Set<Integer> tekrarsizSet=new HashSet<>();


        for (int each:arr
             ) {
            tekrarsizSet.add(each);
        }

        System.out.println("Set :"+ tekrarsizSet); //biz arrayi tekrarsız hale getirmek istiyorz

        int[] tekrarsizArr=new int[tekrarsizSet.size()]; //böylece bitane boş tekrarsız array olştrduk



        //seti arraye cevirömek=format değişimi

        int i=0;
        for (Integer each:tekrarsizSet       //for each loop u indexli hale getirdik
             ) {
            tekrarsizArr[i]=each;
            i++;
        }
        arr=tekrarsizArr;
        System.out.println(" Arrayin son hali "  +Arrays.toString(tekrarsizArr));
    }
}
