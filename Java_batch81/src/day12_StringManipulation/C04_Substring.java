package day12_StringManipulation;

public class C04_Substring {
    public static void main(String[] args) {

        String str= "Java cok guzel";

        System.out.println(str.substring(3,4)); //a 3ten basla 4-3 adım git

        System.out.println(str.substring(5,7));

        System.out.println(str.substring(6,6));

        System.out.println("===");

        System.out.println(str.substring(6,8)); // exception HATA SI VERİR



    }
}
