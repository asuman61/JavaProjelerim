package day04_DataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

        char harf='b';
        char harf2= harf;

        System.out.println(harf2);

        int sayi1=11;
        float sayi= sayi1;
        System.out.println(sayi);

        byte sayi5=23;
        short sayi2=55;

        int sayi3=sayi5+sayi2;

        double sayi4=sayi5*sayi2;
 //java dar veri türünü geniş veri türündeki kaba otomat,k olarak assign eder
    }
}
