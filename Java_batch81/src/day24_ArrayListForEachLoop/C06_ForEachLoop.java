package day24_ArrayListForEachLoop;


import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

    public static void main(String[] args) { //index lazim degilse
        
        int[] arr={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();

        //herkesi bana getirin diyosan biçilmiş kaftan
        //arraydeki tum elemanları iceleyelşm, tek sayi olanları 
        //liste atayalim

        for (int each: arr //
             ) {
            if (each%2==1){
                liste.add(each);
            }
            
        }

        System.out.println(liste);
        
    }
    
    
}
