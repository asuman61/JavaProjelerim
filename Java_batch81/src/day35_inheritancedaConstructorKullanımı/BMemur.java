package day35_inheritancedaConstructorKullanımı;

public class BMemur extends BMuhasebe{
/*Extends keyword kullanılan classlarda
ister default constrctr bulunsun
istersek de biz yeni cons.lar olusturalim
LJava cons.un ilk satırına super() cons. call yazar

//EXTENDS YOKSA SUPER YOK

 */
    BMemur(){
        System.out.println("Memur p.siz contrctır");
    }
    BMemur(String isim){
        System.out.println("Memur p.li constrcrtr");

    }

    public static void main(String[] args) {
        BMemur mmr=new BMemur();    }
}
