package day38_exceptions;

public class C01_exceptions {

    public static void main(String[] args) {
        /*bir sorunla karsılaşayı beklediğimiz noktalarda if else ile cozum uretilebilir
        Ama sorunu her zaman if else ile cozemeyeceğimizden java tr catch olusturmustur

         */

        int a=1000;
        int b=50;
        int sayac=1;
        while(sayac<1000){
            System.out.println(a/b);
            b--;
            sayac++;  //java RTE verir
        }
    }
}
