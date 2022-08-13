package day25_constructor;

public class C02_Constructor {
    public static void main(String[] args) {

        /*javada bir obje oluşturmak için
        mutlaka const. kluunmalısın


         */


        C01 obj1= new C01(); //C01 classından bir obje olusturduk
        System.out.println(obj1.sayi); //C02 DE olusturdugumuz obje ile C01 deki sayıya ulasabildik
        //sayının atanmış bir degeri olmadığı için default deger atar. 0 yazdırır
        obj1.deneme(); //void oldugu için obj1 uzerinden calıstırdık. souta yazmaya gerek yok
    }


}
