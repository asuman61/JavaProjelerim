package day22_arrays;

import java.util.Arrays;

public class c01_MdaTumElementleri {

    /*
    tek katlı arrayde arrayı dırek yazdıramıyoruz cunku array nın primitive data turudur ve
    her non primitive data direkt yazdırılamayabilir.

    ancak arrayin içindeki elementleri direkt yazdırabiliyoduk cunku genelde primitive data turu veya string
 elementler kullanılıyor

 MDA arraylerde en dikkat edecegimiz konu ulasmak istediğimiz
 elementin bir arrqay mı yoksa primitive data mı oldugudur
      */
    public static void main(String[] args) {

        int[][] sayilar = {{1, 2, 4, 5}, {3, 4}};

        /*Burada sayılar arrayını dusunursek icinde 2 tane inner array var
        sayılar[0]==>[1,2,4,5]

        ancak en içerdeki elementlere ulasırsak direkt yazdırabiliriz.
         */
        System.out.println(sayilar[0]);  //referansını yazdırır

        System.out.println(Arrays.toString(sayilar[0]));

        System.out.println(sayilar[0][1]);
        System.out.println(sayilar[1][0]);

        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.deepToString(sayilar));

    }
}


