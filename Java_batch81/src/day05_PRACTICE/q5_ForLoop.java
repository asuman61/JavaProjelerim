package day05_PRACTICE;

public class q5_ForLoop {
    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız


    public static void main(String[] args) {

        //for loop while do while ol. uzere 3 metodkla cozebilirsin

        System.out.println("FOR İLE ÇOZELİM");

        for (int i=0;  i<255; i++){
            char c= (char) i;   //casting yaptık, sayı harf ve karakter için gecerli

            System.out.println(i+ " -> " + c); //integer olan i yi char  a cevirdi


        }

        System.out.println("while ile cozelim");
        //WHİLE FORUN PARCALANMIS HALİ ANKİ FORLA COZ GİBİ PARCALA
        //START VALUE YI DONGUNUN DISINA YAZ

        int i=0;     //baslangıcı yazdık
        while (i<=255){  //bitisi yazdık
            char sembol = (char) i;
            System.out.println(i+ " -" +sembol);
            i++;
        }
        System.out.println(" do while ile cozelim");
        //once yap sonra kontrol et
        //OCA DA COK CIKAR
        //İLK KOMUT SATIRI EN AZ BIR KERE CALISIR
        //BASLANGIC DEGERİ YİNE DONGU DISINDA

        int a=0;
        do {
            char karakter= (char) a;
            System.out.println(a+" " +karakter);
            a++;
        }while (a<=255);










    }









}
