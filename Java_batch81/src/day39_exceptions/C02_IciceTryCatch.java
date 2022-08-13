package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IciceTryCatch {
    public static void main(String[] args) {
       //dosyaya ulaşmaya calısıyoruz exptn veriyo. ulasmaya calısıyoruz bi ecptn daha veriyor

        //-1 gorunceye kadar harfleri oku
           int k;
        try {
            FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");

            while ((k=fis.read())!=-1){ //okuyacagı harf kalmayana  kadar okur
                System.out.print((char)k);
            }


        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadı veya bozuk");
        } catch (IOException e) {
            System.out.println("dosyadan bilgiler okunamadı");
        }


    }
}
