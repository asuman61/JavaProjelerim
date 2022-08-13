package day32_StringBuilder;

public class C08_equals {

    public static void main(String[] args) {


        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Jave");
        String str="Java";

        System.out.println(sb1.equals(sb2)); //false

        System.out.println(sb1.equals(sb1)); //true

        //String builderda equals metodu
        //ancak aynı obje olursa. sadece kendine esit dersen esit olur

        System.out.println(sb1.equals(str)); //false..NŞA DA iki farkli objeyi birbiriyle karsılastıramazsın.



        System.out.println(sb1.compareTo(sb2));  //0. butunn harfleri tek tek karsılastırdı 0 fark buldu

        System.out.println(sb1.compareTo(sb3 ));


/*compareto metodu iki string builderi harf harf karsılastırır
ilk harfler aynı ise ikşiincilere gecer
ikinciler aynı ise 3. lere gecer
ve ilk farklı olan harfe kadar gider
farklı olan iki harfin ascii kodları arasındakı farkı verir
 */








    }





}
