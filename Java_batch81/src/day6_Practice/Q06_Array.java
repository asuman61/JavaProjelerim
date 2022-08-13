package day6_Practice;

import java.util.Arrays;

public class Q06_Array {
    /*  you have a string "HeySiri"
     * with arrays change it to "ByeSiri" and write changing array
     *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
     *
     */
    public static void main(String[] args) {
        String str="Hey Siri";
        str=str.replace("Hey","Bye");
        String[]arr=new String[1];
        arr[0]=str; //1.elemanı str ye esit olsun. O strde
        System.out.println(Arrays.toString(arr));

    }
}
