package day24_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c04_UniqueArrayOlusturma {
    public static void main(String[] args) {
        //Q2) verilen bir arraydeki unique elementleri
        //yeni bir array olarak donduren bir metod olusturun

        int[] arr={2,3,5,6,3,5,4,1,6,3,5,5};

        int[] uniqueArray=UniqueArrayOlusturma(arr);



    }

    private static int[] UniqueArrayOlusturma(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //arrayı olusturmak için once bir list olusturmak gerekir

        List<Integer> benzersizList= new ArrayList<>();
        //yanındaki elemente esit olmayanları listeye ekliyo
        for (int i=0; i< arr.length; i++){
            if(arr[i]!=arr[i+1]){  //bu kod son elementı kontrol etmıyo
                benzersizList.add(arr[i]);
                benzersizList.add(arr[i]);

            }
        }
        //son elementi kontrol edip yoksa listeye ekliyoruz
        if (!benzersizList.contains(arr[arr.length-1])){
            benzersizList.add(arr[arr.length-1]);
        }

//benzersiz List==>1,2,3,4,5,6,7,8

        int[] tekrarsizArr=new int[benzersizList.size()];
        for (int i=0; i< tekrarsizArr.length; i++){
            tekrarsizArr[i]=benzersizList.get(i);

            }
        return tekrarsizArr;
        }

    }

