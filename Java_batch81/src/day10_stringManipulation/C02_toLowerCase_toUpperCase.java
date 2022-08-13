package day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Beni psikopata bağlamayin";

        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR")));

        //EĞER BUYUK HARF KUCUK HARGF DONUSUMUNDE LOCAL BİR DİLİ ESAS ALMAK İSTERSENİZ BU METOD KULLANILABİLİR
    }
}
