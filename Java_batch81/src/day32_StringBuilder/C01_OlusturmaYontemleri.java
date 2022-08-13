package day32_StringBuilder;

public class C01_OlusturmaYontemleri {

    public static void main(String[] args) {


        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder("Java Candir");  //en fala hafıza kullanımı
        StringBuilder sb3= new StringBuilder(10);


        System.out.println(sb1.length());  //0 bos stringin uzunlug olmaz
        System.out.println(sb1.capacity()); //16   //hiçbisey soylemezsen java sana 16lık kapasite verir


        System.out.println(sb2.length());  //11
        System.out.println(sb2.capacity()); //27


        System.out.println(sb3.length());  //0
        System.out.println(sb3.capacity()); //10


        sb1.append("Java");
        System.out.println(sb1.length());  //4
        System.out.println(sb1.capacity()); //16

        sb1.append(" Candir");
        System.out.println(sb1.length());  //11
        System.out.println(sb1.capacity()); //16

        sb1.append(", bilen bilir.");
        System.out.println(sb1.length());  //25
        System.out.println(sb1.capacity()); //34  (16*2 +2)

        //hafıza yönetimi önemli ise
        //hafızayı planlama alan kullanımı kapasite ile ilgili işler için bu kısım önemli


StringBuilder sb4=new StringBuilder();
sb4.append("Java Candir");

        System.out.println(sb4.length());  //11
        System.out.println(sb4.capacity()); //16











    }



}
