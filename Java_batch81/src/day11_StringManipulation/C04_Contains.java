package day11_StringManipulation;

public class C04_Contains {
    public static void main(String[] args) {

        /*kullanıcıdan bir cumle isteyin.
        Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk
        kucuk kelimesi içeriyorsa tum cumleyı kucuk harflerle yazdırın
        iki kelimeyi de icermiyorsa "cumle kucuk ya da buyuk kelimesi icermiyor" yazdırın

         */


        //requirements de buyuk harf kucuk harf hassasiyeti hakkında bir sey soylenmemis
        //ikinci olarak da her iki kelimeyi de içerme durumu acıklanmamuıs
        //gorevi kim veriyorsa mantık acısından havada kalan seyleri ona sorarsın


        //ek requirement gelsin: ikisini de iceriyorsa "karar ver buyuk mu yazdırayım, kucuk mu
        //case sensitive olmasın


        String cumle = "Java buyu dunya kucuk";



        if (cumle.contains("kucuk") && cumle.contains("buyuk")) {

            System.out.println("karar ver buyuk mu yazdırayım kucuk mu");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        } else if  (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());


        } else {
            System.out.println("cumle kucuk ya da buyuk kelimesi içermiyor");


        }


    }
    }

