package day42_abstractClass_interfaces;

public interface I03_interface {

    /* interface lerde tum variable lar public, static ve final dir,
    Dolayısıyla sonradan deger atama sansımız yoktur.
    Bunun için variable olusturdugumuzda mutlaka deger atamalıyız.

     */

    int sayi=20;

    void yakit();

    /*
    ınterface içindeki her metod
    public ve absrract  ozelliklere sahiptir
     */

    public void motor();
    public abstract void teker();

   static public void aku(){
       // abstract metodlara body yazamazsın diyor
       //abstract bir metodun body si olması mumkun değildir
       //java sonradan dev. lerin uzerüine kısmi bir update yapmıstır

       //sebeb:Bir interface e sonradan bir abstract met. eklerseniz

//o interface i daha once implement etmiş tum classlara gidip
       //hepsinde yeni eklenen metodu override etmek gerekşr
       /*bunun için java8den itibaren ınterfacelere
       sonradan bodysi olan metod eklenmesine izin vermiştir.

        */
       int a = 12;

       a = 13;

       System.out.println(a);

    }
}
