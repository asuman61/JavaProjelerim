package day10_stringManipulation;

public class C01_charAt {

    public static void main(String[] args) {

        String str="Java ogrenmek ne guzel";
        System.out.println(str.charAt(0)); //ilk harfi döndürür

        System.out.println(str.toUpperCase().charAt(7)); //7. indexdeki karakteri upper olarak yazdırır

        System.out.println(str.charAt(21));
        //string Index out of bounds exception
        //son harfi bulmak için str'in uzunlugunun 1 eksiğini index olarak gireriz.
        //eger index olarak uzunlugu veya daha bir sayiyi girersek Java exception verir.

        //charAt() kullandıgımızda sonuc char olacagı için artık manipulation yapamayız.
        //String method'larindan kullanmamız gereken bir method varsa
        //charAt()'den once kullanmalıyız.

    }
}
