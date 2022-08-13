package KENDI_CALISMALARIM;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class day30_TEKRAR {


    public static void main(String[] args) {

    LocalDate tarih2=LocalDate.of(2022, 11,13);

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);

        System.out.println(tarih.isLeapYear());
        System.out.println(tarih.minusMonths(3));
        System.out.println(tarih.lengthOfMonth());

        System.out.println(tarih.isAfter(tarih2));

        Period age=Period.between(LocalDate.now(),tarih2);
        System.out.println(age);






    }







}
