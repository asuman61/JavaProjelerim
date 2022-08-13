package day25_constructor;

public class Car {
/* Bu class bizim kalıphanemiz. Bir araba oluşturmak için
ihtiyacımız olan variable ve metodları bu class da belirleriz

Sonra dfarklı classda araba olusturmak gerekirse bu classda obje olusturup
burada belirlenen variable ve metodlara gore araba uretırız
 */

    String marka="Marka belirtilmrdi"; //adam marka belirtmrzse bu def. deger olarak marka belirtilmedi yi alır. null yazmıcak
    String model="Model belirtilmedi";
    int yil;
    int fiyat;


    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu aranba max" + hiz+ "km hiz yapar");
    }
}
