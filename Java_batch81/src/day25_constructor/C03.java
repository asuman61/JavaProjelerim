package day25_constructor;

public class C03 {
    /*proje oluişturulırken bazı classlar run etmek için değil,
    variable ve metod oluşturup bunları
    başka classlardan kullanmak için oluşturulur

    KALIPHANE

    Default cons. parametresizdir. G ormesek bile ihtiyac oldugunda calısır.
    Cok kıskanctır. Pli veya psiz bir cons. olusturursak java default cons.ı siler.
    Artık bu classı olusturan kişi kendi ihtiyacına gore cons.
    olusturdu
     */

C03(){
}
/*olusturdugumuz p.siz bu cons. def. cons. ile birebir aynıdır.
bizim elimizle yazdığımız cons. default olmaz.P.siz cons. deriz. Bunu yazdık. Java def. cons. u ort. kaldırdı
 */

    String isim="Etka";

    public void method01(){
        System.out.println("C03 method calıstı");
    }
}
