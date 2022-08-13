package h28_Soru;

import java.util.Locale;
import java.util.Scanner;

public class SonKarakteriSil {/*
Kullanıcıdan alınan Stringin son karakteirini silep ekrana yazan Java kodunu yazınız.
    Test Data:
    good
    Beklenen Çıktı:
    goo
 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a word");
        String word=scan.next().toLowerCase();

        char c= word.charAt(word.length()-1);
        System.out.println(c);

       // String w=word.replace(0,word.length()-1) ;
   //     System.out.println(w);









    }













}





