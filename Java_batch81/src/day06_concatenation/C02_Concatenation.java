package day06_concatenation;

public class C02_Concatenation {

    public static void main(String[] args) {
        String str1= "Java";
        String str2="Güzeldir";
        int sayi1=5;
        int sayi2=4;

        System.out.println(str1+" "+str2+" "+sayi1+sayi2);            //Java Güzeldir 54

        //Peki Java Güzeldir 9 yazdırmak istesek?

        System.out.println(str1+" "+str2+" "+(sayi1+sayi2));

        //9 Java yazmak istesek?

        System.out.println(sayi1+sayi2+" "+str1); //soldan başladığı için paranteze almadık

        //54 güzeldir yazmak istesek?

        System.out.println(""+ sayi1+sayi2+" " +str2); // bu ifadenin 9 güzeldir olmaması için başa bir hiçlik ekleriiz. bu fiziki olarak bişey eklemez ancak mental olarak ifadeyi stringe çevirir.

        // + YERİNE METOD KULLANMAK İSTERSEN HAZIR CONCAT METODLARI VAR. BUNLARI KULLANABİLİRSİN

        System.out.println(str1.concat(str2));  //JavaGüzeldir
        System.out.println(str1.concat(" ").concat(str2));
    }
}
