package day6_Practice;

import java.util.Scanner;

public class Q10_Interview {

    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz :");
        String input= scanner.nextLine();
        System.out.println("Lutfen bir sayı gırınız :");
        int sayi= scanner.nextInt();

        ilkSonHarf (input, sayi);

    }

    private static String ilkSonHarf(String str, int n) {
        String s = str.substring(0,1)+str.substring(str.length()-1);
        String sonuc="";

        for (int i=1; i<=n; i++){
            sonuc=sonuc+ s;

        }
return sonuc;
    }
}
