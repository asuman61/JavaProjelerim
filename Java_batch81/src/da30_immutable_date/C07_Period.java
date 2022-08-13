package da30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {

    public static void main(String[] args) {

        //iki tarih arasında sureyi bulma

        LocalDate tarih1=LocalDate.of(1972,1,18);
        LocalDate bugun=LocalDate.now();

        Period period=Period.between(tarih1,bugun);

        System.out.println(period.getYears());



    }
}
