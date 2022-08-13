package day29_PaaByValueIMUUTable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    /*bir list olusturalım
    iki ayrı metoddan birinde
    sadece elemanları degistirelim

    ,diğerinde yeni bir list atayoıp
     aynı sayıda yeni eleman ekleyelim

     ve her iki metod calldan kendi
     listemizi maim  metod içerisinde kontrol edelim
     */

    public static void main(String[] args) {

   List<String>list=new ArrayList<>();
   list.add("Ali");
   list.add("Veli");
   list.add("Can");

        System.out.println("ilk basta list :" +list);

        elemanlariDegistir (list);
        System.out.println("eleman degistir metodundan sonra list :" +list); //[Oguz, Murat, Fatih]

        listDegistir(list);
        System.out.println("list degistir metodundan sonra list :" +list); //[Oguz,Murat,Fatih]


    }

    private static void listDegistir(List<String> list) {

        list=new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");

        System.out.println("list degistir metodunda :" + list);
        //[Nutella,Cay, Cokokrem]

    }


    private static void elemanlariDegistir(List<String> list) {

        list.set(0, "Oguz");
        list.set(1, "Murat");
        list.set(2, "Fatih");

        System.out.println("eleman degistir metodunda :"+ list);
        //[Oguz, Murat, Fatih]




    }


}
