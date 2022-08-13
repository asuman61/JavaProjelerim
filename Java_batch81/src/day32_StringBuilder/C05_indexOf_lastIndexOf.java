package day32_StringBuilder;

public class C05_indexOf_lastIndexOf {

    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Pay attention please");

        System.out.println( sb.indexOf("Pay")); //0 //ilk harfinin indexini alır

        System.out.println(sb);  //Pay attention please

        System.out.println(sb.indexOf("e")); //7

        System.out.println(sb.indexOf("e",10)); //aramayı bastan sona yaparsın. 10. imndexten sonraki ilk e


        System.out.println(sb.lastIndexOf("e"));  //19  index baştan sayılır. ama aramayı sondan basa yaparsın

        System.out.println(sb.lastIndexOf("e",10)); //ilk once 10. indexe gidecek, 10. indexten geriye e aramaya baslıyosun

















    }

}