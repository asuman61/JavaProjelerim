package day31_timeFormatter_varrargs;

public class C02_Varrargs {

    public static void main(String[] args) {


//verilen 2 integeri toplayip yazdıran bir metod olsturn
        //sayı eklediğinde her seferinde toplamak metod olusturmak zor . o yuzden varrargs a gidiyorz

//java buna cozum bulmus

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
   toplaYazdir(sayi1, sayi2, sayi3,sayi4);



    }

    private static void toplaYazdir(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println( "Verilen dort sayinin toplamı :" +(sayi1+sayi2+sayi3+sayi4));
    }

    private static void toplaYazdir(int sayi1, int sayi2, int sayi3) {

        System.out.println("Verilen uc sayinin toplamı :" +(sayi1+sayi2+sayi3));

    }


}
