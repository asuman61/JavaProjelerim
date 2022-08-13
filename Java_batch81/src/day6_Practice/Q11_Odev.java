package day6_Practice;

import java.util.Scanner;

public class Q11_Odev {
    //STRING OLAN PIN KODUNUZU KONTROL EDEREK BİR KOD YAZINIZ 23.08

    public static void main(String[] args) {

        String pin="mehmet.1234";  //buraya bir puk kodu tanımla nested if ile
        int girisHakki=3;

        Scanner scanner= new Scanner(System.in);
        System.out.println("********HOSGELDINIZ********");

        while (true){
            System.out.println("pin kodunuzu giriniz :");
            String girilenPin=scanner.nextLine();

            if (pin.equals(girilenPin)) {
                System.out.println("basarili giris yaptınız.");
                break;
            }else{
                System.out.println("yanlis giris yaptınız");
                girisHakki--;
                System.out.println("Kalan giris hakkınız :" +girisHakki );
            }

            if (girisHakki==0){
                System.out.println("girisHakkınızKalmadı. Bloklandınız.");
                break;

            }
        }
    }
}
