package day6_Practice;

import java.util.Scanner;

public class C03_DoWhileLOOP {

/*
Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
ve x girildiğinde ise "Program bitti" yazogramı yazınız.
*/

    public static void main(String[] args) {

        Scanner abc=new Scanner(System.in);
        String okunan="";


        do {
            System.out.println("harf giriniz: ");
            okunan=abc.next();
            System.out.println("Program calısıyor");

        }while (!okunan.equalsIgnoreCase("x"));
    }


}
