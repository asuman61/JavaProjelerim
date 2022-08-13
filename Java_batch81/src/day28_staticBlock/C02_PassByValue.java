package day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {

    double satisFiyati=100;
        System.out.println(indirimliFiyat(satisFiyati));
        System.out.println(satisFiyati);




    }

    private static boolean indirimliFiyat(double orijinalFiyat) {


        double satisFiyati = orijinalFiyat * 0.9;

        return false;
    }
    }

