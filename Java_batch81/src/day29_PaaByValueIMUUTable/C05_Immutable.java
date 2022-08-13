package day29_PaaByValueIMUUTable;

public class C05_Immutable {

    public static void main(String[] args) {

        //ımmutable ı degıstırmek istersek ne olur?
        String isim="Mine";  //sTRİNG İMMUTABLEDIR DEGİSTİRİLEMEZ DEMİSTİK

       isim= isim.toUpperCase(); //isim kalıcı olarak degisir

        System.out.println(isim); //MINE

      isim="Mevlut";
        System.out.println(isim);


        for (int i=0; i<100; i++){ //mevlutun yanına 100 tane nokta koydu. 100 tane cop olusturdu. her nokta

            //

            isim+=".";
        }
        System.out.println(isim);





    }
}
