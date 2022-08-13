package day34_inheritance;

public class Personel {
    /*eger parent class olarak tasarladıgınız bir class varsa veya
    ilerde bu classı parent yapmak isteyenler o zaman variable ve methodların
   access modifierını PROTECTED secmeli.
   boylece childlar sizin pack den istifade ederken child olmayanlar istifade edemez.
     */

    int persNo;
    String isim="Isim belirtilmedi";
    String departman="Departman belirtilmedi";


    public void maas(){
        System.out.println("Tum personelin maasi vardir");
    }
    public void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar.");
    }
    public void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretini statusune gore alir.");
    }



}
