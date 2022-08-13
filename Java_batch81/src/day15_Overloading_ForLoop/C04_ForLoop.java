package day15_Overloading_ForLoop;

public class C04_ForLoop {

    public static void main(String[] args) {

//1 den 5e kadar olan tamsayıları toplayalım. 5 dahil

        int toplam=0;

        for (int i=1; i<=5 ; i++) {

            toplam+=i;
            System.out.println("toplam :" + toplam);
        }

//10 dahil 20 dahil aradaki sayıları toplayın
        toplam=0;
        for (int i=10; i<=20 ; i++) {
            toplam += i;

            System.out.println("10-20 arasi toplam :" +toplam);

        }

        //30 ve 20 dahil aradaki çift sayiları toplayın

        for (int i=30; i<=50 ; i+=2) {
            toplam+=i;


        }


   /*2. yontem
         int toplam=0;
         for (int i=30; i<=50; i++);

         if (i%2==0){
         toplam+=i;
}
        System.out.println("30-50 arasi cift sayiların toplami :" +toplam);



        //1500 İLE 1600 ARASINDAKİ sınırlar dahill yedi ile bolunebilen sayıların toplamı

        toplam=0;
        for (int i=1500; i<=1600; i++);
        if(i%7==0){
            toplam+=i;
            */

        }

    }



