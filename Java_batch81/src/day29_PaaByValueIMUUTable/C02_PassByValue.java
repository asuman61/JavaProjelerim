package day29_PaaByValueIMUUTable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {

    /*birden fazla elemnt iceren array ve arraylist gibi yapılarda
    passbyValue gecerlidir

    Eger metodda array veya listin endisi degistirilirse
    passByValue ozelliği sebebiylw
    java degisen degeri degil array veya listin orojınal degerini alır

    Ancak array veya list degistirilmeden sadece içindeki
     elemanlar degistirilse Java
    obje degismediği için (referans aynı)
    aynı array veya listi bize donsurur, ancak içindeki elementler degismis olacaktır.
     */


    /*verilen 4 elemanlı bir arrayı
    methoda gonderelim
    methodda yeni 3 elemanlı bir array atayıp
    bu yeni arraye rasgele 100den kucuk 3 sayı atayalım
    methodda arrayı yazdıralım

    main methodda method calldan sonra yeniden methodu yazdıralım

     */
    public static void main(String[] args) {

        int[] arr={3,5,8,10};

        arrayiDegistir(arr);








    }

    private static void arrayiDegistir(int[] arr) {

        arr=new  int[3];
        Random rnd=new Random();
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);

        System.out.println("methodda array: " + Arrays.toString(arr));
        System.out.println("methodda "+arr);










    }


}
