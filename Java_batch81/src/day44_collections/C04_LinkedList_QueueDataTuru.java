package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {

    public static void main(String[] args) {


        Queue<String>ll3=new LinkedList<>();

        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        //Queue de gelen sona gelir, giden bastan gider
        System.out.println(ll3);

        System.out.println( ll3.remove());   //ademi dondurdu
        System.out.println(ll3);            //ademsiz listeyazdırdı

        System.out.println( ll3.remove("Hpolat"));
        System.out.println(ll3);

        ll3.offer("ahmet");
        ll3.offer("Sefa");
        System.out.println( ll3); //sona ekledi

        ll3.poll(); //silip getiriyor
        System.out.println(ll3);  //silmeler bastan eklemeler sondan


    }


}
