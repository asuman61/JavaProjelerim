package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        //6-Bir tamsayi, bir de char degişkeni oluşturun ve bunların toplamını yazdirin.

         int sayi= 10;
         char harf= 'a';
         String str= "banan";


        System.out.println(sayi+harf); // 10a degil 107 oldu
        System.out.println(sayi*harf); //
        System.out.println(str+harf); //
        System.out.println(harf+2 );
        System.out.println(str + sayi + harf);

        // konsolda 10a görmek istersek ne yapmalıyız

        System.out.println(""+sayi+harf);

        char deger ='1';
        System.out.println(deger+harf);  //49+97=146 char matematiksel işleme girdi. asci ye gore davranır.
    }
}
