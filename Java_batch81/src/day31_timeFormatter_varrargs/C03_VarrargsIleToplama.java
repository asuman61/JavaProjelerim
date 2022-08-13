package day31_timeFormatter_varrargs;

public class C03_VarrargsIleToplama {
    private static Object sayi5;

    //verilen kac int olursa olsun
    //hepsini toplayıp sonucu yazdıran metod olusrurn




    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;
//3 defa method call var. hepsi için ayrı calısacak
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);





    }

    public static void toplaYazdir(int...sayi) {
        /*bu gosterim integer variable lardan
        olusan bir varrargs demektir. Varrargs array altyapısını kullanır

        Anahtar kelime FOR EACH: kac element varsa tutsun getirsin demektir
         */

       int toplam=0;
       int sayiAdedi=sayi.length;
       for (int each:sayi
       ){
           toplam+=each;

       }
        System.out.println("Girilen "+ sayiAdedi + " adet sayının toplamı: " +toplam);

    }


}






