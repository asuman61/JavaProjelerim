package da30_immutable_date;

public class C02_StringHavuzu {

    public static void main(String[] args) {
        String str1="Ali Can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4=str1.concat(hiclik);

        System.out.println(str1==str2); //false
        System.out.println(str1.equals(str2));//true

        System.out.println(str1.equals(str3));///true
        System.out.println(str1==str3); //false

        System.out.println(str1.equals(str4));  //true içerik aynı cunku
        System.out.println(str1==str4); //false

        String str5="Ali Can";
        String str6=str1;
        System.out.println(str1.equals(str5)); //true
        System.out.println(str5==str1); //true

        System.out.println(str1.equals(str6)); //true
        System.out.println(str1==str6);  //true

        System.out.println(str5.equals(str6));
        System.out.println(str5==str6);

/*Eger yeni string objesi olusturulurken
new kelimesi kullanılmaz veya
esitliğin sagında bir islem olmazsa Java bakar

Eger daha once olusturulan String objelerden  -string havuzu-
birebir aynı string varsa
o objeyi ve referansını kullanır,birebir aynı
yoksa yeni bir obje ve referans olusturur
 */



    }




}
