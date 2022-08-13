package day29_PaaByValueIMUUTable;

public class C04_Immutable {

    public static void main(String[] args) {

        //STRING BUILDER KULLANMA AMACI IMMUTABLE IFADEKERİ DEGISTIREBILMEKTIR

       // immutablee=degistirilemez
        //mutable=degistirilebilir

        //en meshur ımmutable class=stringdir

        String str="Yildiz Bank";

        System.out.println(str.toUpperCase()); //YILDIZ BANK

        str.toLowerCase();
        System.out.println(str); // //Yildiz Bank

        str.substring(3,5); //d,i
        System.out.println(str.substring(3,5));

        System.out.println(str); //Yildiz Bank


        //Javada string gibi metin ifadelerde kullanabilecegimiz
        //mutable stringBuilder classı da vardır
        StringBuilder sb= new StringBuilder("Java Builder");
        System.out.println(sb);

       sb.reverse();
        System.out.println(sb);

        sb.append(".");
        System.out.println(sb);

       //tamamla






    }




}
