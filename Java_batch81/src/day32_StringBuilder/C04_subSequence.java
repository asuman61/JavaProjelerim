package day32_StringBuilder;

public class C04_subSequence {

    public static void main(String[] args) {


        StringBuilder sb=new  StringBuilder("Kayra");

        sb.substring(0,3);   //

        //Bu metod string dondurdugu için string builderın eski halii degiştiremez

        //istediğimiz sonucu almak için ya variable atıyoruz ya da soutun içine yazdırıyoruz
        System.out.println(sb);

        sb.subSequence(0,3);
        System.out.println(sb);  //char sequence ile dondurur

        //sb nin içinde string olan metodlar varsa string iimmurtable old. için sonuç da immutable dır








    }
}
