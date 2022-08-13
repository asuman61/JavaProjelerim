package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {


    public static void main(String[] args) {
        /*collections data turunu object secmeniz durumunda
        Collection a farklı data turlerinden objeler koymamıza izin verir
        Bu depolama acısından bize esneklik saglar
        Ancak islem yaparken tum objeleri Object olarak tanımladıgımızdan
        cok fazla casting yapmamiz gerekebilir.
         */

        List<String> liste=new ArrayList<>();

        List list=new ArrayList<>();  //collections farklı data turlerini barındırabilir. neden object kabul edip her turlu malzemeyi içine doldurabiliyor
      //  list.add(5);  data turu
        list.add('s');
       // list.add(true);
        list.add("Ali");
        System.out.println(list);

        Set<Object> set1=new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('5');
        System.out.println(set1);


        //esnekliği var ama işlem yapman gerektiğinde prob. yasayabilirsin. data type farklı cnku
    }
}
