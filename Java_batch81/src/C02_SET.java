import java.util.ArrayList;
import java.util.List;

public class C02_SET {

    public static void main(String[] args) {


        /*elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen sıradakı bir urunu
        istediğimiz yeni urunle degistirip eski urunler listesine ekleyelim
         */

        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("cay");

        List<String> eskiUrunler=new ArrayList<>();
        //ikramın yerine biskrem koy
        //ikramı da eski urunler listine ekle

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp= urunler.indexOf(silinecekUrun);
       String silinenUrun=  urunler.set(temp,yeniUrun);


         eskiUrunler.add(silinenUrun);

        System.out.println("urunler Listesi :" +urunler);
        System.out.println("eskiUrunler Listesi :" +eskiUrunler);



    }


}
