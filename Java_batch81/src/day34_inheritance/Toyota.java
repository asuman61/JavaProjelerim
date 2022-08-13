package day34_inheritance;

public class Toyota {

    String marka="Toyota";
  //  private model="Model belirtilmedi";
    String yakit="Yakit belirtilmedi";


    protected void motor(){
        System.out.println("Toyota cevreci motorlar kullanır");
    }
    protected void aku(){
        System.out.println("Toyota modele gore aku lullanır.");
        //obje ile calıstıgımızda genelde static yapmamakta fayda var.
    }


}
