package day7_practice;

import java.util.Arrays;
import java.util.Scanner;

public class q06_Arrays {
    
    
      /*

   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/

    public static void main(String[] args) {
        
        farkiniBul();
        
    }

    private static void farkiniBul() {
     Scanner scanner=new Scanner(System.in);
        System.out.println("array uzunlugunu giriniz :");
        int uzunluk=scanner.nextInt();
        int arr[] =new int[uzunluk];

        for (int i=0; i<uzunluk; i++){
            System.out.println("arrayin"+(i+1) + ". elemani giriniz"); //index degil direkt eleman sorduk
            arr[i]=scanner.nextInt(); //fori den gelen indexler, bu satırda kullanıcı tarafından dongu bitene kadar girilen elemanlar okunur

        }


        Arrays.sort(arr); //array elemanlarınoı dizer
        System.out.println("arr deki en buyuk eleman ile e kucuk eleman arasındaki fark :" +(arr[uzunluk-1]-arr[0]));


//ODEV: Bu soruyu mATEMATIC CLASS INDAKİyontemlerle cozun
    }


}
