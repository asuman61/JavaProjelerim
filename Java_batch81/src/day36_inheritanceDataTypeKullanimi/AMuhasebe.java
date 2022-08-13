package day36_inheritanceDataTypeKullanimi;

public class AMuhasebe extends APersonel {


    protected int saatUcreti=10;
    protected int gunlukMesai=8;


    protected void maas(){
        System.out.println("Personel minimum : " + (30*gunlukMesai*saatUcreti) + "maas alır");


    }

}
