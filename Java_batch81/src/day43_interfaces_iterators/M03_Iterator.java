package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {


    public static void main(String[] args) {


        List<Integer> liste=new ArrayList<>();

        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);


        //listedeki tum elementleri INDEX KULLANMADAN 3 artırın

        for (Integer each: liste
        ){
            each +=3;
        System.out.println(each+ " ");
        }
        System.out.print("");
        System.out.println(liste);

        /*java index yapısı olmayan collectionslardaki
        elementlere ulaşmak veya degiştirmek içşn iterator
        interface ini oluşturmustur
       Iterator interface oldugundan ondan obj. uretmemiz mumkun değildir.
       Bunun yyerine bize iterator donduren liste.iterator kullanıyoruz
  */

     //   Iterator it1=new Iterator(); iterator abstrct oldugu için obje olusturamazsın


        //it nin 3 metodu var

        Iterator it1= liste.iterator(); //new değil de sol taraftaki varbl. a uygun bir obje getirecek metod kullandık
        //new it.i it ın içine koyuyor.


        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it1.next()); //30dan sonra element kalmadıgından rte verir. iterator un geri vitesi
        //adım adım sona ulastıktan sonra basa gelmek isterseniz yeniden bir iterator olusturmak gerekir




        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);
        Iterator it3=liste.iterator();
        while(it3.hasNext()){
            it3.next();
            it3.remove();    //loopla listeyi temizldik
        }
        System.out.println("looptan sonra liste :"+liste);

        /*goruldugu gibi iterator kullananrak yapabildiğim
        1-Tum collection elementlerini yazdırmak
        2-tum collection elementlerini silmek
        Bu da bize yetmek
         */
    }


    }



