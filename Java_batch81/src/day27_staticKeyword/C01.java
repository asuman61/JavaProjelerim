package day27_staticKeyword;

public class C01 {


    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {
         /*class levelda 2 tur var. olustururz
         static (class var
         instance - obje variable
         static variable lar tum class lardan kullanılabilirken
         instance olanlar static olmayan methodlar kullanılabilir,
         instance variable lara static methoddahn ulasmakistersek
         obje olusturmaslıyız

instance variable lar obje variable ı oldugu için herhangi bir satırda instance var. degerinin ne oldugunu bulmak için
OBJE OLUSTURULAN satırdan itibaren kod incelenmelidir.

static var. lar class variable ı oldugu için herhangi bir satırda
 static var.ın degerini bulmak için CLASSIN BASINADAN ıtıbaren kod incelenmelidir.


       */

        C01 obj1= new C01();
        System.out.println("obj1'in sayi degeri :" + obj1.rakam); //5
        System.out.println("obj1'in sayi degeri :" + sayi); //10

      //  rakam+=1; java buna izin vermez cunku rakam inst. varisblr

        obj1.rakam+=1;
        sayi+=1;

        System.out.println("1 artıkdan sonra obj1 in rakam degeri :" +obj1.rakam); //6
        System.out.println("1 artrdktan sonra obj'in sayi degeri : " +sayi); //11

        C01 obj2=new C01();

        System.out.println("obj2'nin rakam degeri :" +obj2.rakam);
        System.out.println("obj2nin sayi degeri :" +obj2.sayi);

        obj2.rakam++;
        obj2.sayi++;








    }
}
