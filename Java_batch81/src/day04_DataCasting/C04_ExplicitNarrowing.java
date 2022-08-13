package day04_DataCasting;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {


        int sayi1=132;

        byte sayi2=(byte) sayi1;

        System.out.println(sayi2);

        /* Genis data türündeki degeri dar data türündeki variable a atamak isterseniz Java bunun uyup uymayacagını çalıstırana kadar bilemez. ama java risk almaz
        riski sıfıra indirmek için sorun olursa sorumluluk ustlenmenizi bekler
        bunun icicn degerin onune istediğimiz data turunu yazmak yeterlidir
         */

        //3 FARKLI DURUM VAR
        /* 1-Değerimiz dar kalıp değerine uygun olursa hiç problem olmaz
           2- double bir sayiyi int. a cast etmek gibi durumlarda data kaybi yasayabilirsiniz
           3- genis kalıptan dar kalıba deger koydugunuzda, sınırları asan durumlarda veri baskalasabilir
         */
    }
}
