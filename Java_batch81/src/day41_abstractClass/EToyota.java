package day41_abstractClass;

public abstract class EToyota  extends DAraba{ //uyarı verdi. Ya motor metodu olustur yad aimplement et


    @Override //birisi gidip araba classındaki ilişkili metdu silerse uyarı vrir
    public void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanır");

        /*parent classdaki abstract metodların tamamaı child class
        taraıfından override edilmelidir,

        concrete metodların override edilme mecburiyeti yoktur.
        istersek override ederiz, istemezsek etmeyiz

        Aslında toyota classı da obje uretecegimiz bir class degil
        bu durumda eger proje tasarımı yapıyorsanız
        Toyıta classını da abstract yapmanız guzel olur.
         */

    }




}
