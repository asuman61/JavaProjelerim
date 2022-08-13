package day12_StringManipulation;

public class C01_replace {
    public static void main(String[] args) {
        //bugun hava cok guzel

        String str= "Bu gun ha va cok guz el";
        System.out.println(str.replace(" ","" )); //boslukları yok etti

        //hava kelimesini java ile değiştirelim

        System.out.println(str.replace("h","j").replace(" ",""));


    }
}
