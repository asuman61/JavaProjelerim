package rECAP_1;

import java.util.Scanner;

public class Q02_YolHizZaman {
    //mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız
    //örnek. mesafe: 400      hız=100    süre=4

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("gideceğiniz yol mesafesi(km):");
        double yol= scan.nextDouble();
        double ort_hiz= scan.nextDouble();

        double varis_suresi= yol/ ort_hiz;
        System.out.println("varis sureniz :" + varis_suresi);

    }
}
