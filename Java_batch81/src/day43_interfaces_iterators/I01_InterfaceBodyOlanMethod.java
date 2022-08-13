package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {


    void motor();
    public void yakit();
    public abstract String aku();


/*
normal bir class da oldugumuzu varsayarsak
modifier kullanma ihtimali OLAMAZ

asagıdaki metodda gorecegınız gibi
interface de istisnai olarak body si olan metodla rolusturulabilir

Bu ozellik java8 den sonra bir interface e yeni bir metod eklememiz gerektiğinde
eskiden beri bu interface i implement eden tum classlara gidip
yeni eklenen metodu override etmemiz gerekirdi.

Bu özellik sayesinde basına default ya da static keyword ekleyerek
interface de yeni ve body si olan bir method olusturursak
bu metodun child classlar tarafından override edilme mecburiyeti olmaz.
ve eskiden implement etmiş classları değiştirmemiz gerekmez

Bu istisnai bir durumdur ve interface için oluşturulan genel kuralları bozmaz.

Bu metodların bodysi olsa da bunlara concrete metod denmez ama
override edilme mecburiyetleri yoktur

Burradaki default kelimesi acceess modifier değil istisnai
durumun belirtilmesi içindir

O zaman niçin 2 keyword (static ve default ) tanımlanmıştır
Bu 2 farklı kelimenin amacu child classlardan
bu metoda nasıl erişilebileceğini bwlirlemek içindir
static keyword kullanılırsa
child classdan bu metoda erişmek için
InterfaceAdi.metodAdi yeterli olur

default keyword kullanılırsa metoda erişmek için obje oluşturulmalıdır

implement?? interface için kullandıgımız extends dir

 */

     public default void teker (){  //hem public hem default olmaz dmedi
         System.out.println("tum arabaların tekeri vardır");
     }

     public static void direksiyon(){

     }

}
