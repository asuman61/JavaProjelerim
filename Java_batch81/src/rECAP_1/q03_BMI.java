package rECAP_1;

import java.util.Scanner;

public class q03_BMI {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("kg olarak agirliginizi giriniz");
        double agirlik=scan.nextDouble();
        System.out.println("cm olarak boyunuzu giriniz :");
        double boy= scan.nextDouble();
// boy=boy/100 standart yazım. alttaki daha profesyonel
        boy/=100;
        double vke= agirlik/(boy*boy);
        System.out.println("vke="+ vke);






    }
}
