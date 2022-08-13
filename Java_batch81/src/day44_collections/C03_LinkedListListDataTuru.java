package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedListListDataTuru {
    public static void main(String[] args) {


       LinkedList<String> ll1=new LinkedList<>(); //hepsini kullanır

        LinkedList<String> ll2=new LinkedList<>(); //listte yoksa kullanamzsın

        Queue<String> ll3=new LinkedList<>(); //que ozelliklerine sahip ama halay seklinde . linked

     Deque<String> ll4=new LinkedList<>(); //deque ağır basar ama halay seklide


        ll2.add("Berk");
        ll2.add("Döne");
        ll2.add("Enes");
        ll2.add("Ayşe");

        System.out.println(ll2); //berk done.....

        System.out.println( ll2.remove(3));
        //eğer listemiz integer elementlerden olusuyorsa direk sayı
        //yazarsak index olarak kanbul eder. ama
        //bir var. a atama yapar ve remove da o var.ın ismini yazarsak obje olarak kabul eder
        System.out.println(ll2.remove("Kemal")); //listede kemal yok false geldi

        System.out.println(ll2.isEmpty());
        ll1.add("Berk");
        ll1.add("ali");
        System.out.println(ll1);
        ll2.retainAll(ll1); //ll2 deki tum elementleri ll1 ile
        //karsılastrır. ll1de olmayanları siler. ortak olanları bırakırndiğerini siler


        System.out.println(ll2.hashCode()); //inksar ı hayal    2066939
           ll2.add("Fatih");
        System.out.println(ll2.hashCode()); // 131726141
    }





}
