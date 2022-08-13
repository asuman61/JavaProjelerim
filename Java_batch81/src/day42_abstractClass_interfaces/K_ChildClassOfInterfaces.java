package day42_abstractClass_interfaces;

public class K_ChildClassOfInterfaces implements IO2_Interfaces, I03_interface {

    /*BİR CLASSI bir interface e child yapmak için
    implements kword kullanılabilir. implements dedikten sonra virgul
    yazarak istediğimiz kadar interface ekleyebilitriz

    Bir interface bir classı parent edinemez

     */


    public static void main(String[] args) {
        System.out.println(I03_interface.sayi);
        System.out.println(IO2_Interfaces.sayi);
        System.out.println(isim); //ıntrfc adını

    }


    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
