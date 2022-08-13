package day24_ArrayListForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {

    public static void main(String[] args) {

   String[] arr={"Ismail", "Nurullah", "Fatih"};

   /*Uzun listeler olusturmamız gerektiğinde tek tek
   eklemek yerine array olusturup bunları list e cevirmek daha pratik olabilir.
   1- loop ile arraydeki tum elementleri List'e atabiliriz
   2-Array classındanb asList() i kullanabiliriz
      Ancak bu metodun 2 tane yan tesiri var.
        1.si arrays classı kullanıldıgı için array ozellikleri gecerli olur. Dolayısıyla List'te
        olan add remove gibi size ı degiştiren metodlar bu sekilde olusturulan List
        lerde kullanılamaz
        -Kaynak olan array ile urun olan list ozdeslestirilir
        Birinde yapılan degişiklik otomatik olarak digerine de islenir


            */
        List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList); //[ismail, Nurullah, Fatih]

        //1. yan etki
        sinifList.add("Erdi"); //Unsupported operation exception


        //2.yan etki

        arr[1]="Emre";
        System.out.println("degisim sonrası array :" +Arrays.toString(arr));
        System.out.println("Arrayı degistirince list :" +sinifList);

        sinifList.set(0,"Utku");
        System.out.println("Listi degisince list :" +sinifList);











    }



}
