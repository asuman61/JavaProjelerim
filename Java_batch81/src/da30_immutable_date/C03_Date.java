package da30_immutable_date;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now(); //new kullanmadık.

        System.out.println(tarih);

        System.out.println(tarih.getDayOfYear()); //204
        System.out.println(tarih.getDayOfWeek()); //SATURDAY
        System.out.println(tarih.getMonthValue()); //7
        System.out.println(tarih.isLeapYear()); // false


        LocalDate tarih2= LocalDate.of(2021, 5, 15);
        System.out.println(tarih2);

        LocalDate tarih3= LocalDate.of(1990, Month.JANUARY,10);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100)); //100 gun sonra ne olacak
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(7));

        System.out.println(tarih.minusWeeks(20));

        System.out.println(tarih.minusDays(100).minusMonths(6));

        System.out.println(tarih.minusYears(20090));

        System.out.println(tarih.isAfter(tarih)); //bizim tarih diğer tarihten sonra mı

        //İKİ FARKLI DOGUM GUNU GİRİLDİGİNDE
        // HANGSİNDE DOGANIN DAHA BUYUK OLDUGUNU BULUNUZ -ifle cok zor
        //tarih 2 ve tarih3 için bunu yapalım

        if (tarih2.isAfter(tarih3)) {
            System.out.println(tarih3 + "tarihinde doğan daha buyuk");
        }else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2 + "tarihinde dogan daha buyuk");
        }else{
            System.out.println("iki tarih birbiri ile aynı");
        }



    }



}
