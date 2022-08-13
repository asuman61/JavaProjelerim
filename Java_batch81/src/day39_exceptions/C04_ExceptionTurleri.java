package day39_exceptions;

public class C04_ExceptionTurleri {

    public static void main(String[] args) {

        String str;

        // System.out.println(str);
        // local var. lar deklarasyonla olusturlırnama deger atanmadan kullnılamaz
/*deger ataması yapmadan bir var. i kullanmaya calısırsanız java compile time da bunu farkeder ve size izin vermez


 */
        str=null;
         //str.length yaparsan çalısmaz hata verir

        //Class Cast Excptn

        Object obj="Java ";
        Integer sayi=(Integer) obj;

        /*
        String str="Hava Civa";
        Integer sayi2=str2;
        Java bazı casting işlerinde compile time da izin vermez

        Ancak bazen syntax uygun olabilir
        bu durumda java kodun calısmasına itiraz etmez
         */
    }
}
