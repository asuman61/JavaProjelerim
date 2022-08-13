package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {

        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("cay");




/*remove metodu 2 sekilde calısır.
1-objeyi yazıp silmesini istersek bize boolean sonuc doner.T or F
2-İNDEX GİRERSEK O İNDEXTEKİ ELEMANI SİLER
 */
        System.out.println(urunler); //nutella ikram ..
        System.out.println(urunler.remove("Ikram")); //true
        System.out.println("urunler");

        System.out.println(urunler.remove("Hobby")); //false
        System.out.println(urunler); //nutella cekirdek..
        //set update yapar bu delete yapar

        //IKINCI YONTEMI DENEYELİM

        System.out.println(urunler.remove(1));
        System.out.println(urunler);






    }
}
