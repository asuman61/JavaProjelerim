package day19_SCOPE;

public class C03_ClassVariable {

    public static void main(String[] args) {
        /*
        Farklı bir classda çalışırken herhangi bir class adını yazıp .ya
        basarsak static adını yazdıgımız class daki tüm static class
        uyelerini gorebilir ve kullanabiliriz.
        */
        //Java runtime dır sırayla gider

        C02_StaticVariables.staticMethod(); //classın tamamını degil classdaki bu metodu calıstırır.
        System.out.println(C02_StaticVariables.staticSayi);
        System.out.println(C02_StaticVariables.degersizStaticVar);


/*class variable lara deger atayıp atamamak bize kalmıstır.
istersek değer atarız istemezsekmatamayız. Eger deger atamıssak java atadıgımız degeri kabul eder deger ataamzsak
java bu variable lara default bir deger ataması yapar.
int----->0
String------>null
boolean----->false
char------->'' hiclik
 */
        /*baska classdaki instance variable lara obje olusturarak ulasabiliriz

         */

C02_StaticVariables obje1=new C02_StaticVariables();
obje1.staticOlmayanMethod(); // yukardaki satırları hic calıstırmadı. direk o metoddaki sayıyı yazd
// bu metod içinde static sayi 20 oldu

        System.out.println(obje1.isim); //Mehmet
        System.out.println(obje1.getDegersizStaticVariable);


    }
}
