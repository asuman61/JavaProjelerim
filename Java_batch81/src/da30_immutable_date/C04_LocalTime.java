package da30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) throws InterruptedException{

        LocalTime time1=LocalTime.now();
        System.out.println(time1); //saniye ve nanosaniyeleri yazıyor

        Thread.sleep(3000); //dondurur uykuya daldırır //time1 artık sabit var. oldu

        /*bizim olusturdugumuz datr ve time
        canlı saat veya tarih degildir
        localtime.now kullandıgımız satırda o anmki
        tarih vweya saati alıp
        bizim variablamıza store eder
        time1 var. degeri sabittir
         */

        Thread.sleep(3000);

        time1=LocalTime.now();

        System.out.println(time1.plusSeconds(500));

        System.out.println(time1.getSecond());

        System.out.println(time1.minusMinutes(200));

        System.out.println(time1.withHour(3));







    }

}
