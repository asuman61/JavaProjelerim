package day04_practice;

public class q01_MethodCreation {
    /*
    Problem tanımı :
    Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
    Test Data:
    input: "aabbcccccddddaaa"
    output: abcd
 */
    public static void main(String[] args) {
        birkereYazdir("abbaaaacccdeee");

    }

    private static void birkereYazdir(String str) {
        String output="";  //String default degeri " oldugu için işleme etki etmesin diye bu sekilde
                           // atama yaptık

        for (int i=0; i<str.length(); i++){  //i<=length-1 de olur
            if(!output.contains(str.substring(i,i+1))){
    output+=str.substring(i,i+1);

            }
        }
        System.out.println(output);







    }


}
