package day31_timeFormatter_varrargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class C01_TimeFormatter {

    public static void main(String[] args) {
//farklı formatta date and time ı yazabilirsin


        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih :" +tarihSaat);        //month   M ile
                                                                         //minute m ile


        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/M/yy   hh:mm");                            //ınternational standart office in zamanla ilgili
                                                                    //belirlediği standartlar Date.   dan sonra
        System.out.println(dtf1.format(tarihSaat));                                                                //DTF uluslararasımı ignore eder


        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("d/MMM/yyyy  hh:mm");            //ınternational standart office in zamanla ilgili
        //belirlediği standartlar Date.   dan sonra
        System.out.println(dtf2.format(tarihSaat));



    }









}
