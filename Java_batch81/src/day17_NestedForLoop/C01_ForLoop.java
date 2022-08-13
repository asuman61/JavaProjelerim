package day17_NestedForLoop;

public class C01_ForLoop {

    //Vrilen stringdeki kullanılan harfleri
    //tekrarsız olarak yazdırıp
    //kelimede kullanılan farklı harf sayısını veren bir kod yazınız

    public static void main(String[] args) {

        String input= "Java her zaman güzel";

        tekrarsizYap(input);

    }
    private static void tekrarsizYap(String input) {
        String benzersizInput="";

        String islenecekKelime=input.replaceAll("\\W",""); //Java her zaman guzel
        System.out.println(islenecekKelime.substring(0,1));  //J
        benzersizInput+=islenecekKelime.substring(0,1);   //J

        for (int i=1; i<islenecekKelime.length(); i++){


            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.println(", "+islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.println("inpt: " + input);
        System.out.println("benzersiz input : " +benzersizInput);


    }


}
