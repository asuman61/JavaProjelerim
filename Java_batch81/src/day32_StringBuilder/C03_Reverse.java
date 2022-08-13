package day32_StringBuilder;

public class C03_Reverse {


    public static void main(String[] args) {

        //verilemn bir inputu tersine çevirip
        //bize donduren bir metod olusturn





        String input="Hey gidi for looop gunleri";

        String tersInput=tersineCevir(input);
        System.out.println(tersInput);
    }

    public static String tersineCevir(String input) {

        StringBuilder sb=new StringBuilder(input);

        return sb.reverse().toString();

    }



}
