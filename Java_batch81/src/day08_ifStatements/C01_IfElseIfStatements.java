package day08_ifStatements;

import java.util.Locale;
import java.util.Scanner;

public class C01_IfElseIfStatements {

    //Soru5) Kullanıcıdan gun ismini yazmasını isteyin
    //Girilen isim geçerli ise gün isminin 1., 2. ve 3. harflerini yazdıırn
    //ilk harf buyuk diğer 2si kucuk olarak yazdırın
    //gun ismi gecerli değilse gecerli gun ismi giriniz yazdırın

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String gun=scan.nextLine().toLowerCase();

        if(gun.equals("Pazartesi")) {          //not: stringlerde double == çalısmıyor
            System.out.println("Paz");
        }else if (gun.equals("Sali")){
            System.out.println("Sal");

        } else if (gun.equals("Çarsamba")) {
            System.out.println("Çar");
        } else if (gun.equals("Perşembe")){
            System.out.println("Per");
        } else if (gun.equals("Cuma")){
            System.out.println("um");
        } else if (gun.equals("Cumartesi")) {
            System.out.println("Cum");
        }  else if (gun.equals("Pazar")){
                System.out.println("Paz");
        } else{
            System.out.println("lütfen geçerli gün ismi giriniz");
        }

    }
    }




