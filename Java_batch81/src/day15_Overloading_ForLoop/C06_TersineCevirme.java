package day15_Overloading_ForLoop;

public class C06_TersineCevirme {

    public static void main(String[] args) {

//input olarak verilen bir stringi tersten yazdıtın




        String input= "Java gun gectikce guzellesiyor";

       terstenYazdir(input);

    }

    private static void terstenYazdir(String input) {

        String tersInput=input.substring(input.length()-1);

        for (int i=input.length()-2; i>=0;  i--){
            tersInput+=input.substring(i,i+1);

            System.out.println(tersInput);
        }


    }


}
