package day17_NestedForLoop;

public class CO3_NestedForLoop {
//verilen yukseklik ve boy degerine gore *'lardan olusanbir dikdortgen olusturalim


    //yukseklik 3
    //boy 4
    public static void main(String[] args) {


        int yukseklik = 4;
        int boy = 8;

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 8; j++) {

                System.out.print("*");

            }
            System.out.println(" ");

        }
    }

}