package day43_interfaces_iterators;

public class M02_Child implements I01_InterfaceBodyOlanMethod{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;

      /*parent interface de abstract olan 3 methodu implement ettiğimizde
      Java itirazı durdurur.
      Sonradan eklediğimiz default veya static keyword
      ile tanımladığımız metodları implement etmememiz
      sorun oluşturmadı.
       */

    }

    public static void main(String[] args) {

        I01_InterfaceBodyOlanMethod.direksiyon();   //teker gelmedi ama direksiyon geldi

        M02_Child obj=new M02_Child();

        obj.teker();

    }
}
