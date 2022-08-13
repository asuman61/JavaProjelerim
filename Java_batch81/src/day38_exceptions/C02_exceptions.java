package day38_exceptions;


public class C02_exceptions {
    public static void main(String[] args) {

//bir sorunla karsılasmayı beklediğiniz noktalarda  if else ile sorunu yakalayıp
        //onunla cozum uretebilirsinşiz
        //Ama sorunu her zaman if else ile çözemeyeceğimizden java try catch blokları olusturmustur

   int a=1000;
   int b= 50;
   int sayac= 1;
   while(sayac<100){


       /*try bloğu yapmaya calıstıgımız ama risk oldugunu dusunduguuz islemleri yazmak için kullanılır
       catch den sonraki () karsılasmayo beklediğimiz exception turunu javaya soylemek için kullanılır
       Catch bloğu : Javaya soylediğimz exception(istisna) gerceklesirse  Javanın yapmasını istediğimiz işlem

       catch blogunun onundeki paranteze karsılasmayı beklediğimiz exceptionu yazabilir
       veya her turlu excptnda devreye girmesini istiyorskak
       tum ecptnların parentı olan EXCPTN u yazaibliriz
        */


       try {
           System.out.println(a/b);
       } catch (Exception e) {
           System.out.println("Payda 0 oldu, dikkatli ol"); //tam risk oldugu noktada
       }
       b--;
       sayac++;
   }


    }
}
