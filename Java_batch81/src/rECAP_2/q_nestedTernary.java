package rECAP_2;

public class q_nestedTernary {

    /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */

    public static void main(String[] args) {

     char finalNotu = 'A';

     String result= finalNotu == 'A' ? "Gayet abasarili" :finalNotu=='B' ? "Basarili":finalNotu=='C'? "Ha Gayret": "Digerleri" ;

        System.out.println("result = +result");

    }


}
