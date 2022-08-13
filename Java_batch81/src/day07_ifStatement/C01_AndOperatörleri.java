package day07_ifStatement;

public class C01_AndOperatörleri {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);

        System.out.println(a<0 && b<20 && c>=b); //mükemmeliyet zinciri kırıldı

        System.out.println(a<0 & b<20 & c>=b);  //java & operatoru konusunda bize 2 secenek sunar. Eğer && kullanırsak ilk false da artık sonucun false olacağını bilir ve diğer şartları kontrol etmez. Eğer & kullanırsak hepsini kontrol eder. Dolayısıyla öncekine göre daha yavaş çalışır


    }
}
