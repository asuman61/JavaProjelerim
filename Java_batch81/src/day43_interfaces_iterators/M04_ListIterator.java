package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_ListIterator {
    public static void main(String[] args) {

        /*List itereator iterator un child ıdır.
        AmA DAHA FAZLA METOD İÇERİR
         */

        List<Integer>liste=new ArrayList<>();

        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);
       Integer temp;
        ListIterator lit1=liste.listIterator();

        while (lit1.hasNext()){
            temp=(Integer) lit1.next()+3; //cast yaptık
            lit1.set(temp); //artırdıgım degerin atamasını yaptım
        }
        System.out.println(liste);






    }






}
