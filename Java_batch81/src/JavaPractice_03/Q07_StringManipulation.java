package JavaPractice_03;

public class Q07_StringManipulation {

    // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
    // String  str 1= "$13.99" //string olması sen hemen toplama yapamazsın demek
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.


    //kelimeyi sayiya cevirmek

  /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space
    \\S   ==> space disindaki hersey  */

    //& dolar sembolunden kurtulmamaız lazım. double parse double. yan yana koyarsak concat yapar. biz bunu istemiyoruz

    //kurtulmak yetmiyor işlem yapmak icin parse ile onu sayiy cevirmek gerekir


    public static void main(String[] args) {
        String str1= "$13.99" ;
         str1=str1.replaceAll("\\D","");
        System.out.println("str1= " +str1);

        String str2="$10.55";
        str2=str2.replaceAll("\\D", "");
        System.out.println("str2="+ str2);

        System.out.println("str1+str2");

        double sayi1= Double.parseDouble((str1)); //sayi1 degiskenini String olan str1den double a donusturduk
        double sayi2= Double.parseDouble(str2);   //sayi2 degiskenini String olan str1den double a donusturduk
        double toplam= (sayi1+sayi2)/100;
        System.out.println("$" + toplam);


        //PARSE METODLARINI COK SIK KULLANABİLİYORUZ
    }








}
