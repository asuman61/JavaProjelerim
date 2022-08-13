public class StringBul {


    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {

        String cumle = "Java ogrenmek cok guzel";
        char harf = 'e';
        int toplam = 0;
        for (int i = 1; i < cumle.length(); i++) {
            if (cumle.charAt(i)==harf) {
                toplam++;

            }

        } System.out.println("girdiginiz  " + harf + " harfi " + toplam + " kere kullanılmıstır");




    }
}