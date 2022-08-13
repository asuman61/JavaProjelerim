package day03_scanner;

import java.util.Scanner;

 public class C06_Scanner {
      public static void main(String[] args) {

           //kullanıcıdan ismini soyismini ve yasini alip girilen bilgiler= seyfi capar 34 seklinde yazdirin

    Scanner scan=new Scanner(System.in);

          System.out.println("Lütfen isminizi giriniz");

          //String verileri scanner ile alirken nextnextLine() kullanilabilir :
         // next() : İlk bosluga kadar olan kismi(1 kelime) alir
          // nextLine() : satirin sonuna kadar ne yazarsak alir
         // NOT : eger art arda birden fazle String deger alacaksak nextLine() kullanmaliyiz

          String isim=scan.nextLine();

          System.out.println("Lütfen soyisminizi giriniz");
          String soyisim=scan.nextLine();


          System.out.println("Lütfen yasınızı giriniz");

          double yas=scan.nextDouble();

          System.out.println("girilen bilgiler= "+isim+"  "+yas);


     }
   }
