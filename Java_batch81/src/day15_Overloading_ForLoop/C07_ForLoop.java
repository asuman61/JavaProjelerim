package day15_Overloading_ForLoop;

public class C07_ForLoop {


    public static void main(String[] args) {

      //  C06_TersineCevirme.terstenYazdir("Zekeriya");  HATA VERDİ



        //100den 1e kadar  8 ile bolunebilen sayıları yazdurın. sınırlar dahil

        for (int i=100; i>=1; i--){
            if (i%8==0){
                System.out.print(i+" ");
            }
        }


    }
}

