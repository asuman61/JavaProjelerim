package day8_practice;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {  //kolay deel

    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {

        int[] arr = {2, 5, -9, 45, 43, 11, 8, 102, 47, 0};
        int n = 4; //4 dinamik degistirilebilir

        //liste metodlarını kullanabiliriz
        List<Integer> list = new ArrayList<>();

        //listeye elemanları ekleyelim
        for (int each : arr) {
            list.add(each);
        }

        List<Integer> maxList = new ArrayList<>();
        int count = 1;
        while (count <= n) {
            int max = list.get(0); //listin ilk elemanı maximum olsun
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)>max)
                max = list.get(i); //max
            }
        maxList.add(max);  //102 eklendi
        list.remove(list.indexOf(max));//max listeye eklediğim sayiyi artık listeden kaldırıyorum
        count++;



        }

        System.out.println("Arrayin max "+ n +" elemani" +maxList);

    }





    }



