package day17_NestedForLoop;

public class C02_NestedForLoop {

    //Verilen sayiya gore carpim tablosu olusturun
    /*
    input 3
    1 2 3
    2 4 6
    3 6 9
     */
    public static void main(String[] args) {

 for (int i=1; i<=3 ; i++){

     for (int j=1; j<=3; j++){

         System.out.print(i*j + " ");
     }
     System.out.println(" ");
 }

    }



}
