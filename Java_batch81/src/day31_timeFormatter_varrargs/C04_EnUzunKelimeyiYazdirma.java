package day31_timeFormatter_varrargs;

public class C04_EnUzunKelimeyiYazdirma {

    public static void main(String[] args) {

        enUzunKelimeyiYazdir("Ali", "Ayse", "Ismail", "Ahmet");



    }

    private static void enUzunKelimeyiYazdir(String...kelime) {

        String enUzunKelime=kelime[0]; //hepsini sıradan alaalım. yeni gelen daha uzunsa yer degistirelim

        for (String each: kelime
             ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }

        }

        System.out.println("Girilen kelimelerden en uzunu :" +enUzunKelime);
    }


}
