package day32_StringBuilder;

public class C07_delete {
    public static void main(String[] args) {
   StringBuilder sb=new StringBuilder("Java her zaman guzel")   ;

   sb.delete(8,9);  //java herzaman guzel
        System.out.println(sb);

        sb.deleteCharAt(7);
        System.out.println(sb);

        //bastan baslayarak her loopda ilk harfi silip kalanı yazdıralim


        int son=sb.length();
        for (int i=0; i<son ; i++){
            sb.deleteCharAt(0); //burda lengti siliyosun
            System.out.println(sb);
        }



    }





}
