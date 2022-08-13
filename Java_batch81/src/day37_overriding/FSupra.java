package day37_overriding;

public class FSupra extends     EToyota {

    void yakit(){  //DArabadaki metodu override ediyo. Mavi yerdeki uyarı
        System.out.println("Supra benzin kullanır");

        /*private metodlar override edilemezler
        Eğer child class' da parentr classdaki private metod ile aynı signature da bir metod olusturursanız
        bu overriding metod OLMAZ
         */

    }

    @Override // Override notasyonu ne işimize yarar ?
            //Override notasyonu Javaya bir görev verir. O görev, bu notasyonla
        // birbirine bağlı olan iki metodu Java surekli kontrol eder.  Eğer parent classdaki overridden metodu silerseniz CTE verir.

    //override kullanmak mecburi değildir
    void motor() {
        super.motor();
        System.out.println("Sıralı 6 silindir motor kullanır");
    }
}
