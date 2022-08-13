package da30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateAndTime {

    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();

        System.out.println(tarihSaat); //2022-07.....

        System.out.println(tarihSaat.plusMonths(3).plusHours(100));

        System.out.println(tarihSaat.minusDays(100).plusHours(100));

        System.out.println(tarihSaat.toLocalDate());

        System.out.println(tarihSaat.toLocalDate()); //2022-07-23




    }




}
