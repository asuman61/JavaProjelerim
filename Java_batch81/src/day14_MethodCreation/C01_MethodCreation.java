package day14_MethodCreation;

import day13_MethodCreation.C04_MethodCreatio;

public class C01_MethodCreation {
    public static void main(String[] args) {

        //input olarak verilen 4 harfli bir stringi
        //tersten yazdıran metod yaop


        terstenYazdir("Okan");

    }

    public static void terstenYazdir(String input){

        String tersInput=input.substring(3)+input.substring(2,3)+
                input.substring(1,2)+input.substring(0,1);

        System.out.println("verien kelimenin tersten yazılısı :" +tersInput);





    }

}
