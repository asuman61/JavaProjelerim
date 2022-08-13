package day19_SCOPE;

public class C01_ClassLevellVariables {
    public static void main(String[] args) {

        /*class içerisinde her yerden kullanmak istediğiniz variable ları
        class levelda(clasın içinde ama metodların dısarısında. genellikle
        class level variable lar classın basında olusturulur.
         */

     int instSayi=20; //static olmayıp class levelda oldugu için instance variable dır.
        int sayi=10;

       // System.out.println(instSayi);bundan sonra bunlara local diyoruz

        C01_ClassLevellVariables obje1=new C01_ClassLevellVariables();
        System.out.println(obje1);


    }

    public static void staticMethod(){

       // System.out.println(sayi);
        /*bir metodun içinde olusturulan variable
        sadece o methodun içinde kullanılabilir.(local variable
         */

          //CLASS LEVELDAKİ VARİABLE LAR İÇİN 2 SCOPE VARDIR
        //1. STATİC VARİABLE
        //2. INSTANCE(STATİC OLMAYAN) -OBJE VARIABLE LARI- VARIABLE

    }




}
