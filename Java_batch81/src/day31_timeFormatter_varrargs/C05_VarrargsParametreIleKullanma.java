package day31_timeFormatter_varrargs;

public class C05_VarrargsParametreIleKullanma  {

    public static void main(String[] args) {


        //BIR PARAMETRE DAHA EKLEMEK ISTERSEK??

        enUzunKelimeyiYazdir(4,"Ali", "Ayse", "Ismail", "Ahmet");

/*varrargs teorik olarak sonsuz sayıda element alabilir
bir metho da parametre olarak varrargs varsa
varrargsın sınırlarını bilmesi için
parametrelerin sonuncusu olmalıdır.
oncesinde farkli p.metre olabilir ama
varrrgsdan sonra p. metre olmaz

bu kuraldan oturu bir methodda bir varrgs olur
 */

    }

    private static void enUzunKelimeyiYazdir(int kelimeSayisi, String...kelime) {   //yukards aitiraz ediyor

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

