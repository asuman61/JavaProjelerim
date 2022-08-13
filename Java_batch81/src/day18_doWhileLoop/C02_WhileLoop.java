package day18_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {


     //Soru7) Kullanıcıdan bir sayı alın ve rakamları toplamını yazdırın


        int input= 5432;


        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp= input;

        birlerBasamagi=temp%10;
        rakamlarToplami+=birlerBasamagi;
        temp/=10;   //birler basamağıyla işim bitti ve ondan kurtuluyorum


        while (temp>0) {
            birlerBasamagi = temp % 10;
            rakamlarToplami += birlerBasamagi;
            temp /= 10;
        }

        System.out.println(input + " sayisinin rakamlar toplami :" +rakamlarToplami);






        }


}
