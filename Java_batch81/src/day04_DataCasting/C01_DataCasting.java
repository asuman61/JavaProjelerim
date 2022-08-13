package day04_DataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {

         char harf='a';
         char yeniHarf= (char)(harf+1);
        System.out.println(yeniHarf);

        int sayi=(int)7.3;
        System.out.println(sayi);

        double sayi2=10;
        System.out.println(sayi2);

        int sayi3='c';
        System.out.println("sayi3 : "+sayi3);

        char harf2= 98;
        System.out.println("harf2 : "+harf2);

        //Bazen bir variable a olusturuldugu data turu dısından deger atanabilir.Bunlardan bazısını java otomatik olarak kabul eder
        //java eger bu deger atamasında sorun olusacagını (data kayıplarının olusacagını veya datanın baskalasabileceğini
        //görürse bu atamayı kabul etmez ve sizden bu atamayı istiyorsanız sorumlulugu almanızı kabul eder

    }

}
