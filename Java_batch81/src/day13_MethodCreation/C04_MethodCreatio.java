package day13_MethodCreation;

public class C04_MethodCreatio {
    public static void main(String[] args) {

        //input olarak verilen 2 integeri toplayıp sonucunu yazdırın
        //bir metod olusturun

        int input1=15;
        int input2=20;

        //method 4 adımdır
        // 1. method call
        //2. argument eklenmesi gerekiyorsa ekle
        // eger metod return type ıvoidden farklı olacaksa bir variable olusturup
        //metod call u assign et



        topla(input1,input2);
          





    }

    private static void topla(int input1, int input2) {

        //3. adımda degismesi gerekn yerleri değiştir
        //7access modifier, return type etc.
        //4ç eger return type void dısında biseyse return keywordu ve donecek degeri hesaplamak


        System.out.println("Girilen iki sayının toplamı :" + (input1+input2));

    }

}
