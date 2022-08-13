package day10_stringManipulation;

public class C03_equals {
    public static void main(String[] args) {

        String str1= "Ali Can";
        String str2= "Ali CAN";
        String str3="Ali Can" + "";
        String str4= "Ali Can";
        String str5=new String("Ali Can"); // string non primitive oldugu için biz yeni string olusturabiliyorz

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));

        System.out.println(str1==str5);
        System.out.println(str1.equals(str5));

        System.out.println(str1.equals(str4));


        // Stringlerde aynı string olsa bile == her zaman calışmaz
        //emin olmak için equals kullanmalısın
        //equals() kullandıgında dıkkat edeceğin TEK SEY METİNLERİN BİREBİR AYNI OLMASIDIR
    }
}
