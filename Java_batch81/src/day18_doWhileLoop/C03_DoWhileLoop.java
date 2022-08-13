package day18_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
/*while loopta


 */
        int sayi=7;

        while(sayi<10){
            System.out.println(sayi);

            sayi++;


        /*do while loopta bu dezavantaj ortadan kalkar
           bu işleri şu şart saglandıgı surece yap*/
         sayi=7;
          do {
        sayi++;
        }while (sayi<10);      //10<10 da loop kırılır


}



    }
}
