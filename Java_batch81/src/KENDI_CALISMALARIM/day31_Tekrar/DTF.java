package KENDI_CALISMALARIM.day31_Tekrar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DTF {

    public static void main(String[] args) {


        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih :" +tarihSaat);

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yy/MMMM/dd  hh:mm a");
        System.out.println(dtf1.format(tarihSaat));

        DateTimeFormatter DTF2=DateTimeFormatter.ofPattern("d/MMM/yyyy  HH:mm a" );
        System.out.println(DTF2.format(tarihSaat));




    }






}
