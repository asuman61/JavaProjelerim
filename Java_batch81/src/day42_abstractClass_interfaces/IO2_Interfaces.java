package day42_abstractClass_interfaces;

import java.util.ArrayList;
import java.util.List;

public interface IO2_Interfaces {

    /*Interface bir class değildir
    ınterface ınterface dir. interface=arayüz=kullanıcı olarak bilgisayarla aramdaki ilişkiyi sağlıyor

    Abstract classlar javada abstraction(soyutlastırma/kural koyma)
    işlevini yapıyordu.
    Ancak abstract bir classda abstract olmayan metodlar da olabilir.
    Böyle olunca tam abstraction gerceklesmiş olmaz.

    Egerjavada içinde hiç concrete metod olmasın dediğimiz bir class olusturmak
    istiyorsanız bunu class degil interface yapmalısınız

   1. INTERFACE lERDE CONCRETE METOD OLMAZ
   2.Interfaceler full abstrctn yaptıgından interfacelerden obj. olusturulamaz

   Interface olan listten direkt obj olusturamıyorduk

    List<String> Liste=new List<>();
    Bunun yerine contrctırı List in child ı olan Arraylist den seceriz

    3-normalde Class larda bir child birden fazla parent edinemez.
    Ancak interfacelerde concrete metod  olmadıgından biz her metodu child classda override etmek zorundayız.
    ör:anne okula git diyor. baba arabayla okula git diyor. cocuk okula giderse 2sinin dediğini de yapmıs olr

    Override ederken kimin soylediğini override ettiğimizin onemi yok

    4- interfaceler neyin yapılması gerektiğini soyler,ama nasıl yapılacagına karısmaz

      */
    List<String> Liste=new ArrayList<>();
int sayi=30;
String isim="yildiz kolej";

}
