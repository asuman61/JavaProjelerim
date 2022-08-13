package day09_practice.restourant;

public class Mutfak {

//mutfak kalıphane. oynamaları burda yapıyoruz
    //yemek
    //arasıcaklar= inst. var
    //tatlilar
    //icecekler

    public String yemekler="adana kebap, kusbasi, kusneme";

    public String arasicak="yaylacorba, mercimek, duguncorba, corba";

    public String tatlilar="baklava, sutlac, gullac, kazandibi, kunefe";

    public String icecekler="adana kebap, urfaciger, kusneme";


    @Override
    public String toString() {
        return "Mutfak{" +
                "yemekler='" + yemekler + '\'' +
                ", arasicak='" + arasicak + '\'' +
                ", tatlilar='" + tatlilar + '\'' +
                ", icecekler='" + icecekler + '\'' +
                '}';
    }
}
