package day11_StringManipulation;

public class C01_StringManipulation {

   //  "Java ogrenmek cok guzel"

    public static void main(String[] args) {
      String str= "Java ogrenmek cok guzel";
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("t"));

        System.out.println(str.indexOf("ava")); //bunu bir blok olarak dusunur ve ilk harfin indexini verir

        //eğer istediğimiz index den sonrasini kontrol etmek istersek
        // o zaman ayni metodu 2 parametre olarak kullanavbiliriz

        System.out.println(str.indexOf("g",6)); //yazilan indexten sonra

        //yukaridaki str da 2. ve 3. e nin indexlerini bulunuz.
 //2. e yi bulabilmek için 1. e nin indexine ihtiyacim var.

int ilke=str.indexOf("e");
int ikincie=str.indexOf("e",ilke+1);


        if (ikincie == -1) { //2.e nin var olup olmadıgını kontrol eder
            System.out.println("verilen str da 2.e yok");
        }  else{
            int ucuncue=str.indexOf("e",ikincie+1); //11. indexde 2. index varsa ben 12 den aramaya baslıyorum
            if (ucuncue==-1){
                System.out.println("verilen str daki 3. enin indexi :"+ucuncue);
            }

        }



    }
}
