package day15_Overloading_ForLoop;

public class C08_Faktoriyel {
    public static void main(String[] args) {
         /*input olarak verilen bir tamsayı için faktoriyel hesaplayıp
    yazdırsn bir metod olusturun

    Verielen sayı 0, negatif ya da 20 den buyuk olursa
    girilen sayunın faktoriyeli hesaplanamaz yazdırın*/

        int input=10;
        faktoryelHesapla(input);



    }

    private static void faktoryelHesapla(int input) {

        int faktoryel=1;

        if (input<0 || input>20) {
            System.out.println("verilen sayi için faktoryel hesaplanamaz");

        } else if (input==0) {
            System.out.println("0!=1 dir");
        } else{
            for (int i=1; i<=input ; i++);



        }
        System.out.println("faktoryel degeri :" +faktoryel);
    }


    }



