package JavaPractice_03;

import java.util.Scanner;

public class Q04_StringManipulation {


 /*
Kullanicidan bir kelime girmesini isteyin.
* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
* kelimenin ortasindaki karakteri yazdirin.
*/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("bir kelime giriniz :");
        String kelime= scan.next();            //tek kelime dedigi için next girdik

        char ortancaKrk=kelime.charAt((kelime.length()-1)/2);     //tek harf olacagı için char sectik

                                                              //char indextir

if(kelime.length()%2==1 && kelime.length()>=3) ;{
            System.out.println("ortanca karakter :" + ortancaKrk);
        }


    }














}
