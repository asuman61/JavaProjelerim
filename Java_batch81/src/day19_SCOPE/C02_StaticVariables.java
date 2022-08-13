package day19_SCOPE;

public class C02_StaticVariables {

    static int staticSayi=10;
    String isim="Mehmet";

    static int degersizStaticVar;
    int getDegersizStaticVariable;

    /*
    Class level'daki variable'lara deger atamasak da
    Java kabul ediyor.
     */




    public static void main(String[] args) {

        System.out.println(staticSayi);

        staticSayi=12;
        System.out.println(staticSayi);
    }
    public static void staticMethod(){
        System.out.println(staticSayi);
    }
    public void staticOlmayanMethod(){

        //farklı metodlarda

        System.out.println(staticSayi);
    }

}
