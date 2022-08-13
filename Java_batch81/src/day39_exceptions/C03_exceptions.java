package day39_exceptions;

public class C03_exceptions {
    public static void main(String[] args) {

        String str= "12a35";
        Integer sayi= null;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdıgınız deger sadece rakamlardan olusmalıdır");
        } catch (Exception e) {
            System.out.println("Ongorulemeyen bir hata olustu.");

        }

        System.out.println("Sayinin karesi: "+ (sayi*sayi));


        /*kullanıcısan string bir deger alıyosak ve bunu
        inte ceviriyosak
        NumberFormatException ile karsılasabileceğimizi
        ongoruruz.
        NFE de kodun durmasını istiyosan try catch ile cevrele

        istirosam en genis catch yaz

        Eger bilmrdiğim bir excptn daha olusursa kodum durmasın istiyorsak bir kere daha catch
        cumlesi ekleyip ona en geniş exceptionu yazabiliriz
         */

    }
}
