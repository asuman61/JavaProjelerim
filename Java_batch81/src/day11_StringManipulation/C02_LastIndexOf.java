package day11_StringManipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {
        String cumle="Java cok kolay,Java cok guzel";
        String kelime="cok";

        int kelimeIlkindex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkindex==-1) {
            System.out.println("verilen kelime cumlede kullanılmamıs");
        } else if (kelimeIlkindex==kelimeSonIndex) {
            System.out.println("verilen kelime cumlede sadece 1 kere kullanılmıs");
        }else{
            System.out.println("verilen kelime cumlede birden fazla kullanılmıs");

        }


        //String=char sequence

        //Verilen kelime için aşağıdaki şartlardan uygun olani yazan bir program yazınız
        //verilen kelime cumlede kullanılmamıs,
        //verilen kelime cumlede sadece 1 kez kullanılmıs
        //verilen kelime cumlede birden fazla kullanılmıs


    }
}
