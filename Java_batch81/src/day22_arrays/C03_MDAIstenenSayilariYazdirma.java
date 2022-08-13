package day22_arrays;

public class C03_MDAIstenenSayilariYazdirma {

    public static void main(String[] args) {
        /*verilen bir multıdimensional arrayde
        outer indexi ve inner indexi aynı olan sayıların toplamını bulunuz.
                {
                        [0][0]+[1][1]+[2][2]....

         */

        int[][] sayilar = {{1, 5, 6, 9}, {2, 5}, {3, 1, 6}};

         int istenenToplam=0;

         for (int i=0; i< sayilar.length ; i++){
             for (int j=0; j<sayilar[i].length ; j++){

                 if (i==j){
                     istenenToplam+=sayilar[i][j];
                 }

             }
         }
        System.out.println("istenen toplam: " +istenenToplam);






    }
}
