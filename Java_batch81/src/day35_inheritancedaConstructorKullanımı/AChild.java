package day35_inheritancedaConstructorKullanımı;

public class AChild  extends AParent{

    String isim="Child isim belirtilmedi";
    AChild(){
        System.out.println("Child constructor calıstı");
    }

    public static void main(String[] args) {
        AGrandParent gp1=new AGrandParent();

        //Bu objeyi olusturmak için grandpa constructor calısır.
        //Parent veya child cons ccalismaz


    }
}
