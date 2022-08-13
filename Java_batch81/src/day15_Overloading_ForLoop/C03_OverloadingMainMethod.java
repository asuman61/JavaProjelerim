package day15_Overloading_ForLoop;

public class C03_OverloadingMainMethod {

    public static void main(String[] args) {

        topla(6,7.8); //java akıllı

    }

        public static void topla(int sayi1, int sayi2) {
            System.out.println("Iki integer'in toplamı :" + (sayi1 + sayi2));

        }


      /*   public static void topla(int sayi1, int sayi2);
Bir class da parametre sayisi ve paramete turleri aynı olan 2 metod olusturamayız*/


    public static void topla(double sayi1, int sayi2) {

        System.out.println("Bir double ve bir integerin toplami :" + (sayi1 + sayi2));

    }
    public static void topla(double sayi1, double sayi2){
        System.out.println("İki double'ın toplami :" + (sayi1+sayi2));

  //topla isminde 3 tane metod olusturduk

    }



}
