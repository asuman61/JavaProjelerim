package day25_constructor;

public class CarRunner {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="Toyota";

        System.out.println("marka :" + car1.marka +"\nModel :" + car1.model+ "\nfiyat :"+car1.fiyat);

        Car car2=new Car();
         // araba classında baska bi araba obj. olusturduk
              System.out.println("marka :" + car2.marka +"\nModel :" + car2.model+ "\nfiyat :"+car2.fiyat);

              /*herhangi bir obj. uzerinden bir var. yazdırmaya calıstırgımızda java degeri su sıralama ile atar
              1. o obj olusturulduktan sonra bir deger atandımı
              2 . objenin olusturuldugu classda var. a bir deger atanmıs mı
              3. o zaman data turune gore Java def. deger atar. int---0
               */

        }





    }






