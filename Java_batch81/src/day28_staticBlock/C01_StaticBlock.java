package day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    static{
        /*static blok class uyelerinin tamamından once calisir
        (main methoddan bile once)

        static block class olusturuldugunda calisir, genellikle de classla ilgili on
        ayarlamalar veya static variablellara deger atamak iicn kullanılır

        static blockların class icerisinde nerede oldugu onemli degildir
        once ststic blocklsr calısır

        birden fazla static block varsa yukarudanasgıya calısır
         */


        System.out.println("static blok calisti");
    }

    public static void main(String[] args) {

        System.out.println("Main method calisti");
        System.out.println(sayi);


    }
    static {
        System.out.println("main method altındaki static block calıstı");

    }

}
