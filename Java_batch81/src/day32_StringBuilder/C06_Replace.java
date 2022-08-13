package day32_StringBuilder;

public class C06_Replace {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Calm down");

        sb.replace(5,10,"Up"); //4 harfli parçayı alıp yerine 2 harfli parca ekledik
        System.out.println(sb);

        sb.replace(4,5,"---");
        System.out.println(sb);

        sb.replace(4,7," ");
        System.out.println(sb);

        sb.replace(5,7, "down");
        System.out.println(sb);






    }

}
