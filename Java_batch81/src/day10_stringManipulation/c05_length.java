package day10_stringManipulation;

public class c05_length {

    public static void main(String[] args) {

        String str= "Java ogren isi kap";

        System.out.println(str.length());

        System.out.println(str.charAt(str.length()-1));

        //sondan 3. yazdırmak icin str.length-3


        //NULL POINTER
        String str3= null;
        System.out.println(str3.length());
    }
}
