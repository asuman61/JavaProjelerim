package day34_inheritance;

public class ToyotaCorolla extends Toyota {  //extend le child oldu
    public static void main(String[] args) {

        ToyotaCorolla arb1=new ToyotaCorolla();
        System.out.println(arb1.marka); //Toyota
      //  System.out.println(arb1.model);
        //child classtan parent classa erişimde access modifier kurallarını bypass edemeyiz

        //ornegin parent classdakş private class uyelerini chhild classdan kullanamyız


        //ToyotaCorolla arb1=new ToyotaCorolla();

    }





}




