package day07_ifStatement;

import java.util.Scanner;

public class C05_ifElseStatements {
    public static void main(String[] args) {

        //kullanıcıdan bir karakter girmesini isteyin. ve girilen karakterin harf olup olmadığını yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char harf=scan.next().charAt(0);

        if ((harf>='a'&& harf<='z') || (harf>='A' && harf<='Z')) {
            System.out.println("Girilen karakter bir harf");
        }else{
            System.out.println("Girilen karakter harf değil");

    }
}
}