package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.FileLockInterruptionException;

public class C01_IOException {

    public static void main(String[] args) throws FileNotFoundException {


    /*Javadan bilgisayarımzdaki bir dosyaya erişmek istiyorsak
    FileInputStream Classından yardım alırız.

    Aynı sekilde javadan bilgisayarımızdaki bir dosyaya
    ekleme veya update yapmak istersek
    FileOutputStream Classından yardım alıız.

     */

        FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt"); //test dosaysı---copy path--- path fr. content root

    /*goruldugu gibi CT de altını cizen her durum
    CTE degildir. Javada bazı exceptionlar da CTE dir.
    Ozellikle dosya okuma ve yazma ile ilgili exceptionlar
    CTE dir.

    CTE olustugunda java cozum için 2 ihtimal onerir:
    1-try-catch ile cevrelemek
    2-method signature ına throws keyword ile beklenen exception turunu yazmak

    Throws exception: sadece olayın farkında oldugumuzun deklarasyonudur.
    Exceptionun handle edilmesinde hicbir rolu yoktur.
    Yani try-catch ile kontrol altıa aldıgımız(handle) exceptionlarda
    kod calısmaya devam ediyordu.
    Ancak throwsexception yazdıgımızda java bir exception ile karsılasırsa yine hicbir sey yapmamısız gibi
    hata mesajı yayınlayıp calısmayı durdurur.

     */
    }
}
